package androidx.compose.animation.core;

import Q5.I;
import Q5.t;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Animatable$stop$2 extends l implements Function1 {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable<T, V> animatable, U5.d dVar) {
        super(1, dVar);
        this.this$0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(U5.d dVar) {
        return new Animatable$stop$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(U5.d dVar) {
        return ((Animatable$stop$2) create(dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.endAnimation();
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
