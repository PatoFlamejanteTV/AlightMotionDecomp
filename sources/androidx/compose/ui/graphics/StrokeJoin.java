package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m3282constructorimpl(0);
    private static final int Round = m3282constructorimpl(1);
    private static final int Bevel = m3282constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m3288getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m3289getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m3290getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ StrokeJoin(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m3281boximpl(int i8) {
        return new StrokeJoin(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3282constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3283equalsimpl(int i8, Object obj) {
        return (obj instanceof StrokeJoin) && i8 == ((StrokeJoin) obj).m3287unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3284equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3285hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3286toStringimpl(int i8) {
        if (m3284equalsimpl0(i8, Miter)) {
            return "Miter";
        }
        if (m3284equalsimpl0(i8, Round)) {
            return "Round";
        }
        if (m3284equalsimpl0(i8, Bevel)) {
            return "Bevel";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3283equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3285hashCodeimpl(this.value);
    }

    public String toString() {
        return m3286toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3287unboximpl() {
        return this.value;
    }
}
