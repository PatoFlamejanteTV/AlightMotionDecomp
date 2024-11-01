package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d8) {
            this.hct = hct;
            this.score = d8;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i8) {
        return score(map, i8, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i8, int i9) {
        return score(map, i8, i9, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i8, int i9, boolean z8) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d8 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct fromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(fromInt);
            int floor = (int) Math.floor(fromInt.getHue());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d8 += intValue;
        }
        double[] dArr = new double[360];
        for (int i10 = 0; i10 < 360; i10++) {
            double d9 = iArr[i10] / d8;
            for (int i11 = i10 - 14; i11 < i10 + 16; i11++) {
                int sanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i11);
                dArr[sanitizeDegreesInt] = dArr[sanitizeDegreesInt] + d9;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d10 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z8 || (hct.getChroma() >= CUTOFF_CHROMA && d10 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, (d10 * 100.0d * WEIGHT_PROPORTION) + ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 90; i12 >= 15; i12--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                    if (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) < i12) {
                        break;
                    }
                }
                if (arrayList3.size() >= i8) {
                    break;
                }
            }
            if (arrayList3.size() >= i8) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i9));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }
}
