package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4788constructorimpl(0);
    private static final int All = m4788constructorimpl(1);
    private static final int Weight = m4788constructorimpl(2);
    private static final int Style = m4788constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m4796getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m4797getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m4798getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m4799getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FontSynthesis(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m4787boximpl(int i8) {
        return new FontSynthesis(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4788constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4789equalsimpl(int i8, Object obj) {
        return (obj instanceof FontSynthesis) && i8 == ((FontSynthesis) obj).m4795unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4790equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4791hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4792isStyleOnimpl$ui_text_release(int i8) {
        if (!m4790equalsimpl0(i8, All) && !m4790equalsimpl0(i8, Style)) {
            return false;
        }
        return true;
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m4793isWeightOnimpl$ui_text_release(int i8) {
        if (!m4790equalsimpl0(i8, All) && !m4790equalsimpl0(i8, Weight)) {
            return false;
        }
        return true;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4794toStringimpl(int i8) {
        if (m4790equalsimpl0(i8, None)) {
            return "None";
        }
        if (m4790equalsimpl0(i8, All)) {
            return "All";
        }
        if (m4790equalsimpl0(i8, Weight)) {
            return "Weight";
        }
        if (m4790equalsimpl0(i8, Style)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4789equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4791hashCodeimpl(this.value);
    }

    public String toString() {
        return m4794toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4795unboximpl() {
        return this.value;
    }
}
