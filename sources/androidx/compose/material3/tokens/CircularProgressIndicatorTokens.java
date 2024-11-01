package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class CircularProgressIndicatorTokens {
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final float ActiveIndicatorWidth;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorFourColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorOneColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorThreeColor;
    private static final ColorSchemeKeyTokens FourColorActiveIndicatorTwoColor;
    public static final CircularProgressIndicatorTokens INSTANCE = new CircularProgressIndicatorTokens();
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        ActiveShape = ShapeKeyTokens.CornerNone;
        ActiveIndicatorWidth = Dp.m5155constructorimpl((float) 4.0d);
        FourColorActiveIndicatorFourColor = ColorSchemeKeyTokens.TertiaryContainer;
        FourColorActiveIndicatorOneColor = colorSchemeKeyTokens;
        FourColorActiveIndicatorThreeColor = ColorSchemeKeyTokens.Tertiary;
        FourColorActiveIndicatorTwoColor = ColorSchemeKeyTokens.PrimaryContainer;
        Size = Dp.m5155constructorimpl((float) 48.0d);
    }

    private CircularProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m1972getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
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

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m1973getSizeD9Ej5fM() {
        return Size;
    }
}
