package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    public final Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) throws IOException, InterruptedException {
        Metadata metadata = null;
        int i8 = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.data, 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
                    break;
                }
                this.scratch.skipBytes(3);
                int readSynchSafeInt = this.scratch.readSynchSafeInt();
                int i9 = readSynchSafeInt + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.scratch.data, 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, readSynchSafeInt);
                    metadata = new Id3Decoder(framePredicate).decode(bArr, i9);
                } else {
                    extractorInput.advancePeekPosition(readSynchSafeInt);
                }
                i8 += i9;
            } catch (EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i8);
        return metadata;
    }
}
