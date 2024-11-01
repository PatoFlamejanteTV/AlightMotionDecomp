package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {105, 106}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class NestedScrollNode$onPostFling$1 extends d {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, U5.d dVar) {
        super(dVar);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo432onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
