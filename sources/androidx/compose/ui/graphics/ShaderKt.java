package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;

/* loaded from: classes.dex */
public final class ShaderKt {
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m3238ImageShaderF49vj9s(ImageBitmap imageBitmap, int i8, int i9) {
        return AndroidShader_androidKt.m2854ActualImageShaderF49vj9s(imageBitmap, i8, i9);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m3239ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = TileMode.Companion.m3298getClamp3opZhB0();
        }
        if ((i10 & 4) != 0) {
            i9 = TileMode.Companion.m3298getClamp3opZhB0();
        }
        return m3238ImageShaderF49vj9s(imageBitmap, i8, i9);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m3240LinearGradientShaderVjE6UOU(long j8, long j9, List<Color> list, List<Float> list2, int i8) {
        return AndroidShader_androidKt.m2855ActualLinearGradientShaderVjE6UOU(j8, j9, list, list2, i8);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m3241LinearGradientShaderVjE6UOU$default(long j8, long j9, List list, List list2, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i9 & 16) != 0) {
            i8 = TileMode.Companion.m3298getClamp3opZhB0();
        }
        return m3240LinearGradientShaderVjE6UOU(j8, j9, list, list3, i8);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m3242RadialGradientShader8uybcMk(long j8, float f8, List<Color> list, List<Float> list2, int i8) {
        return AndroidShader_androidKt.m2856ActualRadialGradientShader8uybcMk(j8, f8, list, list2, i8);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m3243RadialGradientShader8uybcMk$default(long j8, float f8, List list, List list2, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i9 & 16) != 0) {
            i8 = TileMode.Companion.m3298getClamp3opZhB0();
        }
        return m3242RadialGradientShader8uybcMk(j8, f8, list, list3, i8);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m3244SweepGradientShader9KIMszo(long j8, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m2857ActualSweepGradientShader9KIMszo(j8, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m3245SweepGradientShader9KIMszo$default(long j8, List list, List list2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list2 = null;
        }
        return m3244SweepGradientShader9KIMszo(j8, list, list2);
    }
}
