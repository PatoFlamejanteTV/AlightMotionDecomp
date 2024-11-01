package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m3189constructorimpl(0);
    private static final int Stroke = m3189constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m3195getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m3196getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ PaintingStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m3188boximpl(int i8) {
        return new PaintingStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3189constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3190equalsimpl(int i8, Object obj) {
        return (obj instanceof PaintingStyle) && i8 == ((PaintingStyle) obj).m3194unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3191equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3192hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3193toStringimpl(int i8) {
        if (m3191equalsimpl0(i8, Fill)) {
            return "Fill";
        }
        if (m3191equalsimpl0(i8, Stroke)) {
            return "Stroke";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3190equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3192hashCodeimpl(this.value);
    }

    public String toString() {
        return m3193toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3194unboximpl() {
        return this.value;
    }
}
