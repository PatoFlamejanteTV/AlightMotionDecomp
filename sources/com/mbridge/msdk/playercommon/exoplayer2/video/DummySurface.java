package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.EGLSurfaceTexture;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class DummySurface extends Surface {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String TAG = "DummySurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void initInternal(int i8) {
            boolean z8;
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i8);
            SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
            if (i8 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.surface = new DummySurface(this, surfaceTexture, z8);
        }

        private void releaseInternal() {
            Assertions.checkNotNull(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            try {
                if (i8 != 1) {
                    if (i8 != 2) {
                        return true;
                    }
                    try {
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    initInternal(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e8);
                    this.initError = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    Log.e(DummySurface.TAG, "Failed to initialize dummy surface", e9);
                    this.initException = e9;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public DummySurface init(int i8) {
            boolean z8;
            start();
            this.handler = new Handler(getLooper(), this);
            this.eglSurfaceTexture = new EGLSurfaceTexture(this.handler);
            synchronized (this) {
                z8 = false;
                this.handler.obtainMessage(1, i8, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException == null) {
                Error error = this.initError;
                if (error == null) {
                    return (DummySurface) Assertions.checkNotNull(this.surface);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void release() {
            Assertions.checkNotNull(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (Util.SDK_INT >= 17) {
        } else {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    private static int getSecureModeV24(Context context) {
        String eglQueryString;
        int i8 = Util.SDK_INT;
        if (i8 < 26 && ("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return 0;
        }
        if ((i8 < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(EXTENSION_PROTECTED_CONTENT)) {
            return 0;
        }
        if (eglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT)) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        boolean z8;
        int secureModeV24;
        synchronized (DummySurface.class) {
            try {
                z8 = true;
                if (!secureModeInitialized) {
                    if (Util.SDK_INT < 24) {
                        secureModeV24 = 0;
                    } else {
                        secureModeV24 = getSecureModeV24(context);
                    }
                    secureMode = secureModeV24;
                    secureModeInitialized = true;
                }
                if (secureMode == 0) {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public static DummySurface newInstanceV17(Context context, boolean z8) {
        boolean z9;
        assertApiLevel17OrHigher();
        int i8 = 0;
        if (z8 && !isSecureSupported(context)) {
            z9 = false;
        } else {
            z9 = true;
        }
        Assertions.checkState(z9);
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        if (z8) {
            i8 = secureMode;
        }
        return dummySurfaceThread.init(i8);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.release();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z8) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z8;
    }
}
