package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Ac3Extractor implements Extractor {
    private static final int AC3_SYNC_WORD = 2935;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.Ac3Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new Ac3Extractor()};
        }
    };
    private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int MAX_SYNC_FRAME_SIZE = 2786;
    private final long firstSampleTimestampUs;
    private final Ac3Reader reader;
    private final ParsableByteArray sampleData;
    private boolean startedPacket;

    public Ac3Extractor() {
        this(0L);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.reader.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        int read = extractorInput.read(this.sampleData.data, 0, MAX_SYNC_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        this.sampleData.setPosition(0);
        this.sampleData.setLimit(read);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, true);
            this.startedPacket = true;
        }
        this.reader.consume(this.sampleData);
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j8, long j9) {
        this.startedPacket = false;
        this.reader.seek();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:            r8.resetPeekPosition();        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:            if ((r4 - r3) < 8192) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:            return false;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r0 = new com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.data
            r8.peekFully(r4, r2, r1)
            r0.setPosition(r2)
            int r4 = r0.readUnsignedInt24()
            int r5 = com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.Ac3Extractor.ID3_TAG
            if (r4 == r5) goto L58
            r8.resetPeekPosition()
            r8.advancePeekPosition(r3)
            r4 = r3
        L20:
            r1 = 0
        L21:
            byte[] r5 = r0.data
            r6 = 5
            r8.peekFully(r5, r2, r6)
            r0.setPosition(r2)
            int r5 = r0.readUnsignedShort()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L42
            r8.resetPeekPosition()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L3e
            return r2
        L3e:
            r8.advancePeekPosition(r4)
            goto L20
        L42:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L48
            return r5
        L48:
            byte[] r5 = r0.data
            int r5 = com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util.parseAc3SyncframeSize(r5)
            r6 = -1
            if (r5 != r6) goto L52
            return r2
        L52:
            int r5 = r5 + (-5)
            r8.advancePeekPosition(r5)
            goto L21
        L58:
            r4 = 3
            r0.skipBytes(r4)
            int r4 = r0.readSynchSafeInt()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.advancePeekPosition(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.Ac3Extractor.sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):boolean");
    }

    public Ac3Extractor(long j8) {
        this.firstSampleTimestampUs = j8;
        this.reader = new Ac3Reader();
        this.sampleData = new ParsableByteArray(MAX_SYNC_FRAME_SIZE);
    }
}
