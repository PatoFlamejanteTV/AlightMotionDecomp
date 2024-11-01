package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import e6.AbstractC2829a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Density density, long j8) {
        return AbstractC2829a.d(density.mo424toPxR2X_6o(j8));
    }

    public static int b(Density density, float f8) {
        float mo425toPx0680j_4 = density.mo425toPx0680j_4(f8);
        if (Float.isInfinite(mo425toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return AbstractC2829a.d(mo425toPx0680j_4);
    }

    public static float c(Density density, float f8) {
        return Dp.m5155constructorimpl(f8 / density.getDensity());
    }

    public static float d(Density density, int i8) {
        return Dp.m5155constructorimpl(i8 / density.getDensity());
    }

    public static long e(Density density, long j8) {
        if (j8 != Size.Companion.m2789getUnspecifiedNHjbRc()) {
            return DpKt.m5177DpSizeYgX7TsA(density.mo421toDpu2uoSUM(Size.m2781getWidthimpl(j8)), density.mo421toDpu2uoSUM(Size.m2778getHeightimpl(j8)));
        }
        return DpSize.Companion.m5262getUnspecifiedMYxV2XQ();
    }

    public static float f(Density density, long j8) {
        if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), TextUnitType.Companion.m5375getSpUIouoOA())) {
            return density.mo425toPx0680j_4(density.mo420toDpGaN1DYA(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(Density density, float f8) {
        return f8 * density.getDensity();
    }

    public static Rect h(Density density, DpRect dpRect) {
        return new Rect(density.mo425toPx0680j_4(dpRect.m5238getLeftD9Ej5fM()), density.mo425toPx0680j_4(dpRect.m5240getTopD9Ej5fM()), density.mo425toPx0680j_4(dpRect.m5239getRightD9Ej5fM()), density.mo425toPx0680j_4(dpRect.m5237getBottomD9Ej5fM()));
    }

    public static long i(Density density, long j8) {
        if (j8 != DpSize.Companion.m5262getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(density.mo425toPx0680j_4(DpSize.m5253getWidthD9Ej5fM(j8)), density.mo425toPx0680j_4(DpSize.m5251getHeightD9Ej5fM(j8)));
        }
        return Size.Companion.m2789getUnspecifiedNHjbRc();
    }

    public static long j(Density density, float f8) {
        return density.mo427toSp0xMU5do(density.mo421toDpu2uoSUM(f8));
    }

    public static long k(Density density, int i8) {
        return density.mo427toSp0xMU5do(density.mo422toDpu2uoSUM(i8));
    }
}
