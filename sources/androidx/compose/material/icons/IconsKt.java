package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    public static final ImageVector materialIcon(String name, Function1 block) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(block, "block");
        return ((ImageVector.Builder) block.invoke(new ImageVector.Builder(name, Dp.m5155constructorimpl(24.0f), Dp.m5155constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null))).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1395materialPathYwgOQQI(ImageVector.Builder materialPath, float f8, float f9, int i8, Function1 pathBuilder) {
        AbstractC3292y.i(materialPath, "$this$materialPath");
        AbstractC3292y.i(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3499addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), i8, "", solidColor, f8, null, f9, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1396materialPathYwgOQQI$default(ImageVector.Builder materialPath, float f8, float f9, int i8, Function1 pathBuilder, int i9, Object obj) {
        float f10;
        float f11;
        int i10;
        if ((i9 & 1) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i9 & 2) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f9;
        }
        if ((i9 & 4) != 0) {
            i10 = VectorKt.getDefaultFillType();
        } else {
            i10 = i8;
        }
        AbstractC3292y.i(materialPath, "$this$materialPath");
        AbstractC3292y.i(pathBuilder, "pathBuilder");
        SolidColor solidColor = new SolidColor(Color.Companion.m2974getBlack0d7_KjU(), null);
        int m3278getButtKaPHkGw = StrokeCap.Companion.m3278getButtKaPHkGw();
        int m3288getBevelLxFBmk8 = StrokeJoin.Companion.m3288getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3499addPathoIyEayM$default(materialPath, pathBuilder2.getNodes(), i10, "", solidColor, f10, null, f11, 1.0f, m3278getButtKaPHkGw, m3288getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
