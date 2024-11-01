package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class LinearProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorHeight;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;
    public static final LinearProgressIndicatorTokens INSTANCE = new LinearProgressIndicatorTokens();
    private static final ColorSchemeKeyTokens TrackColor;
    private static final float TrackHeight;
    private static final ShapeKeyTokens TrackShape;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f8 = (float) 4.0d;
        ActiveIndicatorHeight = Dp.m5155constructorimpl(f8);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ActiveShape = shapeKeyTokens;
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        TrackColor = ColorSchemeKeyTokens.SurfaceVariant;
        TrackHeight = Dp.m5155constructorimpl(f8);
        TrackShape = shapeKeyTokens;
    }

    private LinearProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2178getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorFourColor() {
        return FourColorActiveIndicatorFourColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorOneColor() {
        return FourColorActiveIndicatorOneColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorThreeColor() {
        return FourColorActiveIndicatorThreeColor;
    }

    public final ColorSchemeKeyTokens getFourColorActiveIndicatorTwoColor() {
        return FourColorActiveIndicatorTwoColor;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    /* renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m2179getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }
}
