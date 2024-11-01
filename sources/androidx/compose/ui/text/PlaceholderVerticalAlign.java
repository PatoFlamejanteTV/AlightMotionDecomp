package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m4594constructorimpl(1);
    private static final int Top = m4594constructorimpl(2);
    private static final int Bottom = m4594constructorimpl(3);
    private static final int Center = m4594constructorimpl(4);
    private static final int TextTop = m4594constructorimpl(5);
    private static final int TextBottom = m4594constructorimpl(6);
    private static final int TextCenter = m4594constructorimpl(7);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m4600getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m4601getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m4602getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m4603getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m4604getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m4605getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m4606getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m4593boximpl(int i8) {
        return new PlaceholderVerticalAlign(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4594constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4595equalsimpl(int i8, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i8 == ((PlaceholderVerticalAlign) obj).m4599unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4596equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4597hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4598toStringimpl(int i8) {
        if (m4596equalsimpl0(i8, AboveBaseline)) {
            return "AboveBaseline";
        }
        if (m4596equalsimpl0(i8, Top)) {
            return "Top";
        }
        if (m4596equalsimpl0(i8, Bottom)) {
            return "Bottom";
        }
        if (m4596equalsimpl0(i8, Center)) {
            return "Center";
        }
        if (m4596equalsimpl0(i8, TextTop)) {
            return "TextTop";
        }
        if (m4596equalsimpl0(i8, TextBottom)) {
            return "TextBottom";
        }
        if (m4596equalsimpl0(i8, TextCenter)) {
            return "TextCenter";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4595equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4597hashCodeimpl(this.value);
    }

    public String toString() {
        return m4598toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4599unboximpl() {
        return this.value;
    }
}
