package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;
    private float[] mX;
    private float[] mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void initCubic(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f8, f9, f10, f11, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i8 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(MAX_NUM_POINTS, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.mX = new float[min];
            this.mY = new float[min];
            float[] fArr = new float[2];
            for (int i9 = 0; i9 < min; i9++) {
                pathMeasure.getPosTan((i9 * length) / (min - 1), fArr, null);
                this.mX[i9] = fArr[0];
                this.mY[i9] = fArr[1];
            }
            if (Math.abs(this.mX[0]) <= 1.0E-5d && Math.abs(this.mY[0]) <= 1.0E-5d) {
                int i10 = min - 1;
                if (Math.abs(this.mX[i10] - 1.0f) <= 1.0E-5d && Math.abs(this.mY[i10] - 1.0f) <= 1.0E-5d) {
                    float f8 = 0.0f;
                    int i11 = 0;
                    while (i8 < min) {
                        float[] fArr2 = this.mX;
                        int i12 = i11 + 1;
                        float f9 = fArr2[i11];
                        if (f9 >= f8) {
                            fArr2[i8] = f9;
                            i8++;
                            f8 = f9;
                            i11 = i12;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f9);
                        }
                    }
                    if (!pathMeasure.nextContour()) {
                        return;
                    } else {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.mX[0]);
            sb.append(",");
            sb.append(this.mY[0]);
            sb.append(" end:");
            int i13 = min - 1;
            sb.append(this.mX[i13]);
            sb.append(",");
            sb.append(this.mY[i13]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void initQuad(float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f8, f9, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData != null) {
                initPath(createPathFromPathData);
                return;
            }
            throw new InflateException("The path is null, which is created from " + namedString);
        }
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
                float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
                if (hasAttribute == TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                    if (!hasAttribute) {
                        initQuad(namedFloat, namedFloat2);
                        return;
                    } else {
                        initCubic(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                        return;
                    }
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        int length = this.mX.length - 1;
        int i8 = 0;
        while (length - i8 > 1) {
            int i9 = (i8 + length) / 2;
            if (f8 < this.mX[i9]) {
                length = i9;
            } else {
                i8 = i9;
            }
        }
        float[] fArr = this.mX;
        float f9 = fArr[length];
        float f10 = fArr[i8];
        float f11 = f9 - f10;
        if (f11 == 0.0f) {
            return this.mY[i8];
        }
        float f12 = (f8 - f10) / f11;
        float[] fArr2 = this.mY;
        float f13 = fArr2[i8];
        return f13 + (f12 * (fArr2[length] - f13));
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }
}
