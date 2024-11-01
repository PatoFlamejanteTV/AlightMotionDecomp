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
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {539, 541, 552}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends k implements InterfaceC2072n {
    final /* synthetic */ Function0 $onDragCancel;
    final /* synthetic */ Function0 $onDragEnd;
    final /* synthetic */ Function1 $onDragStart;
    final /* synthetic */ InterfaceC2072n $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ InterfaceC2072n $onHorizontalDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2072n interfaceC2072n) {
            super(1);
            this.$onHorizontalDrag = interfaceC2072n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PointerInputChange) obj);
            return I.f8786a;
        }

        public final void invoke(PointerInputChange it) {
            AbstractC3292y.i(it, "it");
            this.$onHorizontalDrag.invoke(it, Float.valueOf(Offset.m2712getXimpl(PointerEventKt.positionChange(it))));
            it.consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5(Function1 function1, InterfaceC2072n interfaceC2072n, Function0 function0, Function0 function02, U5.d dVar) {
        super(2, dVar);
        this.$onDragStart = function1;
        this.$onHorizontalDrag = interfaceC2072n;
        this.$onDragEnd = function0;
        this.$onDragCancel = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, dVar);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            Q5.t.b(r13)
            goto La7
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.P r1 = (kotlin.jvm.internal.P) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            Q5.t.b(r13)
            goto L72
        L2a:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            Q5.t.b(r13)
            goto L4d
        L32:
            Q5.t.b(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r12.L$0 = r13
            r12.label = r4
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r11 = r1
            r1 = r13
            r13 = r11
        L4d:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.P r10 = new kotlin.jvm.internal.P
            r10.<init>()
            long r5 = r13.m3991getIdJ3iCeTQ()
            int r7 = r13.m3996getTypeT8wyACA()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
            r8.<init>(r10)
            r12.L$0 = r1
            r12.L$1 = r10
            r12.label = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m363awaitHorizontalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L70
            return r0
        L70:
            r3 = r1
            r1 = r10
        L72:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto Lba
            kotlin.jvm.functions.Function1 r4 = r12.$onDragStart
            long r5 = r13.m3993getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2701boximpl(r5)
            r4.invoke(r5)
            c6.n r4 = r12.$onHorizontalDrag
            float r1 = r1.f34570a
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.b(r1)
            r4.invoke(r13, r1)
            long r4 = r13.m3991getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
            c6.n r1 = r12.$onHorizontalDrag
            r13.<init>(r1)
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m376horizontalDragjO51t88(r3, r4, r13, r12)
            if (r13 != r0) goto La7
            return r0
        La7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb5
            kotlin.jvm.functions.Function0 r13 = r12.$onDragEnd
            r13.invoke()
            goto Lba
        Lb5:
            kotlin.jvm.functions.Function0 r13 = r12.$onDragCancel
            r13.invoke()
        Lba:
            Q5.I r13 = Q5.I.f8786a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
