package androidx.compose.ui.text.font;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class FontWeight implements Comparable<FontWeight> {
    public static final int $stable = 0;
    private static final FontWeight Black;
    private static final FontWeight Bold;
    public static final Companion Companion = new Companion(null);
    private static final FontWeight ExtraBold;
    private static final FontWeight ExtraLight;
    private static final FontWeight Light;
    private static final FontWeight Medium;
    private static final FontWeight Normal;
    private static final FontWeight SemiBold;
    private static final FontWeight Thin;
    private static final FontWeight W100;
    private static final FontWeight W200;
    private static final FontWeight W300;
    private static final FontWeight W400;
    private static final FontWeight W500;
    private static final FontWeight W600;
    private static final FontWeight W700;
    private static final FontWeight W800;
    private static final FontWeight W900;
    private static final List<FontWeight> values;
    private final int weight;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getBlack$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getExtraLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getMedium$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNormal$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSemiBold$annotations() {
        }

        @Stable
        public static /* synthetic */ void getThin$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW100$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW200$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW300$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW400$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW500$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW600$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW700$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW800$annotations() {
        }

        @Stable
        public static /* synthetic */ void getW900$annotations() {
        }

        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        public final List<FontWeight> getValues$ui_text_release() {
            return FontWeight.values;
        }

        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        public final FontWeight getW900() {
            return FontWeight.W900;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        W100 = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        W200 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        W300 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        W400 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        W500 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        W600 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(TypedValues.TransitionType.TYPE_DURATION);
        W700 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        W800 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(TypedValues.Custom.TYPE_INT);
        W900 = fontWeight9;
        Thin = fontWeight;
        ExtraLight = fontWeight2;
        Light = fontWeight3;
        Normal = fontWeight4;
        Medium = fontWeight5;
        SemiBold = fontWeight6;
        Bold = fontWeight7;
        ExtraBold = fontWeight8;
        Black = fontWeight9;
        values = AbstractC1435t.p(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i8) {
        this.weight = i8;
        if (1 <= i8 && i8 < 1001) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i8).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FontWeight) && this.weight == ((FontWeight) obj).weight) {
            return true;
        }
        return false;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    @Override // java.lang.Comparable
    public int compareTo(FontWeight fontWeight) {
        return AbstractC3292y.k(this.weight, fontWeight.weight);
    }
}
