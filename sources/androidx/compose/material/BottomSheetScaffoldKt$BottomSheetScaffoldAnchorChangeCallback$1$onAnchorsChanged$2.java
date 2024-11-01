package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2", f = "BottomSheetScaffold.kt", l = {741}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2 extends l implements InterfaceC2072n {
    final /* synthetic */ BottomSheetValue $newTarget;
    final /* synthetic */ BottomSheetState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, d dVar) {
        super(2, dVar);
        this.$state = bottomSheetState;
        this.$newTarget = bottomSheetValue;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2(this.$state, this.$newTarget, dVar);
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
            BottomSheetState bottomSheetState = this.$state;
            BottomSheetValue bottomSheetValue = this.$newTarget;
            this.label = 1;
            if (bottomSheetState.snapTo$material_release(bottomSheetValue, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
