package androidx.compose.ui.text.style;

import androidx.compose.foundation.a;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m5089constructorimpl(1);
        private static final int FontHinting = m5089constructorimpl(2);
        private static final int None = m5089constructorimpl(3);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m5095getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m5096getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m5097getNone4e0Vf04() {
                return Linearity.None;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private /* synthetic */ Linearity(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m5088boximpl(int i8) {
            return new Linearity(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5089constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5090equalsimpl(int i8, Object obj) {
            return (obj instanceof Linearity) && i8 == ((Linearity) obj).m5094unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5091equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5092hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5093toStringimpl(int i8) {
            if (m5091equalsimpl0(i8, Linear)) {
                return "Linearity.Linear";
            }
            if (m5091equalsimpl0(i8, FontHinting)) {
                return "Linearity.FontHinting";
            }
            if (m5091equalsimpl0(i8, None)) {
                return "Linearity.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m5090equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m5092hashCodeimpl(this.value);
        }

        public String toString() {
            return m5093toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5094unboximpl() {
            return this.value;
        }
    }

    static {
        AbstractC3284p abstractC3284p = null;
        Companion = new Companion(abstractC3284p);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m5095getFontHinting4e0Vf04(), false, abstractC3284p);
        Animated = new TextMotion(companion.m5096getLinear4e0Vf04(), true, abstractC3284p);
    }

    public /* synthetic */ TextMotion(int i8, boolean z8, AbstractC3284p abstractC3284p) {
        this(i8, z8);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m5085copyJdDtMQo$ui_text_release$default(TextMotion textMotion, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = textMotion.linearity;
        }
        if ((i9 & 2) != 0) {
            z8 = textMotion.subpixelTextPositioning;
        }
        return textMotion.m5086copyJdDtMQo$ui_text_release(i8, z8);
    }

    /* renamed from: copy-JdDtMQo$ui_text_release, reason: not valid java name */
    public final TextMotion m5086copyJdDtMQo$ui_text_release(int i8, boolean z8) {
        return new TextMotion(i8, z8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        if (Linearity.m5091equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning) {
            return true;
        }
        return false;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text_release, reason: not valid java name */
    public final int m5087getLinearity4e0Vf04$ui_text_release() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (Linearity.m5092hashCodeimpl(this.linearity) * 31) + a.a(this.subpixelTextPositioning);
    }

    public String toString() {
        if (AbstractC3292y.d(this, Static)) {
            return "TextMotion.Static";
        }
        if (AbstractC3292y.d(this, Animated)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    private TextMotion(int i8, boolean z8) {
        this.linearity = i8;
        this.subpixelTextPositioning = z8;
    }
}
