package androidx.compose.material.icons.rounded;

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
public final class FavoriteBorderKt {
    private static ImageVector _favoriteBorder;

    public static final ImageVector getFavoriteBorder(Icons.Rounded rounded) {
        AbstractC3292y.i(rounded, "<this>");
        ImageVector imageVector = _favoriteBorder;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FavoriteBorder", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.66f, 3.99f);
        pathBuilder.curveToRelative(-2.64f, -1.8f, -5.9f, -0.96f, -7.66f, 1.1f);
        pathBuilder.curveToRelative(-1.76f, -2.06f, -5.02f, -2.91f, -7.66f, -1.1f);
        pathBuilder.curveToRelative(-1.4f, 0.96f, -2.28f, 2.58f, -2.34f, 4.29f);
        pathBuilder.curveToRelative(-0.14f, 3.88f, 3.3f, 6.99f, 8.55f, 11.76f);
        pathBuilder.lineToRelative(0.1f, 0.09f);
        pathBuilder.curveToRelative(0.76f, 0.69f, 1.93f, 0.69f, 2.69f, -0.01f);
        pathBuilder.lineToRelative(0.11f, -0.1f);
        pathBuilder.curveToRelative(5.25f, -4.76f, 8.68f, -7.87f, 8.55f, -11.75f);
        pathBuilder.curveToRelative(-0.06f, -1.7f, -0.94f, -3.32f, -2.34f, -4.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.1f, 18.55f);
        pathBuilder.lineToRelative(-0.1f, 0.1f);
        pathBuilder.lineToRelative(-0.1f, -0.1f);
        pathBuilder.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        pathBuilder.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        pathBuilder.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        pathBuilder.horizontalLineToRelative(1.87f);
        pathBuilder.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        pathBuilder.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favoriteBorder = build;
        AbstractC3292y.f(build);
        return build;
    }
}
