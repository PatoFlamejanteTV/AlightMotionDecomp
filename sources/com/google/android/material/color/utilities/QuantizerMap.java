package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuantizerMap implements Quantizer {
    Map<Integer, Integer> colorToCount;

    public Map<Integer, Integer> getColorToCount() {
        return this.colorToCount;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i9 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i9));
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i9), Integer.valueOf(i10));
        }
        this.colorToCount = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
