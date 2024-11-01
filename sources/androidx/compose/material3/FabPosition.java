package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC3284p;

@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Center = m1609constructorimpl(0);
    private static final int End = m1609constructorimpl(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m1615getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m1616getEndERTFSPs() {
            return FabPosition.End;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FabPosition(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m1608boximpl(int i8) {
        return new FabPosition(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1609constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1610equalsimpl(int i8, Object obj) {
        return (obj instanceof FabPosition) && i8 == ((FabPosition) obj).m1614unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1611equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1612hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1613toStringimpl(int i8) {
        if (m1611equalsimpl0(i8, Center)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m1610equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1612hashCodeimpl(this.value);
    }

    public String toString() {
        return m1613toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1614unboximpl() {
        return this.value;
    }
}
