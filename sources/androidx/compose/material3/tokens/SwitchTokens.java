package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SwitchTokens {
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    private static final ColorSchemeKeyTokens DisabledSelectedIconColor;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedTrackColor;
    public static final float DisabledTrackOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledUnselectedHandleColor;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedIconColor;
    public static final float DisabledUnselectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackColor;
    private static final ColorSchemeKeyTokens DisabledUnselectedTrackOutlineColor;
    private static final ShapeKeyTokens HandleShape;
    private static final float IconHandleHeight;
    private static final float IconHandleWidth;
    private static final float PressedHandleHeight;
    private static final float PressedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedFocusHandleColor;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final ColorSchemeKeyTokens SelectedFocusTrackColor;
    private static final ColorSchemeKeyTokens SelectedHandleColor;
    private static final float SelectedHandleHeight;
    private static final float SelectedHandleWidth;
    private static final ColorSchemeKeyTokens SelectedHoverHandleColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverTrackColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final float SelectedIconSize;
    private static final ColorSchemeKeyTokens SelectedPressedHandleColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedTrackColor;
    private static final ColorSchemeKeyTokens SelectedTrackColor;
    private static final ShapeKeyTokens StateLayerShape;
    private static final float StateLayerSize;
    private static final float TrackHeight;
    private static final float TrackOutlineWidth;
    private static final ShapeKeyTokens TrackShape;
    private static final float TrackWidth;
    private static final ColorSchemeKeyTokens UnselectedFocusHandleColor;
    private static final ColorSchemeKeyTokens UnselectedFocusIconColor;
    private static final ColorSchemeKeyTokens UnselectedFocusTrackColor;
    private static final ColorSchemeKeyTokens UnselectedFocusTrackOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedHandleColor;
    private static final float UnselectedHandleHeight;
    private static final float UnselectedHandleWidth;
    private static final ColorSchemeKeyTokens UnselectedHoverHandleColor;
    private static final ColorSchemeKeyTokens UnselectedHoverIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverTrackColor;
    private static final ColorSchemeKeyTokens UnselectedHoverTrackOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final float UnselectedIconSize;
    private static final ColorSchemeKeyTokens UnselectedPressedHandleColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedTrackColor;
    private static final ColorSchemeKeyTokens UnselectedPressedTrackOutlineColor;
    private static final ColorSchemeKeyTokens UnselectedTrackColor;
    private static final ColorSchemeKeyTokens UnselectedTrackOutlineColor;
    public static final SwitchTokens INSTANCE = new SwitchTokens();
    private static final ColorSchemeKeyTokens DisabledSelectedHandleColor = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledSelectedTrackColor = colorSchemeKeyTokens;
        DisabledUnselectedHandleColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
        DisabledUnselectedIconColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackOutlineColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        HandleShape = shapeKeyTokens;
        float f8 = (float) 28.0d;
        PressedHandleHeight = Dp.m5155constructorimpl(f8);
        PressedHandleWidth = Dp.m5155constructorimpl(f8);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.PrimaryContainer;
        SelectedFocusHandleColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimaryContainer;
        SelectedFocusIconColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        SelectedFocusTrackColor = colorSchemeKeyTokens5;
        SelectedHandleColor = ColorSchemeKeyTokens.OnPrimary;
        float f9 = (float) 24.0d;
        SelectedHandleHeight = Dp.m5155constructorimpl(f9);
        SelectedHandleWidth = Dp.m5155constructorimpl(f9);
        SelectedHoverHandleColor = colorSchemeKeyTokens3;
        SelectedHoverIconColor = colorSchemeKeyTokens4;
        SelectedHoverTrackColor = colorSchemeKeyTokens5;
        SelectedIconColor = colorSchemeKeyTokens4;
        float f10 = (float) 16.0d;
        SelectedIconSize = Dp.m5155constructorimpl(f10);
        SelectedPressedHandleColor = colorSchemeKeyTokens3;
        SelectedPressedIconColor = colorSchemeKeyTokens4;
        SelectedPressedTrackColor = colorSchemeKeyTokens5;
        SelectedTrackColor = colorSchemeKeyTokens5;
        StateLayerShape = shapeKeyTokens;
        StateLayerSize = Dp.m5155constructorimpl((float) 40.0d);
        TrackHeight = Dp.m5155constructorimpl((float) 32.0d);
        TrackOutlineWidth = Dp.m5155constructorimpl((float) 2.0d);
        TrackShape = shapeKeyTokens;
        TrackWidth = Dp.m5155constructorimpl((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusHandleColor = colorSchemeKeyTokens6;
        UnselectedFocusIconColor = colorSchemeKeyTokens2;
        UnselectedFocusTrackColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.Outline;
        UnselectedFocusTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedHandleColor = colorSchemeKeyTokens7;
        UnselectedHandleHeight = Dp.m5155constructorimpl(f10);
        UnselectedHandleWidth = Dp.m5155constructorimpl(f10);
        UnselectedHoverHandleColor = colorSchemeKeyTokens6;
        UnselectedHoverIconColor = colorSchemeKeyTokens2;
        UnselectedHoverTrackColor = colorSchemeKeyTokens2;
        UnselectedHoverTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedIconSize = Dp.m5155constructorimpl(f10);
        UnselectedPressedHandleColor = colorSchemeKeyTokens6;
        UnselectedPressedIconColor = colorSchemeKeyTokens2;
        UnselectedPressedTrackColor = colorSchemeKeyTokens2;
        UnselectedPressedTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedTrackColor = colorSchemeKeyTokens2;
        UnselectedTrackOutlineColor = colorSchemeKeyTokens7;
        IconHandleHeight = Dp.m5155constructorimpl(f9);
        IconHandleWidth = Dp.m5155constructorimpl(f9);
    }

    private SwitchTokens() {
    }

    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return DisabledSelectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return DisabledSelectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return DisabledSelectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return DisabledUnselectedHandleColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return DisabledUnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return DisabledUnselectedTrackColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return DisabledUnselectedTrackOutlineColor;
    }

    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* renamed from: getIconHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m2358getIconHandleHeightD9Ej5fM() {
        return IconHandleHeight;
    }

    /* renamed from: getIconHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m2359getIconHandleWidthD9Ej5fM() {
        return IconHandleWidth;
    }

    /* renamed from: getPressedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m2360getPressedHandleHeightD9Ej5fM() {
        return PressedHandleHeight;
    }

    /* renamed from: getPressedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m2361getPressedHandleWidthD9Ej5fM() {
        return PressedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedFocusHandleColor() {
        return SelectedFocusHandleColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusTrackColor() {
        return SelectedFocusTrackColor;
    }

    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return SelectedHandleColor;
    }

    /* renamed from: getSelectedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m2362getSelectedHandleHeightD9Ej5fM() {
        return SelectedHandleHeight;
    }

    /* renamed from: getSelectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m2363getSelectedHandleWidthD9Ej5fM() {
        return SelectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHoverHandleColor() {
        return SelectedHoverHandleColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverTrackColor() {
        return SelectedHoverTrackColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2364getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    public final ColorSchemeKeyTokens getSelectedPressedHandleColor() {
        return SelectedPressedHandleColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedTrackColor() {
        return SelectedPressedTrackColor;
    }

    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return SelectedTrackColor;
    }

    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m2365getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    /* renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2366getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    /* renamed from: getTrackOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2367getTrackOutlineWidthD9Ej5fM() {
        return TrackOutlineWidth;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }

    /* renamed from: getTrackWidth-D9Ej5fM, reason: not valid java name */
    public final float m2368getTrackWidthD9Ej5fM() {
        return TrackWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusHandleColor() {
        return UnselectedFocusHandleColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return UnselectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrackColor() {
        return UnselectedFocusTrackColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return UnselectedFocusTrackOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return UnselectedHandleColor;
    }

    /* renamed from: getUnselectedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m2369getUnselectedHandleHeightD9Ej5fM() {
        return UnselectedHandleHeight;
    }

    /* renamed from: getUnselectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m2370getUnselectedHandleWidthD9Ej5fM() {
        return UnselectedHandleWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverHandleColor() {
        return UnselectedHoverHandleColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return UnselectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverTrackColor() {
        return UnselectedHoverTrackColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverTrackOutlineColor() {
        return UnselectedHoverTrackOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    /* renamed from: getUnselectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2371getUnselectedIconSizeD9Ej5fM() {
        return UnselectedIconSize;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedHandleColor() {
        return UnselectedPressedHandleColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedTrackColor() {
        return UnselectedPressedTrackColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedTrackOutlineColor() {
        return UnselectedPressedTrackOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return UnselectedTrackColor;
    }

    public final ColorSchemeKeyTokens getUnselectedTrackOutlineColor() {
        return UnselectedTrackOutlineColor;
    }
}
