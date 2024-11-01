package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {433, 436, 438}, m = "processDragStart")
/* loaded from: classes.dex */
public final class DraggableNode$processDragStart$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$processDragStart$1(DraggableNode draggableNode, U5.d dVar) {
        super(dVar);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object processDragStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStart = this.this$0.processDragStart(null, null, this);
        return processDragStart;
    }
}
