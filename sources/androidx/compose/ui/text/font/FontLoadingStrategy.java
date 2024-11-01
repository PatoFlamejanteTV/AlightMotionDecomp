package androidx.compose.ui.text.font;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class FontLoadingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Blocking = m4764constructorimpl(0);
    private static final int OptionalLocal = m4764constructorimpl(1);
    private static final int Async = m4764constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAsync-PKNRLFQ, reason: not valid java name */
        public final int m4770getAsyncPKNRLFQ() {
            return FontLoadingStrategy.Async;
        }

        /* renamed from: getBlocking-PKNRLFQ, reason: not valid java name */
        public final int m4771getBlockingPKNRLFQ() {
            return FontLoadingStrategy.Blocking;
        }

        /* renamed from: getOptionalLocal-PKNRLFQ, reason: not valid java name */
        public final int m4772getOptionalLocalPKNRLFQ() {
            return FontLoadingStrategy.OptionalLocal;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ FontLoadingStrategy(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontLoadingStrategy m4763boximpl(int i8) {
        return new FontLoadingStrategy(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4764constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4765equalsimpl(int i8, Object obj) {
        return (obj instanceof FontLoadingStrategy) && i8 == ((FontLoadingStrategy) obj).m4769unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4766equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4767hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4768toStringimpl(int i8) {
        if (m4766equalsimpl0(i8, Blocking)) {
            return "Blocking";
        }
        if (m4766equalsimpl0(i8, OptionalLocal)) {
            return "Optional";
        }
        if (m4766equalsimpl0(i8, Async)) {
            return "Async";
        }
        return "Invalid(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m4765equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4767hashCodeimpl(this.value);
    }

    public String toString() {
        return m4768toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4769unboximpl() {
        return this.value;
    }
}
