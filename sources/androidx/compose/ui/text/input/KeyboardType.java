package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Text = m4877constructorimpl(1);
    private static final int Ascii = m4877constructorimpl(2);
    private static final int Number = m4877constructorimpl(3);
    private static final int Phone = m4877constructorimpl(4);
    private static final int Uri = m4877constructorimpl(5);
    private static final int Email = m4877constructorimpl(6);
    private static final int Password = m4877constructorimpl(7);
    private static final int NumberPassword = m4877constructorimpl(8);
    private static final int Decimal = m4877constructorimpl(9);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4883getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4884getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4885getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4886getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4887getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4888getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4889getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4890getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4891getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m4892getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m4893getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m4894getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m4895getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m4896getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m4897getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m4898getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m4899getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m4900getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ KeyboardType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m4876boximpl(int i8) {
        return new KeyboardType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4877constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4878equalsimpl(int i8, Object obj) {
        return (obj instanceof KeyboardType) && i8 == ((KeyboardType) obj).m4882unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4879equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4880hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4881toStringimpl(int i8) {
        if (m4879equalsimpl0(i8, Text)) {
            return "Text";
        }
        if (m4879equalsimpl0(i8, Ascii)) {
            return "Ascii";
        }
        if (m4879equalsimpl0(i8, Number)) {
            return "Number";
        }
        if (m4879equalsimpl0(i8, Phone)) {
            return "Phone";
        }
        if (m4879equalsimpl0(i8, Uri)) {
            return "Uri";
        }
        if (m4879equalsimpl0(i8, Email)) {
            return "Email";
        }
        if (m4879equalsimpl0(i8, Password)) {
            return "Password";
        }
        if (m4879equalsimpl0(i8, NumberPassword)) {
            return "NumberPassword";
        }
        if (m4879equalsimpl0(i8, Decimal)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4878equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4880hashCodeimpl(this.value);
    }

    public String toString() {
        return m4881toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4882unboximpl() {
        return this.value;
    }
}
