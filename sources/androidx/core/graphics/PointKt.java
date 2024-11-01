package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public final class PointKt {
    public static final int component1(Point point) {
        return point.x;
    }

    public static final int component2(Point point) {
        return point.y;
    }

    public static final Point div(Point point, float f8) {
        return new Point(Math.round(point.x / f8), Math.round(point.y / f8));
    }

    public static final Point minus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    public static final Point plus(Point point, Point point2) {
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    public static final Point times(Point point, float f8) {
        return new Point(Math.round(point.x * f8), Math.round(point.y * f8));
    }

    public static final Point toPoint(PointF pointF) {
        return new Point((int) pointF.x, (int) pointF.y);
    }

    public static final PointF toPointF(Point point) {
        return new PointF(point);
    }

    public static final Point unaryMinus(Point point) {
        return new Point(-point.x, -point.y);
    }

    public static final float component1(PointF pointF) {
        return pointF.x;
    }

    public static final float component2(PointF pointF) {
        return pointF.y;
    }

    public static final PointF div(PointF pointF, float f8) {
        return new PointF(pointF.x / f8, pointF.y / f8);
    }

    public static final PointF times(PointF pointF, float f8) {
        return new PointF(pointF.x * f8, pointF.y * f8);
    }

    public static final PointF unaryMinus(PointF pointF) {
        return new PointF(-pointF.x, -pointF.y);
    }

    public static final PointF minus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    public static final PointF plus(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    public static final Point minus(Point point, int i8) {
        Point point2 = new Point(point.x, point.y);
        int i9 = -i8;
        point2.offset(i9, i9);
        return point2;
    }

    public static final Point plus(Point point, int i8) {
        Point point2 = new Point(point.x, point.y);
        point2.offset(i8, i8);
        return point2;
    }

    public static final PointF minus(PointF pointF, float f8) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f9 = -f8;
        pointF2.offset(f9, f9);
        return pointF2;
    }

    public static final PointF plus(PointF pointF, float f8) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f8, f8);
        return pointF2;
    }
}
