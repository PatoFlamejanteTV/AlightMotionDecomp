package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes4.dex */
final class TrackFragment {
    public long atomPosition;
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public int[] sampleCompositionTimeOffsetTable;
    public int sampleCount;
    public long[] sampleDecodingTimeTable;
    public ParsableByteArray sampleEncryptionData;
    public int sampleEncryptionDataLength;
    public boolean sampleEncryptionDataNeedsFill;
    public boolean[] sampleHasSubsampleEncryptionTable;
    public boolean[] sampleIsSyncFrameTable;
    public int[] sampleSizeTable;
    public TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition;
    public int[] trunLength;

    public final void fillEncryptionData(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.readFully(this.sampleEncryptionData.data, 0, this.sampleEncryptionDataLength);
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }

    public final long getSamplePresentationTime(int i8) {
        return this.sampleDecodingTimeTable[i8] + this.sampleCompositionTimeOffsetTable[i8];
    }

    public final void initEncryptionData(int i8) {
        ParsableByteArray parsableByteArray = this.sampleEncryptionData;
        if (parsableByteArray == null || parsableByteArray.limit() < i8) {
            this.sampleEncryptionData = new ParsableByteArray(i8);
        }
        this.sampleEncryptionDataLength = i8;
        this.definesEncryptionData = true;
        this.sampleEncryptionDataNeedsFill = true;
    }

    public final void initTables(int i8, int i9) {
        this.trunCount = i8;
        this.sampleCount = i9;
        int[] iArr = this.trunLength;
        if (iArr == null || iArr.length < i8) {
            this.trunDataPosition = new long[i8];
            this.trunLength = new int[i8];
        }
        int[] iArr2 = this.sampleSizeTable;
        if (iArr2 == null || iArr2.length < i9) {
            int i10 = (i9 * 125) / 100;
            this.sampleSizeTable = new int[i10];
            this.sampleCompositionTimeOffsetTable = new int[i10];
            this.sampleDecodingTimeTable = new long[i10];
            this.sampleIsSyncFrameTable = new boolean[i10];
            this.sampleHasSubsampleEncryptionTable = new boolean[i10];
        }
    }

    public final void reset() {
        this.trunCount = 0;
        this.nextFragmentDecodeTime = 0L;
        this.definesEncryptionData = false;
        this.sampleEncryptionDataNeedsFill = false;
        this.trackEncryptionBox = null;
    }

    public final void fillEncryptionData(ParsableByteArray parsableByteArray) {
        parsableByteArray.readBytes(this.sampleEncryptionData.data, 0, this.sampleEncryptionDataLength);
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }
}
