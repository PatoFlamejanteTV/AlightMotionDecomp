package androidx.compose.foundation;

import kotlin.jvm.internal.AbstractC3284p;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class MarqueeAnimationMode {
    public static final Companion Companion = new Companion(null);
    private static final int Immediately = m325constructorimpl(0);
    private static final int WhileFocused = m325constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m331getImmediatelyZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ$annotations, reason: not valid java name */
        public static /* synthetic */ void m332getWhileFocusedZbEOnfQ$annotations() {
        }

        @ExperimentalFoundationApi
        /* renamed from: getImmediately-ZbEOnfQ, reason: not valid java name */
        public final int m333getImmediatelyZbEOnfQ() {
            return MarqueeAnimationMode.Immediately;
        }

        @ExperimentalFoundationApi
        /* renamed from: getWhileFocused-ZbEOnfQ, reason: not valid java name */
        public final int m334getWhileFocusedZbEOnfQ() {
            return MarqueeAnimationMode.WhileFocused;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ MarqueeAnimationMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarqueeAnimationMode m324boximpl(int i8) {
        return new MarqueeAnimationMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m325constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m326equalsimpl(int i8, Object obj) {
        return (obj instanceof MarqueeAnimationMode) && i8 == ((MarqueeAnimationMode) obj).m330unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m327equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m328hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m329toStringimpl(int i8) {
        if (m327equalsimpl0(i8, Immediately)) {
            return "Immediately";
        }
        if (m327equalsimpl0(i8, WhileFocused)) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i8).toString());
    }

    public boolean equals(Object obj) {
        return m326equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m328hashCodeimpl(this.value);
    }

    public String toString() {
        return m329toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m330unboximpl() {
        return this.value;
    }
}
