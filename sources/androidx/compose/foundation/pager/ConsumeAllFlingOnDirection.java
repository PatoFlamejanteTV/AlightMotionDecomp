package androidx.compose.foundation.pager;

import U5.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ConsumeAllFlingOnDirection implements NestedScrollConnection {
    private final Orientation orientation;

    public ConsumeAllFlingOnDirection(Orientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        this.orientation = orientation;
    }

    /* renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m778consumeOnOrientation8S9VItk(long j8, Orientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return Offset.m2706copydBAh8RU$default(j8, 0.0f, 0.0f, 2, null);
        }
        return Offset.m2706copydBAh8RU$default(j8, 0.0f, 0.0f, 1, null);
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m779consumeOnOrientationQWom1Mo(long j8, Orientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return Velocity.m5382copyOhffZ5M$default(j8, 0.0f, 0.0f, 2, null);
        }
        return Velocity.m5382copyOhffZ5M$default(j8, 0.0f, 0.0f, 1, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo432onPostFlingRZ2iAVY(long j8, long j9, d dVar) {
        return Velocity.m5377boximpl(m779consumeOnOrientationQWom1Mo(j9, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        if (NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3901getFlingWNlRxjI())) {
            return m778consumeOnOrientation8S9VItk(j9, this.orientation);
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo434onPreFlingQWom1Mo(long j8, d dVar) {
        return a.c(this, j8, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo435onPreScrollOzD1aCk(long j8, int i8) {
        return a.d(this, j8, i8);
    }
}
