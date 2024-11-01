package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class PatternPathMotion extends PathMotion {
    private Path mOriginalPatternPath;

    @NonNull
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    public PatternPathMotion() {
        Path path = new Path();
        this.mPatternPath = path;
        this.mTempMatrix = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.mOriginalPatternPath = path;
    }

    private static float distance(float f8, float f9) {
        return (float) Math.sqrt((f8 * f8) + (f9 * f9));
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f8, float f9, float f10, float f11) {
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        float distance = distance(f12, f13);
        double atan2 = Math.atan2(f13, f12);
        this.mTempMatrix.setScale(distance, distance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(atan2));
        this.mTempMatrix.postTranslate(f8, f9);
        Path path = new Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    @NonNull
    public Path getPatternPath() {
        return this.mOriginalPatternPath;
    }

    public void setPatternPath(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f8 = fArr[0];
        float f9 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        if (f10 == f8 && f11 == f9) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.mTempMatrix.setTranslate(-f10, -f11);
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        float distance = 1.0f / distance(f12, f13);
        this.mTempMatrix.postScale(distance, distance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(-Math.atan2(f13, f12)));
        path.transform(this.mTempMatrix, this.mPatternPath);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.PATTERN_PATH_MOTION);
        try {
            String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                setPatternPath(PathParser.createPathFromPathData(namedString));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(@NonNull Path path) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        setPatternPath(path);
    }
}
