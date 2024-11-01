package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<Hct> getHctsByHue() {
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d8 = 0.0d; d8 <= 360.0d; d8 += 1.0d) {
            arrayList.add(Hct.from(d8, this.input.getChroma(), this.input.getTone()));
        }
        List<Hct> unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = unmodifiableList;
        return unmodifiableList;
    }

    private List<Hct> getHctsByTemp() {
        List<Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, Comparator$CC.comparing(new Function() { // from class: com.google.android.material.color.utilities.k2
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$getHctsByTemp$0;
                lambda$getHctsByTemp$0 = TemperatureCache.this.lambda$getHctsByTemp$0((Hct) obj);
                return lambda$getHctsByTemp$0;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map<Hct, Double> getTempsByHct() {
        Map<Hct, Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap hashMap = new HashMap();
        for (Hct hct : arrayList) {
            hashMap.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double d8, double d9, double d10) {
        return d9 < d10 ? d9 <= d8 && d8 <= d10 : d9 <= d8 || d8 <= d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return getTempsByHct().get(hct);
    }

    public static double rawTemperature(Hct hct) {
        double[] labFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(labFromArgb[2], labFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        double d8;
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double doubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double doubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - doubleValue;
        boolean isBetween = isBetween(this.input.getHue(), hue, hue2);
        if (isBetween) {
            d8 = hue2;
        } else {
            d8 = hue;
        }
        if (!isBetween) {
            hue = hue2;
        }
        Hct hct2 = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d9 = 1000.0d;
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(d8 + (1.0d * d10));
            if (isBetween(sanitizeDegreesDouble, d8, hue)) {
                Hct hct3 = getHctsByHue().get((int) Math.round(sanitizeDegreesDouble));
                double abs = Math.abs(relativeTemperature - ((getTempsByHct().get(hct3).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d9) {
                    hct2 = hct3;
                    d9 = abs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double doubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double doubleValue2 = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public List<Hct> getAnalogousColors(int i8, int i9) {
        int round = (int) Math.round(this.input.getHue());
        Hct hct = getHctsByHue().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double d8 = 0.0d;
        double d9 = 0.0d;
        int i10 = 0;
        while (i10 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i10)));
            d9 += Math.abs(relativeTemperature2 - relativeTemperature);
            i10++;
            relativeTemperature = relativeTemperature2;
        }
        double d10 = d9 / i9;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i11 = 1;
        while (true) {
            if (arrayList.size() >= i9) {
                break;
            }
            Hct hct2 = getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i11));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d8 += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z8 = d8 >= ((double) arrayList.size()) * d10;
            int i12 = 1;
            while (z8 && arrayList.size() < i9) {
                arrayList.add(hct2);
                z8 = d8 >= ((double) (arrayList.size() + i12)) * d10;
                i12++;
            }
            i11++;
            if (i11 > 360) {
                while (arrayList.size() < i9) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int floor = (int) Math.floor((i8 - 1.0d) / 2.0d);
        for (int i13 = 1; i13 < floor + 1; i13++) {
            int i14 = 0 - i13;
            while (i14 < 0) {
                i14 += arrayList.size();
            }
            if (i14 >= arrayList.size()) {
                i14 %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(i14));
        }
        int i15 = i8 - floor;
        for (int i16 = 1; i16 < i15; i16++) {
            int i17 = i16;
            while (i17 < 0) {
                i17 += arrayList.size();
            }
            if (i17 >= arrayList.size()) {
                i17 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(i17));
        }
        return arrayList2;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }
}
