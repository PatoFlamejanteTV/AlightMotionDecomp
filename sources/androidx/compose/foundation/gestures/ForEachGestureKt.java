package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ForEachGestureKt {
    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        AbstractC3292y.i(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            if (changes.get(i8).getPressed()) {
                z8 = true;
                break;
            }
            i8++;
        }
        return !z8;
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, U5.d dVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), dVar);
        return awaitPointerEventScope == V5.b.e() ? awaitPointerEventScope : I.f8786a;
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitEachGesture$2(dVar.getContext(), interfaceC2072n, null), dVar);
        if (awaitPointerEventScope == V5.b.e()) {
            return awaitPointerEventScope;
        }
        return I.f8786a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:            r10 = e;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, U5.g] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:13:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ab -> B:13:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r8, c6.InterfaceC2072n r9, U5.d r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L67
            if (r2 == r5) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r8 = r0.L$2
            U5.g r8 = (U5.g) r8
            java.lang.Object r9 = r0.L$1
            c6.n r9 = (c6.InterfaceC2072n) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            Q5.t.b(r10)
            goto L52
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            java.lang.Object r8 = r0.L$2
            U5.g r8 = (U5.g) r8
            java.lang.Object r9 = r0.L$1
            c6.n r9 = (c6.InterfaceC2072n) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            Q5.t.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
        L52:
            r10 = r8
            r8 = r2
            goto L6e
        L55:
            r10 = move-exception
            goto L99
        L57:
            java.lang.Object r8 = r0.L$2
            U5.g r8 = (U5.g) r8
            java.lang.Object r9 = r0.L$1
            c6.n r9 = (c6.InterfaceC2072n) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            Q5.t.b(r10)     // Catch: java.util.concurrent.CancellationException -> L55
            goto L85
        L67:
            Q5.t.b(r10)
            U5.g r10 = r0.getContext()
        L6e:
            boolean r2 = n6.B0.m(r10)
            if (r2 == 0) goto Laf
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L94
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L94
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L94
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L94
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L94
            if (r2 != r1) goto L83
            return r1
        L83:
            r2 = r8
            r8 = r10
        L85:
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L55
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L55
            r0.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L55
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r10 != r1) goto L52
            return r1
        L94:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L99:
            boolean r6 = n6.B0.m(r8)
            if (r6 == 0) goto Lae
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L52
            return r1
        Lae:
            throw r10
        Laf:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:            if (allPointersUp(r6) == false) goto L16;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, U5.d r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            Q5.t.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Q5.t.b(r7)
            boolean r7 = allPointersUp(r6)
            if (r7 != 0) goto L68
        L3e:
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r6.awaitPointerEvent(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            java.util.List r7 = r7.getChanges()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, U5.d):java.lang.Object");
    }
}
