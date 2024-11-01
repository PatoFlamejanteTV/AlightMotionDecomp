package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {592}, m = "onDragOrUp-Axegvzg")
/* loaded from: classes.dex */
public final class DraggableKt$onDragOrUp$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$onDragOrUp$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m400onDragOrUpAxegvzg;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m400onDragOrUpAxegvzg = DraggableKt.m400onDragOrUpAxegvzg(null, null, 0L, null, this);
        return m400onDragOrUpAxegvzg;
    }
}
