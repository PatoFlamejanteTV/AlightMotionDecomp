package androidx.compose.material.icons.twotone;

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
public final class EditKt {
    private static ImageVector _edit;

    public static final ImageVector getEdit(Icons.TwoTone twoTone) {
        AbstractC3292y.i(twoTone, "<this>");
        ImageVector imageVector = _edit;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Edit", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m3278getButtKaPHkGw = companion2.m3278getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m3288getBevelLxFBmk8 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.08f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        pathBuilder.lineToRelative(9.06f, -9.06f);
        pathBuilder.lineToRelative(-0.92f, -0.92f);
        pathBuilder.close();
        ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw2 = companion2.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk82 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.71f, 7.04f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder2.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-1.83f, 1.83f);
        pathBuilder2.lineToRelative(3.75f, 3.75f);
        pathBuilder2.lineToRelative(1.83f, -1.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.0f, 17.25f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.horizontalLineToRelative(3.75f);
        pathBuilder2.lineTo(17.81f, 9.94f);
        pathBuilder2.lineToRelative(-3.75f, -3.75f);
        pathBuilder2.lineTo(3.0f, 17.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.92f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-0.92f);
        pathBuilder2.lineToRelative(9.06f, -9.06f);
        pathBuilder2.lineToRelative(0.92f, 0.92f);
        pathBuilder2.lineTo(5.92f, 19.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw2, m3288getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _edit = build;
        AbstractC3292y.f(build);
        return build;
    }
}
