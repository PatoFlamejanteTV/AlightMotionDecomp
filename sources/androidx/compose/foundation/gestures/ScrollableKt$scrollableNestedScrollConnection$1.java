package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;

/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$scrollableNestedScrollConnection$1(State<ScrollingLogic> state, boolean z8) {
        this.$scrollLogic = state;
        this.$enabled = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo432onPostFlingRZ2iAVY(long r3, long r5, U5.d r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = V5.b.e()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            long r5 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1) r3
            Q5.t.b(r4)
            goto L54
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L37:
            Q5.t.b(r4)
            boolean r4 = r2.$enabled
            if (r4 == 0) goto L5f
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.$scrollLogic
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.m437doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L53
            return r7
        L53:
            r3 = r2
        L54:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r0 = r4.m5395unboximpl()
            long r4 = androidx.compose.ui.unit.Velocity.m5389minusAH228Gc(r5, r0)
            goto L66
        L5f:
            androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r3.m5397getZero9UxMQ8M()
            r3 = r2
        L66:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m5377boximpl(r4)
            androidx.compose.runtime.State<androidx.compose.foundation.gestures.ScrollingLogic> r3 = r3.$scrollLogic
            r4.m5395unboximpl()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
            r5 = 0
            r3.registerNestedFling(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.mo432onPostFlingRZ2iAVY(long, long, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        if (this.$enabled) {
            return this.$scrollLogic.getValue().m439performRawScrollMKHz9U(j9);
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public /* synthetic */ Object mo434onPreFlingQWom1Mo(long j8, U5.d dVar) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j8, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo435onPreScrollOzD1aCk(long j8, int i8) {
        if (NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3901getFlingWNlRxjI())) {
            this.$scrollLogic.getValue().registerNestedFling(true);
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }
}
