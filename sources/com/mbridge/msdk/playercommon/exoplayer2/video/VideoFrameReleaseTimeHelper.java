package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class VideoFrameReleaseTimeHelper {
    private static final long CHOREOGRAPHER_SAMPLE_DELAY_MILLIS = 500;
    private static final long MAX_ALLOWED_DRIFT_NS = 20000000;
    private static final int MIN_FRAMES_FOR_ADJUSTMENT = 6;
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private long adjustedLastFrameTimeNs;
    private final DefaultDisplayListener displayListener;
    private long frameCount;
    private boolean haveSync;
    private long lastFramePresentationTimeUs;
    private long pendingAdjustedFrameTimeNs;
    private long syncFramePresentationTimeNs;
    private long syncUnadjustedReleaseTimeNs;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final VSyncSampler vsyncSampler;
    private final WindowManager windowManager;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class DefaultDisplayListener implements DisplayManager.DisplayListener {
        private final DisplayManager displayManager;

        public DefaultDisplayListener(DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i8) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i8) {
            if (i8 == 0) {
                VideoFrameReleaseTimeHelper.this.updateDefaultDisplayRefreshRateParams();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i8) {
        }

        public final void register() {
            this.displayManager.registerDisplayListener(this, null);
        }

        public final void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }
    }

    /* loaded from: classes4.dex */
    private static final class VSyncSampler implements Handler.Callback, Choreographer.FrameCallback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = new VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = C.TIME_UNSET;

        private VSyncSampler() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.handler = handler;
            handler.sendEmptyMessage(0);
        }

        private void addObserverInternal() {
            int i8 = this.observerCount + 1;
            this.observerCount = i8;
            if (i8 == 1) {
                this.choreographer.postFrameCallback(this);
            }
        }

        private void createChoreographerInstanceInternal() {
            this.choreographer = Choreographer.getInstance();
        }

        public static VSyncSampler getInstance() {
            return INSTANCE;
        }

        private void removeObserverInternal() {
            int i8 = this.observerCount - 1;
            this.observerCount = i8;
            if (i8 == 0) {
                this.choreographer.removeFrameCallback(this);
                this.sampledVsyncTimeNs = C.TIME_UNSET;
            }
        }

        public final void addObserver() {
            this.handler.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j8) {
            this.sampledVsyncTimeNs = j8;
            this.choreographer.postFrameCallbackDelayed(this, VideoFrameReleaseTimeHelper.CHOREOGRAPHER_SAMPLE_DELAY_MILLIS);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        return false;
                    }
                    removeObserverInternal();
                    return true;
                }
                addObserverInternal();
                return true;
            }
            createChoreographerInstanceInternal();
            return true;
        }

        public final void removeObserver() {
            this.handler.sendEmptyMessage(2);
        }
    }

    public VideoFrameReleaseTimeHelper() {
        this(null);
    }

    private static long closestVsync(long j8, long j9, long j10) {
        long j11;
        long j12 = j9 + (((j8 - j9) / j10) * j10);
        if (j8 <= j12) {
            j11 = j12 - j10;
        } else {
            j12 = j10 + j12;
            j11 = j12;
        }
        if (j12 - j8 >= j8 - j11) {
            return j11;
        }
        return j12;
    }

    private boolean isDriftTooLarge(long j8, long j9) {
        if (Math.abs((j9 - this.syncUnadjustedReleaseTimeNs) - (j8 - this.syncFramePresentationTimeNs)) > MAX_ALLOWED_DRIFT_NS) {
            return true;
        }
        return false;
    }

    private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new DefaultDisplayListener(displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams() {
        if (this.windowManager.getDefaultDisplay() != null) {
            long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long adjustReleaseTime(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.haveSync
            if (r2 == 0) goto L42
            long r2 = r10.lastFramePresentationTimeUs
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r10.frameCount
            r4 = 1
            long r2 = r2 + r4
            r10.frameCount = r2
            long r2 = r10.pendingAdjustedFrameTimeNs
            r10.adjustedLastFrameTimeNs = r2
        L19:
            long r2 = r10.frameCount
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r10.syncFramePresentationTimeNs
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.adjustedLastFrameTimeNs
            long r2 = r2 + r4
            boolean r4 = r10.isDriftTooLarge(r2, r13)
            if (r4 == 0) goto L33
            r10.haveSync = r6
            goto L42
        L33:
            long r4 = r10.syncUnadjustedReleaseTimeNs
            long r4 = r4 + r2
            long r6 = r10.syncFramePresentationTimeNs
            long r4 = r4 - r6
            goto L44
        L3a:
            boolean r2 = r10.isDriftTooLarge(r0, r13)
            if (r2 == 0) goto L42
            r10.haveSync = r6
        L42:
            r4 = r13
            r2 = r0
        L44:
            boolean r6 = r10.haveSync
            if (r6 != 0) goto L53
            r10.syncFramePresentationTimeNs = r0
            r10.syncUnadjustedReleaseTimeNs = r13
            r13 = 0
            r10.frameCount = r13
            r13 = 1
            r10.haveSync = r13
        L53:
            r10.lastFramePresentationTimeUs = r11
            r10.pendingAdjustedFrameTimeNs = r2
            com.mbridge.msdk.playercommon.exoplayer2.video.VideoFrameReleaseTimeHelper$VSyncSampler r11 = r10.vsyncSampler
            if (r11 == 0) goto L78
            long r12 = r10.vsyncDurationNs
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L67
            goto L78
        L67:
            long r6 = r11.sampledVsyncTimeNs
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L6e
            return r4
        L6e:
            long r8 = r10.vsyncDurationNs
            long r11 = closestVsync(r4, r6, r8)
            long r13 = r10.vsyncOffsetNs
            long r11 = r11 - r13
            return r11
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.video.VideoFrameReleaseTimeHelper.adjustReleaseTime(long, long):long");
    }

    public final void disable() {
        if (this.windowManager != null) {
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.unregister();
            }
            this.vsyncSampler.removeObserver();
        }
    }

    public final void enable() {
        this.haveSync = false;
        if (this.windowManager != null) {
            this.vsyncSampler.addObserver();
            DefaultDisplayListener defaultDisplayListener = this.displayListener;
            if (defaultDisplayListener != null) {
                defaultDisplayListener.register();
            }
            updateDefaultDisplayRefreshRateParams();
        }
    }

    public VideoFrameReleaseTimeHelper(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.windowManager = (WindowManager) context.getSystemService("window");
        } else {
            this.windowManager = null;
        }
        if (this.windowManager != null) {
            this.displayListener = Util.SDK_INT >= 17 ? maybeBuildDefaultDisplayListenerV17(context) : null;
            this.vsyncSampler = VSyncSampler.getInstance();
        } else {
            this.displayListener = null;
            this.vsyncSampler = null;
        }
        this.vsyncDurationNs = C.TIME_UNSET;
        this.vsyncOffsetNs = C.TIME_UNSET;
    }
}
