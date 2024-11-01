package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {451, 454}, m = "processDragCancel")
/* loaded from: classes.dex */
public final class DraggableNode$processDragCancel$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$processDragCancel$1(DraggableNode draggableNode, U5.d dVar) {
        super(dVar);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object processDragCancel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragCancel = this.this$0.processDragCancel(null, this);
        return processDragCancel;
    }
}
