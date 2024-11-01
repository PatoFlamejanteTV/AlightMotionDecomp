package androidx.compose.ui.input.key;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class KeyEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m3867constructorimpl(0);
    private static final int KeyUp = m3867constructorimpl(1);
    private static final int KeyDown = m3867constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m3873getKeyDownCS__XNY() {
            return KeyEventType.KeyDown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m3874getKeyUpCS__XNY() {
            return KeyEventType.KeyUp;
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m3875getUnknownCS__XNY() {
            return KeyEventType.Unknown;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ KeyEventType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEventType m3866boximpl(int i8) {
        return new KeyEventType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3867constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3868equalsimpl(int i8, Object obj) {
        return (obj instanceof KeyEventType) && i8 == ((KeyEventType) obj).m3872unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3869equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3870hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3871toStringimpl(int i8) {
        if (m3869equalsimpl0(i8, KeyUp)) {
            return "KeyUp";
        }
        if (m3869equalsimpl0(i8, KeyDown)) {
            return "KeyDown";
        }
        if (m3869equalsimpl0(i8, Unknown)) {
            return "Unknown";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3868equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3870hashCodeimpl(this.value);
    }

    public String toString() {
        return m3871toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3872unboximpl() {
        return this.value;
    }
}
