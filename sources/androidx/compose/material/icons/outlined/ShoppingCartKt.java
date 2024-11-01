package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ShoppingCartKt {
    private static ImageVector _shoppingCart;

    public static final ImageVector getShoppingCart(Icons.Outlined outlined) {
        AbstractC3292y.i(outlined, "<this>");
        ImageVector imageVector = _shoppingCart;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShoppingCart", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 13.0f);
        pathBuilder.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilder.lineToRelative(3.58f, -6.49f);
        pathBuilder.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        pathBuilder.lineTo(5.21f, 4.0f);
        pathBuilder.lineToRelative(-0.94f, -2.0f);
        pathBuilder.lineTo(1.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(3.6f, 7.59f);
        pathBuilder.lineToRelative(-1.35f, 2.44f);
        pathBuilder.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.lineToRelative(1.1f, -2.0f);
        pathBuilder.horizontalLineToRelative(7.45f);
        pathBuilder.close();
        pathBuilder.moveTo(6.16f, 6.0f);
        pathBuilder.horizontalLineToRelative(12.15f);
        pathBuilder.lineToRelative(-2.76f, 5.0f);
        pathBuilder.lineTo(8.53f, 11.0f);
        pathBuilder.lineTo(6.16f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 18.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCart = build;
        AbstractC3292y.f(build);
        return build;
    }
}
