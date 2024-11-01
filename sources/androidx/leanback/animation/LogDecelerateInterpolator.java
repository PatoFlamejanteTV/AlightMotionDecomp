package androidx.leanback.animation;

import android.animation.TimeInterpolator;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LogDecelerateInterpolator implements TimeInterpolator {
    int mBase;
    int mDrift;
    final float mLogScale;

    public LogDecelerateInterpolator(int i8, int i9) {
        this.mBase = i8;
        this.mDrift = i9;
        this.mLogScale = 1.0f / computeLog(1.0f, i8, i9);
    }

    static float computeLog(float f8, int i8, int i9) {
        return ((float) (-Math.pow(i8, -f8))) + 1.0f + (i9 * f8);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        return computeLog(f8, this.mBase, this.mDrift) * this.mLogScale;
    }
}
