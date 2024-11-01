package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    static {
        DrawScope.Companion companion = DrawScope.Companion;
    }

    public static /* synthetic */ void A(DrawScope drawScope, ImageBitmap imageBitmap, long j8, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j9;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j9 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j9 = j8;
            }
            if ((i9 & 4) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 32) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3377drawImagegbVJVH8(imageBitmap, j9, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    public static /* synthetic */ void B(DrawScope drawScope, Brush brush, long j8, long j9, float f8, int i8, PathEffect pathEffect, float f9, ColorFilter colorFilter, int i9, int i10, Object obj) {
        float f10;
        int i11;
        PathEffect pathEffect2;
        float f11;
        ColorFilter colorFilter2;
        int i12;
        if (obj == null) {
            if ((i10 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            if ((i10 & 16) != 0) {
                i11 = Stroke.Companion.m3481getDefaultCapKaPHkGw();
            } else {
                i11 = i8;
            }
            if ((i10 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i10 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i10 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i10 & 256) != 0) {
                i12 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i12 = i9;
            }
            drawScope.mo3378drawLine1RTmtNc(brush, j8, j9, f10, i11, pathEffect2, f11, colorFilter2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    public static /* synthetic */ void C(DrawScope drawScope, long j8, long j9, long j10, float f8, int i8, PathEffect pathEffect, float f9, ColorFilter colorFilter, int i9, int i10, Object obj) {
        float f10;
        int i11;
        PathEffect pathEffect2;
        float f11;
        ColorFilter colorFilter2;
        int i12;
        if (obj == null) {
            if ((i10 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            if ((i10 & 16) != 0) {
                i11 = Stroke.Companion.m3481getDefaultCapKaPHkGw();
            } else {
                i11 = i8;
            }
            if ((i10 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i10 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i10 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i10 & 256) != 0) {
                i12 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i12 = i9;
            }
            drawScope.mo3379drawLineNGM6Ib0(j8, j9, j10, f10, i11, pathEffect2, f11, colorFilter2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    public static /* synthetic */ void D(DrawScope drawScope, Brush brush, long j8, long j9, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j10;
        long j11;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j10 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j10 = j8;
            }
            if ((i9 & 4) != 0) {
                j11 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j10);
            } else {
                j11 = j9;
            }
            if ((i9 & 8) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3380drawOvalAsUm42w(brush, j10, j11, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    public static /* synthetic */ void E(DrawScope drawScope, long j8, long j9, long j10, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j11;
        long j12;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j11 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j11 = j9;
            }
            if ((i9 & 4) != 0) {
                j12 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j11);
            } else {
                j12 = j10;
            }
            if ((i9 & 8) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3381drawOvalnJ9OG0(j8, j11, j12, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    public static /* synthetic */ void F(DrawScope drawScope, Path path, Brush brush, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f9;
        if (obj == null) {
            if ((i9 & 4) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i9 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i9 & 32) != 0) {
                i8 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo3382drawPathGBMwjPU(path, brush, f9, drawStyle2, colorFilter2, i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    public static /* synthetic */ void G(DrawScope drawScope, Path path, long j8, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 4) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 32) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3383drawPathLG529CI(path, j8, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    public static /* synthetic */ void H(DrawScope drawScope, List list, int i8, long j8, float f8, int i9, PathEffect pathEffect, float f9, ColorFilter colorFilter, int i10, int i11, Object obj) {
        float f10;
        int i12;
        PathEffect pathEffect2;
        float f11;
        ColorFilter colorFilter2;
        int i13;
        if (obj == null) {
            if ((i11 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            if ((i11 & 16) != 0) {
                i12 = StrokeCap.Companion.m3278getButtKaPHkGw();
            } else {
                i12 = i9;
            }
            if ((i11 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i11 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i11 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i11 & 256) != 0) {
                i13 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i13 = i10;
            }
            drawScope.mo3384drawPointsF8ZwMP8(list, i8, j8, f10, i12, pathEffect2, f11, colorFilter2, i13);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    public static /* synthetic */ void I(DrawScope drawScope, List list, int i8, Brush brush, float f8, int i9, PathEffect pathEffect, float f9, ColorFilter colorFilter, int i10, int i11, Object obj) {
        float f10;
        int i12;
        PathEffect pathEffect2;
        float f11;
        ColorFilter colorFilter2;
        int i13;
        if (obj == null) {
            if ((i11 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            if ((i11 & 16) != 0) {
                i12 = StrokeCap.Companion.m3278getButtKaPHkGw();
            } else {
                i12 = i9;
            }
            if ((i11 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i11 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i11 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i11 & 256) != 0) {
                i13 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i13 = i10;
            }
            drawScope.mo3385drawPointsGsft0Ws(list, i8, brush, f10, i12, pathEffect2, f11, colorFilter2, i13);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    public static /* synthetic */ void J(DrawScope drawScope, Brush brush, long j8, long j9, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j10;
        long j11;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j10 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j10 = j8;
            }
            if ((i9 & 4) != 0) {
                j11 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j10);
            } else {
                j11 = j9;
            }
            if ((i9 & 8) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3386drawRectAsUm42w(brush, j10, j11, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    public static /* synthetic */ void K(DrawScope drawScope, long j8, long j9, long j10, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j11;
        long j12;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j11 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j11 = j9;
            }
            if ((i9 & 4) != 0) {
                j12 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j11);
            } else {
                j12 = j10;
            }
            if ((i9 & 8) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3387drawRectnJ9OG0(j8, j11, j12, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    public static /* synthetic */ void L(DrawScope drawScope, Brush brush, long j8, long j9, long j10, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j11;
        long j12;
        long j13;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j11 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j11 = j8;
            }
            if ((i9 & 4) != 0) {
                j12 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j11);
            } else {
                j12 = j9;
            }
            if ((i9 & 8) != 0) {
                j13 = CornerRadius.Companion.m2697getZerokKHJgLs();
            } else {
                j13 = j10;
            }
            if ((i9 & 16) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 32) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 128) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3388drawRoundRectZuiqVtQ(brush, j11, j12, j13, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    public static /* synthetic */ void M(DrawScope drawScope, long j8, long j9, long j10, long j11, DrawStyle drawStyle, float f8, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j12;
        long j13;
        long j14;
        DrawStyle drawStyle2;
        float f9;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j12 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j12 = j9;
            }
            if ((i9 & 4) != 0) {
                j13 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j12);
            } else {
                j13 = j10;
            }
            if ((i9 & 8) != 0) {
                j14 = CornerRadius.Companion.m2697getZerokKHJgLs();
            } else {
                j14 = j11;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 128) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3389drawRoundRectuAw5IA(j8, j12, j13, j14, drawStyle2, f9, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    public static void a(DrawScope drawScope, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9) {
        z(drawScope, imageBitmap, j8, j9, j10, j11, f8, drawStyle, colorFilter, i8, 0, 512, null);
    }

    public static long b(DrawScope drawScope) {
        return SizeKt.m2791getCenteruvyYCjk(drawScope.getDrawContext().mo3397getSizeNHjbRc());
    }

    public static long c(DrawScope drawScope) {
        return drawScope.getDrawContext().mo3397getSizeNHjbRc();
    }

    public static long d(DrawScope drawScope, long j8, long j9) {
        return SizeKt.Size(Size.m2781getWidthimpl(j8) - Offset.m2712getXimpl(j9), Size.m2778getHeightimpl(j8) - Offset.m2713getYimpl(j9));
    }

    public static /* synthetic */ void u(DrawScope drawScope, Brush brush, float f8, float f9, boolean z8, long j8, long j9, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j10;
        long j11;
        float f11;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 16) != 0) {
                j10 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j10 = j8;
            }
            if ((i9 & 32) != 0) {
                j11 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j10);
            } else {
                j11 = j9;
            }
            if ((i9 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i9 & 128) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 512) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3371drawArcillE91I(brush, f8, f9, z8, j10, j11, f11, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    public static /* synthetic */ void v(DrawScope drawScope, long j8, float f8, float f9, boolean z8, long j9, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j11;
        long j12;
        float f11;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 16) != 0) {
                j11 = Offset.Companion.m2728getZeroF1C5BW0();
            } else {
                j11 = j9;
            }
            if ((i9 & 32) != 0) {
                j12 = d(drawScope, drawScope.mo3391getSizeNHjbRc(), j11);
            } else {
                j12 = j10;
            }
            if ((i9 & 64) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i9 & 128) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 512) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3372drawArcyD3GUKo(j8, f8, f9, z8, j11, j12, f11, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    public static /* synthetic */ void w(DrawScope drawScope, Brush brush, float f8, long j8, float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f10;
        long j9;
        float f11;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                f10 = Size.m2780getMinDimensionimpl(drawScope.mo3391getSizeNHjbRc()) / 2.0f;
            } else {
                f10 = f8;
            }
            if ((i9 & 4) != 0) {
                j9 = drawScope.mo3390getCenterF1C5BW0();
            } else {
                j9 = j8;
            }
            if ((i9 & 8) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3373drawCircleV9BoPsw(brush, f10, j9, f11, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    public static /* synthetic */ void x(DrawScope drawScope, long j8, float f8, long j9, float f9, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f10;
        long j10;
        float f11;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                f10 = Size.m2780getMinDimensionimpl(drawScope.mo3391getSizeNHjbRc()) / 2.0f;
            } else {
                f10 = f8;
            }
            if ((i9 & 4) != 0) {
                j10 = drawScope.mo3390getCenterF1C5BW0();
            } else {
                j10 = j9;
            }
            if ((i9 & 8) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f9;
            }
            if ((i9 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 64) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3374drawCircleVaOC9Bg(j8, f10, j10, f11, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    public static /* synthetic */ void y(DrawScope drawScope, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
        if (obj == null) {
            if ((i9 & 2) != 0) {
                j12 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j12 = j8;
            }
            if ((i9 & 4) != 0) {
                j13 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j13 = j9;
            }
            if ((i9 & 8) != 0) {
                j14 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j14 = j10;
            }
            if ((i9 & 16) != 0) {
                j15 = j13;
            } else {
                j15 = j11;
            }
            if ((i9 & 32) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i9 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i9 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i9 & 256) != 0) {
                i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i10 = i8;
            }
            drawScope.mo3375drawImage9jGpkUE(imageBitmap, j12, j13, j14, j15, f9, drawStyle2, colorFilter2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    public static /* synthetic */ void z(DrawScope drawScope, ImageBitmap imageBitmap, long j8, long j9, long j10, long j11, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, int i10, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i11;
        int i12;
        if (obj == null) {
            if ((i10 & 2) != 0) {
                j12 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j12 = j8;
            }
            if ((i10 & 4) != 0) {
                j13 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j13 = j9;
            }
            if ((i10 & 8) != 0) {
                j14 = IntOffset.Companion.m5289getZeronOccac();
            } else {
                j14 = j10;
            }
            if ((i10 & 16) != 0) {
                j15 = j13;
            } else {
                j15 = j11;
            }
            if ((i10 & 32) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f8;
            }
            if ((i10 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i10 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i10 & 256) != 0) {
                i11 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
            } else {
                i11 = i8;
            }
            if ((i10 & 512) != 0) {
                i12 = DrawScope.Companion.m3422getDefaultFilterQualityfv9h1I();
            } else {
                i12 = i9;
            }
            drawScope.mo3376drawImageAZ2fEMs(imageBitmap, j12, j13, j14, j15, f9, drawStyle2, colorFilter2, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }
}
