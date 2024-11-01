package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class DpSize {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m5262getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m5263getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        float f8 = 0;
        Zero = DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m5177DpSizeYgX7TsA(companion.m5175getUnspecifiedD9Ej5fM(), companion.m5175getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m5241boximpl(long j8) {
        return new DpSize(j8);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m5242component1D9Ej5fM(long j8) {
        return m5253getWidthD9Ej5fM(j8);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m5243component2D9Ej5fM(long j8) {
        return m5251getHeightD9Ej5fM(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5244constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m5245copyDwJknco(long j8, float f8, float f9) {
        return DpKt.m5177DpSizeYgX7TsA(f8, f9);
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m5246copyDwJknco$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m5253getWidthD9Ej5fM(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m5251getHeightD9Ej5fM(j8);
        }
        return m5245copyDwJknco(j8, f8, f9);
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m5248divGh9hcWk(long j8, int i8) {
        float f8 = i8;
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) / f8), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) / f8));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5249equalsimpl(long j8, Object obj) {
        return (obj instanceof DpSize) && j8 == ((DpSize) obj).m5261unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5250equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m5251getHeightD9Ej5fM(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Dp.m5155constructorimpl(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5252getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m5253getWidthD9Ej5fM(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f34602a;
            return Dp.m5155constructorimpl(Float.intBitsToFloat((int) (j8 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5254getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5255hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m5256minuse_xh8Ic(long j8, long j9) {
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) - m5253getWidthD9Ej5fM(j9)), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) - m5251getHeightD9Ej5fM(j9)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m5257pluse_xh8Ic(long j8, long j9) {
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) + m5253getWidthD9Ej5fM(j9)), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) + m5251getHeightD9Ej5fM(j9)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m5259timesGh9hcWk(long j8, int i8) {
        float f8 = i8;
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) * f8), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) * f8));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5260toStringimpl(long j8) {
        if (j8 != Companion.m5262getUnspecifiedMYxV2XQ()) {
            return ((Object) Dp.m5166toStringimpl(m5253getWidthD9Ej5fM(j8))) + " x " + ((Object) Dp.m5166toStringimpl(m5251getHeightD9Ej5fM(j8)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return m5249equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5255hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m5260toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5261unboximpl() {
        return this.packedValue;
    }

    @Stable
    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m5247divGh9hcWk(long j8, float f8) {
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) / f8), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) / f8));
    }

    @Stable
    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m5258timesGh9hcWk(long j8, float f8) {
        return DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(m5253getWidthD9Ej5fM(j8) * f8), Dp.m5155constructorimpl(m5251getHeightD9Ej5fM(j8) * f8));
    }
}
