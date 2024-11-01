package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {811, 828}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends k implements InterfaceC2072n {
    final /* synthetic */ T $currentDown;
    final /* synthetic */ T $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(T t8, T t9, U5.d dVar) {
        super(2, dVar);
        this.$currentDown = t8;
        this.$longPress = t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, dVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:            r2 = 1;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd A[EDGE_INSN: B:67:0x00cd->B:13:0x00cd BREAK  A[LOOP:0: B:7:0x00ba->B:10:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ac -> B:6:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
