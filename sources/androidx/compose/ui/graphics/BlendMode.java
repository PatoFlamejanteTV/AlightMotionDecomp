package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m2863constructorimpl(0);
    private static final int Src = m2863constructorimpl(1);
    private static final int Dst = m2863constructorimpl(2);
    private static final int SrcOver = m2863constructorimpl(3);
    private static final int DstOver = m2863constructorimpl(4);
    private static final int SrcIn = m2863constructorimpl(5);
    private static final int DstIn = m2863constructorimpl(6);
    private static final int SrcOut = m2863constructorimpl(7);
    private static final int DstOut = m2863constructorimpl(8);
    private static final int SrcAtop = m2863constructorimpl(9);
    private static final int DstAtop = m2863constructorimpl(10);
    private static final int Xor = m2863constructorimpl(11);
    private static final int Plus = m2863constructorimpl(12);
    private static final int Modulate = m2863constructorimpl(13);
    private static final int Screen = m2863constructorimpl(14);
    private static final int Overlay = m2863constructorimpl(15);
    private static final int Darken = m2863constructorimpl(16);
    private static final int Lighten = m2863constructorimpl(17);
    private static final int ColorDodge = m2863constructorimpl(18);
    private static final int ColorBurn = m2863constructorimpl(19);
    private static final int Hardlight = m2863constructorimpl(20);
    private static final int Softlight = m2863constructorimpl(21);
    private static final int Difference = m2863constructorimpl(22);
    private static final int Exclusion = m2863constructorimpl(23);
    private static final int Multiply = m2863constructorimpl(24);
    private static final int Hue = m2863constructorimpl(25);
    private static final int Saturation = m2863constructorimpl(26);
    private static final int Color = m2863constructorimpl(27);
    private static final int Luminosity = m2863constructorimpl(28);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m2869getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m2870getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m2871getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m2872getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m2873getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m2874getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m2875getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m2876getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m2877getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m2878getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m2879getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m2880getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m2881getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m2882getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m2883getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m2884getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m2885getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m2886getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m2887getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m2888getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m2889getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m2890getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m2891getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m2892getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m2893getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m2894getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m2895getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m2896getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m2897getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ BlendMode(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m2862boximpl(int i8) {
        return new BlendMode(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2863constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2864equalsimpl(int i8, Object obj) {
        return (obj instanceof BlendMode) && i8 == ((BlendMode) obj).m2868unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2865equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2866hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2867toStringimpl(int i8) {
        if (m2865equalsimpl0(i8, Clear)) {
            return "Clear";
        }
        if (m2865equalsimpl0(i8, Src)) {
            return "Src";
        }
        if (m2865equalsimpl0(i8, Dst)) {
            return "Dst";
        }
        if (m2865equalsimpl0(i8, SrcOver)) {
            return "SrcOver";
        }
        if (m2865equalsimpl0(i8, DstOver)) {
            return "DstOver";
        }
        if (m2865equalsimpl0(i8, SrcIn)) {
            return "SrcIn";
        }
        if (m2865equalsimpl0(i8, DstIn)) {
            return "DstIn";
        }
        if (m2865equalsimpl0(i8, SrcOut)) {
            return "SrcOut";
        }
        if (m2865equalsimpl0(i8, DstOut)) {
            return "DstOut";
        }
        if (m2865equalsimpl0(i8, SrcAtop)) {
            return "SrcAtop";
        }
        if (m2865equalsimpl0(i8, DstAtop)) {
            return "DstAtop";
        }
        if (m2865equalsimpl0(i8, Xor)) {
            return "Xor";
        }
        if (m2865equalsimpl0(i8, Plus)) {
            return "Plus";
        }
        if (m2865equalsimpl0(i8, Modulate)) {
            return "Modulate";
        }
        if (m2865equalsimpl0(i8, Screen)) {
            return "Screen";
        }
        if (m2865equalsimpl0(i8, Overlay)) {
            return "Overlay";
        }
        if (m2865equalsimpl0(i8, Darken)) {
            return "Darken";
        }
        if (m2865equalsimpl0(i8, Lighten)) {
            return "Lighten";
        }
        if (m2865equalsimpl0(i8, ColorDodge)) {
            return "ColorDodge";
        }
        if (m2865equalsimpl0(i8, ColorBurn)) {
            return "ColorBurn";
        }
        if (m2865equalsimpl0(i8, Hardlight)) {
            return "HardLight";
        }
        if (m2865equalsimpl0(i8, Softlight)) {
            return "Softlight";
        }
        if (m2865equalsimpl0(i8, Difference)) {
            return "Difference";
        }
        if (m2865equalsimpl0(i8, Exclusion)) {
            return "Exclusion";
        }
        if (m2865equalsimpl0(i8, Multiply)) {
            return "Multiply";
        }
        if (m2865equalsimpl0(i8, Hue)) {
            return "Hue";
        }
        if (m2865equalsimpl0(i8, Saturation)) {
            return ExifInterface.TAG_SATURATION;
        }
        if (m2865equalsimpl0(i8, Color)) {
            return "Color";
        }
        if (m2865equalsimpl0(i8, Luminosity)) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m2864equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2866hashCodeimpl(this.value);
    }

    public String toString() {
        return m2867toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2868unboximpl() {
        return this.value;
    }
}
