package androidx.compose.runtime;

import Q5.I;
import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Choreographer.FrameCallback $callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.$callback = frameCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        DefaultChoreographerFrameClock.choreographer.removeFrameCallback(this.$callback);
    }
}
