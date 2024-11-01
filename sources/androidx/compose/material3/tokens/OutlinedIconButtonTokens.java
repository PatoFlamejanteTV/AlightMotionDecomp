package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class OutlinedIconButtonTokens {
    private static final ColorSchemeKeyTokens DisabledColor;
    public static final float DisabledOpacity = 0.38f;
    private static final ColorSchemeKeyTokens DisabledSelectedContainerColor;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;
    private static final ColorSchemeKeyTokens SelectedColor;
    private static final ColorSchemeKeyTokens SelectedContainerColor;
    private static final ColorSchemeKeyTokens SelectedFocusColor;
    private static final ColorSchemeKeyTokens SelectedHoverColor;
    private static final ColorSchemeKeyTokens SelectedPressedColor;
    private static final float Size;
    private static final ColorSchemeKeyTokens UnselectedColor;
    private static final ColorSchemeKeyTokens UnselectedFocusColor;
    private static final ColorSchemeKeyTokens UnselectedHoverColor;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor;
    private static final float UnselectedOutlineWidth;
    private static final ColorSchemeKeyTokens UnselectedPressedColor;
    public static final OutlinedIconButtonTokens INSTANCE = new OutlinedIconButtonTokens();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ContainerSize = Dp.m5155constructorimpl((float) 40.0d);

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledColor = colorSchemeKeyTokens;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        Size = Dp.m5155constructorimpl((float) 24.0d);
        SelectedContainerColor = ColorSchemeKeyTokens.InverseSurface;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.InverseOnSurface;
        SelectedFocusColor = colorSchemeKeyTokens2;
        SelectedHoverColor = colorSchemeKeyTokens2;
        SelectedColor = colorSchemeKeyTokens2;
        SelectedPressedColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusColor = colorSchemeKeyTokens3;
        UnselectedHoverColor = colorSchemeKeyTokens3;
        UnselectedColor = colorSchemeKeyTokens3;
        UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
        UnselectedOutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        UnselectedPressedColor = colorSchemeKeyTokens;
    }

    private OutlinedIconButtonTokens() {
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* renamed from: getContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m2234getContainerSizeD9Ej5fM() {
        return ContainerSize;
    }

    public final ColorSchemeKeyTokens getDisabledColor() {
        return DisabledColor;
    }

    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    public final ColorSchemeKeyTokens getSelectedColor() {
        return SelectedColor;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusColor() {
        return SelectedFocusColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverColor() {
        return SelectedHoverColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedColor() {
        return SelectedPressedColor;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2235getSizeD9Ej5fM() {
        return Size;
    }

    public final ColorSchemeKeyTokens getUnselectedColor() {
        return UnselectedColor;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusColor() {
        return UnselectedFocusColor;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverColor() {
        return UnselectedHoverColor;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2236getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedColor() {
        return UnselectedPressedColor;
    }
}
