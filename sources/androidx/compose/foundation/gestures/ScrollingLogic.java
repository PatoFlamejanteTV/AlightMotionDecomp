package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final MutableState<Boolean> isNestedFlinging;
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation, boolean z8, State<NestedScrollDispatcher> nestedScrollDispatcher, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        MutableState<Boolean> mutableStateOf$default;
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(nestedScrollDispatcher, "nestedScrollDispatcher");
        AbstractC3292y.i(scrollableState, "scrollableState");
        AbstractC3292y.i(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z8;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isNestedFlinging = mutableStateOf$default;
    }

    private final boolean getShouldDispatchOverscroll() {
        if (!this.scrollableState.getCanScrollForward() && !this.scrollableState.getCanScrollBackward()) {
            return false;
        }
        return true;
    }

    /* renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m436dispatchScroll3eAAhYA(ScrollScope dispatchScroll, long j8, int i8) {
        AbstractC3292y.i(dispatchScroll, "$this$dispatchScroll");
        long m441singleAxisOffsetMKHz9U = m441singleAxisOffsetMKHz9U(j8);
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i8, dispatchScroll);
        if (this.overscrollEffect != null && getShouldDispatchOverscroll()) {
            return this.overscrollEffect.mo254applyToScrollRhakbz0(m441singleAxisOffsetMKHz9U, i8, scrollingLogic$dispatchScroll$performScroll$1);
        }
        return ((Offset) scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m2701boximpl(m441singleAxisOffsetMKHz9U))).m2722unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m437doFlingAnimationQWom1Mo(long r12, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L14
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = V5.b.e()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r12 = r4.L$0
            kotlin.jvm.internal.S r12 = (kotlin.jvm.internal.S) r12
            Q5.t.b(r14)
            goto L5c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            kotlin.jvm.internal.S r14 = new kotlin.jvm.internal.S
            r14.<init>()
            r14.f34572a = r12
            androidx.compose.foundation.gestures.ScrollableState r1 = r11.scrollableState
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r3 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r3
            r6 = r11
            r7 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r10)
            r4.L$0 = r14
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.c.e(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5b
            return r0
        L5b:
            r12 = r14
        L5c:
            long r12 = r12.f34572a
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.m5377boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m437doFlingAnimationQWom1Mo(long, U5.d):java.lang.Object");
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m438onDragStoppedsFctU(long r6, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            Q5.t.b(r8)
            goto L71
        L39:
            Q5.t.b(r8)
            r5.registerNestedFling(r4)
            long r6 = r5.m442singleAxisVelocityAH228Gc(r6)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r8 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r8.<init>(r5, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            if (r2 == 0) goto L62
            boolean r2 = r5.getShouldDispatchOverscroll()
            if (r2 == 0) goto L62
            androidx.compose.foundation.OverscrollEffect r2 = r5.overscrollEffect
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r2.mo253applyToFlingBMRW4eQ(r6, r8, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r5
            goto L71
        L62:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m5377boximpl(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r8.invoke(r6, r0)
            if (r6 != r1) goto L60
            return r1
        L71:
            r7 = 0
            r6.registerNestedFling(r7)
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m438onDragStoppedsFctU(long, U5.d):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m439performRawScrollMKHz9U(long j8) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        return m445toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m444toFloatk4lQ0M(j8)))));
    }

    public final void registerNestedFling(boolean z8) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z8));
    }

    public final float reverseIfNeeded(float f8) {
        if (this.reverseDirection) {
            return f8 * (-1);
        }
        return f8;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m440reverseIfNeededMKHz9U(long j8) {
        if (this.reverseDirection) {
            return Offset.m2719timestuRUvjQ(j8, -1.0f);
        }
        return j8;
    }

    public final boolean shouldScrollImmediately() {
        boolean z8;
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (overscrollEffect != null) {
                z8 = overscrollEffect.isInProgress();
            } else {
                z8 = false;
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m441singleAxisOffsetMKHz9U(long j8) {
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m2706copydBAh8RU$default(j8, 0.0f, 0.0f, 1, null);
        }
        return Offset.m2706copydBAh8RU$default(j8, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m442singleAxisVelocityAH228Gc(long j8) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m5382copyOhffZ5M$default(j8, 0.0f, 0.0f, 1, null);
        }
        return Velocity.m5382copyOhffZ5M$default(j8, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m443toFloatTH1AsA0(long j8) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m5386getXimpl(j8);
        }
        return Velocity.m5387getYimpl(j8);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m444toFloatk4lQ0M(long j8) {
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m2712getXimpl(j8);
        }
        return Offset.m2713getYimpl(j8);
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m445toOffsettuRUvjQ(float f8) {
        if (f8 == 0.0f) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(f8, 0.0f);
        }
        return OffsetKt.Offset(0.0f, f8);
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m446updateQWom1Mo(long j8, float f8) {
        if (this.orientation == Orientation.Horizontal) {
            return Velocity.m5382copyOhffZ5M$default(j8, f8, 0.0f, 2, null);
        }
        return Velocity.m5382copyOhffZ5M$default(j8, 0.0f, f8, 1, null);
    }
}
