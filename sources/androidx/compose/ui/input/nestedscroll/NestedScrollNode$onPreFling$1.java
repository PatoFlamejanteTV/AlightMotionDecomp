package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {98, 99}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class NestedScrollNode$onPreFling$1 extends d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, U5.d dVar) {
        super(dVar);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo434onPreFlingQWom1Mo(0L, this);
    }
}
