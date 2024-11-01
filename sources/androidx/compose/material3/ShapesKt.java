package androidx.compose.material3;

import Q5.p;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(ShapesKt$LocalShapes$1.INSTANCE);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CornerBasedShape end(CornerBasedShape cornerBasedShape) {
        AbstractC3292y.i(cornerBasedShape, "<this>");
        float f8 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), null, null, CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), 6, null);
    }

    public static final Shape fromToken(Shapes shapes, ShapeKeyTokens value) {
        AbstractC3292y.i(shapes, "<this>");
        AbstractC3292y.i(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return top(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return top(shapes.getExtraSmall());
            case 5:
                return RoundedCornerShapeKt.getCircleShape();
            case 6:
                return shapes.getLarge();
            case 7:
                return end(shapes.getLarge());
            case 8:
                return top(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return RectangleShapeKt.getRectangleShape();
            case 11:
                return shapes.getSmall();
            default:
                throw new p();
        }
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }

    @Composable
    public static final Shape toShape(ShapeKeyTokens shapeKeyTokens, Composer composer, int i8) {
        AbstractC3292y.i(shapeKeyTokens, "<this>");
        composer.startReplaceableGroup(-612531606);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-612531606, i8, -1, "androidx.compose.material3.toShape (Shapes.kt:174)");
        }
        Shape fromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fromToken;
    }

    public static final CornerBasedShape top(CornerBasedShape cornerBasedShape) {
        AbstractC3292y.i(cornerBasedShape, "<this>");
        float f8 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), 3, null);
    }
}
