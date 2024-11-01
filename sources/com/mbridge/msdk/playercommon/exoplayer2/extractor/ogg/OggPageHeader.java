package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes4.dex */
final class OggPageHeader {
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    private static final int TYPE_OGGS = Util.getIntegerCodeForString("OggS");
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[255];
    private final ParsableByteArray scratch = new ParsableByteArray(255);

    public final boolean populate(ExtractorInput extractorInput, boolean z8) throws IOException, InterruptedException {
        this.scratch.reset();
        reset();
        if ((extractorInput.getLength() != -1 && extractorInput.getLength() - extractorInput.getPeekPosition() < 27) || !extractorInput.peekFully(this.scratch.data, 0, 27, true)) {
            if (z8) {
                return false;
            }
            throw new EOFException();
        }
        if (this.scratch.readUnsignedInt() != TYPE_OGGS) {
            if (z8) {
                return false;
            }
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
        int readUnsignedByte = this.scratch.readUnsignedByte();
        this.revision = readUnsignedByte;
        if (readUnsignedByte != 0) {
            if (z8) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.type = this.scratch.readUnsignedByte();
        this.granulePosition = this.scratch.readLittleEndianLong();
        this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
        int readUnsignedByte2 = this.scratch.readUnsignedByte();
        this.pageSegmentCount = readUnsignedByte2;
        this.headerSize = readUnsignedByte2 + 27;
        this.scratch.reset();
        extractorInput.peekFully(this.scratch.data, 0, this.pageSegmentCount);
        for (int i8 = 0; i8 < this.pageSegmentCount; i8++) {
            this.laces[i8] = this.scratch.readUnsignedByte();
            this.bodySize += this.laces[i8];
        }
        return true;
    }

    public final void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }
}
