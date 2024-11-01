package androidx.compose.ui.viewinterop;

import U5.d;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import e6.AbstractC2829a;

/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {
    private static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ Object mo432onPostFlingRZ2iAVY(long j8, long j9, d dVar) {
            return androidx.compose.ui.input.nestedscroll.a.a(this, j8, j9, dVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public /* synthetic */ long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
            return androidx.compose.ui.input.nestedscroll.a.b(this, j8, j9, i8);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        public /* synthetic */ Object mo434onPreFlingQWom1Mo(long j8, d dVar) {
            return androidx.compose.ui.input.nestedscroll.a.c(this, j8, dVar);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public /* synthetic */ long mo435onPreScrollOzD1aCk(long j8, int i8) {
            return androidx.compose.ui.input.nestedscroll.a.d(this, j8, i8);
        }
    };
    private static final int Unmeasured = Integer.MIN_VALUE;

    public static final /* synthetic */ void access$layoutAccordingTo(View view, LayoutNode layoutNode) {
        layoutAccordingTo(view, layoutNode);
    }

    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int d8 = AbstractC2829a.d(Offset.m2712getXimpl(positionInRoot));
        int d9 = AbstractC2829a.d(Offset.m2713getYimpl(positionInRoot));
        view.layout(d8, d9, view.getMeasuredWidth() + d8, view.getMeasuredHeight() + d9);
    }

    public static final float toComposeOffset(int i8) {
        return i8 * (-1);
    }

    public static final float toComposeVelocity(float f8) {
        return f8 * (-1.0f);
    }

    public static final int toNestedScrollSource(int i8) {
        if (i8 == 0) {
            return NestedScrollSource.Companion.m3900getDragWNlRxjI();
        }
        return NestedScrollSource.Companion.m3901getFlingWNlRxjI();
    }
}
