package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultDraggableState implements DraggableState {
    private final DragScope dragScope;
    private final Function1 onDelta;
    private final MutatorMutex scrollMutex;

    public DefaultDraggableState(Function1 onDelta) {
        AbstractC3292y.i(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f8) {
                DefaultDraggableState.this.getOnDelta().invoke(Float.valueOf(f8));
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f8) {
        this.onDelta.invoke(Float.valueOf(f8));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object e8 = N.e(new DefaultDraggableState$drag$2(this, mutatePriority, interfaceC2072n, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public final Function1 getOnDelta() {
        return this.onDelta;
    }
}
