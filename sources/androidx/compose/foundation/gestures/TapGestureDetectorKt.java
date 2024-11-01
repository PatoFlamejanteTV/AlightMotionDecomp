package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import n6.N;

/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final InterfaceC2073o NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z8, U5.d dVar) {
        return awaitFirstDown(awaitPointerEventScope, z8, PointerEventPass.Main, dVar);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z8, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z8, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, U5.d dVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, U5.d r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            Q5.t.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Q5.t.b(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.b.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, U5.d):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, InterfaceC2073o interfaceC2073o, Function1 function1, U5.d dVar) {
        Object e8 = N.e(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, interfaceC2073o, function1, new PressGestureScopeImpl(pointerInputScope), null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, InterfaceC2073o interfaceC2073o, Function1 function1, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2073o = NoPressGesture;
        }
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, interfaceC2073o, function1, dVar);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, InterfaceC2073o interfaceC2073o, Function1 function13, U5.d dVar) {
        Object e8 = N.e(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, interfaceC2073o, function12, function1, function13, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function12, InterfaceC2073o interfaceC2073o, Function1 function13, U5.d dVar, int i8, Object obj) {
        Function1 function14;
        Function1 function15;
        Function1 function16;
        if ((i8 & 1) != 0) {
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i8 & 2) != 0) {
            function15 = null;
        } else {
            function15 = function12;
        }
        if ((i8 & 4) != 0) {
            interfaceC2073o = NoPressGesture;
        }
        InterfaceC2073o interfaceC2073o2 = interfaceC2073o;
        if ((i8 & 8) != 0) {
            function16 = null;
        } else {
            function16 = function13;
        }
        return detectTapGestures(pointerInputScope, function14, function15, interfaceC2073o2, function16, dVar);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, boolean r10, androidx.compose.ui.input.pointer.PointerEventPass r11, U5.d r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            Q5.t.b(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L51
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            Q5.t.b(r12)
        L42:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L5d:
            if (r6 >= r4) goto L77
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r10 == 0) goto L6c
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L70
        L6c:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L70:
            if (r7 != 0) goto L74
            r2 = 0
            goto L78
        L74:
            int r6 = r6 + 1
            goto L5d
        L77:
            r2 = 1
        L78:
            if (r2 == 0) goto L42
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, U5.d):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z8, PointerEventPass pointerEventPass, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z8, pointerEventPass, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:            return null;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c0 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.ui.input.pointer.PointerEventPass r19, U5.d r20) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, U5.d):java.lang.Object");
    }
}
