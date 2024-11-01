package androidx.compose.material.pullrefresh;

import U5.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.nestedscroll.a;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;
    private final Function1 onPull;
    private final InterfaceC2072n onRelease;

    public PullRefreshNestedScrollConnection(Function1 onPull, InterfaceC2072n onRelease, boolean z8) {
        AbstractC3292y.i(onPull, "onPull");
        AbstractC3292y.i(onRelease, "onRelease");
        this.onPull = onPull;
        this.onRelease = onRelease;
        this.enabled = z8;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo432onPostFlingRZ2iAVY(long j8, long j9, d dVar) {
        return a.a(this, j8, j9, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        if (!this.enabled) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3900getDragWNlRxjI()) && Offset.m2713getYimpl(j9) > 0.0f) {
            return OffsetKt.Offset(0.0f, ((Number) this.onPull.invoke(Float.valueOf(Offset.m2713getYimpl(j9)))).floatValue());
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo434onPreFlingQWom1Mo(long r5, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            float r5 = r0.F$0
            Q5.t.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            Q5.t.b(r7)
            c6.n r7 = r4.onRelease
            float r5 = androidx.compose.ui.unit.Velocity.m5387getYimpl(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m5377boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.mo434onPreFlingQWom1Mo(long, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo435onPreScrollOzD1aCk(long j8, int i8) {
        if (!this.enabled) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3900getDragWNlRxjI()) && Offset.m2713getYimpl(j8) < 0.0f) {
            return OffsetKt.Offset(0.0f, ((Number) this.onPull.invoke(Float.valueOf(Offset.m2713getYimpl(j8)))).floatValue());
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }
}
