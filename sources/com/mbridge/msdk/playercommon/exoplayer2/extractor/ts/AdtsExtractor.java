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
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.AdtsExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new AdtsExtractor()};
        }
    };
    private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
    private static final int MAX_PACKET_SIZE = 200;
    private static final int MAX_SNIFF_BYTES = 8192;
    private final long firstSampleTimestampUs;
    private final ParsableByteArray packetBuffer;
    private final AdtsReader reader;
    private boolean startedPacket;

    public AdtsExtractor() {
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
        int read = extractorInput.read(this.packetBuffer.data, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(read);
        if (!this.startedPacket) {
            this.reader.packetStarted(this.firstSampleTimestampUs, true);
            this.startedPacket = true;
        }
        this.reader.consume(this.packetBuffer);
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:            r11.resetPeekPosition();        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:            if ((r5 - r4) < 8192) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:            return false;     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r10 = this;
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r0 = new com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray
            r1 = 10
            r0.<init>(r1)
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray r2 = new com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray
            byte[] r3 = r0.data
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L10:
            byte[] r5 = r0.data
            r11.peekFully(r5, r3, r1)
            r0.setPosition(r3)
            int r5 = r0.readUnsignedInt24()
            int r6 = com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.AdtsExtractor.ID3_TAG
            if (r5 == r6) goto L74
            r11.resetPeekPosition()
            r11.advancePeekPosition(r4)
            r5 = r4
        L27:
            r1 = 0
            r6 = 0
        L29:
            byte[] r7 = r0.data
            r8 = 2
            r11.peekFully(r7, r3, r8)
            r0.setPosition(r3)
            int r7 = r0.readUnsignedShort()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L4f
            r11.resetPeekPosition()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 < r6) goto L4b
            return r3
        L4b:
            r11.advancePeekPosition(r5)
            goto L27
        L4f:
            r7 = 1
            int r1 = r1 + r7
            r8 = 4
            if (r1 < r8) goto L59
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L59
            return r7
        L59:
            byte[] r7 = r0.data
            r11.peekFully(r7, r3, r8)
            r7 = 14
            r2.setPosition(r7)
            r7 = 13
            int r7 = r2.readBits(r7)
            r8 = 6
            if (r7 > r8) goto L6d
            return r3
        L6d:
            int r8 = r7 + (-6)
            r11.advancePeekPosition(r8)
            int r6 = r6 + r7
            goto L29
        L74:
            r5 = 3
            r0.skipBytes(r5)
            int r5 = r0.readSynchSafeInt()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.advancePeekPosition(r5)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.AdtsExtractor.sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):boolean");
    }

    public AdtsExtractor(long j8) {
        this.firstSampleTimestampUs = j8;
        this.reader = new AdtsReader(true);
        this.packetBuffer = new ParsableByteArray(200);
    }
}
