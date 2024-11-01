package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class TypeScaleTokens {
    private static final GenericFontFamily BodyLargeFont;
    private static final long BodyLargeLineHeight;
    private static final long BodyLargeSize;
    private static final long BodyLargeTracking;
    private static final FontWeight BodyLargeWeight;
    private static final GenericFontFamily BodyMediumFont;
    private static final long BodyMediumLineHeight;
    private static final long BodyMediumSize;
    private static final long BodyMediumTracking;
    private static final FontWeight BodyMediumWeight;
    private static final GenericFontFamily BodySmallFont;
    private static final long BodySmallLineHeight;
    private static final long BodySmallSize;
    private static final long BodySmallTracking;
    private static final FontWeight BodySmallWeight;
    private static final GenericFontFamily DisplayLargeFont;
    private static final long DisplayLargeLineHeight;
    private static final long DisplayLargeSize;
    private static final long DisplayLargeTracking;
    private static final FontWeight DisplayLargeWeight;
    private static final GenericFontFamily DisplayMediumFont;
    private static final long DisplayMediumLineHeight;
    private static final long DisplayMediumSize;
    private static final long DisplayMediumTracking;
    private static final FontWeight DisplayMediumWeight;
    private static final GenericFontFamily DisplaySmallFont;
    private static final long DisplaySmallLineHeight;
    private static final long DisplaySmallSize;
    private static final long DisplaySmallTracking;
    private static final FontWeight DisplaySmallWeight;
    private static final GenericFontFamily HeadlineLargeFont;
    private static final long HeadlineLargeLineHeight;
    private static final long HeadlineLargeSize;
    private static final long HeadlineLargeTracking;
    private static final FontWeight HeadlineLargeWeight;
    private static final GenericFontFamily HeadlineMediumFont;
    private static final long HeadlineMediumLineHeight;
    private static final long HeadlineMediumSize;
    private static final long HeadlineMediumTracking;
    private static final FontWeight HeadlineMediumWeight;
    private static final GenericFontFamily HeadlineSmallFont;
    private static final long HeadlineSmallLineHeight;
    private static final long HeadlineSmallSize;
    private static final long HeadlineSmallTracking;
    private static final FontWeight HeadlineSmallWeight;
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();
    private static final GenericFontFamily LabelLargeFont;
    private static final long LabelLargeLineHeight;
    private static final long LabelLargeSize;
    private static final long LabelLargeTracking;
    private static final FontWeight LabelLargeWeight;
    private static final GenericFontFamily LabelMediumFont;
    private static final long LabelMediumLineHeight;
    private static final long LabelMediumSize;
    private static final long LabelMediumTracking;
    private static final FontWeight LabelMediumWeight;
    private static final GenericFontFamily LabelSmallFont;
    private static final long LabelSmallLineHeight;
    private static final long LabelSmallSize;
    private static final long LabelSmallTracking;
    private static final FontWeight LabelSmallWeight;
    private static final GenericFontFamily TitleLargeFont;
    private static final long TitleLargeLineHeight;
    private static final long TitleLargeSize;
    private static final long TitleLargeTracking;
    private static final FontWeight TitleLargeWeight;
    private static final GenericFontFamily TitleMediumFont;
    private static final long TitleMediumLineHeight;
    private static final long TitleMediumSize;
    private static final long TitleMediumTracking;
    private static final FontWeight TitleMediumWeight;
    private static final GenericFontFamily TitleSmallFont;
    private static final long TitleSmallLineHeight;
    private static final long TitleSmallSize;
    private static final long TitleSmallTracking;
    private static final FontWeight TitleSmallWeight;

    static {
        TypefaceTokens typefaceTokens = TypefaceTokens.INSTANCE;
        BodyLargeFont = typefaceTokens.getPlain();
        BodyLargeLineHeight = TextUnitKt.getSp(24.0d);
        BodyLargeSize = TextUnitKt.getSp(16);
        BodyLargeTracking = TextUnitKt.getSp(0.5d);
        BodyLargeWeight = typefaceTokens.getWeightRegular();
        BodyMediumFont = typefaceTokens.getPlain();
        BodyMediumLineHeight = TextUnitKt.getSp(20.0d);
        BodyMediumSize = TextUnitKt.getSp(14);
        BodyMediumTracking = TextUnitKt.getSp(0.2d);
        BodyMediumWeight = typefaceTokens.getWeightRegular();
        BodySmallFont = typefaceTokens.getPlain();
        BodySmallLineHeight = TextUnitKt.getSp(16.0d);
        BodySmallSize = TextUnitKt.getSp(12);
        BodySmallTracking = TextUnitKt.getSp(0.4d);
        BodySmallWeight = typefaceTokens.getWeightRegular();
        DisplayLargeFont = typefaceTokens.getBrand();
        DisplayLargeLineHeight = TextUnitKt.getSp(64.0d);
        DisplayLargeSize = TextUnitKt.getSp(57);
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m5355checkArithmeticR2X_6o(sp);
        DisplayLargeTracking = TextUnitKt.pack(TextUnit.m5340getRawTypeimpl(sp), -TextUnit.m5342getValueimpl(sp));
        DisplayLargeWeight = typefaceTokens.getWeightRegular();
        DisplayMediumFont = typefaceTokens.getBrand();
        DisplayMediumLineHeight = TextUnitKt.getSp(52.0d);
        DisplayMediumSize = TextUnitKt.getSp(45);
        DisplayMediumTracking = TextUnitKt.getSp(0.0d);
        DisplayMediumWeight = typefaceTokens.getWeightRegular();
        DisplaySmallFont = typefaceTokens.getBrand();
        DisplaySmallLineHeight = TextUnitKt.getSp(44.0d);
        DisplaySmallSize = TextUnitKt.getSp(36);
        DisplaySmallTracking = TextUnitKt.getSp(0.0d);
        DisplaySmallWeight = typefaceTokens.getWeightRegular();
        HeadlineLargeFont = typefaceTokens.getBrand();
        HeadlineLargeLineHeight = TextUnitKt.getSp(40.0d);
        HeadlineLargeSize = TextUnitKt.getSp(32);
        HeadlineLargeTracking = TextUnitKt.getSp(0.0d);
        HeadlineLargeWeight = typefaceTokens.getWeightRegular();
        HeadlineMediumFont = typefaceTokens.getBrand();
        HeadlineMediumLineHeight = TextUnitKt.getSp(36.0d);
        HeadlineMediumSize = TextUnitKt.getSp(28);
        HeadlineMediumTracking = TextUnitKt.getSp(0.0d);
        HeadlineMediumWeight = typefaceTokens.getWeightRegular();
        HeadlineSmallFont = typefaceTokens.getBrand();
        HeadlineSmallLineHeight = TextUnitKt.getSp(32.0d);
        HeadlineSmallSize = TextUnitKt.getSp(24);
        HeadlineSmallTracking = TextUnitKt.getSp(0.0d);
        HeadlineSmallWeight = typefaceTokens.getWeightRegular();
        LabelLargeFont = typefaceTokens.getPlain();
        LabelLargeLineHeight = TextUnitKt.getSp(20.0d);
        LabelLargeSize = TextUnitKt.getSp(14);
        LabelLargeTracking = TextUnitKt.getSp(0.1d);
        LabelLargeWeight = typefaceTokens.getWeightMedium();
        LabelMediumFont = typefaceTokens.getPlain();
        LabelMediumLineHeight = TextUnitKt.getSp(16.0d);
        LabelMediumSize = TextUnitKt.getSp(12);
        LabelMediumTracking = TextUnitKt.getSp(0.5d);
        LabelMediumWeight = typefaceTokens.getWeightMedium();
        LabelSmallFont = typefaceTokens.getPlain();
        LabelSmallLineHeight = TextUnitKt.getSp(16.0d);
        LabelSmallSize = TextUnitKt.getSp(11);
        LabelSmallTracking = TextUnitKt.getSp(0.5d);
        LabelSmallWeight = typefaceTokens.getWeightMedium();
        TitleLargeFont = typefaceTokens.getBrand();
        TitleLargeLineHeight = TextUnitKt.getSp(28.0d);
        TitleLargeSize = TextUnitKt.getSp(22);
        TitleLargeTracking = TextUnitKt.getSp(0.0d);
        TitleLargeWeight = typefaceTokens.getWeightRegular();
        TitleMediumFont = typefaceTokens.getPlain();
        TitleMediumLineHeight = TextUnitKt.getSp(24.0d);
        TitleMediumSize = TextUnitKt.getSp(16);
        TitleMediumTracking = TextUnitKt.getSp(0.2d);
        TitleMediumWeight = typefaceTokens.getWeightMedium();
        TitleSmallFont = typefaceTokens.getPlain();
        TitleSmallLineHeight = TextUnitKt.getSp(20.0d);
        TitleSmallSize = TextUnitKt.getSp(14);
        TitleSmallTracking = TextUnitKt.getSp(0.1d);
        TitleSmallWeight = typefaceTokens.getWeightMedium();
    }

    private TypeScaleTokens() {
    }

    public final GenericFontFamily getBodyLargeFont() {
        return BodyLargeFont;
    }

    /* renamed from: getBodyLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2393getBodyLargeLineHeightXSAIIZE() {
        return BodyLargeLineHeight;
    }

    /* renamed from: getBodyLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2394getBodyLargeSizeXSAIIZE() {
        return BodyLargeSize;
    }

    /* renamed from: getBodyLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2395getBodyLargeTrackingXSAIIZE() {
        return BodyLargeTracking;
    }

    public final FontWeight getBodyLargeWeight() {
        return BodyLargeWeight;
    }

    public final GenericFontFamily getBodyMediumFont() {
        return BodyMediumFont;
    }

    /* renamed from: getBodyMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2396getBodyMediumLineHeightXSAIIZE() {
        return BodyMediumLineHeight;
    }

    /* renamed from: getBodyMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2397getBodyMediumSizeXSAIIZE() {
        return BodyMediumSize;
    }

    /* renamed from: getBodyMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2398getBodyMediumTrackingXSAIIZE() {
        return BodyMediumTracking;
    }

    public final FontWeight getBodyMediumWeight() {
        return BodyMediumWeight;
    }

    public final GenericFontFamily getBodySmallFont() {
        return BodySmallFont;
    }

    /* renamed from: getBodySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2399getBodySmallLineHeightXSAIIZE() {
        return BodySmallLineHeight;
    }

    /* renamed from: getBodySmallSize-XSAIIZE, reason: not valid java name */
    public final long m2400getBodySmallSizeXSAIIZE() {
        return BodySmallSize;
    }

    /* renamed from: getBodySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2401getBodySmallTrackingXSAIIZE() {
        return BodySmallTracking;
    }

    public final FontWeight getBodySmallWeight() {
        return BodySmallWeight;
    }

    public final GenericFontFamily getDisplayLargeFont() {
        return DisplayLargeFont;
    }

    /* renamed from: getDisplayLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2402getDisplayLargeLineHeightXSAIIZE() {
        return DisplayLargeLineHeight;
    }

    /* renamed from: getDisplayLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2403getDisplayLargeSizeXSAIIZE() {
        return DisplayLargeSize;
    }

    /* renamed from: getDisplayLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2404getDisplayLargeTrackingXSAIIZE() {
        return DisplayLargeTracking;
    }

    public final FontWeight getDisplayLargeWeight() {
        return DisplayLargeWeight;
    }

    public final GenericFontFamily getDisplayMediumFont() {
        return DisplayMediumFont;
    }

    /* renamed from: getDisplayMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2405getDisplayMediumLineHeightXSAIIZE() {
        return DisplayMediumLineHeight;
    }

    /* renamed from: getDisplayMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2406getDisplayMediumSizeXSAIIZE() {
        return DisplayMediumSize;
    }

    /* renamed from: getDisplayMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2407getDisplayMediumTrackingXSAIIZE() {
        return DisplayMediumTracking;
    }

    public final FontWeight getDisplayMediumWeight() {
        return DisplayMediumWeight;
    }

    public final GenericFontFamily getDisplaySmallFont() {
        return DisplaySmallFont;
    }

    /* renamed from: getDisplaySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2408getDisplaySmallLineHeightXSAIIZE() {
        return DisplaySmallLineHeight;
    }

    /* renamed from: getDisplaySmallSize-XSAIIZE, reason: not valid java name */
    public final long m2409getDisplaySmallSizeXSAIIZE() {
        return DisplaySmallSize;
    }

    /* renamed from: getDisplaySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2410getDisplaySmallTrackingXSAIIZE() {
        return DisplaySmallTracking;
    }

    public final FontWeight getDisplaySmallWeight() {
        return DisplaySmallWeight;
    }

    public final GenericFontFamily getHeadlineLargeFont() {
        return HeadlineLargeFont;
    }

    /* renamed from: getHeadlineLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2411getHeadlineLargeLineHeightXSAIIZE() {
        return HeadlineLargeLineHeight;
    }

    /* renamed from: getHeadlineLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2412getHeadlineLargeSizeXSAIIZE() {
        return HeadlineLargeSize;
    }

    /* renamed from: getHeadlineLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2413getHeadlineLargeTrackingXSAIIZE() {
        return HeadlineLargeTracking;
    }

    public final FontWeight getHeadlineLargeWeight() {
        return HeadlineLargeWeight;
    }

    public final GenericFontFamily getHeadlineMediumFont() {
        return HeadlineMediumFont;
    }

    /* renamed from: getHeadlineMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2414getHeadlineMediumLineHeightXSAIIZE() {
        return HeadlineMediumLineHeight;
    }

    /* renamed from: getHeadlineMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2415getHeadlineMediumSizeXSAIIZE() {
        return HeadlineMediumSize;
    }

    /* renamed from: getHeadlineMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2416getHeadlineMediumTrackingXSAIIZE() {
        return HeadlineMediumTracking;
    }

    public final FontWeight getHeadlineMediumWeight() {
        return HeadlineMediumWeight;
    }

    public final GenericFontFamily getHeadlineSmallFont() {
        return HeadlineSmallFont;
    }

    /* renamed from: getHeadlineSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2417getHeadlineSmallLineHeightXSAIIZE() {
        return HeadlineSmallLineHeight;
    }

    /* renamed from: getHeadlineSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2418getHeadlineSmallSizeXSAIIZE() {
        return HeadlineSmallSize;
    }

    /* renamed from: getHeadlineSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2419getHeadlineSmallTrackingXSAIIZE() {
        return HeadlineSmallTracking;
    }

    public final FontWeight getHeadlineSmallWeight() {
        return HeadlineSmallWeight;
    }

    public final GenericFontFamily getLabelLargeFont() {
        return LabelLargeFont;
    }

    /* renamed from: getLabelLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2420getLabelLargeLineHeightXSAIIZE() {
        return LabelLargeLineHeight;
    }

    /* renamed from: getLabelLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2421getLabelLargeSizeXSAIIZE() {
        return LabelLargeSize;
    }

    /* renamed from: getLabelLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2422getLabelLargeTrackingXSAIIZE() {
        return LabelLargeTracking;
    }

    public final FontWeight getLabelLargeWeight() {
        return LabelLargeWeight;
    }

    public final GenericFontFamily getLabelMediumFont() {
        return LabelMediumFont;
    }

    /* renamed from: getLabelMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2423getLabelMediumLineHeightXSAIIZE() {
        return LabelMediumLineHeight;
    }

    /* renamed from: getLabelMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2424getLabelMediumSizeXSAIIZE() {
        return LabelMediumSize;
    }

    /* renamed from: getLabelMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2425getLabelMediumTrackingXSAIIZE() {
        return LabelMediumTracking;
    }

    public final FontWeight getLabelMediumWeight() {
        return LabelMediumWeight;
    }

    public final GenericFontFamily getLabelSmallFont() {
        return LabelSmallFont;
    }

    /* renamed from: getLabelSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2426getLabelSmallLineHeightXSAIIZE() {
        return LabelSmallLineHeight;
    }

    /* renamed from: getLabelSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2427getLabelSmallSizeXSAIIZE() {
        return LabelSmallSize;
    }

    /* renamed from: getLabelSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2428getLabelSmallTrackingXSAIIZE() {
        return LabelSmallTracking;
    }

    public final FontWeight getLabelSmallWeight() {
        return LabelSmallWeight;
    }

    public final GenericFontFamily getTitleLargeFont() {
        return TitleLargeFont;
    }

    /* renamed from: getTitleLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2429getTitleLargeLineHeightXSAIIZE() {
        return TitleLargeLineHeight;
    }

    /* renamed from: getTitleLargeSize-XSAIIZE, reason: not valid java name */
    public final long m2430getTitleLargeSizeXSAIIZE() {
        return TitleLargeSize;
    }

    /* renamed from: getTitleLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m2431getTitleLargeTrackingXSAIIZE() {
        return TitleLargeTracking;
    }

    public final FontWeight getTitleLargeWeight() {
        return TitleLargeWeight;
    }

    public final GenericFontFamily getTitleMediumFont() {
        return TitleMediumFont;
    }

    /* renamed from: getTitleMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2432getTitleMediumLineHeightXSAIIZE() {
        return TitleMediumLineHeight;
    }

    /* renamed from: getTitleMediumSize-XSAIIZE, reason: not valid java name */
    public final long m2433getTitleMediumSizeXSAIIZE() {
        return TitleMediumSize;
    }

    /* renamed from: getTitleMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m2434getTitleMediumTrackingXSAIIZE() {
        return TitleMediumTracking;
    }

    public final FontWeight getTitleMediumWeight() {
        return TitleMediumWeight;
    }

    public final GenericFontFamily getTitleSmallFont() {
        return TitleSmallFont;
    }

    /* renamed from: getTitleSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2435getTitleSmallLineHeightXSAIIZE() {
        return TitleSmallLineHeight;
    }

    /* renamed from: getTitleSmallSize-XSAIIZE, reason: not valid java name */
    public final long m2436getTitleSmallSizeXSAIIZE() {
        return TitleSmallSize;
    }

    /* renamed from: getTitleSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m2437getTitleSmallTrackingXSAIIZE() {
        return TitleSmallTracking;
    }

    public final FontWeight getTitleSmallWeight() {
        return TitleSmallWeight;
    }
}
