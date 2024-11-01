package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SliderTokens {
    private static final ColorSchemeKeyTokens ActiveTrackColor;
    private static final float ActiveTrackHeight;
    private static final ShapeKeyTokens ActiveTrackShape;
    private static final ColorSchemeKeyTokens DisabledActiveTrackColor;
    public static final float DisabledActiveTrackOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledHandleColor;
    private static final float DisabledHandleElevation;
    public static final float DisabledHandleOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledInactiveTrackColor;
    public static final float DisabledInactiveTrackOpacity = 0.12f;
    private static final ColorSchemeKeyTokens FocusHandleColor;
    private static final ColorSchemeKeyTokens HandleColor;
    private static final float HandleElevation;
    private static final float HandleHeight;
    private static final ShapeKeyTokens HandleShape;
    private static final float HandleWidth;
    private static final ColorSchemeKeyTokens HoverHandleColor;
    public static final SliderTokens INSTANCE = new SliderTokens();
    private static final ColorSchemeKeyTokens InactiveTrackColor;
    private static final float InactiveTrackHeight;
    private static final ShapeKeyTokens InactiveTrackShape;
    private static final ColorSchemeKeyTokens LabelContainerColor;
    private static final float LabelContainerElevation;
    private static final float LabelContainerHeight;
    private static final ColorSchemeKeyTokens LabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final ColorSchemeKeyTokens OverlapHandleOutlineColor;
    private static final float OverlapHandleOutlineWidth;
    private static final ColorSchemeKeyTokens PressedHandleColor;
    private static final float StateLayerSize;
    private static final ColorSchemeKeyTokens TickMarksActiveContainerColor;
    public static final float TickMarksActiveContainerOpacity = 0.38f;
    private static final ShapeKeyTokens TickMarksContainerShape;
    private static final float TickMarksContainerSize;
    private static final ColorSchemeKeyTokens TickMarksDisabledContainerColor;
    public static final float TickMarksDisabledContainerOpacity = 0.38f;
    private static final ColorSchemeKeyTokens TickMarksInactiveContainerColor;
    public static final float TickMarksInactiveContainerOpacity = 0.38f;
    private static final float TrackElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        float f8 = (float) 4.0d;
        ActiveTrackHeight = Dp.m5155constructorimpl(f8);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveTrackShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledHandleColor = colorSchemeKeyTokens2;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DisabledHandleElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        FocusHandleColor = colorSchemeKeyTokens;
        HandleColor = colorSchemeKeyTokens;
        HandleElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        float f9 = (float) 20.0d;
        HandleHeight = Dp.m5155constructorimpl(f9);
        HandleShape = shapeKeyTokens;
        HandleWidth = Dp.m5155constructorimpl(f9);
        HoverHandleColor = colorSchemeKeyTokens;
        InactiveTrackColor = ColorSchemeKeyTokens.SurfaceVariant;
        InactiveTrackHeight = Dp.m5155constructorimpl(f8);
        InactiveTrackShape = shapeKeyTokens;
        LabelContainerColor = colorSchemeKeyTokens;
        LabelContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        LabelContainerHeight = Dp.m5155constructorimpl((float) 28.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        LabelTextColor = colorSchemeKeyTokens3;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        PressedHandleColor = colorSchemeKeyTokens;
        StateLayerSize = Dp.m5155constructorimpl((float) 40.0d);
        TrackElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        OverlapHandleOutlineColor = colorSchemeKeyTokens3;
        OverlapHandleOutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        TickMarksActiveContainerColor = colorSchemeKeyTokens3;
        TickMarksContainerShape = shapeKeyTokens;
        TickMarksContainerSize = Dp.m5155constructorimpl((float) 2.0d);
        TickMarksDisabledContainerColor = colorSchemeKeyTokens2;
        TickMarksInactiveContainerColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    }

    private SliderTokens() {
    }

    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return ActiveTrackColor;
    }

    /* renamed from: getActiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2332getActiveTrackHeightD9Ej5fM() {
        return ActiveTrackHeight;
    }

    public final ShapeKeyTokens getActiveTrackShape() {
        return ActiveTrackShape;
    }

    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return DisabledActiveTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return DisabledHandleColor;
    }

    /* renamed from: getDisabledHandleElevation-D9Ej5fM, reason: not valid java name */
    public final float m2333getDisabledHandleElevationD9Ej5fM() {
        return DisabledHandleElevation;
    }

    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return DisabledInactiveTrackColor;
    }

    public final ColorSchemeKeyTokens getFocusHandleColor() {
        return FocusHandleColor;
    }

    public final ColorSchemeKeyTokens getHandleColor() {
        return HandleColor;
    }

    /* renamed from: getHandleElevation-D9Ej5fM, reason: not valid java name */
    public final float m2334getHandleElevationD9Ej5fM() {
        return HandleElevation;
    }

    /* renamed from: getHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m2335getHandleHeightD9Ej5fM() {
        return HandleHeight;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* renamed from: getHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m2336getHandleWidthD9Ej5fM() {
        return HandleWidth;
    }

    public final ColorSchemeKeyTokens getHoverHandleColor() {
        return HoverHandleColor;
    }

    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return InactiveTrackColor;
    }

    /* renamed from: getInactiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2337getInactiveTrackHeightD9Ej5fM() {
        return InactiveTrackHeight;
    }

    public final ShapeKeyTokens getInactiveTrackShape() {
        return InactiveTrackShape;
    }

    public final ColorSchemeKeyTokens getLabelContainerColor() {
        return LabelContainerColor;
    }

    /* renamed from: getLabelContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2338getLabelContainerElevationD9Ej5fM() {
        return LabelContainerElevation;
    }

    /* renamed from: getLabelContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2339getLabelContainerHeightD9Ej5fM() {
        return LabelContainerHeight;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getOverlapHandleOutlineColor() {
        return OverlapHandleOutlineColor;
    }

    /* renamed from: getOverlapHandleOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2340getOverlapHandleOutlineWidthD9Ej5fM() {
        return OverlapHandleOutlineWidth;
    }

    public final ColorSchemeKeyTokens getPressedHandleColor() {
        return PressedHandleColor;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m2341getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getTickMarksActiveContainerColor() {
        return TickMarksActiveContainerColor;
    }

    public final ShapeKeyTokens getTickMarksContainerShape() {
        return TickMarksContainerShape;
    }

    /* renamed from: getTickMarksContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m2342getTickMarksContainerSizeD9Ej5fM() {
        return TickMarksContainerSize;
    }

    public final ColorSchemeKeyTokens getTickMarksDisabledContainerColor() {
        return TickMarksDisabledContainerColor;
    }

    public final ColorSchemeKeyTokens getTickMarksInactiveContainerColor() {
        return TickMarksInactiveContainerColor;
    }

    /* renamed from: getTrackElevation-D9Ej5fM, reason: not valid java name */
    public final float m2343getTrackElevationD9Ej5fM() {
        return TrackElevation;
    }
}
