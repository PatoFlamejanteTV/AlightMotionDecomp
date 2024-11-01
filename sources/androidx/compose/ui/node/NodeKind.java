package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m4319boximpl(int i8) {
        return new NodeKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m4320constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4321equalsimpl(int i8, Object obj) {
        return (obj instanceof NodeKind) && i8 == ((NodeKind) obj).m4327unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4322equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4323hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m4324orH91voCI(int i8, int i9) {
        return i8 | i9;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m4325orimpl(int i8, int i9) {
        return i8 | i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4326toStringimpl(int i8) {
        return "NodeKind(mask=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4321equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m4323hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4326toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4327unboximpl() {
        return this.mask;
    }
}
