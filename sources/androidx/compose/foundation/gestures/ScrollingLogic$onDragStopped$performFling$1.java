package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.unit.Velocity;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {464, 466, 468}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends l implements InterfaceC2072n {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, U5.d dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, dVar);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).m5395unboximpl();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m449invokesFctU(((Velocity) obj).m5395unboximpl(), (U5.d) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m449invokesFctU(long j8, U5.d dVar) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m5377boximpl(j8), dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = V5.b.e()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            long r0 = r13.J$1
            long r2 = r13.J$0
            Q5.t.b(r14)
            r9 = r0
            r0 = r14
            goto L95
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            long r2 = r13.J$1
            long r4 = r13.J$0
            Q5.t.b(r14)
            r0 = r14
            r7 = r4
            goto L6e
        L2e:
            long r3 = r13.J$0
            Q5.t.b(r14)
            r0 = r14
            goto L52
        L35:
            Q5.t.b(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.m3890dispatchPreFlingQWom1Mo(r4, r13)
            if (r0 != r6) goto L51
            return r6
        L51:
            r3 = r4
        L52:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.m5395unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m5389minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m437doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L6b
            return r6
        L6b:
            r11 = r3
            r2 = r7
            r7 = r11
        L6e:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.m5395unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            long r2 = androidx.compose.ui.unit.Velocity.m5389minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.m3888dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L94
            return r6
        L94:
            r2 = r7
        L95:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.m5395unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m5389minusAH228Gc(r9, r0)
            long r0 = androidx.compose.ui.unit.Velocity.m5389minusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5377boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
