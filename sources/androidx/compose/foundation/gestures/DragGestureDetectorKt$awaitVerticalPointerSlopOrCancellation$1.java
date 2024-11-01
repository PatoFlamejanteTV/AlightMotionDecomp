package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {890, 940}, m = "awaitVerticalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m371awaitVerticalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
