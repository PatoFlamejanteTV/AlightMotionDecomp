package androidx.compose.foundation.pager;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1", f = "Pager.kt", l = {848}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PagerKt$pagerSemantics$performForwardPaging$1 extends l implements InterfaceC2072n {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$performForwardPaging$1(PagerState pagerState, d dVar) {
        super(2, dVar);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PagerKt$pagerSemantics$performForwardPaging$1(this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            PagerState pagerState = this.$state;
            this.label = 1;
            if (PagerStateKt.animateToNextPage(pagerState, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((PagerKt$pagerSemantics$performForwardPaging$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
