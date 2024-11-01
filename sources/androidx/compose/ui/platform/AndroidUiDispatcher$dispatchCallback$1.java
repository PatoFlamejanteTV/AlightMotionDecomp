package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* loaded from: classes.dex */
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ AndroidUiDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.this$0 = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        Handler handler;
        handler = this.this$0.handler;
        handler.removeCallbacks(this);
        this.this$0.performTrampolineDispatch();
        this.this$0.performFrameDispatch(j8);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        List list;
        this.this$0.performTrampolineDispatch();
        obj = this.this$0.lock;
        AndroidUiDispatcher androidUiDispatcher = this.this$0;
        synchronized (obj) {
            try {
                list = androidUiDispatcher.toRunOnFrame;
                if (list.isEmpty()) {
                    androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                    androidUiDispatcher.scheduledFrameDispatch = false;
                }
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
