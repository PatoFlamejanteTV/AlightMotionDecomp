package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;

/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f8, float f9) {
        drawTransform.inset(f8, f9, f8, f9);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        drawTransform.inset(f8, f9, f8, f9);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m3475rotateRad0AR0LA0(DrawTransform drawTransform, float f8, long j8) {
        drawTransform.mo3403rotateUv8p0NA(DegreesKt.degrees(f8), j8);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3476rotateRad0AR0LA0$default(DrawTransform drawTransform, float f8, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = drawTransform.mo3401getCenterF1C5BW0();
        }
        drawTransform.mo3403rotateUv8p0NA(DegreesKt.degrees(f8), j8);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m3477scale0AR0LA0(DrawTransform drawTransform, float f8, long j8) {
        drawTransform.mo3404scale0AR0LA0(f8, f8, j8);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m3478scale0AR0LA0$default(DrawTransform drawTransform, float f8, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = drawTransform.mo3401getCenterF1C5BW0();
        }
        drawTransform.mo3404scale0AR0LA0(f8, f8, j8);
    }

    public static final void inset(DrawTransform drawTransform, float f8) {
        drawTransform.inset(f8, f8, f8, f8);
    }
}
