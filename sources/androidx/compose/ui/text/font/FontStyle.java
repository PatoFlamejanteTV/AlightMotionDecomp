package androidx.compose.ui.text.font;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m4777constructorimpl(0);
    private static final int Italic = m4777constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4783getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m4784getNormal_LCdwA$annotations() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m4785getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m4786getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return AbstractC1435t.p(FontStyle.m4776boximpl(m4786getNormal_LCdwA()), FontStyle.m4776boximpl(m4785getItalic_LCdwA()));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FontStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m4776boximpl(int i8) {
        return new FontStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4777constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4778equalsimpl(int i8, Object obj) {
        return (obj instanceof FontStyle) && i8 == ((FontStyle) obj).m4782unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4779equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4780hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4781toStringimpl(int i8) {
        if (m4779equalsimpl0(i8, Normal)) {
            return "Normal";
        }
        if (m4779equalsimpl0(i8, Italic)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4778equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4780hashCodeimpl(this.value);
    }

    public String toString() {
        return m4781toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4782unboximpl() {
        return this.value;
    }
}
