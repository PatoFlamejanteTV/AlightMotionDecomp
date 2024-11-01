package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ShapeTokens {
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    public static final ShapeTokens INSTANCE = new ShapeTokens();
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();
    private static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl((float) 12.0d));
    private static final Shape CornerNone = RectangleShapeKt.getRectangleShape();
    private static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl((float) 8.0d));

    static {
        float f8 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(f8));
        float f9 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m830RoundedCornerShapea9UjIt4(Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f9));
        float f10 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(f10));
        CornerExtraSmallTop = RoundedCornerShapeKt.m830RoundedCornerShapea9UjIt4(Dp.m5155constructorimpl(f10), Dp.m5155constructorimpl(f10), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f9));
        float f11 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m829RoundedCornerShape0680j_4(Dp.m5155constructorimpl(f11));
        CornerLargeEnd = RoundedCornerShapeKt.m830RoundedCornerShapea9UjIt4(Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f11), Dp.m5155constructorimpl(f11), Dp.m5155constructorimpl(f9));
        CornerLargeTop = RoundedCornerShapeKt.m830RoundedCornerShapea9UjIt4(Dp.m5155constructorimpl(f11), Dp.m5155constructorimpl(f11), Dp.m5155constructorimpl(f9), Dp.m5155constructorimpl(f9));
    }

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
