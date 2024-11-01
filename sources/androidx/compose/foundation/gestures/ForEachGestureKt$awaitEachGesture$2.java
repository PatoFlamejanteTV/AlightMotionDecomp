package androidx.compose.foundation.gestures;

import Q5.I;
import U5.g;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitEachGesture$2 extends k implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ g $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(g gVar, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        super(2, dVar);
        this.$currentContext = gVar;
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, dVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0070 -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            Q5.t.b(r8)
            goto L28
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            Q5.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r8 = r1
            goto L3b
        L2a:
            r8 = move-exception
            goto L60
        L2c:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            Q5.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L51
        L34:
            Q5.t.b(r8)
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
        L3b:
            U5.g r1 = r7.$currentContext
            boolean r1 = n6.B0.m(r1)
            if (r1 == 0) goto L74
            c6.n r1 = r7.$block     // Catch: java.util.concurrent.CancellationException -> L5c
            r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L5c
            r7.label = r4     // Catch: java.util.concurrent.CancellationException -> L5c
            java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
            if (r1 != r0) goto L50
            return r0
        L50:
            r1 = r8
        L51:
            r7.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r8 != r0) goto L28
            return r0
        L5c:
            r1 = move-exception
            r6 = r1
            r1 = r8
            r8 = r6
        L60:
            U5.g r5 = r7.$currentContext
            boolean r5 = n6.B0.m(r5)
            if (r5 == 0) goto L73
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r1, r7)
            if (r8 != r0) goto L28
            return r0
        L73:
            throw r8
        L74:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
