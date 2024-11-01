package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SampleMetadataQueue {
    private static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private int absoluteFirstIndex;
    private int length;
    private int readPosition;
    private int relativeFirstIndex;
    private Format upstreamFormat;
    private int upstreamSourceId;
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private Format[] formats = new Format[1000];
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    /* loaded from: classes4.dex */
    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    private long discardSamples(int i8) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i8));
        int i9 = this.length - i8;
        this.length = i9;
        this.absoluteFirstIndex += i8;
        int i10 = this.relativeFirstIndex + i8;
        this.relativeFirstIndex = i10;
        int i11 = this.capacity;
        if (i10 >= i11) {
            this.relativeFirstIndex = i10 - i11;
        }
        int i12 = this.readPosition - i8;
        this.readPosition = i12;
        if (i12 < 0) {
            this.readPosition = 0;
        }
        if (i9 == 0) {
            int i13 = this.relativeFirstIndex;
            if (i13 != 0) {
                i11 = i13;
            }
            return this.offsets[i11 - 1] + this.sizes[r2];
        }
        return this.offsets[this.relativeFirstIndex];
    }

    private int findSampleBefore(int i8, int i9, long j8, boolean z8) {
        int i10 = -1;
        for (int i11 = 0; i11 < i9 && this.timesUs[i8] <= j8; i11++) {
            if (!z8 || (this.flags[i8] & 1) != 0) {
                i10 = i11;
            }
            i8++;
            if (i8 == this.capacity) {
                i8 = 0;
            }
        }
        return i10;
    }

    private long getLargestTimestamp(int i8) {
        long j8 = Long.MIN_VALUE;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i8 - 1);
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = Math.max(j8, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j8;
    }

    private int getRelativeIndex(int i8) {
        int i9 = this.relativeFirstIndex + i8;
        int i10 = this.capacity;
        if (i9 >= i10) {
            return i9 - i10;
        }
        return i9;
    }

    public final synchronized int advanceTo(long j8, boolean z8, boolean z9) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j8 >= this.timesUs[relativeIndex] && (j8 <= this.largestQueuedTimestampUs || z9)) {
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j8, z8);
            if (findSampleBefore == -1) {
                return -1;
            }
            this.readPosition += findSampleBefore;
            return findSampleBefore;
        }
        return -1;
    }

    public final synchronized int advanceToEnd() {
        int i8;
        int i9 = this.length;
        i8 = i9 - this.readPosition;
        this.readPosition = i9;
        return i8;
    }

    public final synchronized boolean attemptSplice(long j8) {
        boolean z8 = false;
        if (this.length == 0) {
            if (j8 > this.largestDiscardedTimestampUs) {
                z8 = true;
            }
            return z8;
        }
        if (Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition)) >= j8) {
            return false;
        }
        int i8 = this.length;
        int relativeIndex = getRelativeIndex(i8 - 1);
        while (i8 > this.readPosition && this.timesUs[relativeIndex] >= j8) {
            i8--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        discardUpstreamSamples(this.absoluteFirstIndex + i8);
        return true;
    }

    public final synchronized void commitSample(long j8, int i8, long j9, int i9, TrackOutput.CryptoData cryptoData) {
        try {
            if (this.upstreamKeyframeRequired) {
                if ((i8 & 1) == 0) {
                    return;
                } else {
                    this.upstreamKeyframeRequired = false;
                }
            }
            Assertions.checkState(!this.upstreamFormatRequired);
            commitSampleTimestamp(j8);
            int relativeIndex = getRelativeIndex(this.length);
            this.timesUs[relativeIndex] = j8;
            long[] jArr = this.offsets;
            jArr[relativeIndex] = j9;
            this.sizes[relativeIndex] = i9;
            this.flags[relativeIndex] = i8;
            this.cryptoDatas[relativeIndex] = cryptoData;
            this.formats[relativeIndex] = this.upstreamFormat;
            this.sourceIds[relativeIndex] = this.upstreamSourceId;
            int i10 = this.length + 1;
            this.length = i10;
            int i11 = this.capacity;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                int[] iArr = new int[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr2 = new int[i12];
                int[] iArr3 = new int[i12];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i12];
                Format[] formatArr = new Format[i12];
                int i13 = this.relativeFirstIndex;
                int i14 = i11 - i13;
                System.arraycopy(jArr, i13, jArr2, 0, i14);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i14);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i14);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i14);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i14);
                System.arraycopy(this.formats, this.relativeFirstIndex, formatArr, 0, i14);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i14);
                int i15 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i14, i15);
                System.arraycopy(this.timesUs, 0, jArr3, i14, i15);
                System.arraycopy(this.flags, 0, iArr2, i14, i15);
                System.arraycopy(this.sizes, 0, iArr3, i14, i15);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i14, i15);
                System.arraycopy(this.formats, 0, formatArr, i14, i15);
                System.arraycopy(this.sourceIds, 0, iArr, i14, i15);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr2;
                this.sizes = iArr3;
                this.cryptoDatas = cryptoDataArr;
                this.formats = formatArr;
                this.sourceIds = iArr;
                this.relativeFirstIndex = 0;
                this.length = this.capacity;
                this.capacity = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void commitSampleTimestamp(long j8) {
        this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j8);
    }

    public final synchronized long discardTo(long j8, boolean z8, boolean z9) {
        int i8;
        try {
            int i9 = this.length;
            if (i9 != 0) {
                long[] jArr = this.timesUs;
                int i10 = this.relativeFirstIndex;
                if (j8 >= jArr[i10]) {
                    if (z9 && (i8 = this.readPosition) != i9) {
                        i9 = i8 + 1;
                    }
                    int findSampleBefore = findSampleBefore(i10, i9, j8, z8);
                    if (findSampleBefore == -1) {
                        return -1L;
                    }
                    return discardSamples(findSampleBefore);
                }
            }
            return -1L;
        } finally {
        }
    }

    public final synchronized long discardToEnd() {
        int i8 = this.length;
        if (i8 == 0) {
            return -1L;
        }
        return discardSamples(i8);
    }

    public final synchronized long discardToRead() {
        int i8 = this.readPosition;
        if (i8 == 0) {
            return -1L;
        }
        return discardSamples(i8);
    }

    public final long discardUpstreamSamples(int i8) {
        boolean z8;
        int writeIndex = getWriteIndex() - i8;
        if (writeIndex >= 0 && writeIndex <= this.length - this.readPosition) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        int i9 = this.length - writeIndex;
        this.length = i9;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i9));
        int i10 = this.length;
        if (i10 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i10 - 1)] + this.sizes[r6];
    }

    public final synchronized boolean format(Format format) {
        if (format == null) {
            this.upstreamFormatRequired = true;
            return false;
        }
        this.upstreamFormatRequired = false;
        if (Util.areEqual(format, this.upstreamFormat)) {
            return false;
        }
        this.upstreamFormat = format;
        return true;
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        long j8;
        if (this.length == 0) {
            j8 = Long.MIN_VALUE;
        } else {
            j8 = this.timesUs[this.relativeFirstIndex];
        }
        return j8;
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized Format getUpstreamFormat() {
        Format format;
        if (this.upstreamFormatRequired) {
            format = null;
        } else {
            format = this.upstreamFormat;
        }
        return format;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final synchronized boolean hasNextSample() {
        boolean z8;
        if (this.readPosition != this.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        return z8;
    }

    public final int peekSourceId() {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample()) {
            return this.sourceIds[relativeIndex];
        }
        return this.upstreamSourceId;
    }

    public final synchronized int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8, boolean z9, Format format, SampleExtrasHolder sampleExtrasHolder) {
        if (!hasNextSample()) {
            if (z9) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            Format format2 = this.upstreamFormat;
            if (format2 == null || (!z8 && format2 == format)) {
                return -3;
            }
            formatHolder.format = format2;
            return -5;
        }
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (!z8 && this.formats[relativeIndex] == format) {
            if (decoderInputBuffer.isFlagsOnly()) {
                return -3;
            }
            decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
            decoderInputBuffer.setFlags(this.flags[relativeIndex]);
            sampleExtrasHolder.size = this.sizes[relativeIndex];
            sampleExtrasHolder.offset = this.offsets[relativeIndex];
            sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
            this.readPosition++;
            return -4;
        }
        formatHolder.format = this.formats[relativeIndex];
        return -5;
    }

    public final void reset(boolean z8) {
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        if (z8) {
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    public final synchronized void rewind() {
        this.readPosition = 0;
    }

    public final synchronized boolean setReadPosition(int i8) {
        int i9 = this.absoluteFirstIndex;
        if (i9 <= i8 && i8 <= this.length + i9) {
            this.readPosition = i8 - i9;
            return true;
        }
        return false;
    }

    public final void sourceId(int i8) {
        this.upstreamSourceId = i8;
    }
}
