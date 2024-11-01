package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i8) {
        this.packedValue = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m4044boximpl(int i8) {
        return new PointerKeyboardModifiers(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4045constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4046equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i8 == ((PointerKeyboardModifiers) obj).m4050unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4047equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4048hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4049toStringimpl(int i8) {
        return "PointerKeyboardModifiers(packedValue=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4046equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4048hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m4049toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4050unboximpl() {
        return this.packedValue;
    }
}
