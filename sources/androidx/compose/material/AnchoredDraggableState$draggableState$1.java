package androidx.compose.material;

import Q5.I;
import U5.d;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {
    private final AnchoredDraggableState$draggableState$1$dragScope$1 dragScope;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
        this.dragScope = new DragScope() { // from class: androidx.compose.material.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f8) {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) anchoredDraggableState).anchoredDragScope;
                a.a(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$material_release(f8), 0.0f, 2, null);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        this.this$0.dispatchRawDelta(f8);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, d dVar) {
        Object anchoredDrag = this.this$0.anchoredDrag(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, interfaceC2072n, null), dVar);
        if (anchoredDrag == V5.b.e()) {
            return anchoredDrag;
        }
        return I.f8786a;
    }
}
