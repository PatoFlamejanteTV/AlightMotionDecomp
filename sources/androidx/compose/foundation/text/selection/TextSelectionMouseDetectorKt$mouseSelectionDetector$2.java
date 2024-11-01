package androidx.compose.foundation.text.selection;

import Q5.I;
import U5.d;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {89, 96, 111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends k implements InterfaceC2072n {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MouseSelectionObserver $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver) {
            super(1);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PointerInputChange) obj);
            return I.f8786a;
        }

        public final void invoke(PointerInputChange it) {
            AbstractC3292y.i(it, "it");
            if (this.$observer.mo977onExtendDragk4lQ0M(it.m3993getPositionF1C5BW0())) {
                it.consume();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MouseSelectionObserver $observer;
        final /* synthetic */ SelectionAdjustment $selectionMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment) {
            super(1);
            this.$observer = mouseSelectionObserver;
            this.$selectionMode = selectionAdjustment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PointerInputChange) obj);
            return I.f8786a;
        }

        public final void invoke(PointerInputChange it) {
            AbstractC3292y.i(it, "it");
            if (this.$observer.mo975onDrag3MmeM6k(it.m3993getPositionF1C5BW0(), this.$selectionMode)) {
                it.consume();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, d dVar) {
        super(2, dVar);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, dVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:10:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:10:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b6 -> B:10:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d0 -> B:10:0x00d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            java.lang.Object r1 = r11.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            Q5.t.b(r12)
            goto Ld3
        L27:
            java.lang.Object r1 = r11.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            Q5.t.b(r12)
            goto L53
        L33:
            Q5.t.b(r12)
            java.lang.Object r12 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            androidx.compose.foundation.text.selection.ClicksCounter r1 = new androidx.compose.foundation.text.selection.ClicksCounter
            androidx.compose.ui.platform.ViewConfiguration r5 = r12.getViewConfiguration()
            r1.<init>(r5)
        L43:
            r11.L$0 = r12
            r11.L$1 = r1
            r11.label = r4
            java.lang.Object r5 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.access$awaitMouseEventDown(r12, r11)
            if (r5 != r0) goto L50
            return r0
        L50:
            r10 = r5
            r5 = r12
            r12 = r10
        L53:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            r1.update(r12)
            java.util.List r6 = r12.getChanges()
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r12 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(r12)
            if (r12 == 0) goto L90
            androidx.compose.foundation.text.selection.MouseSelectionObserver r12 = r11.$observer
            long r7 = r6.m3993getPositionF1C5BW0()
            boolean r12 = r12.mo976onExtendk4lQ0M(r7)
            if (r12 == 0) goto Ld3
            r6.consume()
            long r6 = r6.m3991getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r12 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
            androidx.compose.foundation.text.selection.MouseSelectionObserver r8 = r11.$observer
            r12.<init>(r8)
            r11.L$0 = r5
            r11.L$1 = r1
            r11.label = r3
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m375dragjO51t88(r5, r6, r12, r11)
            if (r12 != r0) goto Ld3
            return r0
        L90:
            int r12 = r1.getClicks()
            if (r12 == r4) goto La6
            if (r12 == r3) goto L9f
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getParagraph()
            goto Lac
        L9f:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getWord()
            goto Lac
        La6:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r12 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r12 = r12.getNone()
        Lac:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r7 = r11.$observer
            long r8 = r6.m3993getPositionF1C5BW0()
            boolean r7 = r7.mo978onStart3MmeM6k(r8, r12)
            if (r7 == 0) goto Ld3
            r6.consume()
            long r6 = r6.m3991getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r8 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = r11.$observer
            r8.<init>(r9, r12)
            r11.L$0 = r5
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m375dragjO51t88(r5, r6, r8, r11)
            if (r12 != r0) goto Ld3
            return r0
        Ld3:
            r12 = r5
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
