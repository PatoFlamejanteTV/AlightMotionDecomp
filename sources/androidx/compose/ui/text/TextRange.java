package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m4674getZerod9O1mEE() {
            return TextRange.Zero;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TextRange(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m4657boximpl(long j8) {
        return new TextRange(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4658constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m4659contains5zctL8(long j8, long j9) {
        if (m4667getMinimpl(j8) <= m4667getMinimpl(j9) && m4666getMaximpl(j9) <= m4666getMaximpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m4660containsimpl(long j8, int i8) {
        int m4667getMinimpl = m4667getMinimpl(j8);
        if (i8 >= m4666getMaximpl(j8) || m4667getMinimpl > i8) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4661equalsimpl(long j8, Object obj) {
        return (obj instanceof TextRange) && j8 == ((TextRange) obj).m4673unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4662equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m4663getCollapsedimpl(long j8) {
        if (m4669getStartimpl(j8) == m4664getEndimpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m4664getEndimpl(long j8) {
        return (int) (j8 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m4665getLengthimpl(long j8) {
        return m4666getMaximpl(j8) - m4667getMinimpl(j8);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m4666getMaximpl(long j8) {
        if (m4669getStartimpl(j8) > m4664getEndimpl(j8)) {
            return m4669getStartimpl(j8);
        }
        return m4664getEndimpl(j8);
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m4667getMinimpl(long j8) {
        if (m4669getStartimpl(j8) > m4664getEndimpl(j8)) {
            return m4664getEndimpl(j8);
        }
        return m4669getStartimpl(j8);
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m4668getReversedimpl(long j8) {
        if (m4669getStartimpl(j8) > m4664getEndimpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m4669getStartimpl(long j8) {
        return (int) (j8 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4670hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m4671intersects5zctL8(long j8, long j9) {
        if (m4667getMinimpl(j8) < m4666getMaximpl(j9) && m4667getMinimpl(j9) < m4666getMaximpl(j8)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4672toStringimpl(long j8) {
        return "TextRange(" + m4669getStartimpl(j8) + ", " + m4664getEndimpl(j8) + ')';
    }

    public boolean equals(Object obj) {
        return m4661equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4670hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4672toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4673unboximpl() {
        return this.packedValue;
    }
}
