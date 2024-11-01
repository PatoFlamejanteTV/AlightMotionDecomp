package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f8, float[] fArr, float[] fArr2) {
            float f9;
            float f10;
            float f11;
            float constrainedMap;
            float abs = Math.abs(f8);
            float signum = Math.signum(f8);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                constrainedMap = fArr2[binarySearch];
            } else {
                int i8 = -(binarySearch + 1);
                int i9 = i8 - 1;
                float f12 = 0.0f;
                if (i9 >= fArr.length - 1) {
                    float f13 = fArr[fArr.length - 1];
                    float f14 = fArr2[fArr.length - 1];
                    if (f13 == 0.0f) {
                        return 0.0f;
                    }
                    return f8 * (f14 / f13);
                }
                if (i9 == -1) {
                    float f15 = fArr[0];
                    f11 = fArr2[0];
                    f10 = f15;
                    f9 = 0.0f;
                } else {
                    float f16 = fArr[i9];
                    float f17 = fArr[i8];
                    f9 = fArr2[i9];
                    f12 = f16;
                    f10 = f17;
                    f11 = fArr2[i8];
                }
                constrainedMap = MathUtils.INSTANCE.constrainedMap(f9, f11, f12, f10, abs);
            }
            return signum * constrainedMap;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.mFromSpValues = fArr;
            this.mToDpValues = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
    }

    @VisibleForTesting
    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f8) {
        return Companion.lookupAndInterpolate(f8, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f8) {
        return Companion.lookupAndInterpolate(f8, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        if (Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues)) {
            return true;
        }
        return false;
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.mFromSpValues);
        AbstractC3292y.h(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.mToDpValues);
        AbstractC3292y.h(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
