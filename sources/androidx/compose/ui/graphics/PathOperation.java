package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m3211constructorimpl(0);
    private static final int Intersect = m3211constructorimpl(1);
    private static final int Union = m3211constructorimpl(2);
    private static final int Xor = m3211constructorimpl(3);
    private static final int ReverseDifference = m3211constructorimpl(4);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m3217getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m3218getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m3219getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m3220getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m3221getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ PathOperation(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m3210boximpl(int i8) {
        return new PathOperation(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3211constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3212equalsimpl(int i8, Object obj) {
        return (obj instanceof PathOperation) && i8 == ((PathOperation) obj).m3216unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3213equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3214hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3215toStringimpl(int i8) {
        if (m3213equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m3213equalsimpl0(i8, Intersect)) {
            return "Intersect";
        }
        if (m3213equalsimpl0(i8, Union)) {
            return "Union";
        }
        if (m3213equalsimpl0(i8, Xor)) {
            return "Xor";
        }
        if (m3213equalsimpl0(i8, ReverseDifference)) {
            return "ReverseDifference";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3212equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3214hashCodeimpl(this.value);
    }

    public String toString() {
        return m3215toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3216unboximpl() {
        return this.value;
    }
}
