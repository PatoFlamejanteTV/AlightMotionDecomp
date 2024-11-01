package com.mbridge.msdk.playercommon.exoplayer2.extractor.amr;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AmrExtractor implements Extractor {
    private static final int MAX_FRAME_SIZE_BYTES;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final int[] frameSizeBytesByTypeWb;
    private int currentSampleBytesRemaining;
    private long currentSampleTimeUs;
    private int currentSampleTotalBytes;
    private boolean hasOutputFormat;
    private boolean isWideBand;
    private final byte[] scratch = new byte[1];
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.amr.AmrExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new AmrExtractor()};
        }
    };
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        frameSizeBytesByTypeWb = iArr;
        MAX_FRAME_SIZE_BYTES = iArr[8];
    }

    static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static int frameSizeBytesByTypeNb(int i8) {
        return frameSizeBytesByTypeNb[i8];
    }

    static int frameSizeBytesByTypeWb(int i8) {
        return frameSizeBytesByTypeWb[i8];
    }

    private int getFrameSizeInBytes(int i8) throws ParserException {
        String str;
        if (!isValidFrameType(i8)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal AMR ");
            if (this.isWideBand) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i8);
            throw new ParserException(sb.toString());
        }
        if (this.isWideBand) {
            return frameSizeBytesByTypeWb[i8];
        }
        return frameSizeBytesByTypeNb[i8];
    }

    private boolean isNarrowBandValidFrameType(int i8) {
        if (!this.isWideBand && (i8 < 12 || i8 > 14)) {
            return true;
        }
        return false;
    }

    private boolean isValidFrameType(int i8) {
        if (i8 >= 0 && i8 <= 15 && (isWideBandValidFrameType(i8) || isNarrowBandValidFrameType(i8))) {
            return true;
        }
        return false;
    }

    private boolean isWideBandValidFrameType(int i8) {
        if (this.isWideBand && (i8 < 10 || i8 > 13)) {
            return true;
        }
        return false;
    }

    private void maybeOutputFormat() {
        String str;
        int i8;
        if (!this.hasOutputFormat) {
            this.hasOutputFormat = true;
            boolean z8 = this.isWideBand;
            if (z8) {
                str = MimeTypes.AUDIO_AMR_WB;
            } else {
                str = MimeTypes.AUDIO_AMR_NB;
            }
            String str2 = str;
            if (z8) {
                i8 = SAMPLE_RATE_WB;
            } else {
                i8 = 8000;
            }
            this.trackOutput.format(Format.createAudioSampleFormat(null, str2, null, -1, MAX_FRAME_SIZE_BYTES, 1, i8, -1, null, null, 0, null));
        }
    }

    private boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    private int readNextSampleSize(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b9 = this.scratch[0];
        if ((b9 & 131) <= 0) {
            return getFrameSizeInBytes((b9 >> 3) & 15);
        }
        throw new ParserException("Invalid padding bits for frame header " + ((int) b9));
    }

    private int readSample(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int readNextSampleSize = readNextSampleSize(extractorInput);
                this.currentSampleTotalBytes = readNextSampleSize;
                this.currentSampleBytesRemaining = readNextSampleSize;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int sampleData = this.trackOutput.sampleData(extractorInput, this.currentSampleBytesRemaining, true);
        if (sampleData == -1) {
            return -1;
        }
        int i8 = this.currentSampleBytesRemaining - sampleData;
        this.currentSampleBytesRemaining = i8;
        if (i8 > 0) {
            return 0;
        }
        this.trackOutput.sampleMetadata(this.currentSampleTimeUs, 1, this.currentSampleTotalBytes, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw new ParserException("Could not find AMR header.");
        }
        maybeOutputFormat();
        return readSample(extractorInput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j8, long j9) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleTotalBytes = 0;
        this.currentSampleBytesRemaining = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return readAmrHeader(extractorInput);
    }
}
