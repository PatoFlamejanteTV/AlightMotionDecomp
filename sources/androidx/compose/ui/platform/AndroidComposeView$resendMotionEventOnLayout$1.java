package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4407invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4407invoke() {
        MotionEvent motionEvent;
        AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
        motionEvent = this.this$0.previousMotionEvent;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView$resendMotionEventRunnable$1 = androidComposeView.resendMotionEventRunnable;
                androidComposeView.post(androidComposeView$resendMotionEventRunnable$1);
            }
        }
    }
}
