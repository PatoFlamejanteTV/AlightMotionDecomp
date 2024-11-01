package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class RadioButtonTokens {
    private static final ColorSchemeKeyTokens DisabledSelectedIconColor;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledUnselectedIconColor;
    public static final float DisabledUnselectedIconOpacity = 0.38f;
    public static final RadioButtonTokens INSTANCE = new RadioButtonTokens();
    private static final float IconSize;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;
    private static final ColorSchemeKeyTokens SelectedIconColor;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;
    private static final float StateLayerSize;
    private static final ColorSchemeKeyTokens UnselectedFocusIconColor;
    private static final ColorSchemeKeyTokens UnselectedHoverIconColor;
    private static final ColorSchemeKeyTokens UnselectedIconColor;
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledUnselectedIconColor = colorSchemeKeyTokens;
        IconSize = Dp.m5155constructorimpl((float) 20.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        SelectedFocusIconColor = colorSchemeKeyTokens2;
        SelectedHoverIconColor = colorSchemeKeyTokens2;
        SelectedIconColor = colorSchemeKeyTokens2;
        SelectedPressedIconColor = colorSchemeKeyTokens2;
        StateLayerSize = Dp.m5155constructorimpl((float) 40.0d);
        UnselectedFocusIconColor = colorSchemeKeyTokens;
        UnselectedHoverIconColor = colorSchemeKeyTokens;
        UnselectedIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedPressedIconColor = colorSchemeKeyTokens;
    }

    private RadioButtonTokens() {
    }

    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return DisabledSelectedIconColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return DisabledUnselectedIconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2330getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m2331getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return UnselectedFocusIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return UnselectedHoverIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }
}
