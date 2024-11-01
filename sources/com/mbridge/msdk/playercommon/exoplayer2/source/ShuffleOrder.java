package com.mbridge.msdk.playercommon.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes4.dex */
public interface ShuffleOrder {

    /* loaded from: classes4.dex */
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i8) {
            this(i8, new Random());
        }

        private static int[] createShuffledList(int i8, Random random) {
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                int nextInt = random.nextInt(i10);
                iArr[i9] = iArr[nextInt];
                iArr[nextInt] = i9;
                i9 = i10;
            }
            return iArr;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i8, int i9) {
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int i10 = 0;
            int i11 = 0;
            while (i11 < i9) {
                iArr[i11] = this.random.nextInt(this.shuffled.length + 1);
                int i12 = i11 + 1;
                int nextInt = this.random.nextInt(i12);
                iArr2[i11] = iArr2[nextInt];
                iArr2[nextInt] = i11 + i8;
                i11 = i12;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i9];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i10 < iArr4.length + i9) {
                    if (i13 < i9 && i14 == iArr[i13]) {
                        iArr3[i10] = iArr2[i13];
                        i13++;
                    } else {
                        int i15 = i14 + 1;
                        int i16 = iArr4[i14];
                        iArr3[i10] = i16;
                        if (i16 >= i8) {
                            iArr3[i10] = i16 + i9;
                        }
                        i14 = i15;
                    }
                    i10++;
                } else {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i8) {
            int i9;
            int[] iArr = new int[this.shuffled.length - 1];
            int i10 = 0;
            boolean z8 = false;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i10 < iArr2.length) {
                    int i11 = iArr2[i10];
                    if (i11 == i8) {
                        z8 = true;
                    } else {
                        if (z8) {
                            i9 = i10 - 1;
                        } else {
                            i9 = i10;
                        }
                        if (i11 > i8) {
                            i11--;
                        }
                        iArr[i9] = i11;
                    }
                    i10++;
                } else {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i8) {
            int i9 = this.indexInShuffled[i8] + 1;
            int[] iArr = this.shuffled;
            if (i9 < iArr.length) {
                return iArr[i9];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i8) {
            int i9 = this.indexInShuffled[i8] - 1;
            if (i9 < 0) {
                return -1;
            }
            return this.shuffled[i9];
        }

        public DefaultShuffleOrder(int i8, long j8) {
            this(i8, new Random(j8));
        }

        private DefaultShuffleOrder(int i8, Random random) {
            this(createShuffledList(i8, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                this.indexInShuffled[iArr[i8]] = i8;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i8) {
            this.length = i8;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndInsert(int i8, int i9) {
            return new UnshuffledShuffleOrder(this.length + i9);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i8) {
            return new UnshuffledShuffleOrder(this.length - 1);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getFirstIndex() {
            if (this.length > 0) {
                return 0;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLastIndex() {
            int i8 = this.length;
            if (i8 > 0) {
                return i8 - 1;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLength() {
            return this.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getNextIndex(int i8) {
            int i9 = i8 + 1;
            if (i9 >= this.length) {
                return -1;
            }
            return i9;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getPreviousIndex(int i8) {
            int i9 = i8 - 1;
            if (i9 >= 0) {
                return i9;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i8, int i9);

    ShuffleOrder cloneAndRemove(int i8);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i8);

    int getPreviousIndex(int i8);
}
