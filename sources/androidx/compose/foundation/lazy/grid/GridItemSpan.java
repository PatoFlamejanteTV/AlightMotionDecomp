package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m690boximpl(long j8) {
        return new GridItemSpan(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m691constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m692equalsimpl(long j8, Object obj) {
        return (obj instanceof GridItemSpan) && j8 == ((GridItemSpan) obj).m697unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m693equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getCurrentLineSpan$annotations() {
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m694getCurrentLineSpanimpl(long j8) {
        return (int) j8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m695hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m696toStringimpl(long j8) {
        return "GridItemSpan(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m692equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m695hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m696toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m697unboximpl() {
        return this.packedValue;
    }
}
