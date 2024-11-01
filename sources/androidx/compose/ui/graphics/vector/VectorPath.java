package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i8, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, AbstractC3284p abstractC3284p) {
        this(str, list, i8, brush, f8, brush2, f9, f10, i9, i10, f11, f12, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            if (AbstractC3292y.d(this.name, vectorPath.name) && AbstractC3292y.d(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && AbstractC3292y.d(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m3274equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m3284equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m3204equalsimpl0(this.pathFillType, vectorPath.pathFillType) && AbstractC3292y.d(this.pathData, vectorPath.pathData)) {
                return true;
            }
            return false;
        }
        return false;
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
    public final int m3532getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m3533getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m3534getStrokeLineJoinLxFBmk8() {
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

    public int hashCode() {
        int i8;
        int hashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        Brush brush = this.fill;
        int i9 = 0;
        if (brush != null) {
            i8 = brush.hashCode();
        } else {
            i8 = 0;
        }
        int floatToIntBits = (((hashCode + i8) * 31) + Float.floatToIntBits(this.fillAlpha)) * 31;
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            i9 = brush2.hashCode();
        }
        return ((((((((((((((((((floatToIntBits + i9) * 31) + Float.floatToIntBits(this.strokeAlpha)) * 31) + Float.floatToIntBits(this.strokeLineWidth)) * 31) + StrokeCap.m3275hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m3285hashCodeimpl(this.strokeLineJoin)) * 31) + Float.floatToIntBits(this.strokeLineMiter)) * 31) + Float.floatToIntBits(this.trimPathStart)) * 31) + Float.floatToIntBits(this.trimPathEnd)) * 31) + Float.floatToIntBits(this.trimPathOffset)) * 31) + PathFillType.m3205hashCodeimpl(this.pathFillType);
    }

    public /* synthetic */ VectorPath(String str, List list, int i8, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, int i11, AbstractC3284p abstractC3284p) {
        this((i11 & 1) != 0 ? "" : str, list, i8, (i11 & 8) != 0 ? null : brush, (i11 & 16) != 0 ? 1.0f : f8, (i11 & 32) != 0 ? null : brush2, (i11 & 64) != 0 ? 1.0f : f9, (i11 & 128) != 0 ? 0.0f : f10, (i11 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i9, (i11 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i10, (i11 & 1024) != 0 ? 4.0f : f11, (i11 & 2048) != 0 ? 0.0f : f12, (i11 & 4096) != 0 ? 1.0f : f13, (i11 & 8192) != 0 ? 0.0f : f14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i8, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i8;
        this.fill = brush;
        this.fillAlpha = f8;
        this.stroke = brush2;
        this.strokeAlpha = f9;
        this.strokeLineWidth = f10;
        this.strokeLineCap = i9;
        this.strokeLineJoin = i10;
        this.strokeLineMiter = f11;
        this.trimPathStart = f12;
        this.trimPathEnd = f13;
        this.trimPathOffset = f14;
    }
}
