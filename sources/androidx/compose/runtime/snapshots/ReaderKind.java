package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m2577getComposition6f8NoZ8() {
            return ReaderKind.m2568constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m2578getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m2568constructorimpl(2);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ ReaderKind(int i8) {
        this.mask = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m2567boximpl(int i8) {
        return new ReaderKind(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2568constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m2569constructorimpl$default(int i8, int i9, AbstractC3284p abstractC3284p) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return m2568constructorimpl(i8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2570equalsimpl(int i8, Object obj) {
        return (obj instanceof ReaderKind) && i8 == ((ReaderKind) obj).m2576unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2571equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2572hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m2573isReadInh_f27i8(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2574toStringimpl(int i8) {
        return "ReaderKind(mask=" + i8 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m2575withReadIn3QSx2Dw(int i8, int i9) {
        return m2568constructorimpl(i8 | i9);
    }

    public boolean equals(Object obj) {
        return m2570equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m2572hashCodeimpl(this.mask);
    }

    public String toString() {
        return m2574toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2576unboximpl() {
        return this.mask;
    }
}
