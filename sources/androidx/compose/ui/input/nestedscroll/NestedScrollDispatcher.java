package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import kotlin.jvm.functions.Function0;
import n6.M;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private Function0 calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    private ModifierLocalModifierNode modifierLocalNode;
    private M scope;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3888dispatchPostFlingRZ2iAVY(long r8, long r10, U5.d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            Q5.t.b(r12)
            goto L47
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            Q5.t.b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L4e
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo432onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L47
            return r0
        L47:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m5395unboximpl()
            goto L54
        L4e:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m5397getZero9UxMQ8M()
        L54:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m5377boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3888dispatchPostFlingRZ2iAVY(long, long, U5.d):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m3889dispatchPostScrollDzOQY0M(long j8, long j9, int i8) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            return parent$ui_release.mo433onPostScrollDzOQY0M(j8, j9, i8);
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3890dispatchPreFlingQWom1Mo(long r5, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Q5.t.b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L4a
            r0.label = r3
            java.lang.Object r7 = r7.mo434onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r5 = r7.m5395unboximpl()
            goto L50
        L4a:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r5.m5397getZero9UxMQ8M()
        L50:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m5377boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3890dispatchPreFlingQWom1Mo(long, U5.d):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m3891dispatchPreScrollOzD1aCk(long j8, int i8) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            return parent$ui_release.mo435onPreScrollOzD1aCk(j8, i8);
        }
        return Offset.Companion.m2728getZeroF1C5BW0();
    }

    public final Function0 getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final M getCoroutineScope() {
        M m8 = (M) this.calculateNestedScrollScope.invoke();
        if (m8 != null) {
            return m8;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final ModifierLocalModifierNode getModifierLocalNode$ui_release() {
        return this.modifierLocalNode;
    }

    public final NestedScrollConnection getParent$ui_release() {
        ModifierLocalModifierNode modifierLocalModifierNode = this.modifierLocalNode;
        if (modifierLocalModifierNode != null) {
            return (NestedScrollNode) modifierLocalModifierNode.getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    public final M getScope$ui_release() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0 function0) {
        this.calculateNestedScrollScope = function0;
    }

    public final void setModifierLocalNode$ui_release(ModifierLocalModifierNode modifierLocalModifierNode) {
        this.modifierLocalNode = modifierLocalModifierNode;
    }

    public final void setScope$ui_release(M m8) {
        this.scope = m8;
    }
}
