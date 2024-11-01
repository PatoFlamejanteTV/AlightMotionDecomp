package androidx.compose.ui.unit;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m5368constructorimpl(0);
    private static final long Sp = m5368constructorimpl(4294967296L);
    private static final long Em = m5368constructorimpl(8589934592L);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m5374getEmUIouoOA() {
            return TextUnitType.Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m5375getSpUIouoOA() {
            return TextUnitType.Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m5376getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TextUnitType(long j8) {
        this.type = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m5367boximpl(long j8) {
        return new TextUnitType(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5368constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5369equalsimpl(long j8, Object obj) {
        return (obj instanceof TextUnitType) && j8 == ((TextUnitType) obj).m5373unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5370equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5371hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5372toStringimpl(long j8) {
        if (m5370equalsimpl0(j8, Unspecified)) {
            return "Unspecified";
        }
        if (m5370equalsimpl0(j8, Sp)) {
            return "Sp";
        }
        if (m5370equalsimpl0(j8, Em)) {
            return "Em";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5369equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m5371hashCodeimpl(this.type);
    }

    public String toString() {
        return m5372toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5373unboximpl() {
        return this.type;
    }
}
