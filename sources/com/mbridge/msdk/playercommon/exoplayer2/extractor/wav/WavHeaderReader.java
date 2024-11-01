package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final int TYPE_FLOAT = 3;
    private static final int TYPE_PCM = 1;
    private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;

    /* loaded from: classes4.dex */
    private static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i8, long j8) {
            this.id = i8;
            this.size = j8;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException, InterruptedException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.playercommon.exoplayer2.extractor.wav.WavHeader peek(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.wav.WavHeaderReader.peek(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):com.mbridge.msdk.playercommon.exoplayer2.extractor.wav.WavHeader");
    }

    public static void skipToData(ExtractorInput extractorInput, WavHeader wavHeader) throws IOException, InterruptedException {
        Assertions.checkNotNull(extractorInput);
        Assertions.checkNotNull(wavHeader);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.id != Util.getIntegerCodeForString(DataSchemeDataSource.SCHEME_DATA)) {
            Log.w(TAG, "Ignoring unknown WAV chunk: " + peek.id);
            long j8 = peek.size + 8;
            if (peek.id == Util.getIntegerCodeForString("RIFF")) {
                j8 = 12;
            }
            if (j8 <= 2147483647L) {
                extractorInput.skipFully((int) j8);
                peek = ChunkHeader.peek(extractorInput, parsableByteArray);
            } else {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + peek.id);
            }
        }
        extractorInput.skipFully(8);
        wavHeader.setDataBounds(extractorInput.getPosition(), peek.size);
    }
}
