package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {176, 890, 940, 193}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$5 extends k implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $onDrag;
    final /* synthetic */ Function0 $onDragCancel;
    final /* synthetic */ Function0 $onDragEnd;
    final /* synthetic */ Function1 $onDragStart;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ InterfaceC2072n $onDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC2072n interfaceC2072n) {
            super(1);
            this.$onDrag = interfaceC2072n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PointerInputChange) obj);
            return I.f8786a;
        }

        public final void invoke(PointerInputChange it) {
            AbstractC3292y.i(it, "it");
            this.$onDrag.invoke(it, Offset.m2701boximpl(PointerEventKt.positionChange(it)));
            it.consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(Function1 function1, InterfaceC2072n interfaceC2072n, Function0 function0, Function0 function02, U5.d dVar) {
        super(2, dVar);
        this.$onDragStart = function1;
        this.$onDrag = interfaceC2072n;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, dVar);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d8 -> B:22:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0154 -> B:21:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0195 -> B:30:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01f1 -> B:18:0x01f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x023e -> B:22:0x0241). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
