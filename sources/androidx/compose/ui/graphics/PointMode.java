package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m3224constructorimpl(0);
    private static final int Lines = m3224constructorimpl(1);
    private static final int Polygon = m3224constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m3230getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m3231getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m3232getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ PointMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m3223boximpl(int i8) {
        return new PointMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3224constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3225equalsimpl(int i8, Object obj) {
        return (obj instanceof PointMode) && i8 == ((PointMode) obj).m3229unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3226equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3227hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3228toStringimpl(int i8) {
        if (m3226equalsimpl0(i8, Points)) {
            return "Points";
        }
        if (m3226equalsimpl0(i8, Lines)) {
            return "Lines";
        }
        if (m3226equalsimpl0(i8, Polygon)) {
            return "Polygon";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3225equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3227hashCodeimpl(this.value);
    }

    public String toString() {
        return m3228toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3229unboximpl() {
        return this.value;
    }
}
