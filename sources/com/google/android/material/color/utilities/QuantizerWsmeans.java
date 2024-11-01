package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* loaded from: classes3.dex */
    private static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i8) {
        int[] iArr3;
        int i9;
        int i10;
        int i11 = 1;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i12 = 0;
        for (int i13 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i13));
            if (num == null) {
                dArr[i12] = pointProviderLab.fromInt(i13);
                iArr4[i12] = i13;
                i12++;
                linkedHashMap.put(Integer.valueOf(i13), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            iArr5[i14] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i14]))).intValue();
        }
        int min = Math.min(i8, i12);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr2.length; i16++) {
            dArr2[i16] = pointProviderLab.fromInt(iArr2[i16]);
            i15++;
        }
        int i17 = min - i15;
        if (i17 > 0) {
            for (int i18 = 0; i18 < i17; i18++) {
            }
        }
        int[] iArr6 = new int[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            iArr6[i19] = random.nextInt(min);
        }
        int[][] iArr7 = new int[min];
        for (int i20 = 0; i20 < min; i20++) {
            iArr7[i20] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min];
        for (int i21 = 0; i21 < min; i21++) {
            distanceArr[i21] = new Distance[min];
            for (int i22 = 0; i22 < min; i22++) {
                distanceArr[i21][i22] = new Distance();
            }
        }
        int[] iArr8 = new int[min];
        int i23 = 0;
        while (true) {
            if (i23 < 10) {
                int i24 = 0;
                while (i24 < min) {
                    int i25 = i24 + 1;
                    int i26 = i25;
                    while (i26 < min) {
                        int[] iArr9 = iArr8;
                        double distance = pointProviderLab.distance(dArr2[i24], dArr2[i26]);
                        Distance distance2 = distanceArr[i26][i24];
                        distance2.distance = distance;
                        distance2.index = i24;
                        Distance distance3 = distanceArr[i24][i26];
                        distance3.distance = distance;
                        distance3.index = i26;
                        i11 = 1;
                        i26++;
                        iArr8 = iArr9;
                        i23 = i23;
                    }
                    int[] iArr10 = iArr8;
                    int i27 = i23;
                    Arrays.sort(distanceArr[i24]);
                    for (int i28 = 0; i28 < min; i28 += i11) {
                        iArr7[i24][i28] = distanceArr[i24][i28].index;
                    }
                    iArr8 = iArr10;
                    i23 = i27;
                    i24 = i25;
                }
                int[] iArr11 = iArr8;
                int i29 = i23;
                int i30 = 0;
                int i31 = 0;
                while (i30 < i12) {
                    double[] dArr3 = dArr[i30];
                    int i32 = iArr6[i30];
                    double distance4 = pointProviderLab.distance(dArr3, dArr2[i32]);
                    int[][] iArr12 = iArr7;
                    double d8 = distance4;
                    int i33 = -1;
                    int i34 = 0;
                    while (i34 < min) {
                        Distance[][] distanceArr2 = distanceArr;
                        int i35 = i12;
                        if (distanceArr[i32][i34].distance < 4.0d * distance4) {
                            double distance5 = pointProviderLab.distance(dArr3, dArr2[i34]);
                            if (distance5 < d8) {
                                d8 = distance5;
                                i33 = i34;
                            }
                        }
                        i34++;
                        i12 = i35;
                        distanceArr = distanceArr2;
                    }
                    Distance[][] distanceArr3 = distanceArr;
                    int i36 = i12;
                    if (i33 != -1 && Math.abs(Math.sqrt(d8) - Math.sqrt(distance4)) > 3.0d) {
                        i31++;
                        iArr6[i30] = i33;
                    }
                    i30++;
                    iArr7 = iArr12;
                    i12 = i36;
                    distanceArr = distanceArr3;
                }
                int[][] iArr13 = iArr7;
                Distance[][] distanceArr4 = distanceArr;
                int i37 = i12;
                if (i31 == 0 && i29 != 0) {
                    iArr3 = iArr11;
                    break;
                }
                double[] dArr4 = new double[min];
                double[] dArr5 = new double[min];
                double[] dArr6 = new double[min];
                char c8 = 0;
                Arrays.fill(iArr11, 0);
                int i38 = 0;
                while (true) {
                    i9 = i37;
                    if (i38 >= i9) {
                        break;
                    }
                    int i39 = iArr6[i38];
                    double[] dArr7 = dArr[i38];
                    int i40 = iArr5[i38];
                    iArr11[i39] = iArr11[i39] + i40;
                    double d9 = dArr4[i39];
                    double d10 = dArr7[c8];
                    int[] iArr14 = iArr5;
                    double d11 = i40;
                    dArr4[i39] = d9 + (d10 * d11);
                    dArr5[i39] = dArr5[i39] + (dArr7[1] * d11);
                    dArr6[i39] = dArr6[i39] + (dArr7[2] * d11);
                    i38++;
                    iArr5 = iArr14;
                    iArr6 = iArr6;
                    c8 = 0;
                    i37 = i9;
                }
                int[] iArr15 = iArr5;
                int[] iArr16 = iArr6;
                int i41 = 0;
                while (i41 < min) {
                    int i42 = iArr11[i41];
                    if (i42 == 0) {
                        dArr2[i41] = new double[]{0.0d, 0.0d, 0.0d};
                        i10 = 1;
                    } else {
                        double d12 = i42;
                        double d13 = dArr4[i41] / d12;
                        double d14 = dArr5[i41] / d12;
                        double d15 = dArr6[i41] / d12;
                        double[] dArr8 = dArr2[i41];
                        dArr8[0] = d13;
                        i10 = 1;
                        dArr8[1] = d14;
                        dArr8[2] = d15;
                    }
                    i41 += i10;
                }
                i23 = i29 + 1;
                iArr5 = iArr15;
                iArr8 = iArr11;
                i12 = i9;
                iArr7 = iArr13;
                iArr6 = iArr16;
                distanceArr = distanceArr4;
                i11 = 1;
            } else {
                iArr3 = iArr8;
                break;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i43 = 0; i43 < min; i43++) {
            int i44 = iArr3[i43];
            if (i44 != 0) {
                int i45 = pointProviderLab.toInt(dArr2[i43]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i45))) {
                    linkedHashMap2.put(Integer.valueOf(i45), Integer.valueOf(i44));
                }
            }
        }
        return linkedHashMap2;
    }
}
