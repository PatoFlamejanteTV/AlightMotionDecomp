package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;

/* loaded from: classes.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d10;
        double d18 = 4;
        int ceil = (int) Math.ceil(Math.abs((d16 * d18) / 3.141592653589793d));
        double cos = Math.cos(d14);
        double sin = Math.sin(d14);
        double cos2 = Math.cos(d15);
        double sin2 = Math.sin(d15);
        double d19 = -d17;
        double d20 = d19 * cos;
        double d21 = d11 * sin;
        double d22 = (d20 * sin2) - (d21 * cos2);
        double d23 = d19 * sin;
        double d24 = d11 * cos;
        double d25 = (sin2 * d23) + (cos2 * d24);
        double d26 = d16 / ceil;
        double d27 = d12;
        double d28 = d15;
        double d29 = d25;
        double d30 = d22;
        int i8 = 0;
        double d31 = d13;
        while (i8 < ceil) {
            double d32 = d28 + d26;
            double sin3 = Math.sin(d32);
            double cos3 = Math.cos(d32);
            int i9 = ceil;
            double d33 = (d8 + ((d17 * cos) * cos3)) - (d21 * sin3);
            double d34 = d9 + (d17 * sin * cos3) + (d24 * sin3);
            double d35 = (d20 * sin3) - (d21 * cos3);
            double d36 = (sin3 * d23) + (cos3 * d24);
            double d37 = d32 - d28;
            double tan = Math.tan(d37 / 2);
            double sin4 = (Math.sin(d37) * (Math.sqrt(d18 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d27 + (d30 * sin4)), (float) (d31 + (d29 * sin4)), (float) (d33 - (sin4 * d35)), (float) (d34 - (sin4 * d36)), (float) d33, (float) d34);
            i8++;
            d26 = d26;
            sin = sin;
            d27 = d33;
            d23 = d23;
            d28 = d32;
            d29 = d36;
            d18 = d18;
            d30 = d35;
            cos = cos;
            ceil = i9;
            d31 = d34;
            d17 = d10;
        }
    }

    private static final void drawArc(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, boolean z8, boolean z9) {
        double d15;
        double d16;
        boolean z10;
        double d17 = (d14 / SubsamplingScaleImageView.ORIENTATION_180) * 3.141592653589793d;
        double cos = Math.cos(d17);
        double sin = Math.sin(d17);
        double d18 = ((d8 * cos) + (d9 * sin)) / d12;
        double d19 = (((-d8) * sin) + (d9 * cos)) / d13;
        double d20 = ((d10 * cos) + (d11 * sin)) / d12;
        double d21 = (((-d10) * sin) + (d11 * cos)) / d13;
        double d22 = d18 - d20;
        double d23 = d19 - d21;
        double d24 = 2;
        double d25 = (d18 + d20) / d24;
        double d26 = (d19 + d21) / d24;
        double d27 = (d22 * d22) + (d23 * d23);
        if (d27 == 0.0d) {
            return;
        }
        double d28 = (1.0d / d27) - 0.25d;
        if (d28 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d27) / 1.99999d);
            drawArc(path, d8, d9, d10, d11, d12 * sqrt, d13 * sqrt, d14, z8, z9);
            return;
        }
        double sqrt2 = Math.sqrt(d28);
        double d29 = d22 * sqrt2;
        double d30 = sqrt2 * d23;
        if (z8 == z9) {
            d15 = d25 - d30;
            d16 = d26 + d29;
        } else {
            d15 = d25 + d30;
            d16 = d26 - d29;
        }
        double atan2 = Math.atan2(d19 - d16, d18 - d15);
        double atan22 = Math.atan2(d21 - d16, d20 - d15) - atan2;
        if (atan22 >= 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d31 = d15 * d12;
        double d32 = d16 * d13;
        arcToBezier(path, (d31 * cos) - (d32 * sin), (d31 * sin) + (d32 * cos), d12, d13, d8, d9, d17, atan2, atan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        PathNode pathNode;
        PathNode pathNode2;
        int i8;
        int i9;
        PathNode pathNode3;
        float f8;
        float f9;
        float f10;
        float f11;
        float dy;
        float y12;
        float x22;
        float y22;
        float f12;
        float f13;
        float f14;
        float f15;
        float dy2;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int mo2845getFillTypeRgk1Os = path.mo2845getFillTypeRgk1Os();
        path.rewind();
        path2.mo2847setFillTypeoQ8Xj4U(mo2845getFillTypeRgk1Os);
        if (list.isEmpty()) {
            pathNode = PathNode.Close.INSTANCE;
        } else {
            pathNode = list2.get(0);
        }
        int size = list.size();
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        int i10 = 0;
        while (i10 < size) {
            PathNode pathNode4 = list2.get(i10);
            if (pathNode4 instanceof PathNode.Close) {
                path.close();
                path2.moveTo(f21, f22);
                pathNode3 = pathNode4;
                f17 = f21;
                f19 = f17;
                f18 = f22;
                f20 = f18;
            } else if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                f19 += relativeMoveTo.getDx();
                f20 += relativeMoveTo.getDy();
                path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                pathNode3 = pathNode4;
                f21 = f19;
                f22 = f20;
            } else {
                if (pathNode4 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                    float x8 = moveTo.getX();
                    float y8 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                    f19 = x8;
                    f21 = f19;
                    f20 = y8;
                    f22 = f20;
                } else {
                    if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f19 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        path2.lineTo(lineTo.getX(), lineTo.getY());
                        float x9 = lineTo.getX();
                        f20 = lineTo.getY();
                        f19 = x9;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                        path2.relativeLineTo(relativeHorizontalTo.getDx(), f16);
                        f19 += relativeHorizontalTo.getDx();
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                        path2.lineTo(horizontalTo.getX(), f20);
                        f19 = horizontalTo.getX();
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                        path2.relativeLineTo(f16, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                        path2.lineTo(f19, verticalTo.getY());
                        f20 = verticalTo.getY();
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            pathNode2 = pathNode4;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            f10 = relativeCurveTo.getDx2() + f19;
                            f11 = relativeCurveTo.getDy2() + f20;
                            f19 += relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else {
                            pathNode2 = pathNode4;
                            if (pathNode2 instanceof PathNode.CurveTo) {
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode2;
                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                f10 = curveTo.getX2();
                                y12 = curveTo.getY2();
                                x22 = curveTo.getX3();
                                y22 = curveTo.getY3();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    f15 = f20 - f18;
                                    f14 = f19 - f17;
                                } else {
                                    f14 = 0.0f;
                                    f15 = 0.0f;
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                                path.relativeCubicTo(f14, f15, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                f10 = relativeReflectiveCurveTo.getDx1() + f19;
                                f11 = relativeReflectiveCurveTo.getDy1() + f20;
                                f19 += relativeReflectiveCurveTo.getDx2();
                                dy = relativeReflectiveCurveTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    float f23 = 2;
                                    f13 = (f23 * f20) - f18;
                                    f12 = (f19 * f23) - f17;
                                } else {
                                    f12 = f19;
                                    f13 = f20;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode2;
                                path.cubicTo(f12, f13, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                f10 = reflectiveCurveTo.getX1();
                                y12 = reflectiveCurveTo.getY1();
                                x22 = reflectiveCurveTo.getX2();
                                y22 = reflectiveCurveTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode2;
                                path2.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                f10 = relativeQuadTo.getDx1() + f19;
                                f11 = relativeQuadTo.getDy1() + f20;
                                f19 += relativeQuadTo.getDx2();
                                dy = relativeQuadTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode2;
                                path2.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                f10 = quadTo.getX1();
                                y12 = quadTo.getY1();
                                x22 = quadTo.getX2();
                                y22 = quadTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode.isQuad()) {
                                    f8 = f19 - f17;
                                    f9 = f20 - f18;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                                path2.relativeQuadraticBezierTo(f8, f9, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                f10 = f8 + f19;
                                f11 = f9 + f20;
                                f19 += relativeReflectiveQuadTo.getDx();
                                dy = relativeReflectiveQuadTo.getDy();
                            } else {
                                if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode.isQuad()) {
                                        float f24 = 2;
                                        f19 = (f19 * f24) - f17;
                                        f20 = (f24 * f20) - f18;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode2;
                                    path2.quadraticBezierTo(f19, f20, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                    float x10 = reflectiveQuadTo.getX();
                                    pathNode3 = pathNode2;
                                    f18 = f20;
                                    i8 = i10;
                                    i9 = size;
                                    f20 = reflectiveQuadTo.getY();
                                    f17 = f19;
                                    f19 = x10;
                                } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                                    PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode2;
                                    float arcStartDx = relativeArcTo.getArcStartDx() + f19;
                                    float arcStartDy = relativeArcTo.getArcStartDy() + f20;
                                    pathNode3 = pathNode2;
                                    i8 = i10;
                                    i9 = size;
                                    drawArc(path, f19, f20, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                    f17 = arcStartDx;
                                    f19 = f17;
                                    f21 = f21;
                                    f22 = f22;
                                    f18 = arcStartDy;
                                    f20 = f18;
                                } else {
                                    float f25 = f21;
                                    float f26 = f22;
                                    i8 = i10;
                                    i9 = size;
                                    if (pathNode2 instanceof PathNode.ArcTo) {
                                        PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode2;
                                        pathNode3 = pathNode2;
                                        drawArc(path, f19, f20, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        f19 = arcTo.getArcStartX();
                                        f18 = arcTo.getArcStartY();
                                        f20 = f18;
                                        f21 = f25;
                                        f22 = f26;
                                        f17 = f19;
                                    } else {
                                        pathNode3 = pathNode2;
                                        f21 = f25;
                                        f22 = f26;
                                    }
                                }
                                i10 = i8 + 1;
                                path2 = path;
                                size = i9;
                                pathNode = pathNode3;
                                f16 = 0.0f;
                                list2 = list;
                            }
                            pathNode3 = pathNode2;
                            f19 = x22;
                            f20 = y22;
                            i8 = i10;
                            i9 = size;
                            f18 = y12;
                            f17 = f10;
                            i10 = i8 + 1;
                            path2 = path;
                            size = i9;
                            pathNode = pathNode3;
                            f16 = 0.0f;
                            list2 = list;
                        }
                        f20 += dy;
                        pathNode3 = pathNode2;
                        f18 = f11;
                        i8 = i10;
                        i9 = size;
                        f17 = f10;
                        i10 = i8 + 1;
                        path2 = path;
                        size = i9;
                        pathNode = pathNode3;
                        f16 = 0.0f;
                        list2 = list;
                    }
                    f20 += dy2;
                }
                pathNode3 = pathNode4;
            }
            i8 = i10;
            i9 = size;
            i10 = i8 + 1;
            path2 = path;
            size = i9;
            pathNode = pathNode3;
            f16 = 0.0f;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d8) {
        return (d8 / SubsamplingScaleImageView.ORIENTATION_180) * 3.141592653589793d;
    }
}
