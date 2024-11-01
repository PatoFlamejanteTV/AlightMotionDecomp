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
public final class SendKt {
    private static ImageVector _send;

    public static final ImageVector getSend(Icons.Outlined outlined) {
        AbstractC3292y.i(outlined, "<this>");
        ImageVector imageVector = _send;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Send", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.01f, 6.03f);
        pathBuilder.lineToRelative(7.51f, 3.22f);
        pathBuilder.lineToRelative(-7.52f, -1.0f);
        pathBuilder.lineToRelative(0.01f, -2.22f);
        pathBuilder.moveToRelative(7.5f, 8.72f);
        pathBuilder.lineTo(4.0f, 17.97f);
        pathBuilder.verticalLineToRelative(-2.22f);
        pathBuilder.lineToRelative(7.51f, -1.0f);
        pathBuilder.moveTo(2.01f, 3.0f);
        pathBuilder.lineTo(2.0f, 10.0f);
        pathBuilder.lineToRelative(15.0f, 2.0f);
        pathBuilder.lineToRelative(-15.0f, 2.0f);
        pathBuilder.lineToRelative(0.01f, 7.0f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.lineTo(2.01f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        AbstractC3292y.f(build);
        return build;
    }
}
