package androidx.compose.animation.core;

import Q5.p;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m206boximpl(long j8) {
        return new StartOffset(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m208constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m209constructorimpl$default(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        if ((i10 & 2) != 0) {
            i9 = StartOffsetType.Companion.m224getDelayEo1U57Q();
        }
        return m207constructorimpl(i8, i9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m210equalsimpl(long j8, Object obj) {
        return (obj instanceof StartOffset) && j8 == ((StartOffset) obj).m216unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m211equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m212getOffsetMillisimpl(long j8) {
        return Math.abs((int) j8);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m213getOffsetTypeEo1U57Q(long j8) {
        boolean z8;
        if (j8 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return StartOffsetType.Companion.m225getFastForwardEo1U57Q();
        }
        if (!z8) {
            return StartOffsetType.Companion.m224getDelayEo1U57Q();
        }
        throw new p();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m214hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m215toStringimpl(long j8) {
        return "StartOffset(value=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m210equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m214hashCodeimpl(this.value);
    }

    public String toString() {
        return m215toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m216unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m207constructorimpl(int i8, int i9) {
        return m208constructorimpl(i8 * i9);
    }
}
