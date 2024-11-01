package androidx.compose.ui.graphics.vector;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public static final int $stable = 8;
    private Brush fill;
    private float fillAlpha;
    private boolean isPathDirty;
    private boolean isStrokeDirty;
    private boolean isTrimPathDirty;
    private String name;
    private final Path path;
    private List<? extends PathNode> pathData;
    private int pathFillType;
    private final InterfaceC1416k pathMeasure$delegate;
    private Path renderPath;
    private Brush stroke;
    private float strokeAlpha;
    private int strokeLineCap;
    private int strokeLineJoin;
    private float strokeLineMiter;
    private float strokeLineWidth;
    private Stroke strokeStyle;
    private float trimPathEnd;
    private float trimPathOffset;
    private float trimPathStart;

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        Path Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        this.pathMeasure$delegate = l.a(o.f8805c, PathComponent$pathMeasure$2.INSTANCE);
    }

    private final PathMeasure getPathMeasure() {
        return (PathMeasure) this.pathMeasure$delegate.getValue();
    }

    private final void updatePath() {
        PathParserKt.toPath(this.pathData, this.path);
        updateRenderPath();
    }

    private final void updateRenderPath() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (AbstractC3292y.d(this.renderPath, this.path)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int mo2845getFillTypeRgk1Os = this.renderPath.mo2845getFillTypeRgk1Os();
            this.renderPath.rewind();
            this.renderPath.mo2847setFillTypeoQ8Xj4U(mo2845getFillTypeRgk1Os);
        }
        getPathMeasure().setPath(this.path, false);
        float length = getPathMeasure().getLength();
        float f8 = this.trimPathStart;
        float f9 = this.trimPathOffset;
        float f10 = ((f8 + f9) % 1.0f) * length;
        float f11 = ((this.trimPathEnd + f9) % 1.0f) * length;
        if (f10 > f11) {
            getPathMeasure().getSegment(f10, length, this.renderPath, true);
            getPathMeasure().getSegment(0.0f, f11, this.renderPath, true);
        } else {
            getPathMeasure().getSegment(f10, f11, this.renderPath, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isPathDirty) {
            updatePath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            c.F(drawScope, this.renderPath, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            c.F(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m3503getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m3504getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m3505getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final void setFill(Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f8) {
        this.fillAlpha = f8;
        invalidate();
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final void setPathData(List<? extends PathNode> list) {
        this.pathData = list;
        this.isPathDirty = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m3506setPathFillTypeoQ8Xj4U(int i8) {
        this.pathFillType = i8;
        this.renderPath.mo2847setFillTypeoQ8Xj4U(i8);
        invalidate();
    }

    public final void setStroke(Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f8) {
        this.strokeAlpha = f8;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m3507setStrokeLineCapBeK7IIE(int i8) {
        this.strokeLineCap = i8;
        this.isStrokeDirty = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m3508setStrokeLineJoinWw9F2mQ(int i8) {
        this.strokeLineJoin = i8;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f8) {
        this.strokeLineMiter = f8;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f8) {
        this.strokeLineWidth = f8;
        this.isStrokeDirty = true;
        invalidate();
    }

    public final void setTrimPathEnd(float f8) {
        this.trimPathEnd = f8;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f8) {
        this.trimPathOffset = f8;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public final void setTrimPathStart(float f8) {
        this.trimPathStart = f8;
        this.isTrimPathDirty = true;
        invalidate();
    }

    public String toString() {
        return this.path.toString();
    }
}
