package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m4494constructorimpl(0);
    private static final int Checkbox = m4494constructorimpl(1);
    private static final int Switch = m4494constructorimpl(2);
    private static final int RadioButton = m4494constructorimpl(3);
    private static final int Tab = m4494constructorimpl(4);
    private static final int Image = m4494constructorimpl(5);
    private static final int DropdownList = m4494constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m4500getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m4501getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m4502getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m4503getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m4504getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m4505getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m4506getTabo7Vup1c() {
            return Role.Tab;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Role(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m4493boximpl(int i8) {
        return new Role(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4494constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4495equalsimpl(int i8, Object obj) {
        return (obj instanceof Role) && i8 == ((Role) obj).m4499unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4496equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4497hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4498toStringimpl(int i8) {
        if (m4496equalsimpl0(i8, Button)) {
            return "Button";
        }
        if (m4496equalsimpl0(i8, Checkbox)) {
            return "Checkbox";
        }
        if (m4496equalsimpl0(i8, Switch)) {
            return "Switch";
        }
        if (m4496equalsimpl0(i8, RadioButton)) {
            return "RadioButton";
        }
        if (m4496equalsimpl0(i8, Tab)) {
            return "Tab";
        }
        if (m4496equalsimpl0(i8, Image)) {
            return "Image";
        }
        if (m4496equalsimpl0(i8, DropdownList)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m4495equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4497hashCodeimpl(this.value);
    }

    public String toString() {
        return m4498toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4499unboximpl() {
        return this.value;
    }
}
