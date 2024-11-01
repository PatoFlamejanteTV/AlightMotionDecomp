package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int i8, int i9) {
            this.resultCount = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int i8, double d8) {
            this.cutLocation = i8;
            this.maximum = d8;
        }
    }

    static int bottom(Box box, Direction direction, int[] iArr) {
        int i8;
        int i9;
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    i8 = (-iArr[getIndex(box.f18275r1, box.f18273g1, box.f18270b0)]) + iArr[getIndex(box.f18275r1, box.f18272g0, box.f18270b0)] + iArr[getIndex(box.f18274r0, box.f18273g1, box.f18270b0)];
                    i9 = iArr[getIndex(box.f18274r0, box.f18272g0, box.f18270b0)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i8 = (-iArr[getIndex(box.f18275r1, box.f18272g0, box.f18271b1)]) + iArr[getIndex(box.f18275r1, box.f18272g0, box.f18270b0)] + iArr[getIndex(box.f18274r0, box.f18272g0, box.f18271b1)];
                i9 = iArr[getIndex(box.f18274r0, box.f18272g0, box.f18270b0)];
            }
        } else {
            i8 = (-iArr[getIndex(box.f18274r0, box.f18273g1, box.f18271b1)]) + iArr[getIndex(box.f18274r0, box.f18273g1, box.f18270b0)] + iArr[getIndex(box.f18274r0, box.f18272g0, box.f18271b1)];
            i9 = iArr[getIndex(box.f18274r0, box.f18272g0, box.f18270b0)];
        }
        return i8 - i9;
    }

    static int getIndex(int i8, int i9, int i10) {
        return (i8 << 10) + (i8 << 6) + i8 + (i9 << 5) + i9 + i10;
    }

    static int top(Box box, Direction direction, int i8, int[] iArr) {
        int i9;
        int i10;
        int i11 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i9 = (iArr[getIndex(box.f18275r1, box.f18273g1, i8)] - iArr[getIndex(box.f18275r1, box.f18272g0, i8)]) - iArr[getIndex(box.f18274r0, box.f18273g1, i8)];
                    i10 = iArr[getIndex(box.f18274r0, box.f18272g0, i8)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i9 = (iArr[getIndex(box.f18275r1, i8, box.f18271b1)] - iArr[getIndex(box.f18275r1, i8, box.f18270b0)]) - iArr[getIndex(box.f18274r0, i8, box.f18271b1)];
                i10 = iArr[getIndex(box.f18274r0, i8, box.f18270b0)];
            }
        } else {
            i9 = (iArr[getIndex(i8, box.f18273g1, box.f18271b1)] - iArr[getIndex(i8, box.f18273g1, box.f18270b0)]) - iArr[getIndex(i8, box.f18272g0, box.f18271b1)];
            i10 = iArr[getIndex(i8, box.f18272g0, box.f18270b0)];
        }
        return i9 + i10;
    }

    static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f18275r1, box.f18273g1, box.f18271b1)] - iArr[getIndex(box.f18275r1, box.f18273g1, box.f18270b0)]) - iArr[getIndex(box.f18275r1, box.f18272g0, box.f18271b1)]) + iArr[getIndex(box.f18275r1, box.f18272g0, box.f18270b0)]) - iArr[getIndex(box.f18274r0, box.f18273g1, box.f18271b1)]) + iArr[getIndex(box.f18274r0, box.f18273g1, box.f18270b0)]) + iArr[getIndex(box.f18274r0, box.f18272g0, box.f18271b1)]) - iArr[getIndex(box.f18274r0, box.f18272g0, box.f18270b0)];
    }

    void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (redFromArgb * intValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (greenFromArgb * intValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (blueFromArgb * intValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + (intValue2 * ((redFromArgb * redFromArgb) + (greenFromArgb * greenFromArgb) + (blueFromArgb * blueFromArgb)));
        }
    }

    CreateBoxesResult createBoxes(int i8) {
        int i9;
        double d8;
        double d9;
        this.cubes = new Box[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            this.cubes[i10] = new Box(null);
        }
        double[] dArr = new double[i8];
        Box box = this.cubes[0];
        box.f18275r1 = 32;
        box.f18273g1 = 32;
        box.f18271b1 = 32;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            if (i11 < i8) {
                Box[] boxArr = this.cubes;
                if (cut(boxArr[i12], boxArr[i11]).booleanValue()) {
                    Box box2 = this.cubes[i12];
                    if (box2.vol > 1) {
                        d8 = variance(box2);
                    } else {
                        d8 = 0.0d;
                    }
                    dArr[i12] = d8;
                    Box box3 = this.cubes[i11];
                    if (box3.vol > 1) {
                        d9 = variance(box3);
                    } else {
                        d9 = 0.0d;
                    }
                    dArr[i11] = d9;
                } else {
                    dArr[i12] = 0.0d;
                    i11--;
                }
                double d10 = dArr[0];
                int i13 = 0;
                for (int i14 = 1; i14 <= i11; i14++) {
                    double d11 = dArr[i14];
                    if (d11 > d10) {
                        i13 = i14;
                        d10 = d11;
                    }
                }
                if (d10 <= 0.0d) {
                    i9 = i11 + 1;
                    break;
                }
                i11++;
                i12 = i13;
            } else {
                i9 = i8;
                break;
            }
        }
        return new CreateBoxesResult(i8, i9);
    }

    void createMoments() {
        int i8 = 1;
        while (true) {
            int i9 = 33;
            if (i8 < 33) {
                int[] iArr = new int[33];
                int[] iArr2 = new int[33];
                int[] iArr3 = new int[33];
                int[] iArr4 = new int[33];
                double[] dArr = new double[33];
                int i10 = 1;
                while (i10 < i9) {
                    int i11 = 0;
                    double d8 = 0.0d;
                    int i12 = 1;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (i12 < i9) {
                        int index = getIndex(i8, i10, i12);
                        int i16 = i11 + this.weights[index];
                        i13 += this.momentsR[index];
                        i14 += this.momentsG[index];
                        i15 += this.momentsB[index];
                        d8 += this.moments[index];
                        iArr[i12] = iArr[i12] + i16;
                        iArr2[i12] = iArr2[i12] + i13;
                        iArr3[i12] = iArr3[i12] + i14;
                        iArr4[i12] = iArr4[i12] + i15;
                        dArr[i12] = dArr[i12] + d8;
                        int index2 = getIndex(i8 - 1, i10, i12);
                        int[] iArr5 = this.weights;
                        iArr5[index] = iArr5[index2] + iArr[i12];
                        int[] iArr6 = this.momentsR;
                        iArr6[index] = iArr6[index2] + iArr2[i12];
                        int[] iArr7 = this.momentsG;
                        iArr7[index] = iArr7[index2] + iArr3[i12];
                        int[] iArr8 = this.momentsB;
                        iArr8[index] = iArr8[index2] + iArr4[i12];
                        double[] dArr2 = this.moments;
                        dArr2[index] = dArr2[index2] + dArr[i12];
                        i12++;
                        i11 = i16;
                        i9 = 33;
                    }
                    i10++;
                    i9 = 33;
                }
                i8++;
            } else {
                return;
            }
        }
    }

    List<Integer> createResult(int i8) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < i8; i9++) {
            Box box = this.cubes[i9];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                int volume2 = volume(box, this.momentsR) / volume;
                int volume3 = volume(box, this.momentsG) / volume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / volume) & 255) | ((volume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((volume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    Boolean cut(Box box, Box box2) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximize = maximize(box, direction, box.f18274r0 + 1, box.f18275r1, volume, volume2, volume3, volume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximize2 = maximize(box, direction2, box.f18272g0 + 1, box.f18273g1, volume, volume2, volume3, volume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximize3 = maximize(box, direction3, box.f18270b0 + 1, box.f18271b1, volume, volume2, volume3, volume4);
        double d8 = maximize.maximum;
        double d9 = maximize2.maximum;
        double d10 = maximize3.maximum;
        if (d8 >= d9 && d8 >= d10) {
            if (maximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
        } else if (d9 >= d8 && d9 >= d10) {
            direction = direction2;
        } else {
            direction = direction3;
        }
        box2.f18275r1 = box.f18275r1;
        box2.f18273g1 = box.f18273g1;
        box2.f18271b1 = box.f18271b1;
        int i8 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    int i9 = maximize3.cutLocation;
                    box.f18271b1 = i9;
                    box2.f18274r0 = box.f18274r0;
                    box2.f18272g0 = box.f18272g0;
                    box2.f18270b0 = i9;
                }
            } else {
                int i10 = maximize2.cutLocation;
                box.f18273g1 = i10;
                box2.f18274r0 = box.f18274r0;
                box2.f18272g0 = i10;
                box2.f18270b0 = box.f18270b0;
            }
        } else {
            int i11 = maximize.cutLocation;
            box.f18275r1 = i11;
            box2.f18274r0 = i11;
            box2.f18272g0 = box.f18272g0;
            box2.f18270b0 = box.f18270b0;
        }
        box.vol = (box.f18275r1 - box.f18274r0) * (box.f18273g1 - box.f18272g0) * (box.f18271b1 - box.f18270b0);
        box2.vol = (box2.f18275r1 - box2.f18274r0) * (box2.f18273g1 - box2.f18272g0) * (box2.f18271b1 - box2.f18270b0);
        return Boolean.TRUE;
    }

    MaximizeResult maximize(Box box, Direction direction, int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        Direction direction2 = direction;
        int bottom = bottom(box2, direction2, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction2, quantizerWu.weights);
        double d8 = 0.0d;
        int i15 = -1;
        int i16 = i8;
        while (i16 < i9) {
            int pVar = top(box2, direction2, i16, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction2, i16, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction2, i16, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction2, i16, quantizerWu.weights) + bottom4;
            if (pVar4 == 0) {
                i14 = bottom;
            } else {
                i14 = bottom;
                double d9 = (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3)) / pVar4;
                int i17 = i10 - pVar;
                int i18 = i11 - pVar2;
                int i19 = i12 - pVar3;
                int i20 = i13 - pVar4;
                if (i20 != 0) {
                    double d10 = d9 + ((((i17 * i17) + (i18 * i18)) + (i19 * i19)) / i20);
                    if (d10 > d8) {
                        d8 = d10;
                        i15 = i16;
                    }
                }
            }
            i16++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            bottom = i14;
        }
        return new MaximizeResult(i15, d8);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i8) {
        constructHistogram(new QuantizerMap().quantize(iArr, i8).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i8).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : createResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    double variance(Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.f18275r1, box.f18273g1, box.f18271b1)] - this.moments[getIndex(box.f18275r1, box.f18273g1, box.f18270b0)]) - this.moments[getIndex(box.f18275r1, box.f18272g0, box.f18271b1)]) + this.moments[getIndex(box.f18275r1, box.f18272g0, box.f18270b0)]) - this.moments[getIndex(box.f18274r0, box.f18273g1, box.f18271b1)]) + this.moments[getIndex(box.f18274r0, box.f18273g1, box.f18270b0)]) + this.moments[getIndex(box.f18274r0, box.f18272g0, box.f18271b1)]) - this.moments[getIndex(box.f18274r0, box.f18272g0, box.f18270b0)]) - ((((volume * volume) + (volume2 * volume2)) + (volume3 * volume3)) / volume(box, this.weights));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Box {

        /* renamed from: b0, reason: collision with root package name */
        int f18270b0;

        /* renamed from: b1, reason: collision with root package name */
        int f18271b1;

        /* renamed from: g0, reason: collision with root package name */
        int f18272g0;

        /* renamed from: g1, reason: collision with root package name */
        int f18273g1;

        /* renamed from: r0, reason: collision with root package name */
        int f18274r0;

        /* renamed from: r1, reason: collision with root package name */
        int f18275r1;
        int vol;

        private Box() {
            this.f18274r0 = 0;
            this.f18275r1 = 0;
            this.f18272g0 = 0;
            this.f18273g1 = 0;
            this.f18270b0 = 0;
            this.f18271b1 = 0;
            this.vol = 0;
        }

        /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
