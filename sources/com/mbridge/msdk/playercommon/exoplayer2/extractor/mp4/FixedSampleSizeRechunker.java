package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* loaded from: classes4.dex */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i8, long[] jArr2, int[] iArr2, long j8) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i8;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j8;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i8, long[] jArr, int[] iArr, long j8) {
        int i9 = 8192 / i8;
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += Util.ceilDivide(i11, i9);
        }
        long[] jArr2 = new long[i10];
        int[] iArr2 = new int[i10];
        long[] jArr3 = new long[i10];
        int[] iArr3 = new int[i10];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j9 = jArr[i15];
            while (i16 > 0) {
                int min = Math.min(i9, i16);
                jArr2[i13] = j9;
                int i17 = i8 * min;
                iArr2[i13] = i17;
                i14 = Math.max(i14, i17);
                jArr3[i13] = i12 * j8;
                iArr3[i13] = 1;
                j9 += iArr2[i13];
                i12 += min;
                i16 -= min;
                i13++;
            }
        }
        return new Results(jArr2, iArr2, i14, jArr3, iArr3, j8 * i12);
    }
}
