package androidx.compose.ui.input.pointer;

import Q5.I;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {720, 721}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends l implements InterfaceC2072n {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j8, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, U5.d dVar) {
        super(2, dVar);
        this.$timeMillis = j8;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r8.label
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            Q5.t.b(r9)
            goto L38
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            Q5.t.b(r9)
            goto L2f
        L20:
            Q5.t.b(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = n6.X.b(r6, r8)
            if (r9 != r0) goto L2f
            return r0
        L2f:
            r8.label = r4
            java.lang.Object r9 = n6.X.b(r2, r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            n6.o r9 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.access$getPointerAwaiter$p(r9)
            if (r9 == 0) goto L54
            Q5.s$a r0 = Q5.s.f8810b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
            r9.resumeWith(r0)
        L54:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
