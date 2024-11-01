package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class DensityKt {
    @Stable
    public static final Density Density(float f8, float f9) {
        return new DensityImpl(f8, f9);
    }

    public static /* synthetic */ Density Density$default(float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f9 = 1.0f;
        }
        return Density(f8, f9);
    }
}
