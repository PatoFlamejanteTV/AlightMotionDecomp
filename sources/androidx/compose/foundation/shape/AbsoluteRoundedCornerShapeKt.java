package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(CornerSize corner) {
        AbstractC3292y.i(corner, "corner");
        return new AbsoluteRoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i8 & 8) != 0) {
            f11 = 0.0f;
        }
        return AbsoluteRoundedCornerShape(f8, f9, f10, f11);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m817AbsoluteRoundedCornerShape0680j_4(float f8) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m821CornerSize0680j_4(f8));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m818AbsoluteRoundedCornerShapea9UjIt4(float f8, float f9, float f10, float f11) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m821CornerSize0680j_4(f8), CornerSizeKt.m821CornerSize0680j_4(f9), CornerSizeKt.m821CornerSize0680j_4(f10), CornerSizeKt.m821CornerSize0680j_4(f11));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m819AbsoluteRoundedCornerShapea9UjIt4$default(float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 2) != 0) {
            f9 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 4) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        }
        if ((i8 & 8) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        }
        return m818AbsoluteRoundedCornerShapea9UjIt4(f8, f9, f10, f11);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f8) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f8));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return AbsoluteRoundedCornerShape(i8, i9, i10, i11);
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i8) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i8));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f8, float f9, float f10, float f11) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f8), CornerSizeKt.CornerSize(f9), CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11));
    }

    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i8, int i9, int i10, int i11) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i8), CornerSizeKt.CornerSize(i9), CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11));
    }
}
