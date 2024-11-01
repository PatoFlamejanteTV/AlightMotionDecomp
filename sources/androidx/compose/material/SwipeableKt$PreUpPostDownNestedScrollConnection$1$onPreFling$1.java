package androidx.compose.material;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {873}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, U5.d dVar) {
        super(dVar);
        this.this$0 = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo434onPreFlingQWom1Mo(0L, this);
    }
}
