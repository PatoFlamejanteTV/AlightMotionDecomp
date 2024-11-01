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
public final class SendKt {
    private static ImageVector _send;

    public static final ImageVector getSend(Icons.TwoTone twoTone) {
        AbstractC3292y.i(twoTone, "<this>");
        ImageVector imageVector = _send;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Send", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m3278getButtKaPHkGw = companion2.m3278getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m3288getBevelLxFBmk8 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 8.25f);
        pathBuilder.lineToRelative(7.51f, 1.0f);
        pathBuilder.lineToRelative(-7.5f, -3.22f);
        pathBuilder.close();
        pathBuilder.moveTo(4.01f, 17.97f);
        pathBuilder.lineToRelative(7.5f, -3.22f);
        pathBuilder.lineToRelative(-7.51f, 1.0f);
        pathBuilder.close();
        ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw2 = companion2.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk82 = companion3.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.01f, 3.0f);
        pathBuilder2.lineTo(2.0f, 10.0f);
        pathBuilder2.lineToRelative(15.0f, 2.0f);
        pathBuilder2.lineToRelative(-15.0f, 2.0f);
        pathBuilder2.lineToRelative(0.01f, 7.0f);
        pathBuilder2.lineTo(23.0f, 12.0f);
        pathBuilder2.lineTo(2.01f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 8.25f);
        pathBuilder2.lineTo(4.0f, 6.03f);
        pathBuilder2.lineToRelative(7.51f, 3.22f);
        pathBuilder2.lineToRelative(-7.51f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.01f, 17.97f);
        pathBuilder2.verticalLineToRelative(-2.22f);
        pathBuilder2.lineToRelative(7.51f, -1.0f);
        pathBuilder2.lineToRelative(-7.51f, 3.22f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw2, m3288getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        AbstractC3292y.f(build);
        return build;
    }
}
