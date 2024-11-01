package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class OutlinedCardTokens {
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;
    private static final float DisabledContainerElevation;
    private static final ColorSchemeKeyTokens DisabledOutlineColor;
    public static final float DisabledOutlineOpacity = 0.12f;
    private static final float DraggedContainerElevation;
    private static final ColorSchemeKeyTokens DraggedOutlineColor;
    private static final float FocusContainerElevation;
    private static final ColorSchemeKeyTokens FocusOutlineColor;
    private static final float HoverContainerElevation;
    private static final ColorSchemeKeyTokens HoverOutlineColor;
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens OutlineColor;
    private static final float OutlineWidth;
    private static final float PressedContainerElevation;
    private static final ColorSchemeKeyTokens PressedOutlineColor;
    public static final OutlinedCardTokens INSTANCE = new OutlinedCardTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        DisabledContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Outline;
        DisabledOutlineColor = colorSchemeKeyTokens;
        DraggedContainerElevation = elevationTokens.m2052getLevel3D9Ej5fM();
        DraggedOutlineColor = colorSchemeKeyTokens;
        FocusContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        FocusOutlineColor = ColorSchemeKeyTokens.OnSurface;
        HoverContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        HoverOutlineColor = colorSchemeKeyTokens;
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m5155constructorimpl((float) 24.0d);
        OutlineColor = colorSchemeKeyTokens;
        OutlineWidth = Dp.m5155constructorimpl((float) 1.0d);
        PressedContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        PressedOutlineColor = colorSchemeKeyTokens;
    }

    private OutlinedCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2226getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2227getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2228getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    public final ColorSchemeKeyTokens getDraggedOutlineColor() {
        return DraggedOutlineColor;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2229getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2230getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2231getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* renamed from: getOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m2232getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2233getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedOutlineColor() {
        return PressedOutlineColor;
    }
}
