package androidx.compose.ui.text.style;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4963constructorimpl(1);
    private static final int Auto = m4963constructorimpl(2);
    private static final int Unspecified = m4963constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m4969getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m4970getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m4971getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Hyphens(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m4962boximpl(int i8) {
        return new Hyphens(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4963constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4964equalsimpl(int i8, Object obj) {
        return (obj instanceof Hyphens) && i8 == ((Hyphens) obj).m4968unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4965equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4966hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4967toStringimpl(int i8) {
        if (m4965equalsimpl0(i8, None)) {
            return "Hyphens.None";
        }
        if (m4965equalsimpl0(i8, Auto)) {
            return "Hyphens.Auto";
        }
        if (m4965equalsimpl0(i8, Unspecified)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4964equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4966hashCodeimpl(this.value);
    }

    public String toString() {
        return m4967toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4968unboximpl() {
        return this.value;
    }
}
