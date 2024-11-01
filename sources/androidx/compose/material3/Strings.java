package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m1756constructorimpl(0);
    private static final int CloseDrawer = m1756constructorimpl(1);
    private static final int CloseSheet = m1756constructorimpl(2);
    private static final int DefaultErrorMessage = m1756constructorimpl(3);
    private static final int ExposedDropdownMenu = m1756constructorimpl(4);
    private static final int SliderRangeStart = m1756constructorimpl(5);
    private static final int SliderRangeEnd = m1756constructorimpl(6);
    private static final int Dialog = m1756constructorimpl(7);
    private static final int MenuExpanded = m1756constructorimpl(8);
    private static final int MenuCollapsed = m1756constructorimpl(9);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCloseDrawer-adMyvUU, reason: not valid java name */
        public final int m1762getCloseDraweradMyvUU() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-adMyvUU, reason: not valid java name */
        public final int m1763getCloseSheetadMyvUU() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-adMyvUU, reason: not valid java name */
        public final int m1764getDefaultErrorMessageadMyvUU() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getDialog-adMyvUU, reason: not valid java name */
        public final int m1765getDialogadMyvUU() {
            return Strings.Dialog;
        }

        /* renamed from: getExposedDropdownMenu-adMyvUU, reason: not valid java name */
        public final int m1766getExposedDropdownMenuadMyvUU() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getMenuCollapsed-adMyvUU, reason: not valid java name */
        public final int m1767getMenuCollapsedadMyvUU() {
            return Strings.MenuCollapsed;
        }

        /* renamed from: getMenuExpanded-adMyvUU, reason: not valid java name */
        public final int m1768getMenuExpandedadMyvUU() {
            return Strings.MenuExpanded;
        }

        /* renamed from: getNavigationMenu-adMyvUU, reason: not valid java name */
        public final int m1769getNavigationMenuadMyvUU() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-adMyvUU, reason: not valid java name */
        public final int m1770getSliderRangeEndadMyvUU() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-adMyvUU, reason: not valid java name */
        public final int m1771getSliderRangeStartadMyvUU() {
            return Strings.SliderRangeStart;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Strings(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Strings m1755boximpl(int i8) {
        return new Strings(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1756constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1757equalsimpl(int i8, Object obj) {
        return (obj instanceof Strings) && i8 == ((Strings) obj).m1761unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1758equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1759hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1760toStringimpl(int i8) {
        return "Strings(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m1757equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1759hashCodeimpl(this.value);
    }

    public String toString() {
        return m1760toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1761unboximpl() {
        return this.value;
    }
}
