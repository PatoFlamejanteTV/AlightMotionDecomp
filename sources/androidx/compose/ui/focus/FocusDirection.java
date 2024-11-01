package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m2627constructorimpl(1);
    private static final int Previous = m2627constructorimpl(2);
    private static final int Left = m2627constructorimpl(3);
    private static final int Right = m2627constructorimpl(4);
    private static final int Up = m2627constructorimpl(5);
    private static final int Down = m2627constructorimpl(6);
    private static final int Enter = m2627constructorimpl(7);
    private static final int Exit = m2627constructorimpl(8);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2633getEnterdhqQ8s$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s$annotations, reason: not valid java name */
        public static /* synthetic */ void m2634getExitdhqQ8s$annotations() {
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m2635getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m2636getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m2637getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m2638getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m2639getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m2640getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m2641getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m2642getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FocusDirection(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m2626boximpl(int i8) {
        return new FocusDirection(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2627constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2628equalsimpl(int i8, Object obj) {
        return (obj instanceof FocusDirection) && i8 == ((FocusDirection) obj).m2632unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2629equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2630hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2631toStringimpl(int i8) {
        if (m2629equalsimpl0(i8, Next)) {
            return "Next";
        }
        if (m2629equalsimpl0(i8, Previous)) {
            return "Previous";
        }
        if (m2629equalsimpl0(i8, Left)) {
            return "Left";
        }
        if (m2629equalsimpl0(i8, Right)) {
            return "Right";
        }
        if (m2629equalsimpl0(i8, Up)) {
            return "Up";
        }
        if (m2629equalsimpl0(i8, Down)) {
            return "Down";
        }
        if (m2629equalsimpl0(i8, Enter)) {
            return "Enter";
        }
        if (m2629equalsimpl0(i8, Exit)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m2628equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2630hashCodeimpl(this.value);
    }

    public String toString() {
        return m2631toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2632unboximpl() {
        return this.value;
    }
}
