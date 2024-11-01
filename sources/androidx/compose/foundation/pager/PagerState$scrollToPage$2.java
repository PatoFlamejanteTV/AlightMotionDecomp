package androidx.compose.foundation.pager;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import e6.AbstractC2829a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {TypedValues.CycleType.TYPE_WAVE_SHAPE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PagerState$scrollToPage$2 extends l implements InterfaceC2072n {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f8, int i8, d dVar) {
        super(2, dVar);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f8;
        this.$page = i8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((PagerState$scrollToPage$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object awaitScrollDependencies;
        int coerceInPageRange;
        PagerScrollPosition pagerScrollPosition;
        int pageAvailableSpace;
        Object e8 = b.e();
        int i8 = this.label;
        boolean z8 = true;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            awaitScrollDependencies = pagerState.awaitScrollDependencies(this);
            if (awaitScrollDependencies == e8) {
                return e8;
            }
        }
        float f8 = this.$pageOffsetFraction;
        double d8 = f8;
        if (-0.5d > d8 || d8 > 0.5d) {
            z8 = false;
        }
        if (z8) {
            coerceInPageRange = this.this$0.coerceInPageRange(this.$page);
            pagerScrollPosition = this.this$0.scrollPosition;
            pageAvailableSpace = this.this$0.getPageAvailableSpace();
            pagerScrollPosition.requestPosition(coerceInPageRange, AbstractC2829a.d(pageAvailableSpace * this.$pageOffsetFraction));
            Remeasurement remeasurement$foundation_release = this.this$0.getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            return I.f8786a;
        }
        throw new IllegalArgumentException(("pageOffsetFraction " + f8 + " is not within the range -0.5 to 0.5").toString());
    }
}
