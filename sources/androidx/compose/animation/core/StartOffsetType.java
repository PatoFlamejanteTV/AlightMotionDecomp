package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class StartOffsetType {
    public static final Companion Companion = new Companion(null);
    private static final int Delay = m218constructorimpl(-1);
    private static final int FastForward = m218constructorimpl(1);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDelay-Eo1U57Q, reason: not valid java name */
        public final int m224getDelayEo1U57Q() {
            return StartOffsetType.Delay;
        }

        /* renamed from: getFastForward-Eo1U57Q, reason: not valid java name */
        public final int m225getFastForwardEo1U57Q() {
            return StartOffsetType.FastForward;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ StartOffsetType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffsetType m217boximpl(int i8) {
        return new StartOffsetType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m218constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m219equalsimpl(int i8, Object obj) {
        return (obj instanceof StartOffsetType) && i8 == ((StartOffsetType) obj).m223unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m220equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m221hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m222toStringimpl(int i8) {
        return "StartOffsetType(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m219equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m221hashCodeimpl(this.value);
    }

    public String toString() {
        return m222toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m223unboximpl() {
        return this.value;
    }
}
