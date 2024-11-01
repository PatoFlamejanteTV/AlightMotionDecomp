package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m1315constructorimpl(0);
    private static final int CloseDrawer = m1315constructorimpl(1);
    private static final int CloseSheet = m1315constructorimpl(2);
    private static final int DefaultErrorMessage = m1315constructorimpl(3);
    private static final int ExposedDropdownMenu = m1315constructorimpl(4);
    private static final int SliderRangeStart = m1315constructorimpl(5);
    private static final int SliderRangeEnd = m1315constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCloseDrawer-UdPEhr4, reason: not valid java name */
        public final int m1321getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4, reason: not valid java name */
        public final int m1322getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4, reason: not valid java name */
        public final int m1323getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4, reason: not valid java name */
        public final int m1324getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4, reason: not valid java name */
        public final int m1325getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4, reason: not valid java name */
        public final int m1326getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4, reason: not valid java name */
        public final int m1327getSliderRangeStartUdPEhr4() {
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
    public static final /* synthetic */ Strings m1314boximpl(int i8) {
        return new Strings(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1315constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1316equalsimpl(int i8, Object obj) {
        return (obj instanceof Strings) && i8 == ((Strings) obj).m1320unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1317equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1318hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1319toStringimpl(int i8) {
        return "Strings(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m1316equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1318hashCodeimpl(this.value);
    }

    public String toString() {
        return m1319toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1320unboximpl() {
        return this.value;
    }
}
