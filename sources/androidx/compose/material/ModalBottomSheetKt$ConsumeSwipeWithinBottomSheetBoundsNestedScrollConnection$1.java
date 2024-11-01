package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;

/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ AnchoredDraggableState<?> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        this.$state = anchoredDraggableState;
        this.$orientation = orientation;
    }

    private final float offsetToFloat(long j8) {
        if (this.$orientation == Orientation.Horizontal) {
            return Offset.m2712getXimpl(j8);
        }
        return Offset.m2713getYimpl(j8);
    }

    private final long toOffset(float f8) {
        float f9;
        Orientation orientation = this.$orientation;
        if (orientation == Orientation.Horizontal) {
            f9 = f8;
        } else {
            f9 = 0.0f;
        }
        if (orientation != Orientation.Vertical) {
            f8 = 0.0f;
        }
        return OffsetKt.Offset(f9, f8);
    }

    private final float velocityToFloat(long j8) {
        if (this.$orientation == Orientation.Horizontal) {
            return Velocity.m5386getXimpl(j8);
        }
        return Velocity.m5387getYimpl(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo432onPostFlingRZ2iAVY(long r3, long r5, U5.d r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = V5.b.e()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.J$0
            Q5.t.b(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            Q5.t.b(r4)
            androidx.compose.material.AnchoredDraggableState<?> r4 = r2.$state
            float r0 = r2.velocityToFloat(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.settle(r0, r3)
            if (r3 != r7) goto L47
            return r7
        L47:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.m5377boximpl(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo432onPostFlingRZ2iAVY(long, long, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        if (NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3900getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat(j9)));
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
    public java.lang.Object mo434onPreFlingQWom1Mo(long r6, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r6 = r0.J$0
            Q5.t.b(r8)
            goto L62
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            Q5.t.b(r8)
            float r8 = r5.velocityToFloat(r6)
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            float r2 = r2.requireOffset()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L5c
            androidx.compose.material.AnchoredDraggableState<?> r4 = r5.$state
            float r4 = r4.getMinOffset()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L5c
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.settle(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L5c:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r6.m5397getZero9UxMQ8M()
        L62:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m5377boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo434onPreFlingQWom1Mo(long, U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo435onPreScrollOzD1aCk(long j8, int i8) {
        float offsetToFloat = offsetToFloat(j8);
        if (offsetToFloat < 0.0f && NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3900getDragWNlRxjI())) {
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat));
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }
}
