package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private final ParsableByteArray packetArray = new ParsableByteArray(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int currentSegmentIndex = -1;

    private int calculatePacketSize(int i8) {
        int i9;
        int i10 = 0;
        this.segmentCount = 0;
        do {
            int i11 = this.segmentCount;
            int i12 = i8 + i11;
            OggPageHeader oggPageHeader = this.pageHeader;
            if (i12 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.segmentCount = i11 + 1;
            i9 = iArr[i11 + i8];
            i10 += i9;
        } while (i9 == 255);
        return i10;
    }

    public final OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public final ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public final boolean populate(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z8;
        boolean z9;
        int i8;
        if (extractorInput != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset();
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.pageHeader;
                int i9 = oggPageHeader.headerSize;
                if ((oggPageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    i9 += calculatePacketSize(0);
                    i8 = this.segmentCount;
                } else {
                    i8 = 0;
                }
                extractorInput.skipFully(i9);
                this.currentSegmentIndex = i8;
            }
            int calculatePacketSize = calculatePacketSize(this.currentSegmentIndex);
            int i10 = this.currentSegmentIndex + this.segmentCount;
            if (calculatePacketSize > 0) {
                if (this.packetArray.capacity() < this.packetArray.limit() + calculatePacketSize) {
                    ParsableByteArray parsableByteArray = this.packetArray;
                    parsableByteArray.data = Arrays.copyOf(parsableByteArray.data, parsableByteArray.limit() + calculatePacketSize);
                }
                ParsableByteArray parsableByteArray2 = this.packetArray;
                extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), calculatePacketSize);
                ParsableByteArray parsableByteArray3 = this.packetArray;
                parsableByteArray3.setLimit(parsableByteArray3.limit() + calculatePacketSize);
                if (this.pageHeader.laces[i10 - 1] != 255) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.populated = z9;
            }
            if (i10 == this.pageHeader.pageSegmentCount) {
                i10 = -1;
            }
            this.currentSegmentIndex = i10;
        }
        return true;
    }

    public final void reset() {
        this.pageHeader.reset();
        this.packetArray.reset();
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public final void trimPayload() {
        ParsableByteArray parsableByteArray = this.packetArray;
        byte[] bArr = parsableByteArray.data;
        if (bArr.length == 65025) {
            return;
        }
        parsableByteArray.data = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, parsableByteArray.limit()));
    }
}
