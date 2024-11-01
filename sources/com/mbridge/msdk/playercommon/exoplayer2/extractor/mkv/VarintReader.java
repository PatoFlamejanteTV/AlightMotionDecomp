package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes4.dex */
final class VarintReader {
    private static final int STATE_BEGIN_READING = 0;
    private static final int STATE_READ_CONTENTS = 1;
    private static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    private int length;
    private final byte[] scratch = new byte[8];
    private int state;

    public static long assembleVarint(byte[] bArr, int i8, boolean z8) {
        long j8 = bArr[0] & 255;
        if (z8) {
            j8 &= ~VARINT_LENGTH_MASKS[i8 - 1];
        }
        for (int i9 = 1; i9 < i8; i9++) {
            j8 = (j8 << 8) | (bArr[i9] & 255);
        }
        return j8;
    }

    public static int parseUnsignedVarintLength(int i8) {
        int i9 = 0;
        while (true) {
            long[] jArr = VARINT_LENGTH_MASKS;
            if (i9 < jArr.length) {
                if ((jArr[i9] & i8) != 0) {
                    return i9 + 1;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    public final int getLastLength() {
        return this.length;
    }

    public final long readUnsignedVarint(ExtractorInput extractorInput, boolean z8, boolean z9, int i8) throws IOException, InterruptedException {
        if (this.state == 0) {
            if (!extractorInput.readFully(this.scratch, 0, 1, z8)) {
                return -1L;
            }
            int parseUnsignedVarintLength = parseUnsignedVarintLength(this.scratch[0] & 255);
            this.length = parseUnsignedVarintLength;
            if (parseUnsignedVarintLength != -1) {
                this.state = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i9 = this.length;
        if (i9 > i8) {
            this.state = 0;
            return -2L;
        }
        if (i9 != 1) {
            extractorInput.readFully(this.scratch, 1, i9 - 1);
        }
        this.state = 0;
        return assembleVarint(this.scratch, this.length, z9);
    }

    public final void reset() {
        this.state = 0;
        this.length = 0;
    }
}
