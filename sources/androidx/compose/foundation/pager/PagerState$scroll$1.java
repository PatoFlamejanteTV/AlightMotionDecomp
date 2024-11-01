package androidx.compose.foundation.pager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {TypedValues.PositionType.TYPE_DRAWPATH, TypedValues.PositionType.TYPE_PERCENT_WIDTH}, m = "scroll$suspendImpl")
/* loaded from: classes.dex */
public final class PagerState$scroll$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PagerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scroll$1(PagerState pagerState, U5.d dVar) {
        super(dVar);
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PagerState.scroll$suspendImpl(this.this$0, null, null, this);
    }
}
