package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FilledCardTokens {
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens DisabledContainerColor;
    private static final float DisabledContainerElevation;
    public static final float DisabledContainerOpacity = 0.38f;
    private static final float DraggedContainerElevation;
    private static final float FocusContainerElevation;
    private static final float HoverContainerElevation;
    public static final FilledCardTokens INSTANCE = new FilledCardTokens();
    private static final ColorSchemeKeyTokens IconColor;
    private static final float IconSize;
    private static final float PressedContainerElevation;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        ContainerColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        DisabledContainerColor = colorSchemeKeyTokens;
        DisabledContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        DraggedContainerElevation = elevationTokens.m2052getLevel3D9Ej5fM();
        FocusContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        HoverContainerElevation = elevationTokens.m2050getLevel1D9Ej5fM();
        IconColor = ColorSchemeKeyTokens.Primary;
        IconSize = Dp.m5155constructorimpl((float) 24.0d);
        PressedContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
    }

    private FilledCardTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2126getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2127getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2128getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2129getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    /* renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2130getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2131getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2132getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }
}
