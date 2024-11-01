package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class TopAppBarSmallTokens {
    private static final float ContainerElevation;
    private static final float ContainerHeight;
    private static final ShapeKeyTokens ContainerShape;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;
    private static final ColorSchemeKeyTokens HeadlineColor;
    private static final TypographyKeyTokens HeadlineFont;
    private static final ColorSchemeKeyTokens LeadingIconColor;
    private static final float LeadingIconSize;
    private static final float OnScrollContainerElevation;
    private static final ColorSchemeKeyTokens TrailingIconColor;
    private static final float TrailingIconSize;
    public static final TopAppBarSmallTokens INSTANCE = new TopAppBarSmallTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m2049getLevel0D9Ej5fM();
        ContainerHeight = Dp.m5155constructorimpl((float) 64.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        HeadlineColor = colorSchemeKeyTokens;
        HeadlineFont = TypographyKeyTokens.TitleLarge;
        LeadingIconColor = colorSchemeKeyTokens;
        float f8 = (float) 24.0d;
        LeadingIconSize = Dp.m5155constructorimpl(f8);
        OnScrollContainerElevation = elevationTokens.m2051getLevel2D9Ej5fM();
        TrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        TrailingIconSize = Dp.m5155constructorimpl(f8);
    }

    private TopAppBarSmallTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2388getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m2389getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2390getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getOnScrollContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m2391getOnScrollContainerElevationD9Ej5fM() {
        return OnScrollContainerElevation;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2392getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
