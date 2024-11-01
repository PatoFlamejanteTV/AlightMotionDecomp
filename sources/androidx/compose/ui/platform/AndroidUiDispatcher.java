package androidx.compose.ui.platform;

import Q5.InterfaceC1416k;
import R5.C1427k;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends n6.I {
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final C1427k toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC1416k Main$delegate = Q5.l.b(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
    private static final ThreadLocal<U5.g> currentThread = new ThreadLocal<U5.g>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public U5.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(myLooper), null);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final U5.g getCurrentThread() {
            boolean isMainThread;
            isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            U5.g gVar = (U5.g) AndroidUiDispatcher.currentThread.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final U5.g getMain() {
            return (U5.g) AndroidUiDispatcher.Main$delegate.getValue();
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, AbstractC3284p abstractC3284p) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable runnable;
        synchronized (this.lock) {
            runnable = (Runnable) this.toRunTrampolined.z();
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j8) {
        synchronized (this.lock) {
            if (!this.scheduledFrameDispatch) {
                return;
            }
            this.scheduledFrameDispatch = false;
            List<Choreographer.FrameCallback> list = this.toRunOnFrame;
            this.toRunOnFrame = this.spareToRunOnFrame;
            this.spareToRunOnFrame = list;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                list.get(i8).doFrame(j8);
            }
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z8;
        do {
            Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z8 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z8 = true;
                }
            }
        } while (z8);
    }

    @Override // n6.I
    public void dispatch(U5.g gVar, Runnable runnable) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.e(runnable);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(frameCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new C1427k();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }
}
