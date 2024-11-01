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
public final class DoneKt {
    private static ImageVector _done;

    public static final ImageVector getDone(Icons.Rounded rounded) {
        AbstractC3292y.i(rounded, "<this>");
        ImageVector imageVector = _done;
        if (imageVector != null) {
            AbstractC3292y.f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Done", Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.2f);
        pathBuilder.lineToRelative(-3.5f, -3.5f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.4f);
        pathBuilder.lineToRelative(4.19f, 4.19f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(20.3f, 7.7f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilder.lineTo(9.0f, 16.2f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3499addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _done = build;
        AbstractC3292y.f(build);
        return build;
    }
}
