package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
    }

    private static float toTangent(float f8) {
        if (f8 >= 0.0f && f8 <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f8 / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f8, float f9, float f10, float f11) {
        boolean z8;
        float f12;
        float f13;
        float f14;
        Path path = new Path();
        path.moveTo(f8, f9);
        float f15 = f10 - f8;
        float f16 = f11 - f9;
        float f17 = (f15 * f15) + (f16 * f16);
        float f18 = (f8 + f10) / 2.0f;
        float f19 = (f9 + f11) / 2.0f;
        float f20 = 0.25f * f17;
        if (f9 > f11) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Math.abs(f15) < Math.abs(f16)) {
            float abs = Math.abs(f17 / (f16 * 2.0f));
            if (z8) {
                f13 = abs + f11;
                f12 = f10;
            } else {
                f13 = abs + f9;
                f12 = f8;
            }
            f14 = this.mMinimumVerticalTangent;
        } else {
            float f21 = f17 / (f15 * 2.0f);
            if (z8) {
                f13 = f9;
                f12 = f21 + f8;
            } else {
                f12 = f10 - f21;
                f13 = f11;
            }
            f14 = this.mMinimumHorizontalTangent;
        }
        float f22 = f20 * f14 * f14;
        float f23 = f18 - f12;
        float f24 = f19 - f13;
        float f25 = (f23 * f23) + (f24 * f24);
        float f26 = this.mMaximumTangent;
        float f27 = f20 * f26 * f26;
        if (f25 >= f22) {
            if (f25 > f27) {
                f22 = f27;
            } else {
                f22 = 0.0f;
            }
        }
        if (f22 != 0.0f) {
            float sqrt = (float) Math.sqrt(f22 / f25);
            f12 = ((f12 - f18) * sqrt) + f18;
            f13 = f19 + (sqrt * (f13 - f19));
        }
        path.cubicTo((f8 + f12) / 2.0f, (f9 + f13) / 2.0f, (f12 + f10) / 2.0f, (f13 + f11) / 2.0f, f10, f11);
        return path;
    }

    public void setMaximumAngle(float f8) {
        this.mMaximumAngle = f8;
        this.mMaximumTangent = toTangent(f8);
    }

    public void setMinimumHorizontalAngle(float f8) {
        this.mMinimumHorizontalAngle = f8;
        this.mMinimumHorizontalTangent = toTangent(f8);
    }

    public void setMinimumVerticalAngle(float f8) {
        this.mMinimumVerticalAngle = f8;
        this.mMinimumVerticalTangent = toTangent(f8);
    }

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, DEFAULT_MAX_ANGLE_DEGREES));
        obtainStyledAttributes.recycle();
    }
}
