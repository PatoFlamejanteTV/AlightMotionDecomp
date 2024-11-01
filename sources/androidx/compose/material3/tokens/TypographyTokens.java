package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class TypographyTokens {
    private static final TextStyle BodyLarge;
    private static final TextStyle BodyMedium;
    private static final TextStyle BodySmall;
    private static final TextStyle DisplayLarge;
    private static final TextStyle DisplayMedium;
    private static final TextStyle DisplaySmall;
    private static final TextStyle HeadlineLarge;
    private static final TextStyle HeadlineMedium;
    private static final TextStyle HeadlineSmall;
    public static final TypographyTokens INSTANCE = new TypographyTokens();
    private static final TextStyle LabelLarge;
    private static final TextStyle LabelMedium;
    private static final TextStyle LabelSmall;
    private static final TextStyle TitleLarge;
    private static final TextStyle TitleMedium;
    private static final TextStyle TitleSmall;

    static {
        TypeScaleTokens typeScaleTokens = TypeScaleTokens.INSTANCE;
        GenericFontFamily bodyLargeFont = typeScaleTokens.getBodyLargeFont();
        BodyLarge = new TextStyle(0L, typeScaleTokens.m2394getBodyLargeSizeXSAIIZE(), typeScaleTokens.getBodyLargeWeight(), (FontStyle) null, (FontSynthesis) null, bodyLargeFont, (String) null, typeScaleTokens.m2395getBodyLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2393getBodyLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily bodyMediumFont = typeScaleTokens.getBodyMediumFont();
        BodyMedium = new TextStyle(0L, typeScaleTokens.m2397getBodyMediumSizeXSAIIZE(), typeScaleTokens.getBodyMediumWeight(), (FontStyle) null, (FontSynthesis) null, bodyMediumFont, (String) null, typeScaleTokens.m2398getBodyMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2396getBodyMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily bodySmallFont = typeScaleTokens.getBodySmallFont();
        BodySmall = new TextStyle(0L, typeScaleTokens.m2400getBodySmallSizeXSAIIZE(), typeScaleTokens.getBodySmallWeight(), (FontStyle) null, (FontSynthesis) null, bodySmallFont, (String) null, typeScaleTokens.m2401getBodySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2399getBodySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily displayLargeFont = typeScaleTokens.getDisplayLargeFont();
        DisplayLarge = new TextStyle(0L, typeScaleTokens.m2403getDisplayLargeSizeXSAIIZE(), typeScaleTokens.getDisplayLargeWeight(), (FontStyle) null, (FontSynthesis) null, displayLargeFont, (String) null, typeScaleTokens.m2404getDisplayLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2402getDisplayLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily displayMediumFont = typeScaleTokens.getDisplayMediumFont();
        DisplayMedium = new TextStyle(0L, typeScaleTokens.m2406getDisplayMediumSizeXSAIIZE(), typeScaleTokens.getDisplayMediumWeight(), (FontStyle) null, (FontSynthesis) null, displayMediumFont, (String) null, typeScaleTokens.m2407getDisplayMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2405getDisplayMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily displaySmallFont = typeScaleTokens.getDisplaySmallFont();
        DisplaySmall = new TextStyle(0L, typeScaleTokens.m2409getDisplaySmallSizeXSAIIZE(), typeScaleTokens.getDisplaySmallWeight(), (FontStyle) null, (FontSynthesis) null, displaySmallFont, (String) null, typeScaleTokens.m2410getDisplaySmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2408getDisplaySmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily headlineLargeFont = typeScaleTokens.getHeadlineLargeFont();
        HeadlineLarge = new TextStyle(0L, typeScaleTokens.m2412getHeadlineLargeSizeXSAIIZE(), typeScaleTokens.getHeadlineLargeWeight(), (FontStyle) null, (FontSynthesis) null, headlineLargeFont, (String) null, typeScaleTokens.m2413getHeadlineLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2411getHeadlineLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily headlineMediumFont = typeScaleTokens.getHeadlineMediumFont();
        HeadlineMedium = new TextStyle(0L, typeScaleTokens.m2415getHeadlineMediumSizeXSAIIZE(), typeScaleTokens.getHeadlineMediumWeight(), (FontStyle) null, (FontSynthesis) null, headlineMediumFont, (String) null, typeScaleTokens.m2416getHeadlineMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2414getHeadlineMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily headlineSmallFont = typeScaleTokens.getHeadlineSmallFont();
        HeadlineSmall = new TextStyle(0L, typeScaleTokens.m2418getHeadlineSmallSizeXSAIIZE(), typeScaleTokens.getHeadlineSmallWeight(), (FontStyle) null, (FontSynthesis) null, headlineSmallFont, (String) null, typeScaleTokens.m2419getHeadlineSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2417getHeadlineSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily labelLargeFont = typeScaleTokens.getLabelLargeFont();
        LabelLarge = new TextStyle(0L, typeScaleTokens.m2421getLabelLargeSizeXSAIIZE(), typeScaleTokens.getLabelLargeWeight(), (FontStyle) null, (FontSynthesis) null, labelLargeFont, (String) null, typeScaleTokens.m2422getLabelLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2420getLabelLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily labelMediumFont = typeScaleTokens.getLabelMediumFont();
        LabelMedium = new TextStyle(0L, typeScaleTokens.m2424getLabelMediumSizeXSAIIZE(), typeScaleTokens.getLabelMediumWeight(), (FontStyle) null, (FontSynthesis) null, labelMediumFont, (String) null, typeScaleTokens.m2425getLabelMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2423getLabelMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily labelSmallFont = typeScaleTokens.getLabelSmallFont();
        LabelSmall = new TextStyle(0L, typeScaleTokens.m2427getLabelSmallSizeXSAIIZE(), typeScaleTokens.getLabelSmallWeight(), (FontStyle) null, (FontSynthesis) null, labelSmallFont, (String) null, typeScaleTokens.m2428getLabelSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2426getLabelSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily titleLargeFont = typeScaleTokens.getTitleLargeFont();
        TitleLarge = new TextStyle(0L, typeScaleTokens.m2430getTitleLargeSizeXSAIIZE(), typeScaleTokens.getTitleLargeWeight(), (FontStyle) null, (FontSynthesis) null, titleLargeFont, (String) null, typeScaleTokens.m2431getTitleLargeTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2429getTitleLargeLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily titleMediumFont = typeScaleTokens.getTitleMediumFont();
        TitleMedium = new TextStyle(0L, typeScaleTokens.m2433getTitleMediumSizeXSAIIZE(), typeScaleTokens.getTitleMediumWeight(), (FontStyle) null, (FontSynthesis) null, titleMediumFont, (String) null, typeScaleTokens.m2434getTitleMediumTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2432getTitleMediumLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
        GenericFontFamily titleSmallFont = typeScaleTokens.getTitleSmallFont();
        TitleSmall = new TextStyle(0L, typeScaleTokens.m2436getTitleSmallSizeXSAIIZE(), typeScaleTokens.getTitleSmallWeight(), (FontStyle) null, (FontSynthesis) null, titleSmallFont, (String) null, typeScaleTokens.m2437getTitleSmallTrackingXSAIIZE(), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, typeScaleTokens.m2435getTitleSmallLineHeightXSAIIZE(), (TextIndent) null, 196441, (AbstractC3284p) null);
    }

    private TypographyTokens() {
    }

    public final TextStyle getBodyLarge() {
        return BodyLarge;
    }

    public final TextStyle getBodyMedium() {
        return BodyMedium;
    }

    public final TextStyle getBodySmall() {
        return BodySmall;
    }

    public final TextStyle getDisplayLarge() {
        return DisplayLarge;
    }

    public final TextStyle getDisplayMedium() {
        return DisplayMedium;
    }

    public final TextStyle getDisplaySmall() {
        return DisplaySmall;
    }

    public final TextStyle getHeadlineLarge() {
        return HeadlineLarge;
    }

    public final TextStyle getHeadlineMedium() {
        return HeadlineMedium;
    }

    public final TextStyle getHeadlineSmall() {
        return HeadlineSmall;
    }

    public final TextStyle getLabelLarge() {
        return LabelLarge;
    }

    public final TextStyle getLabelMedium() {
        return LabelMedium;
    }

    public final TextStyle getLabelSmall() {
        return LabelSmall;
    }

    public final TextStyle getTitleLarge() {
        return TitleLarge;
    }

    public final TextStyle getTitleMedium() {
        return TitleMedium;
    }

    public final TextStyle getTitleSmall() {
        return TitleSmall;
    }
}
