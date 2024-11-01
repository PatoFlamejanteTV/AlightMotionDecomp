package androidx.compose.ui.graphics;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else {
            if (outline instanceof Outline.Generic) {
                V0.g(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
                return;
            }
            throw new Q5.p();
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
                return;
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m2687getXimpl(rounded.getRoundRect().m2760getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2688getYimpl(rounded.getRoundRect().m2760getBottomLeftCornerRadiuskKHJgLs()), paint);
                return;
            }
        }
        if (outline instanceof Outline.Generic) {
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
            return;
        }
        throw new Q5.p();
    }

    /* renamed from: drawOutline-hn5TExg */
    public static final void m3184drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo3386drawRectAsUm42w(brush, topLeft(rect), size(rect), f8, drawStyle, colorFilter, i8);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo3388drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m2687getXimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f8, drawStyle, colorFilter, i8);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new Q5.p();
        }
        drawScope.mo3382drawPathGBMwjPU(path, brush, f8, drawStyle, colorFilter, i8);
    }

    /* renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m3185drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f9;
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
        m3184drawOutlinehn5TExg(drawScope, outline, brush, f9, drawStyle2, colorFilter2, i8);
    }

    /* renamed from: drawOutline-wDX37Ww */
    public static final void m3186drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8) {
        Path path;
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo3387drawRectnJ9OG0(j8, topLeft(rect), size(rect), f8, drawStyle, colorFilter, i8);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawScope.mo3389drawRoundRectuAw5IA(j8, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m2687getXimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), drawStyle, f8, colorFilter, i8);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new Q5.p();
        }
        drawScope.mo3383drawPathLG529CI(path, j8, f8, drawStyle, colorFilter, i8);
    }

    /* renamed from: drawOutline-wDX37Ww$default */
    public static /* synthetic */ void m3187drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j8, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i8, int i9, Object obj) {
        float f9;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i10;
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
        m3186drawOutlinewDX37Ww(drawScope, outline, j8, f9, drawStyle2, colorFilter2, i10);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3) {
        if (outline instanceof Outline.Rectangle) {
            interfaceC2072n.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                interfaceC2072n3.invoke(drawScope, roundRectPath$ui_graphics_release);
                return;
            } else {
                interfaceC2072n2.invoke(drawScope, rounded.getRoundRect());
                return;
            }
        }
        if (outline instanceof Outline.Generic) {
            interfaceC2072n3.invoke(drawScope, ((Outline.Generic) outline).getPath());
            return;
        }
        throw new Q5.p();
    }

    public static final boolean hasSameCornerRadius(RoundRect roundRect) {
        boolean z8;
        boolean z9;
        if (CornerRadius.m2687getXimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m2687getXimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2687getXimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2687getXimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2687getXimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2687getXimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs())) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (CornerRadius.m2688getYimpl(roundRect.m2760getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m2688getYimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2688getYimpl(roundRect.m2761getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2688getYimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2688getYimpl(roundRect.m2763getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2688getYimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs())) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
