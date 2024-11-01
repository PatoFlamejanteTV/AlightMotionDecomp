package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Typography {
    private final TextStyle bodyLarge;
    private final TextStyle bodyMedium;
    private final TextStyle bodySmall;
    private final TextStyle displayLarge;
    private final TextStyle displayMedium;
    private final TextStyle displaySmall;
    private final TextStyle headlineLarge;
    private final TextStyle headlineMedium;
    private final TextStyle headlineSmall;
    private final TextStyle labelLarge;
    private final TextStyle labelMedium;
    private final TextStyle labelSmall;
    private final TextStyle titleLarge;
    private final TextStyle titleMedium;
    private final TextStyle titleSmall;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i8, Object obj) {
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        TextStyle textStyle27;
        TextStyle textStyle28;
        TextStyle textStyle29;
        TextStyle textStyle30;
        if ((i8 & 1) != 0) {
            textStyle16 = typography.displayLarge;
        } else {
            textStyle16 = textStyle;
        }
        if ((i8 & 2) != 0) {
            textStyle17 = typography.displayMedium;
        } else {
            textStyle17 = textStyle2;
        }
        if ((i8 & 4) != 0) {
            textStyle18 = typography.displaySmall;
        } else {
            textStyle18 = textStyle3;
        }
        if ((i8 & 8) != 0) {
            textStyle19 = typography.headlineLarge;
        } else {
            textStyle19 = textStyle4;
        }
        if ((i8 & 16) != 0) {
            textStyle20 = typography.headlineMedium;
        } else {
            textStyle20 = textStyle5;
        }
        if ((i8 & 32) != 0) {
            textStyle21 = typography.headlineSmall;
        } else {
            textStyle21 = textStyle6;
        }
        if ((i8 & 64) != 0) {
            textStyle22 = typography.titleLarge;
        } else {
            textStyle22 = textStyle7;
        }
        if ((i8 & 128) != 0) {
            textStyle23 = typography.titleMedium;
        } else {
            textStyle23 = textStyle8;
        }
        if ((i8 & 256) != 0) {
            textStyle24 = typography.titleSmall;
        } else {
            textStyle24 = textStyle9;
        }
        if ((i8 & 512) != 0) {
            textStyle25 = typography.bodyLarge;
        } else {
            textStyle25 = textStyle10;
        }
        if ((i8 & 1024) != 0) {
            textStyle26 = typography.bodyMedium;
        } else {
            textStyle26 = textStyle11;
        }
        if ((i8 & 2048) != 0) {
            textStyle27 = typography.bodySmall;
        } else {
            textStyle27 = textStyle12;
        }
        if ((i8 & 4096) != 0) {
            textStyle28 = typography.labelLarge;
        } else {
            textStyle28 = textStyle13;
        }
        if ((i8 & 8192) != 0) {
            textStyle29 = typography.labelMedium;
        } else {
            textStyle29 = textStyle14;
        }
        if ((i8 & 16384) != 0) {
            textStyle30 = typography.labelSmall;
        } else {
            textStyle30 = textStyle15;
        }
        return typography.copy(textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle30);
    }

    public final Typography copy(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall) {
        AbstractC3292y.i(displayLarge, "displayLarge");
        AbstractC3292y.i(displayMedium, "displayMedium");
        AbstractC3292y.i(displaySmall, "displaySmall");
        AbstractC3292y.i(headlineLarge, "headlineLarge");
        AbstractC3292y.i(headlineMedium, "headlineMedium");
        AbstractC3292y.i(headlineSmall, "headlineSmall");
        AbstractC3292y.i(titleLarge, "titleLarge");
        AbstractC3292y.i(titleMedium, "titleMedium");
        AbstractC3292y.i(titleSmall, "titleSmall");
        AbstractC3292y.i(bodyLarge, "bodyLarge");
        AbstractC3292y.i(bodyMedium, "bodyMedium");
        AbstractC3292y.i(bodySmall, "bodySmall");
        AbstractC3292y.i(labelLarge, "labelLarge");
        AbstractC3292y.i(labelMedium, "labelMedium");
        AbstractC3292y.i(labelSmall, "labelSmall");
        return new Typography(displayLarge, displayMedium, displaySmall, headlineLarge, headlineMedium, headlineSmall, titleLarge, titleMedium, titleSmall, bodyLarge, bodyMedium, bodySmall, labelLarge, labelMedium, labelSmall);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (AbstractC3292y.d(this.displayLarge, typography.displayLarge) && AbstractC3292y.d(this.displayMedium, typography.displayMedium) && AbstractC3292y.d(this.displaySmall, typography.displaySmall) && AbstractC3292y.d(this.headlineLarge, typography.headlineLarge) && AbstractC3292y.d(this.headlineMedium, typography.headlineMedium) && AbstractC3292y.d(this.headlineSmall, typography.headlineSmall) && AbstractC3292y.d(this.titleLarge, typography.titleLarge) && AbstractC3292y.d(this.titleMedium, typography.titleMedium) && AbstractC3292y.d(this.titleSmall, typography.titleSmall) && AbstractC3292y.d(this.bodyLarge, typography.bodyLarge) && AbstractC3292y.d(this.bodyMedium, typography.bodyMedium) && AbstractC3292y.d(this.bodySmall, typography.bodySmall) && AbstractC3292y.d(this.labelLarge, typography.labelLarge) && AbstractC3292y.d(this.labelMedium, typography.labelMedium) && AbstractC3292y.d(this.labelSmall, typography.labelSmall)) {
            return true;
        }
        return false;
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ')';
    }

    public Typography(TextStyle displayLarge, TextStyle displayMedium, TextStyle displaySmall, TextStyle headlineLarge, TextStyle headlineMedium, TextStyle headlineSmall, TextStyle titleLarge, TextStyle titleMedium, TextStyle titleSmall, TextStyle bodyLarge, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLarge, TextStyle labelMedium, TextStyle labelSmall) {
        AbstractC3292y.i(displayLarge, "displayLarge");
        AbstractC3292y.i(displayMedium, "displayMedium");
        AbstractC3292y.i(displaySmall, "displaySmall");
        AbstractC3292y.i(headlineLarge, "headlineLarge");
        AbstractC3292y.i(headlineMedium, "headlineMedium");
        AbstractC3292y.i(headlineSmall, "headlineSmall");
        AbstractC3292y.i(titleLarge, "titleLarge");
        AbstractC3292y.i(titleMedium, "titleMedium");
        AbstractC3292y.i(titleSmall, "titleSmall");
        AbstractC3292y.i(bodyLarge, "bodyLarge");
        AbstractC3292y.i(bodyMedium, "bodyMedium");
        AbstractC3292y.i(bodySmall, "bodySmall");
        AbstractC3292y.i(labelLarge, "labelLarge");
        AbstractC3292y.i(labelMedium, "labelMedium");
        AbstractC3292y.i(labelSmall, "labelSmall");
        this.displayLarge = displayLarge;
        this.displayMedium = displayMedium;
        this.displaySmall = displaySmall;
        this.headlineLarge = headlineLarge;
        this.headlineMedium = headlineMedium;
        this.headlineSmall = headlineSmall;
        this.titleLarge = titleLarge;
        this.titleMedium = titleMedium;
        this.titleSmall = titleSmall;
        this.bodyLarge = bodyLarge;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLarge = labelLarge;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i8 & 2) != 0 ? TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i8 & 4) != 0 ? TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i8 & 8) != 0 ? TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i8 & 16) != 0 ? TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i8 & 32) != 0 ? TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i8 & 64) != 0 ? TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i8 & 128) != 0 ? TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i8 & 256) != 0 ? TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i8 & 512) != 0 ? TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i8 & 1024) != 0 ? TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i8 & 2048) != 0 ? TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i8 & 4096) != 0 ? TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i8 & 8192) != 0 ? TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i8 & 16384) != 0 ? TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }
}
