package androidx.compose.ui.input.pointer;

/* loaded from: classes.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i8) {
        this.packedValue = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m3925boximpl(int i8) {
        return new PointerButtons(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3926constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3927equalsimpl(int i8, Object obj) {
        return (obj instanceof PointerButtons) && i8 == ((PointerButtons) obj).m3931unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3928equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3929hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3930toStringimpl(int i8) {
        return "PointerButtons(packedValue=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m3927equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3929hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3930toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3931unboximpl() {
        return this.packedValue;
    }
}
