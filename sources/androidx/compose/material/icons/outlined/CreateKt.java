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
public final class CreateKt {
    private static ImageVector _create;

    public static final ImageVector getCreate(Icons.Outlined outlined) {
        AbstractC3292y.i(outlined, "<this>");
        ImageVector imageVector = _create;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Create", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 17.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(3.75f);
        pathBuilder.lineTo(17.81f, 9.94f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineTo(3.0f, 17.25f);
        pathBuilder.close();
        pathBuilder.moveTo(5.92f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-0.92f);
        pathBuilder.lineToRelative(9.06f, -9.06f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.lineTo(5.92f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.71f, 5.63f);
        pathBuilder.lineToRelative(-2.34f, -2.34f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder.lineToRelative(-1.83f, 1.83f);
        pathBuilder.lineToRelative(3.75f, 3.75f);
        pathBuilder.lineToRelative(1.83f, -1.83f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _create = build;
        AbstractC3292y.f(build);
        return build;
    }
}
