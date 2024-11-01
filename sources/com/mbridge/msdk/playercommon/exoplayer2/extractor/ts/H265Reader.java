package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableNalUnitBitArray;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class H265Reader implements ElementaryStreamReader {
    private static final int BLA_W_LP = 16;
    private static final int CRA_NUT = 21;
    private static final int PPS_NUT = 34;
    private static final int PREFIX_SEI_NUT = 39;
    private static final int RASL_R = 9;
    private static final int SPS_NUT = 33;
    private static final int SUFFIX_SEI_NUT = 40;
    private static final String TAG = "H265Reader";
    private static final int VPS_NUT = 32;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstParameterSet;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private boolean writingParameterSets;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private void outputSample(int i8) {
            boolean z8 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z8 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i8, null);
        }

        public final void endNalUnit(long j8, int i8) {
            if (this.writingParameterSets && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.writingParameterSets = false;
            } else if (this.isFirstParameterSet || this.isFirstSlice) {
                if (this.readingSample) {
                    outputSample(i8 + ((int) (j8 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.readingSample = true;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
            }
        }

        public final void readNalUnitData(byte[] bArr, int i8, int i9) {
            boolean z8;
            if (this.lookingForFirstSliceFlag) {
                int i10 = this.nalUnitBytesRead;
                int i11 = (i8 + 2) - i10;
                if (i11 < i9) {
                    if ((bArr[i11] & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.isFirstSlice = z8;
                    this.lookingForFirstSliceFlag = false;
                    return;
                }
                this.nalUnitBytesRead = i10 + (i9 - i8);
            }
        }

        public final void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.readingSample = false;
            this.writingParameterSets = false;
        }

        public final void startNalUnit(long j8, int i8, int i9, long j9) {
            boolean z8;
            boolean z9 = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.nalUnitTimeUs = j9;
            this.nalUnitBytesRead = 0;
            this.nalUnitStartPosition = j8;
            if (i9 >= 32) {
                if (!this.writingParameterSets && this.readingSample) {
                    outputSample(i8);
                    this.readingSample = false;
                }
                if (i9 <= 34) {
                    this.isFirstParameterSet = !this.writingParameterSets;
                    this.writingParameterSets = true;
                }
            }
            if (i9 >= 16 && i9 <= 21) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.nalUnitHasKeyframeData = z8;
            if (z8 || i9 <= 9) {
                z9 = true;
            }
            this.lookingForFirstSliceFlag = z9;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    private void endNalUnit(long j8, int i8, int i9, long j9) {
        if (this.hasOutputFormat) {
            this.sampleReader.endNalUnit(j8, i8);
        } else {
            this.vps.endNalUnit(i9);
            this.sps.endNalUnit(i9);
            this.pps.endNalUnit(i9);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i9)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j9, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i9)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j9, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i8, int i9) {
        if (this.hasOutputFormat) {
            this.sampleReader.readNalUnitData(bArr, i8, i9);
        } else {
            this.vps.appendToNalUnit(bArr, i8, i9);
            this.sps.appendToNalUnit(bArr, i8, i9);
            this.pps.appendToNalUnit(bArr, i8, i9);
        }
        this.prefixSei.appendToNalUnit(bArr, i8, i9);
        this.suffixSei.appendToNalUnit(bArr, i8, i9);
    }

    private static Format parseMediaFormat(String str, NalUnitTargetBuffer nalUnitTargetBuffer, NalUnitTargetBuffer nalUnitTargetBuffer2, NalUnitTargetBuffer nalUnitTargetBuffer3) {
        int i8;
        float f8;
        int i9;
        int i10 = nalUnitTargetBuffer.nalLength;
        byte[] bArr = new byte[nalUnitTargetBuffer2.nalLength + i10 + nalUnitTargetBuffer3.nalLength];
        System.arraycopy(nalUnitTargetBuffer.nalData, 0, bArr, 0, i10);
        System.arraycopy(nalUnitTargetBuffer2.nalData, 0, bArr, nalUnitTargetBuffer.nalLength, nalUnitTargetBuffer2.nalLength);
        System.arraycopy(nalUnitTargetBuffer3.nalData, 0, bArr, nalUnitTargetBuffer.nalLength + nalUnitTargetBuffer2.nalLength, nalUnitTargetBuffer3.nalLength);
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer2.nalData, 0, nalUnitTargetBuffer2.nalLength);
        parsableNalUnitBitArray.skipBits(44);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        parsableNalUnitBitArray.skipBits(88);
        parsableNalUnitBitArray.skipBits(8);
        int i11 = 0;
        for (int i12 = 0; i12 < readBits; i12++) {
            if (parsableNalUnitBitArray.readBit()) {
                i11 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i11 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i11);
        if (readBits > 0) {
            parsableNalUnitBitArray.skipBits((8 - readBits) * 2);
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i13 = 1;
            if (readUnsignedExpGolombCodedInt != 1 && readUnsignedExpGolombCodedInt != 2) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            if (readUnsignedExpGolombCodedInt == 1) {
                i13 = 2;
            }
            readUnsignedExpGolombCodedInt2 -= i9 * (readUnsignedExpGolombCodedInt4 + readUnsignedExpGolombCodedInt5);
            readUnsignedExpGolombCodedInt3 -= i13 * (readUnsignedExpGolombCodedInt6 + readUnsignedExpGolombCodedInt7);
        }
        int i14 = readUnsignedExpGolombCodedInt2;
        int i15 = readUnsignedExpGolombCodedInt3;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            i8 = 0;
        } else {
            i8 = readBits;
        }
        while (i8 <= readBits) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            i8++;
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermRefPicSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            for (int i16 = 0; i16 < parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(); i16++) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt8 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f9 = 1.0f;
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            int readBits2 = parsableNalUnitBitArray.readBits(8);
            if (readBits2 == 255) {
                int readBits3 = parsableNalUnitBitArray.readBits(16);
                int readBits4 = parsableNalUnitBitArray.readBits(16);
                if (readBits3 != 0 && readBits4 != 0) {
                    f9 = readBits3 / readBits4;
                }
                f8 = f9;
            } else {
                float[] fArr = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
                if (readBits2 < fArr.length) {
                    f8 = fArr[readBits2];
                } else {
                    Log.w(TAG, "Unexpected aspect_ratio_idc value: " + readBits2);
                }
            }
            return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i14, i15, -1.0f, Collections.singletonList(bArr), -1, f8, null);
        }
        f8 = 1.0f;
        return Format.createVideoSampleFormat(str, MimeTypes.VIDEO_H265, null, -1, -1, i14, i15, -1.0f, Collections.singletonList(bArr), -1, f8, null);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = 0;
            while (i9 < 6) {
                int i10 = 1;
                if (!parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    int min = Math.min(64, 1 << ((i8 << 1) + 4));
                    if (i8 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i11 = 0; i11 < min; i11++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                }
                if (i8 == 3) {
                    i10 = 3;
                }
                i9 += i10;
            }
        }
    }

    private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean z8 = false;
        int i8 = 0;
        for (int i9 = 0; i9 < readUnsignedExpGolombCodedInt; i9++) {
            if (i9 != 0) {
                z8 = parsableNalUnitBitArray.readBit();
            }
            if (z8) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i10 = 0; i10 <= i8; i10++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i11 = readUnsignedExpGolombCodedInt2 + readUnsignedExpGolombCodedInt3;
                for (int i12 = 0; i12 < readUnsignedExpGolombCodedInt2; i12++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i13 = 0; i13 < readUnsignedExpGolombCodedInt3; i13++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i8 = i11;
            }
        }
    }

    private void startNalUnit(long j8, int i8, int i9, long j9) {
        if (this.hasOutputFormat) {
            this.sampleReader.startNalUnit(j8, i8, i9, j9);
        } else {
            this.vps.startNalUnit(i9);
            this.sps.startNalUnit(i9);
            this.pps.startNalUnit(i9);
        }
        this.prefixSei.startNalUnit(i9);
        this.suffixSei.startNalUnit(i9);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        int i8;
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int limit = parsableByteArray.limit();
            byte[] bArr = parsableByteArray.data;
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < limit) {
                int findNalUnit = NalUnitUtil.findNalUnit(bArr, position, limit, this.prefixFlags);
                if (findNalUnit == limit) {
                    nalUnitData(bArr, position, limit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(bArr, findNalUnit);
                int i9 = findNalUnit - position;
                if (i9 > 0) {
                    nalUnitData(bArr, position, findNalUnit);
                }
                int i10 = limit - findNalUnit;
                long j8 = this.totalBytesWritten - i10;
                if (i9 < 0) {
                    i8 = -i9;
                } else {
                    i8 = 0;
                }
                endNalUnit(j8, i10, i8, this.pesTimeUs);
                startNalUnit(j8, i10, h265NalUnitType, this.pesTimeUs);
                position = findNalUnit + 3;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j8, boolean z8) {
        this.pesTimeUs = j8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.sampleReader.reset();
        this.totalBytesWritten = 0L;
    }
}
