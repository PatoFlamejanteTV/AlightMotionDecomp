package androidx.compose.ui.text.style;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m5067constructorimpl(1);
    private static final int Rtl = m5067constructorimpl(2);
    private static final int Content = m5067constructorimpl(3);
    private static final int ContentOrLtr = m5067constructorimpl(4);
    private static final int ContentOrRtl = m5067constructorimpl(5);
    private static final int Unspecified = m5067constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m5073getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m5074getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m5075getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m5076getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m5077getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m5078getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TextDirection(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m5066boximpl(int i8) {
        return new TextDirection(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5067constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5068equalsimpl(int i8, Object obj) {
        return (obj instanceof TextDirection) && i8 == ((TextDirection) obj).m5072unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5069equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5070hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5071toStringimpl(int i8) {
        if (m5069equalsimpl0(i8, Ltr)) {
            return "Ltr";
        }
        if (m5069equalsimpl0(i8, Rtl)) {
            return "Rtl";
        }
        if (m5069equalsimpl0(i8, Content)) {
            return "Content";
        }
        if (m5069equalsimpl0(i8, ContentOrLtr)) {
            return "ContentOrLtr";
        }
        if (m5069equalsimpl0(i8, ContentOrRtl)) {
            return "ContentOrRtl";
        }
        if (m5069equalsimpl0(i8, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5068equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5070hashCodeimpl(this.value);
    }

    public String toString() {
        return m5071toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5072unboximpl() {
        return this.value;
    }
}
