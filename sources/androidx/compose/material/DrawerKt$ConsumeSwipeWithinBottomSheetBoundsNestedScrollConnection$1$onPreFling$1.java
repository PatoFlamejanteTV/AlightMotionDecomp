package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", l = {TypedValues.Custom.TYPE_STRING}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 extends d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, U5.d dVar) {
        super(dVar);
        this.this$0 = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo434onPreFlingQWom1Mo(0L, this);
    }
}
