package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.jvm.internal.AbstractC3292y;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final InterfaceC4158a mutex;

    public PressGestureScopeImpl(Density density) {
        AbstractC3292y.i(density, "density");
        this.$$delegate_0 = density;
        this.mutex = AbstractC4160c.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitRelease(U5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Q5.t.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Q5.t.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            Q5.I r5 = Q5.I.f8786a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(U5.d):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        InterfaceC4158a.C0922a.c(this.mutex, null, 1, null);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        InterfaceC4158a.C0922a.c(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object reset(U5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            Q5.t.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Q5.t.b(r5)
            w6.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = w6.InterfaceC4158a.C0922a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            Q5.I r5 = Q5.I.f8786a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public int mo418roundToPxR2X_6o(long j8) {
        return this.$$delegate_0.mo418roundToPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
    public int mo419roundToPx0680j_4(float f8) {
        return this.$$delegate_0.mo419roundToPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    public float mo420toDpGaN1DYA(long j8) {
        return this.$$delegate_0.mo420toDpGaN1DYA(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo421toDpu2uoSUM(float f8) {
        return this.$$delegate_0.mo421toDpu2uoSUM(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
    public long mo423toDpSizekrfVVM(long j8) {
        return this.$$delegate_0.mo423toDpSizekrfVVM(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o, reason: not valid java name */
    public float mo424toPxR2X_6o(long j8) {
        return this.$$delegate_0.mo424toPxR2X_6o(j8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4, reason: not valid java name */
    public float mo425toPx0680j_4(float f8) {
        return this.$$delegate_0.mo425toPx0680j_4(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        AbstractC3292y.i(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
    public long mo426toSizeXkaWNTQ(long j8) {
        return this.$$delegate_0.mo426toSizeXkaWNTQ(j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    public long mo427toSp0xMU5do(float f8) {
        return this.$$delegate_0.mo427toSp0xMU5do(f8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo428toSpkPz2Gy4(float f8) {
        return this.$$delegate_0.mo428toSpkPz2Gy4(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object tryAwaitRelease(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            Q5.t.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            Q5.t.b(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            w6.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = w6.InterfaceC4158a.C0922a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            w6.a r6 = r0.mutex
            w6.InterfaceC4158a.C0922a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(U5.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo422toDpu2uoSUM(int i8) {
        return this.$$delegate_0.mo422toDpu2uoSUM(i8);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo429toSpkPz2Gy4(int i8) {
        return this.$$delegate_0.mo429toSpkPz2Gy4(i8);
    }
}
