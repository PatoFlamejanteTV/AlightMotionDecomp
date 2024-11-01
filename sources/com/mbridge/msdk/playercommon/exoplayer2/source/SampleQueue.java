package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.CryptoInfo;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.source.SampleMetadataQueue;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocation;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.Allocator;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class SampleQueue implements TrackOutput {
    public static final int ADVANCE_FAILED = -1;
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private Format downstreamFormat;
    private final SampleMetadataQueue.SampleExtrasHolder extrasHolder;
    private AllocationNode firstAllocationNode;
    private Format lastUnadjustedFormat;
    private final SampleMetadataQueue metadataQueue;
    private boolean pendingFormatAdjustment;
    private boolean pendingSplice;
    private AllocationNode readAllocationNode;
    private long sampleOffsetUs;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private AllocationNode writeAllocationNode;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class AllocationNode {
        public Allocation allocation;
        public final long endPosition;
        public AllocationNode next;
        public final long startPosition;
        public boolean wasInitialized;

        public AllocationNode(long j8, int i8) {
            this.startPosition = j8;
            this.endPosition = j8 + i8;
        }

        public final AllocationNode clear() {
            this.allocation = null;
            AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        public final void initialize(Allocation allocation, AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
            this.wasInitialized = true;
        }

        public final int translateOffset(long j8) {
            return ((int) (j8 - this.startPosition)) + this.allocation.offset;
        }
    }

    /* loaded from: classes4.dex */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.metadataQueue = new SampleMetadataQueue();
        this.extrasHolder = new SampleMetadataQueue.SampleExtrasHolder();
        this.scratch = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    private void advanceReadTo(long j8) {
        while (true) {
            AllocationNode allocationNode = this.readAllocationNode;
            if (j8 >= allocationNode.endPosition) {
                this.readAllocationNode = allocationNode.next;
            } else {
                return;
            }
        }
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
        if (!allocationNode.wasInitialized) {
            return;
        }
        AllocationNode allocationNode2 = this.writeAllocationNode;
        boolean z8 = allocationNode2.wasInitialized;
        int i8 = (z8 ? 1 : 0) + (((int) (allocationNode2.startPosition - allocationNode.startPosition)) / this.allocationLength);
        Allocation[] allocationArr = new Allocation[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            allocationArr[i9] = allocationNode.allocation;
            allocationNode = allocationNode.clear();
        }
        this.allocator.release(allocationArr);
    }

    private void discardDownstreamTo(long j8) {
        AllocationNode allocationNode;
        if (j8 == -1) {
            return;
        }
        while (true) {
            allocationNode = this.firstAllocationNode;
            if (j8 < allocationNode.endPosition) {
                break;
            }
            this.allocator.release(allocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < allocationNode.startPosition) {
            this.readAllocationNode = allocationNode;
        }
    }

    private static Format getAdjustedSampleFormat(Format format, long j8) {
        if (format == null) {
            return null;
        }
        if (j8 != 0) {
            long j9 = format.subsampleOffsetUs;
            if (j9 != Long.MAX_VALUE) {
                return format.copyWithSubsampleOffsetUs(j9 + j8);
            }
            return format;
        }
        return format;
    }

    private void postAppend(int i8) {
        long j8 = this.totalBytesWritten + i8;
        this.totalBytesWritten = j8;
        AllocationNode allocationNode = this.writeAllocationNode;
        if (j8 == allocationNode.endPosition) {
            this.writeAllocationNode = allocationNode.next;
        }
    }

    private int preAppend(int i8) {
        AllocationNode allocationNode = this.writeAllocationNode;
        if (!allocationNode.wasInitialized) {
            allocationNode.initialize(this.allocator.allocate(), new AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i8, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private void readData(long j8, ByteBuffer byteBuffer, int i8) {
        advanceReadTo(j8);
        while (i8 > 0) {
            int min = Math.min(i8, (int) (this.readAllocationNode.endPosition - j8));
            AllocationNode allocationNode = this.readAllocationNode;
            byteBuffer.put(allocationNode.allocation.data, allocationNode.translateOffset(j8), min);
            i8 -= min;
            j8 += min;
            AllocationNode allocationNode2 = this.readAllocationNode;
            if (j8 == allocationNode2.endPosition) {
                this.readAllocationNode = allocationNode2.next;
            }
        }
    }

    private void readEncryptionData(DecoderInputBuffer decoderInputBuffer, SampleMetadataQueue.SampleExtrasHolder sampleExtrasHolder) {
        boolean z8;
        int i8;
        long j8 = sampleExtrasHolder.offset;
        this.scratch.reset(1);
        readData(j8, this.scratch.data, 1);
        long j9 = j8 + 1;
        byte b9 = this.scratch.data[0];
        if ((b9 & 128) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = b9 & Byte.MAX_VALUE;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        if (cryptoInfo.iv == null) {
            cryptoInfo.iv = new byte[16];
        }
        readData(j9, cryptoInfo.iv, i9);
        long j10 = j9 + i9;
        if (z8) {
            this.scratch.reset(2);
            readData(j10, this.scratch.data, 2);
            j10 += 2;
            i8 = this.scratch.readUnsignedShort();
        } else {
            i8 = 1;
        }
        CryptoInfo cryptoInfo2 = decoderInputBuffer.cryptoInfo;
        int[] iArr = cryptoInfo2.numBytesOfClearData;
        if (iArr == null || iArr.length < i8) {
            iArr = new int[i8];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i8) {
            iArr3 = new int[i8];
        }
        int[] iArr4 = iArr3;
        if (z8) {
            int i10 = i8 * 6;
            this.scratch.reset(i10);
            readData(j10, this.scratch.data, i10);
            j10 += i10;
            this.scratch.setPosition(0);
            for (int i11 = 0; i11 < i8; i11++) {
                iArr2[i11] = this.scratch.readUnsignedShort();
                iArr4[i11] = this.scratch.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j10 - sampleExtrasHolder.offset));
        }
        TrackOutput.CryptoData cryptoData = sampleExtrasHolder.cryptoData;
        CryptoInfo cryptoInfo3 = decoderInputBuffer.cryptoInfo;
        cryptoInfo3.set(i8, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo3.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j11 = sampleExtrasHolder.offset;
        int i12 = (int) (j10 - j11);
        sampleExtrasHolder.offset = j11 + i12;
        sampleExtrasHolder.size -= i12;
    }

    public final int advanceTo(long j8, boolean z8, boolean z9) {
        return this.metadataQueue.advanceTo(j8, z8, z9);
    }

    public final int advanceToEnd() {
        return this.metadataQueue.advanceToEnd();
    }

    public final void discardTo(long j8, boolean z8, boolean z9) {
        discardDownstreamTo(this.metadataQueue.discardTo(j8, z8, z9));
    }

    public final void discardToEnd() {
        discardDownstreamTo(this.metadataQueue.discardToEnd());
    }

    public final void discardToRead() {
        discardDownstreamTo(this.metadataQueue.discardToRead());
    }

    public final void discardUpstreamSamples(int i8) {
        long discardUpstreamSamples = this.metadataQueue.discardUpstreamSamples(i8);
        this.totalBytesWritten = discardUpstreamSamples;
        if (discardUpstreamSamples != 0) {
            AllocationNode allocationNode = this.firstAllocationNode;
            if (discardUpstreamSamples != allocationNode.startPosition) {
                while (this.totalBytesWritten > allocationNode.endPosition) {
                    allocationNode = allocationNode.next;
                }
                AllocationNode allocationNode2 = allocationNode.next;
                clearAllocationNodes(allocationNode2);
                AllocationNode allocationNode3 = new AllocationNode(allocationNode.endPosition, this.allocationLength);
                allocationNode.next = allocationNode3;
                if (this.totalBytesWritten == allocationNode.endPosition) {
                    allocationNode = allocationNode3;
                }
                this.writeAllocationNode = allocationNode;
                if (this.readAllocationNode == allocationNode2) {
                    this.readAllocationNode = allocationNode3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode4 = new AllocationNode(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = allocationNode4;
        this.readAllocationNode = allocationNode4;
        this.writeAllocationNode = allocationNode4;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedSampleFormat = getAdjustedSampleFormat(format, this.sampleOffsetUs);
        boolean format2 = this.metadataQueue.format(adjustedSampleFormat);
        this.lastUnadjustedFormat = format;
        this.pendingFormatAdjustment = false;
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener != null && format2) {
            upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedSampleFormat);
        }
    }

    public final int getFirstIndex() {
        return this.metadataQueue.getFirstIndex();
    }

    public final long getFirstTimestampUs() {
        return this.metadataQueue.getFirstTimestampUs();
    }

    public final long getLargestQueuedTimestampUs() {
        return this.metadataQueue.getLargestQueuedTimestampUs();
    }

    public final int getReadIndex() {
        return this.metadataQueue.getReadIndex();
    }

    public final Format getUpstreamFormat() {
        return this.metadataQueue.getUpstreamFormat();
    }

    public final int getWriteIndex() {
        return this.metadataQueue.getWriteIndex();
    }

    public final boolean hasNextSample() {
        return this.metadataQueue.hasNextSample();
    }

    public final int peekSourceId() {
        return this.metadataQueue.peekSourceId();
    }

    public final int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z8, boolean z9, long j8) {
        int read = this.metadataQueue.read(formatHolder, decoderInputBuffer, z8, z9, this.downstreamFormat, this.extrasHolder);
        if (read != -5) {
            if (read != -4) {
                if (read == -3) {
                    return -3;
                }
                throw new IllegalStateException();
            }
            if (!decoderInputBuffer.isEndOfStream()) {
                if (decoderInputBuffer.timeUs < j8) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                if (decoderInputBuffer.isEncrypted()) {
                    readEncryptionData(decoderInputBuffer, this.extrasHolder);
                }
                decoderInputBuffer.ensureSpaceForWrite(this.extrasHolder.size);
                SampleMetadataQueue.SampleExtrasHolder sampleExtrasHolder = this.extrasHolder;
                readData(sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
            }
            return -4;
        }
        this.downstreamFormat = formatHolder.format;
        return -5;
    }

    public final void reset() {
        reset(false);
    }

    public final void rewind() {
        this.metadataQueue.rewind();
        this.readAllocationNode = this.firstAllocationNode;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final int sampleData(ExtractorInput extractorInput, int i8, boolean z8) throws IOException, InterruptedException {
        int preAppend = preAppend(i8);
        AllocationNode allocationNode = this.writeAllocationNode;
        int read = extractorInput.read(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
        if (read != -1) {
            postAppend(read);
            return read;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleMetadata(long j8, int i8, int i9, int i10, TrackOutput.CryptoData cryptoData) {
        if (this.pendingFormatAdjustment) {
            format(this.lastUnadjustedFormat);
        }
        if (this.pendingSplice) {
            if ((i8 & 1) != 0 && this.metadataQueue.attemptSplice(j8)) {
                this.pendingSplice = false;
            } else {
                return;
            }
        }
        this.metadataQueue.commitSample(j8 + this.sampleOffsetUs, i8, (this.totalBytesWritten - i9) - i10, i9, cryptoData);
    }

    public final boolean setReadPosition(int i8) {
        return this.metadataQueue.setReadPosition(i8);
    }

    public final void setSampleOffsetUs(long j8) {
        if (this.sampleOffsetUs != j8) {
            this.sampleOffsetUs = j8;
            this.pendingFormatAdjustment = true;
        }
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final void sourceId(int i8) {
        this.metadataQueue.sourceId(i8);
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public final void reset(boolean z8) {
        this.metadataQueue.reset(z8);
        clearAllocationNodes(this.firstAllocationNode);
        AllocationNode allocationNode = new AllocationNode(0L, this.allocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    private void readData(long j8, byte[] bArr, int i8) {
        advanceReadTo(j8);
        int i9 = i8;
        while (i9 > 0) {
            int min = Math.min(i9, (int) (this.readAllocationNode.endPosition - j8));
            AllocationNode allocationNode = this.readAllocationNode;
            System.arraycopy(allocationNode.allocation.data, allocationNode.translateOffset(j8), bArr, i8 - i9, min);
            i9 -= min;
            j8 += min;
            AllocationNode allocationNode2 = this.readAllocationNode;
            if (j8 == allocationNode2.endPosition) {
                this.readAllocationNode = allocationNode2.next;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i8) {
        while (i8 > 0) {
            int preAppend = preAppend(i8);
            AllocationNode allocationNode = this.writeAllocationNode;
            parsableByteArray.readBytes(allocationNode.allocation.data, allocationNode.translateOffset(this.totalBytesWritten), preAppend);
            i8 -= preAppend;
            postAppend(preAppend);
        }
    }
}
