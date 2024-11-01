package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import n6.M;
import n6.X;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Function1 $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(Function1 function1, U5.d dVar) {
        super(2, dVar);
        this.$onFrame = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.$onFrame, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            this.label = 1;
            if (X.b(16L, this) == e8) {
                return e8;
            }
        }
        return this.$onFrame.invoke(kotlin.coroutines.jvm.internal.b.d(System.nanoTime()));
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
