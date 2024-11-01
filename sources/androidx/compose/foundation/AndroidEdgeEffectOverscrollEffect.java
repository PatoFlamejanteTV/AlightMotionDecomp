package androidx.compose.foundation;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import e6.AbstractC2829a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    private final List<EdgeEffect> allEffects;
    private final EdgeEffect bottomEffect;
    private final EdgeEffect bottomEffectNegation;
    private long containerSize;
    private final Modifier effectModifier;
    private boolean invalidationEnabled;
    private final EdgeEffect leftEffect;
    private final EdgeEffect leftEffectNegation;
    private final Function1 onNewSize;
    private final OverscrollConfiguration overscrollConfig;
    private PointerId pointerId;
    private Offset pointerPosition;
    private final MutableState<I> redrawSignal;
    private final EdgeEffect rightEffect;
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;
    private final EdgeEffect topEffect;
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverscrollEffect(Context context, OverscrollConfiguration overscrollConfig) {
        Modifier modifier;
        Function1 noInspectorInfo;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        List<EdgeEffect> p8 = AbstractC1435t.p(create3, create, create4, create2);
        this.allEffects = p8;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = p8.size();
        for (int i8 = 0; i8 < size; i8++) {
            p8.get(i8).setColor(ColorKt.m3002toArgb8_81llA(this.overscrollConfig.m343getGlowColor0d7_KjU()));
        }
        I i9 = I.f8786a;
        this.redrawSignal = SnapshotStateKt.mutableStateOf(i9, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.containerSize = Size.Companion.m2790getZeroNHjbRc();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.onNewSize = androidEdgeEffectOverscrollEffect$onNewSize$1;
        Modifier.Companion companion = Modifier.Companion;
        modifier = AndroidOverscrollKt.StretchOverscrollNonClippingLayer;
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), i9, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), androidEdgeEffectOverscrollEffect$onNewSize$1);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1(this);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        this.effectModifier = onSizeChanged.then(new DrawOverscrollModifier(this, noInspectorInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            EdgeEffect edgeEffect = list.get(i8);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z8) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        if (z8) {
            invalidateOverscroll();
        }
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m2781getWidthimpl(this.containerSize), (-Size.m2778getHeightimpl(this.containerSize)) + drawScope.mo425toPx0680j_4(this.overscrollConfig.getDrawPadding().mo527calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m2778getHeightimpl(this.containerSize), drawScope.mo425toPx0680j_4(this.overscrollConfig.getDrawPadding().mo528calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int d8 = AbstractC2829a.d(Size.m2781getWidthimpl(this.containerSize));
        float mo529calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo529calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-d8) + drawScope.mo425toPx0680j_4(mo529calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo425toPx0680j_4(this.overscrollConfig.getDrawPadding().mo530calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(I.f8786a);
        }
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m248pullBottom0a9Yr6o(long j8, long j9) {
        float m2712getXimpl = Offset.m2712getXimpl(j9) / Size.m2781getWidthimpl(this.containerSize);
        float m2713getYimpl = Offset.m2713getYimpl(j8) / Size.m2778getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float m2778getHeightimpl = (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -m2713getYimpl, 1 - m2712getXimpl)) * Size.m2778getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) != 0.0f) {
            return Offset.m2713getYimpl(j8);
        }
        return m2778getHeightimpl;
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m249pullLeft0a9Yr6o(long j8, long j9) {
        float m2713getYimpl = Offset.m2713getYimpl(j9) / Size.m2778getHeightimpl(this.containerSize);
        float m2712getXimpl = Offset.m2712getXimpl(j8) / Size.m2781getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.leftEffect, m2712getXimpl, 1 - m2713getYimpl) * Size.m2781getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) != 0.0f) {
            return Offset.m2712getXimpl(j8);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m250pullRight0a9Yr6o(long j8, long j9) {
        float m2713getYimpl = Offset.m2713getYimpl(j9) / Size.m2778getHeightimpl(this.containerSize);
        float m2712getXimpl = Offset.m2712getXimpl(j8) / Size.m2781getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float m2781getWidthimpl = (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -m2712getXimpl, m2713getYimpl)) * Size.m2781getWidthimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            return Offset.m2712getXimpl(j8);
        }
        return m2781getWidthimpl;
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m251pullTop0a9Yr6o(long j8, long j9) {
        float m2712getXimpl = Offset.m2712getXimpl(j9) / Size.m2781getWidthimpl(this.containerSize);
        float m2713getYimpl = Offset.m2713getYimpl(j8) / Size.m2778getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.topEffect, m2713getYimpl, m2712getXimpl) * Size.m2778getHeightimpl(this.containerSize);
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            return Offset.m2713getYimpl(j8);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m252releaseOppositeOverscrollk4lQ0M(long j8) {
        boolean z8;
        boolean z9 = false;
        if (!this.leftEffect.isFinished() && Offset.m2712getXimpl(j8) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m2712getXimpl(j8));
            z8 = this.leftEffect.isFinished();
        } else {
            z8 = false;
        }
        if (!this.rightEffect.isFinished() && Offset.m2712getXimpl(j8) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m2712getXimpl(j8));
            if (!z8 && !this.rightEffect.isFinished()) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        if (!this.topEffect.isFinished() && Offset.m2713getYimpl(j8) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m2713getYimpl(j8));
            if (!z8 && !this.topEffect.isFinished()) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        if (!this.bottomEffect.isFinished() && Offset.m2713getYimpl(j8) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m2713getYimpl(j8));
            if (z8 || this.bottomEffect.isFinished()) {
                z9 = true;
            }
            return z9;
        }
        return z8;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z8;
        long m2791getCenteruvyYCjk = SizeKt.m2791getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z8 = false;
        } else {
            m249pullLeft0a9Yr6o(Offset.Companion.m2728getZeroF1C5BW0(), m2791getCenteruvyYCjk);
            z8 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            m250pullRight0a9Yr6o(Offset.Companion.m2728getZeroF1C5BW0(), m2791getCenteruvyYCjk);
            z8 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            m251pullTop0a9Yr6o(Offset.Companion.m2728getZeroF1C5BW0(), m2791getCenteruvyYCjk);
            z8 = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z8;
        }
        m248pullBottom0a9Yr6o(Offset.Companion.m2728getZeroF1C5BW0(), m2791getCenteruvyYCjk);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo253applyToFlingBMRW4eQ(long r11, c6.InterfaceC2072n r13, U5.d r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo253applyToFlingBMRW4eQ(long, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo254applyToScrollRhakbz0(long r18, int r20, kotlin.jvm.functions.Function1 r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo254applyToScrollRhakbz0(long, int, kotlin.jvm.functions.Function1):long");
    }

    public final void drawOverscroll(DrawScope drawScope) {
        boolean z8;
        AbstractC3292y.i(drawScope, "<this>");
        if (Size.m2783isEmptyimpl(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        boolean z9 = false;
        if (!this.leftEffect.isFinished()) {
            z8 = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        } else {
            z8 = false;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            if (!drawTop(drawScope, this.topEffect, nativeCanvas) && !z8) {
                z8 = false;
            } else {
                z8 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            if (!drawRight(drawScope, this.rightEffect, nativeCanvas) && !z8) {
                z8 = false;
            } else {
                z8 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (drawBottom(drawScope, this.bottomEffect, nativeCanvas) || z8) {
                z9 = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            z8 = z9;
        }
        if (z8) {
            invalidateOverscroll();
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.invalidationEnabled;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        boolean z8;
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i8)) == 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z8) {
        this.invalidationEnabled = z8;
    }
}
