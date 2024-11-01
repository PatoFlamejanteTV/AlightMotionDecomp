package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

/* loaded from: classes3.dex */
public final class RectKt {
    @SuppressLint({"CheckResult"})
    public static final Rect and(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(Rect rect) {
        return rect.left;
    }

    public static final int component2(Rect rect) {
        return rect.top;
    }

    public static final int component3(Rect rect) {
        return rect.right;
    }

    public static final int component4(Rect rect) {
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final Region minus(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect or(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect times(Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i8;
        rect2.left *= i8;
        rect2.right *= i8;
        rect2.bottom *= i8;
        return rect2;
    }

    public static final Rect toRect(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        return new RectF(rect);
    }

    public static final Region toRegion(Rect rect) {
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(RectF rectF) {
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        return rectF.bottom;
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final Region toRegion(RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @SuppressLint({"CheckResult"})
    public static final RectF and(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final RectF or(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Rect plus(Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i8, i8);
        return rect2;
    }

    public static final RectF times(RectF rectF, float f8) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f8;
        rectF2.left *= f8;
        rectF2.right *= f8;
        rectF2.bottom *= f8;
        return rectF2;
    }

    public static final RectF plus(RectF rectF, float f8) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f8, f8);
        return rectF2;
    }

    public static final Rect plus(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final Rect minus(Rect rect, int i8) {
        Rect rect2 = new Rect(rect);
        int i9 = -i8;
        rect2.offset(i9, i9);
        return rect2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF times(RectF rectF, int i8) {
        float f8 = i8;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f8;
        rectF2.left *= f8;
        rectF2.right *= f8;
        rectF2.bottom *= f8;
        return rectF2;
    }

    public static final RectF minus(RectF rectF, float f8) {
        RectF rectF2 = new RectF(rectF);
        float f9 = -f8;
        rectF2.offset(f9, f9);
        return rectF2;
    }

    public static final Rect minus(Rect rect, Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
