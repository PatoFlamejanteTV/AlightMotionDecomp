package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m3351constructorimpl(0);
    private static final int Relative = m3351constructorimpl(1);
    private static final int Saturation = m3351constructorimpl(2);
    private static final int Absolute = m3351constructorimpl(3);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m3357getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m3358getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m3359getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m3360getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ RenderIntent(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m3350boximpl(int i8) {
        return new RenderIntent(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3351constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3352equalsimpl(int i8, Object obj) {
        return (obj instanceof RenderIntent) && i8 == ((RenderIntent) obj).m3356unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3353equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3354hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3355toStringimpl(int i8) {
        if (m3353equalsimpl0(i8, Perceptual)) {
            return "Perceptual";
        }
        if (m3353equalsimpl0(i8, Relative)) {
            return "Relative";
        }
        if (m3353equalsimpl0(i8, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m3353equalsimpl0(i8, Absolute)) {
            return "Absolute";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m3352equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3354hashCodeimpl(this.value);
    }

    public String toString() {
        return m3355toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3356unboximpl() {
        return this.value;
    }
}
