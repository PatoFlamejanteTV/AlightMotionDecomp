package androidx.compose.ui.platform;

import R5.AbstractC1428l;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo432onPostFlingRZ2iAVY(long j8, long j9, U5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5386getXimpl(j9));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5387getYimpl(j9));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j9 = Velocity.Companion.m5397getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5377boximpl(j9);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        int m4467getScrollAxesk4lQ0M;
        int m4469toViewTypeGyEprt8;
        int m4469toViewTypeGyEprt82;
        long m4468toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4467getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4467getScrollAxesk4lQ0M(j9);
        m4469toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4469toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4467getScrollAxesk4lQ0M, m4469toViewTypeGyEprt8)) {
            AbstractC1428l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2712getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2713getYimpl(j8));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2712getXimpl(j9));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2713getYimpl(j9));
            m4469toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4469toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m4469toViewTypeGyEprt82, this.consumedScrollCache);
            m4468toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4468toOffsetUv8p0NA(this.consumedScrollCache, j9);
            return m4468toOffsetUv8p0NA;
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo434onPreFlingQWom1Mo(long j8, U5.d dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5386getXimpl(j8));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m5387getYimpl(j8));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j8 = Velocity.Companion.m5397getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m5377boximpl(j8);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo435onPreScrollOzD1aCk(long j8, int i8) {
        int m4467getScrollAxesk4lQ0M;
        int m4469toViewTypeGyEprt8;
        int m4469toViewTypeGyEprt82;
        long m4468toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m4467getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m4467getScrollAxesk4lQ0M(j8);
        m4469toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m4469toViewTypeGyEprt8(i8);
        if (nestedScrollingChildHelper.startNestedScroll(m4467getScrollAxesk4lQ0M, m4469toViewTypeGyEprt8)) {
            AbstractC1428l.v(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2712getXimpl(j8));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2713getYimpl(j8));
            int[] iArr = this.consumedScrollCache;
            m4469toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m4469toViewTypeGyEprt8(i8);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m4469toViewTypeGyEprt82);
            m4468toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m4468toOffsetUv8p0NA(this.consumedScrollCache, j8);
            return m4468toOffsetUv8p0NA;
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }
}
