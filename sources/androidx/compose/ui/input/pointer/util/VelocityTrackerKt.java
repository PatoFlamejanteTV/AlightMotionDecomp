package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import i6.m;
import java.util.List;

/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final MutableState VelocityTrackerAddPointsFix$delegate;

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VelocityTrackerAddPointsFix$delegate = mutableStateOf$default;
    }

    private static final float[][] Matrix(int i8, int i9) {
        float[][] fArr = new float[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            fArr[i10] = new float[i9];
        }
        return fArr;
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (getVelocityTrackerAddPointsFix()) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m4084setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m3993getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m3994getPreviousPositionF1C5BW0 = pointerInputChange.m3994getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i8 = 0;
        while (i8 < size) {
            HistoricalChange historicalChange = historical.get(i8);
            long m2716minusMKHz9U = Offset.m2716minusMKHz9U(historicalChange.m3920getPositionF1C5BW0(), m3994getPreviousPositionF1C5BW0);
            long m3920getPositionF1C5BW0 = historicalChange.m3920getPositionF1C5BW0();
            velocityTracker.m4084setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2717plusMKHz9U(velocityTracker.m4083getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m2716minusMKHz9U));
            velocityTracker.m4080addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m4083getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i8++;
            m3994getPreviousPositionF1C5BW0 = m3920getPositionF1C5BW0;
        }
        velocityTracker.m4084setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2717plusMKHz9U(velocityTracker.m4083getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m2716minusMKHz9U(pointerInputChange.m3993getPositionF1C5BW0(), m3994getPreviousPositionF1C5BW0)));
        velocityTracker.m4080addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m4083getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i8 = 0; i8 < size; i8++) {
                HistoricalChange historicalChange = historical.get(i8);
                velocityTracker.m4080addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m3919getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m4080addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m3992getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i8, boolean z8) {
        float f8;
        float f9;
        float f10 = 0.0f;
        if (i8 < 2) {
            return 0.0f;
        }
        if (i8 == 2) {
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            if (f11 == f12) {
                return 0.0f;
            }
            if (z8) {
                f9 = fArr[0];
            } else {
                f9 = fArr[0] - fArr[1];
            }
            return f9 / (f11 - f12);
        }
        int i9 = i8 - 1;
        for (int i10 = i9; i10 > 0; i10--) {
            int i11 = i10 - 1;
            if (fArr2[i10] != fArr2[i11]) {
                float signum = Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
                if (z8) {
                    f8 = -fArr[i11];
                } else {
                    f8 = fArr[i10] - fArr[i11];
                }
                float f13 = f8 / (fArr2[i10] - fArr2[i11]);
                f10 += (f13 - signum) * Math.abs(f13);
                if (i10 == i9) {
                    f10 *= 0.5f;
                }
            }
        }
        return Math.signum(f10) * ((float) Math.sqrt(2 * Math.abs(f10)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < length; i8++) {
            f8 += fArr[i8] * fArr2[i8];
        }
        return f8;
    }

    private static final float get(float[][] fArr, int i8, int i9) {
        return fArr[i8][i9];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalComposeUiApi
    public static final boolean getVelocityTrackerAddPointsFix() {
        return ((Boolean) VelocityTrackerAddPointsFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    private static final float kineticEnergyToVelocity(float f8) {
        return Math.signum(f8) * ((float) Math.sqrt(2 * Math.abs(f8)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i8, int i9, float[] fArr3) {
        float dot;
        int i10 = i9;
        if (i10 >= 1) {
            if (i8 != 0) {
                if (i10 >= i8) {
                    i10 = i8 - 1;
                }
                int i11 = i10 + 1;
                float[][] fArr4 = new float[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    fArr4[i12] = new float[i8];
                }
                for (int i13 = 0; i13 < i8; i13++) {
                    fArr4[0][i13] = 1.0f;
                    for (int i14 = 1; i14 < i11; i14++) {
                        fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
                    }
                }
                float[][] fArr5 = new float[i11];
                for (int i15 = 0; i15 < i11; i15++) {
                    fArr5[i15] = new float[i8];
                }
                float[][] fArr6 = new float[i11];
                for (int i16 = 0; i16 < i11; i16++) {
                    fArr6[i16] = new float[i11];
                }
                for (int i17 = 0; i17 < i11; i17++) {
                    float[] fArr7 = fArr5[i17];
                    float[] fArr8 = fArr4[i17];
                    for (int i18 = 0; i18 < i8; i18++) {
                        fArr7[i18] = fArr8[i18];
                    }
                    for (int i19 = 0; i19 < i17; i19++) {
                        float[] fArr9 = fArr5[i19];
                        float dot2 = dot(fArr7, fArr9);
                        for (int i20 = 0; i20 < i8; i20++) {
                            fArr7[i20] = fArr7[i20] - (fArr9[i20] * dot2);
                        }
                    }
                    float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
                    if (sqrt >= 1.0E-6f) {
                        float f8 = 1.0f / sqrt;
                        for (int i21 = 0; i21 < i8; i21++) {
                            fArr7[i21] = fArr7[i21] * f8;
                        }
                        float[] fArr10 = fArr6[i17];
                        for (int i22 = 0; i22 < i11; i22++) {
                            if (i22 < i17) {
                                dot = 0.0f;
                            } else {
                                dot = dot(fArr7, fArr4[i22]);
                            }
                            fArr10[i22] = dot;
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                for (int i23 = i10; -1 < i23; i23--) {
                    fArr3[i23] = dot(fArr5[i23], fArr2);
                    int i24 = i23 + 1;
                    if (i24 <= i10) {
                        int i25 = i10;
                        while (true) {
                            fArr3[i23] = fArr3[i23] - (fArr6[i23][i25] * fArr3[i25]);
                            if (i25 != i24) {
                                i25--;
                            }
                        }
                    }
                    fArr3[i23] = fArr3[i23] / fArr6[i23][i23];
                }
                return fArr3;
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i8, int i9, float[] fArr3, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            fArr3 = new float[m.d(i9 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i8, i9, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i8, long j8, float f8) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i8];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i8] = new DataPointAtTime(j8, f8);
        } else {
            dataPointAtTime.setTime(j8);
            dataPointAtTime.setDataPoint(f8);
        }
    }

    @ExperimentalComposeUiApi
    public static final void setVelocityTrackerAddPointsFix(boolean z8) {
        VelocityTrackerAddPointsFix$delegate.setValue(Boolean.valueOf(z8));
    }

    private static final void set(float[][] fArr, int i8, int i9, float f8) {
        fArr[i8][i9] = f8;
    }
}
