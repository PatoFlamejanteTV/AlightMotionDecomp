package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2", f = "AnchoredDraggable.kt", l = {690}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Map<T, Float> $newAnchors;
    final /* synthetic */ AnchoredDraggableState<T> $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2(AnchoredDraggableState<T> anchoredDraggableState, Map<T, Float> map, d dVar) {
        super(2, dVar);
        this.$state = anchoredDraggableState;
        this.$newAnchors = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2(this.$state, this.$newAnchors, dVar);
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
            AnchoredDraggableState<T> anchoredDraggableState = this.$state;
            Object closestAnchor$default = AnchoredDraggableKt.closestAnchor$default(this.$newAnchors, anchoredDraggableState.requireOffset(), false, 2, null);
            this.label = 1;
            if (AnchoredDraggableKt.snapTo(anchoredDraggableState, closestAnchor$default, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
