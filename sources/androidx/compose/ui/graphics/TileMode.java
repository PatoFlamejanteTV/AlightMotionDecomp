package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m3292constructorimpl(0);
    private static final int Repeated = m3292constructorimpl(1);
    private static final int Mirror = m3292constructorimpl(2);
    private static final int Decal = m3292constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m3298getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m3299getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m3300getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m3301getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TileMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m3291boximpl(int i8) {
        return new TileMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3292constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3293equalsimpl(int i8, Object obj) {
        return (obj instanceof TileMode) && i8 == ((TileMode) obj).m3297unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3294equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3295hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3296toStringimpl(int i8) {
        if (m3294equalsimpl0(i8, Clamp)) {
            return "Clamp";
        }
        if (m3294equalsimpl0(i8, Repeated)) {
            return "Repeated";
        }
        if (m3294equalsimpl0(i8, Mirror)) {
            return "Mirror";
        }
        if (m3294equalsimpl0(i8, Decal)) {
            return "Decal";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3293equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3295hashCodeimpl(this.value);
    }

    public String toString() {
        return m3296toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3297unboximpl() {
        return this.value;
    }
}
