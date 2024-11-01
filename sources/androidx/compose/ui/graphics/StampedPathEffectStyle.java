package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class StampedPathEffectStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Translate = m3262constructorimpl(0);
    private static final int Rotate = m3262constructorimpl(1);
    private static final int Morph = m3262constructorimpl(2);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getMorph-Ypspkwk, reason: not valid java name */
        public final int m3268getMorphYpspkwk() {
            return StampedPathEffectStyle.Morph;
        }

        /* renamed from: getRotate-Ypspkwk, reason: not valid java name */
        public final int m3269getRotateYpspkwk() {
            return StampedPathEffectStyle.Rotate;
        }

        /* renamed from: getTranslate-Ypspkwk, reason: not valid java name */
        public final int m3270getTranslateYpspkwk() {
            return StampedPathEffectStyle.Translate;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ StampedPathEffectStyle(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StampedPathEffectStyle m3261boximpl(int i8) {
        return new StampedPathEffectStyle(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3262constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3263equalsimpl(int i8, Object obj) {
        return (obj instanceof StampedPathEffectStyle) && i8 == ((StampedPathEffectStyle) obj).m3267unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3264equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3265hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3266toStringimpl(int i8) {
        if (m3264equalsimpl0(i8, Translate)) {
            return "Translate";
        }
        if (m3264equalsimpl0(i8, Rotate)) {
            return "Rotate";
        }
        if (m3264equalsimpl0(i8, Morph)) {
            return "Morph";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3263equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3265hashCodeimpl(this.value);
    }

    public String toString() {
        return m3266toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3267unboximpl() {
        return this.value;
    }
}
