package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.1
        @Override // java.util.Comparator
        public int compare(Sample sample, Sample sample2) {
            return sample.index - sample2.index;
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.2
        @Override // java.util.Comparator
        public int compare(Sample sample, Sample sample2) {
            float f8 = sample.value;
            float f9 = sample2.value;
            if (f8 < f9) {
                return -1;
            }
            return f9 < f8 ? 1 : 0;
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    public SlidingPercentile(int i8) {
        this.maxWeight = i8;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    public void addSample(int i8, float f8) {
        Sample sample;
        ensureSortedByIndex();
        int i9 = this.recycledSampleCount;
        if (i9 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i10 = i9 - 1;
            this.recycledSampleCount = i10;
            sample = sampleArr[i10];
        } else {
            sample = new Sample();
        }
        int i11 = this.nextSampleIndex;
        this.nextSampleIndex = i11 + 1;
        sample.index = i11;
        sample.weight = i8;
        sample.value = f8;
        this.samples.add(sample);
        this.totalWeight += i8;
        while (true) {
            int i12 = this.totalWeight;
            int i13 = this.maxWeight;
            if (i12 > i13) {
                int i14 = i12 - i13;
                Sample sample2 = this.samples.get(0);
                int i15 = sample2.weight;
                if (i15 <= i14) {
                    this.totalWeight -= i15;
                    this.samples.remove(0);
                    int i16 = this.recycledSampleCount;
                    if (i16 < 5) {
                        Sample[] sampleArr2 = this.recycledSamples;
                        this.recycledSampleCount = i16 + 1;
                        sampleArr2[i16] = sample2;
                    }
                } else {
                    sample2.weight = i15 - i14;
                    this.totalWeight -= i14;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f8) {
        ensureSortedByValue();
        float f9 = f8 * this.totalWeight;
        int i8 = 0;
        for (int i9 = 0; i9 < this.samples.size(); i9++) {
            Sample sample = this.samples.get(i9);
            i8 += sample.weight;
            if (i8 >= f9) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return this.samples.get(r5.size() - 1).value;
    }
}
