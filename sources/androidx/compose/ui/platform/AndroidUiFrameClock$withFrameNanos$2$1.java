package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidUiFrameClock$withFrameNanos$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Choreographer.FrameCallback $callback;
    final /* synthetic */ AndroidUiDispatcher $uiDispatcher;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$uiDispatcher = androidUiDispatcher;
        this.$callback = frameCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(Throwable th) {
        this.$uiDispatcher.removeFrameCallback$ui_release(this.$callback);
    }
}
