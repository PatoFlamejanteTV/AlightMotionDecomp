package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class FilterQuality {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m3040constructorimpl(0);
    private static final int Low = m3040constructorimpl(1);
    private static final int Medium = m3040constructorimpl(2);
    private static final int High = m3040constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getHigh-f-v9h1I, reason: not valid java name */
        public final int m3046getHighfv9h1I() {
            return FilterQuality.High;
        }

        /* renamed from: getLow-f-v9h1I, reason: not valid java name */
        public final int m3047getLowfv9h1I() {
            return FilterQuality.Low;
        }

        /* renamed from: getMedium-f-v9h1I, reason: not valid java name */
        public final int m3048getMediumfv9h1I() {
            return FilterQuality.Medium;
        }

        /* renamed from: getNone-f-v9h1I, reason: not valid java name */
        public final int m3049getNonefv9h1I() {
            return FilterQuality.None;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FilterQuality(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FilterQuality m3039boximpl(int i8) {
        return new FilterQuality(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3040constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3041equalsimpl(int i8, Object obj) {
        return (obj instanceof FilterQuality) && i8 == ((FilterQuality) obj).m3045unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3042equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3043hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3044toStringimpl(int i8) {
        if (m3042equalsimpl0(i8, None)) {
            return "None";
        }
        if (m3042equalsimpl0(i8, Low)) {
            return "Low";
        }
        if (m3042equalsimpl0(i8, Medium)) {
            return "Medium";
        }
        if (m3042equalsimpl0(i8, High)) {
            return "High";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3041equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3043hashCodeimpl(this.value);
    }

    public String toString() {
        return m3044toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3045unboximpl() {
        return this.value;
    }
}
