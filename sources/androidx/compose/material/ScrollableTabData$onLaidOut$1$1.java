package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.ScrollState;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableTabData$onLaidOut$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ ScrollableTabData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i8, d dVar) {
        super(2, dVar);
        this.this$0 = scrollableTabData;
        this.$calculatedOffset = i8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ScrollState scrollState;
        AnimationSpec<Float> animationSpec;
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
            scrollState = this.this$0.scrollState;
            int i9 = this.$calculatedOffset;
            animationSpec = TabRowKt.ScrollableTabRowScrollSpec;
            this.label = 1;
            if (scrollState.animateScrollTo(i9, animationSpec, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((ScrollableTabData$onLaidOut$1$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
