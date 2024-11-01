package androidx.compose.foundation.text.selection;

import Q5.I;
import U5.d;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;

/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt {
    public static final double ClicksSlop = 100.0d;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, U5.d r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            Q5.t.b(r10)
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            Q5.t.b(r10)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r10 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = r9.awaitPointerEvent(r10, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            int r2 = r10.m3933getButtonsry648PA()
            boolean r2 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m3966isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r10.getChanges()
            int r4 = r2.size()
            r5 = 0
        L5a:
            if (r5 >= r4) goto L7b
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            int r7 = r6.m3996getTypeT8wyACA()
            androidx.compose.ui.input.pointer.PointerType$Companion r8 = androidx.compose.ui.input.pointer.PointerType.Companion
            int r8 = r8.m4059getMouseT8wyACA()
            boolean r7 = androidx.compose.ui.input.pointer.PointerType.m4054equalsimpl0(r7, r8)
            if (r7 == 0) goto L38
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 == 0) goto L38
            int r5 = r5 + 1
            goto L5a
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, U5.d):java.lang.Object");
    }

    public static final Object mouseSelectionDetector(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(mouseSelectionObserver, null), dVar);
        if (awaitEachGesture == V5.b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }
}
