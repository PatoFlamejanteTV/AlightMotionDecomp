package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class TextUnit {
    public static final Companion Companion = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m5352getUnspecifiedXSAIIZE$annotations() {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m5353getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m5367boximpl(companion.m5376getUnspecifiedUIouoOA()), TextUnitType.m5367boximpl(companion.m5375getSpUIouoOA()), TextUnitType.m5367boximpl(companion.m5374getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m5332boximpl(long j8) {
        return new TextUnit(j8);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m5333compareToR2X_6o(long j8, long j9) {
        TextUnitKt.m5356checkArithmeticNB67dxo(j8, j9);
        return Float.compare(m5342getValueimpl(j8), m5342getValueimpl(j9));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5334constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5336divkPz2Gy4(long j8, float f8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), m5342getValueimpl(j8) / f8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5338equalsimpl(long j8, Object obj) {
        return (obj instanceof TextUnit) && j8 == ((TextUnit) obj).m5351unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5339equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m5340getRawTypeimpl(long j8) {
        return j8 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m5341getTypeUIouoOA(long j8) {
        return TextUnitTypes[(int) (m5340getRawTypeimpl(j8) >>> 32)].m5373unboximpl();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m5342getValueimpl(long j8) {
        r rVar = r.f34602a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5343hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m5344isEmimpl(long j8) {
        if (m5340getRawTypeimpl(j8) == 8589934592L) {
            return true;
        }
        return false;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m5345isSpimpl(long j8) {
        if (m5340getRawTypeimpl(j8) == 4294967296L) {
            return true;
        }
        return false;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5347timeskPz2Gy4(long j8, float f8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), m5342getValueimpl(j8) * f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5349toStringimpl(long j8) {
        long m5341getTypeUIouoOA = m5341getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5376getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
            return m5342getValueimpl(j8) + ".sp";
        }
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
            return m5342getValueimpl(j8) + ".em";
        }
        return "Invalid";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m5350unaryMinusXSAIIZE(long j8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), -m5342getValueimpl(j8));
    }

    public boolean equals(Object obj) {
        return m5338equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5343hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5349toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5351unboximpl() {
        return this.packedValue;
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5335divkPz2Gy4(long j8, double d8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), (float) (m5342getValueimpl(j8) / d8));
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5346timeskPz2Gy4(long j8, double d8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), (float) (m5342getValueimpl(j8) * d8));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m5337divkPz2Gy4(long j8, int i8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), m5342getValueimpl(j8) / i8);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m5348timeskPz2Gy4(long j8, int i8) {
        TextUnitKt.m5355checkArithmeticR2X_6o(j8);
        return TextUnitKt.pack(m5340getRawTypeimpl(j8), m5342getValueimpl(j8) * i8);
    }
}
