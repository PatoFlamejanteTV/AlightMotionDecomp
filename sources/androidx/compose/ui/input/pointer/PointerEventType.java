package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3940constructorimpl(0);
    private static final int Press = m3940constructorimpl(1);
    private static final int Release = m3940constructorimpl(2);
    private static final int Move = m3940constructorimpl(3);
    private static final int Enter = m3940constructorimpl(4);
    private static final int Exit = m3940constructorimpl(5);
    private static final int Scroll = m3940constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m3946getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m3947getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m3948getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m3949getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m3950getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m3951getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m3952getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ PointerEventType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m3939boximpl(int i8) {
        return new PointerEventType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3940constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3941equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerEventType) && i8 == ((PointerEventType) obj).m3945unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3942equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3943hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3944toStringimpl(int i8) {
        if (m3942equalsimpl0(i8, Press)) {
            return "Press";
        }
        if (m3942equalsimpl0(i8, Release)) {
            return "Release";
        }
        if (m3942equalsimpl0(i8, Move)) {
            return "Move";
        }
        if (m3942equalsimpl0(i8, Enter)) {
            return "Enter";
        }
        if (m3942equalsimpl0(i8, Exit)) {
            return "Exit";
        }
        if (m3942equalsimpl0(i8, Scroll)) {
            return "Scroll";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3941equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3943hashCodeimpl(this.value);
    }

    public String toString() {
        return m3944toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3945unboximpl() {
        return this.value;
    }
}
