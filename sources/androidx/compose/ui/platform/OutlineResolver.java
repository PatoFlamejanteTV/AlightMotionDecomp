package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline = true;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(Density density) {
        this.density = density;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.Companion;
        this.size = companion.m2790getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m2728getZeroF1C5BW0();
        this.rectSize = companion.m2790getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m4470isSameBounds4L21HEs(RoundRect roundRect, long j8, long j9, float f8) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect) || roundRect.getLeft() != Offset.m2712getXimpl(j8) || roundRect.getTop() != Offset.m2713getYimpl(j8) || roundRect.getRight() != Offset.m2712getXimpl(j8) + Size.m2781getWidthimpl(j9) || roundRect.getBottom() != Offset.m2713getYimpl(j8) + Size.m2778getHeightimpl(j9) || CornerRadius.m2687getXimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs()) != f8) {
            return false;
        }
        return true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m2728getZeroF1C5BW0();
            long j8 = this.size;
            this.rectSize = j8;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && Size.m2781getWidthimpl(j8) > 0.0f && Size.m2778getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo308createOutlinePq9zytI = this.shape.mo308createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo308createOutlinePq9zytI;
                if (mo308createOutlinePq9zytI instanceof Outline.Rectangle) {
                    updateCacheWithRect(((Outline.Rectangle) mo308createOutlinePq9zytI).getRect());
                    return;
                } else if (mo308createOutlinePq9zytI instanceof Outline.Rounded) {
                    updateCacheWithRoundRect(((Outline.Rounded) mo308createOutlinePq9zytI).getRoundRect());
                    return;
                } else {
                    if (mo308createOutlinePq9zytI instanceof Outline.Generic) {
                        updateCacheWithPath(((Outline.Generic) mo308createOutlinePq9zytI).getPath());
                        return;
                    }
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT <= 28 && !path.isConvex()) {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        } else {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(AbstractC2829a.d(rect.getLeft()), AbstractC2829a.d(rect.getTop()), AbstractC2829a.d(rect.getRight()), AbstractC2829a.d(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float m2687getXimpl = CornerRadius.m2687getXimpl(roundRect.m2762getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(AbstractC2829a.d(roundRect.getLeft()), AbstractC2829a.d(roundRect.getTop()), AbstractC2829a.d(roundRect.getRight()), AbstractC2829a.d(roundRect.getBottom()), m2687getXimpl);
            this.roundedCornerRadius = m2687getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            androidx.compose.ui.graphics.T.m(canvas, clipPath, 0, 2, null);
            return;
        }
        float f8 = this.roundedCornerRadius;
        if (f8 > 0.0f) {
            Path path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (path == null || !m4470isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f8)) {
                RoundRect m2766RoundRectgG7oq9Y = RoundRectKt.m2766RoundRectgG7oq9Y(Offset.m2712getXimpl(this.rectTopLeft), Offset.m2713getYimpl(this.rectTopLeft), Offset.m2712getXimpl(this.rectTopLeft) + Size.m2781getWidthimpl(this.rectSize), Offset.m2713getYimpl(this.rectTopLeft) + Size.m2778getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m2766RoundRectgG7oq9Y);
                this.tmpRoundRect = m2766RoundRectgG7oq9Y;
                this.tmpPath = path;
            }
            androidx.compose.ui.graphics.T.m(canvas, path, 0, 2, null);
            return;
        }
        androidx.compose.ui.graphics.T.n(canvas, Offset.m2712getXimpl(this.rectTopLeft), Offset.m2713getYimpl(this.rectTopLeft), Offset.m2712getXimpl(this.rectTopLeft) + Size.m2781getWidthimpl(this.rectSize), Offset.m2713getYimpl(this.rectTopLeft) + Size.m2778getHeightimpl(this.rectSize), 0, 16, null);
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m4471isInOutlinek4lQ0M(long j8) {
        androidx.compose.ui.graphics.Outline outline;
        if (!this.outlineNeeded || (outline = this.calculatedOutline) == null) {
            return true;
        }
        return ShapeContainingUtilKt.isInOutline(outline, Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), this.tmpTouchPointPath, this.tmpOpPath);
    }

    public final boolean update(Shape shape, float f8, boolean z8, float f9, LayoutDirection layoutDirection, Density density) {
        boolean z9;
        this.cachedOutline.setAlpha(f8);
        boolean z10 = !AbstractC3292y.d(this.shape, shape);
        if (z10) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        if (!z8 && f9 <= 0.0f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.outlineNeeded != z9) {
            this.outlineNeeded = z9;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!AbstractC3292y.d(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z10;
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m4472updateuvyYCjk(long j8) {
        if (!Size.m2777equalsimpl0(this.size, j8)) {
            this.size = j8;
            this.cacheIsDirty = true;
        }
    }
}
