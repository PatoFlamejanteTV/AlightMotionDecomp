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
public final class NotificationsKt {
    private static ImageVector _notifications;

    public static final ImageVector getNotifications(Icons.TwoTone twoTone) {
        AbstractC3292y.i(twoTone, "<this>");
        ImageVector imageVector = _notifications;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Notifications", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m3278getButtKaPHkGw = companion2.m3278getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m3288getBevelLxFBmk8 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(-2.49f, 0.0f, -4.0f, 2.02f, -4.0f, 4.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(0.0f, -2.48f, -1.51f, -4.5f, -4.0f, -4.5f);
        pathBuilder.close();
        ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw2 = companion2.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk82 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 22.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(-5.0f);
        pathBuilder2.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilder2.lineTo(13.5f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.verticalLineToRelative(0.68f);
        pathBuilder2.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.lineToRelative(-2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 17.0f);
        pathBuilder2.lineTo(8.0f, 17.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw2, m3288getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notifications = build;
        AbstractC3292y.f(build);
        return build;
    }
}
