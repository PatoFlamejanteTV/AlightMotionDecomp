package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m3316getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ TransformOrigin(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m3303boximpl(long j8) {
        return new TransformOrigin(j8);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m3304component1impl(long j8) {
        return m3311getPivotFractionXimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m3305component2impl(long j8) {
        return m3312getPivotFractionYimpl(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3306constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m3307copyzey9I6w(long j8, float f8, float f9) {
        return TransformOriginKt.TransformOrigin(f8, f9);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m3308copyzey9I6w$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m3311getPivotFractionXimpl(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m3312getPivotFractionYimpl(j8);
        }
        return m3307copyzey9I6w(j8, f8, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3309equalsimpl(long j8, Object obj) {
        return (obj instanceof TransformOrigin) && j8 == ((TransformOrigin) obj).m3315unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3310equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m3311getPivotFractionXimpl(long j8) {
        kotlin.jvm.internal.r rVar = kotlin.jvm.internal.r.f34602a;
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m3312getPivotFractionYimpl(long j8) {
        kotlin.jvm.internal.r rVar = kotlin.jvm.internal.r.f34602a;
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3313hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3314toStringimpl(long j8) {
        return "TransformOrigin(packedValue=" + j8 + ')';
    }

    public boolean equals(Object obj) {
        return m3309equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3313hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3314toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3315unboximpl() {
        return this.packedValue;
    }
}
