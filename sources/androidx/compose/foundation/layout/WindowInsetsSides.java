package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m664getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m665getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m666getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m667getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m668getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m669getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m670getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m671getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m672getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m673getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m674getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m675getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        int m655constructorimpl = m655constructorimpl(8);
        AllowLeftInLtr = m655constructorimpl;
        int m655constructorimpl2 = m655constructorimpl(4);
        AllowRightInLtr = m655constructorimpl2;
        int m655constructorimpl3 = m655constructorimpl(2);
        AllowLeftInRtl = m655constructorimpl3;
        int m655constructorimpl4 = m655constructorimpl(1);
        AllowRightInRtl = m655constructorimpl4;
        Start = m660plusgK_yJZ4(m655constructorimpl, m655constructorimpl4);
        End = m660plusgK_yJZ4(m655constructorimpl2, m655constructorimpl3);
        int m655constructorimpl5 = m655constructorimpl(16);
        Top = m655constructorimpl5;
        int m655constructorimpl6 = m655constructorimpl(32);
        Bottom = m655constructorimpl6;
        int m660plusgK_yJZ4 = m660plusgK_yJZ4(m655constructorimpl, m655constructorimpl3);
        Left = m660plusgK_yJZ4;
        int m660plusgK_yJZ42 = m660plusgK_yJZ4(m655constructorimpl2, m655constructorimpl4);
        Right = m660plusgK_yJZ42;
        Horizontal = m660plusgK_yJZ4(m660plusgK_yJZ4, m660plusgK_yJZ42);
        Vertical = m660plusgK_yJZ4(m655constructorimpl5, m655constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m654boximpl(int i8) {
        return new WindowInsetsSides(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m655constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m656equalsimpl(int i8, Object obj) {
        return (obj instanceof WindowInsetsSides) && i8 == ((WindowInsetsSides) obj).m663unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m657equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m658hasAnybkgdKaI$foundation_layout_release(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m659hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m660plusgK_yJZ4(int i8, int i9) {
        return m655constructorimpl(i8 | i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m661toStringimpl(int i8) {
        return "WindowInsetsSides(" + m662valueToStringimpl(i8) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m662valueToStringimpl(int i8) {
        StringBuilder sb = new StringBuilder();
        int i9 = Start;
        if ((i8 & i9) == i9) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i10 = Left;
        if ((i8 & i10) == i10) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i11 = Top;
        if ((i8 & i11) == i11) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i12 = End;
        if ((i8 & i12) == i12) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i13 = Right;
        if ((i8 & i13) == i13) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i14 = Bottom;
        if ((i8 & i14) == i14) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m656equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m659hashCodeimpl(this.value);
    }

    public String toString() {
        return m661toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m663unboximpl() {
        return this.value;
    }
}
