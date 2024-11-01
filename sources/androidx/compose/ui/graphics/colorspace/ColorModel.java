package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class ColorModel {
    private static final long Cmyk;
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m3337getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m3338getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m3339getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m3340getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        long j8 = 3;
        long j9 = j8 << 32;
        Rgb = m3330constructorimpl((0 & 4294967295L) | j9);
        Xyz = m3330constructorimpl((1 & 4294967295L) | j9);
        Lab = m3330constructorimpl(j9 | (2 & 4294967295L));
        Cmyk = m3330constructorimpl((j8 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m3329boximpl(long j8) {
        return new ColorModel(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3330constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3331equalsimpl(long j8, Object obj) {
        return (obj instanceof ColorModel) && j8 == ((ColorModel) obj).m3336unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3332equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    @IntRange(from = 1, to = 4)
    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m3333getComponentCountimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3334hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3335toStringimpl(long j8) {
        if (m3332equalsimpl0(j8, Rgb)) {
            return "Rgb";
        }
        if (m3332equalsimpl0(j8, Xyz)) {
            return "Xyz";
        }
        if (m3332equalsimpl0(j8, Lab)) {
            return "Lab";
        }
        if (m3332equalsimpl0(j8, Cmyk)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3331equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3334hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3335toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3336unboximpl() {
        return this.packedValue;
    }
}
