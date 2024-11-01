package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class MathUtils {
    public static final int $stable = 0;
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f8, float f9, float f10, float f11, float f12) {
        return lerp(f8, f9, Math.max(0.0f, Math.min(1.0f, lerpInv(f10, f11, f12))));
    }

    public final float lerp(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    public final float lerpInv(float f8, float f9, float f10) {
        if (f8 == f9) {
            return 0.0f;
        }
        return (f10 - f8) / (f9 - f8);
    }
}
