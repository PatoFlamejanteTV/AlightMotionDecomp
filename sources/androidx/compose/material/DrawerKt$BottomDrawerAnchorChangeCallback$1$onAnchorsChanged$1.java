package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material.DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1", f = "Drawer.kt", l = {949}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1 extends l implements InterfaceC2072n {
    final /* synthetic */ BottomDrawerValue $newTarget;
    final /* synthetic */ BottomDrawerState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, d dVar) {
        super(2, dVar);
        this.$state = bottomDrawerState;
        this.$newTarget = bottomDrawerValue;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1(this.$state, this.$newTarget, dVar);
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
            BottomDrawerState bottomDrawerState = this.$state;
            BottomDrawerValue bottomDrawerValue = this.$newTarget;
            float lastVelocity$material_release = bottomDrawerState.getLastVelocity$material_release();
            this.label = 1;
            if (bottomDrawerState.animateTo$material_release(bottomDrawerValue, lastVelocity$material_release, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
