package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataSource dataSource;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    public DefaultExtractorInput(DataSource dataSource, long j8, long j9) {
        this.dataSource = dataSource;
        this.position = j8;
        this.streamLength = j9;
    }

    private void commitBytesRead(int i8) {
        if (i8 != -1) {
            this.position += i8;
        }
    }

    private void ensureSpaceForPeek(int i8) {
        int i9 = this.peekBufferPosition + i8;
        byte[] bArr = this.peekBuffer;
        if (i9 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i9, i9 + 524288));
        }
    }

    private int readFromDataSource(byte[] bArr, int i8, int i9, int i10, boolean z8) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.dataSource.read(bArr, i8 + i10, i9 - i10);
            if (read == -1) {
                if (i10 == 0 && z8) {
                    return -1;
                }
                throw new EOFException();
            }
            return i10 + read;
        }
        throw new InterruptedException();
    }

    private int readFromPeekBuffer(byte[] bArr, int i8, int i9) {
        int i10 = this.peekBufferLength;
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, i9);
        System.arraycopy(this.peekBuffer, 0, bArr, i8, min);
        updatePeekBuffer(min);
        return min;
    }

    private int skipFromPeekBuffer(int i8) {
        int min = Math.min(this.peekBufferLength, i8);
        updatePeekBuffer(min);
        return min;
    }

    private void updatePeekBuffer(int i8) {
        byte[] bArr;
        int i9 = this.peekBufferLength - i8;
        this.peekBufferLength = i9;
        this.peekBufferPosition = 0;
        byte[] bArr2 = this.peekBuffer;
        if (i9 < bArr2.length - 524288) {
            bArr = new byte[65536 + i9];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i8, bArr, 0, i9);
        this.peekBuffer = bArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean advancePeekPosition(int i8, boolean z8) throws IOException, InterruptedException {
        ensureSpaceForPeek(i8);
        int min = Math.min(this.peekBufferLength - this.peekBufferPosition, i8);
        while (min < i8) {
            min = readFromDataSource(this.peekBuffer, this.peekBufferPosition, i8, min, z8);
            if (min == -1) {
                return false;
            }
        }
        int i9 = this.peekBufferPosition + i8;
        this.peekBufferPosition = i9;
        this.peekBufferLength = Math.max(this.peekBufferLength, i9);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getLength() {
        return this.streamLength;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final long getPosition() {
        return this.position;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i8, int i9, boolean z8) throws IOException, InterruptedException {
        if (!advancePeekPosition(i9, z8)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i9, bArr, i8, i9);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final int read(byte[] bArr, int i8, int i9) throws IOException, InterruptedException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i8, i9);
        if (readFromPeekBuffer == 0) {
            readFromPeekBuffer = readFromDataSource(bArr, i8, i9, 0, true);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i8, int i9, boolean z8) throws IOException, InterruptedException {
        int readFromPeekBuffer = readFromPeekBuffer(bArr, i8, i9);
        while (readFromPeekBuffer < i9 && readFromPeekBuffer != -1) {
            readFromPeekBuffer = readFromDataSource(bArr, i8, i9, readFromPeekBuffer, z8);
        }
        commitBytesRead(readFromPeekBuffer);
        return readFromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final <E extends Throwable> void setRetryPosition(long j8, E e8) throws Throwable {
        boolean z8;
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.position = j8;
        throw e8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final int skip(int i8) throws IOException, InterruptedException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i8);
        if (skipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            skipFromPeekBuffer = readFromDataSource(bArr, 0, Math.min(i8, bArr.length), 0, true);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final boolean skipFully(int i8, boolean z8) throws IOException, InterruptedException {
        int skipFromPeekBuffer = skipFromPeekBuffer(i8);
        while (skipFromPeekBuffer < i8 && skipFromPeekBuffer != -1) {
            skipFromPeekBuffer = readFromDataSource(this.scratchSpace, -skipFromPeekBuffer, Math.min(i8, this.scratchSpace.length + skipFromPeekBuffer), skipFromPeekBuffer, z8);
        }
        commitBytesRead(skipFromPeekBuffer);
        return skipFromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void peekFully(byte[] bArr, int i8, int i9) throws IOException, InterruptedException {
        peekFully(bArr, i8, i9, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i8, int i9) throws IOException, InterruptedException {
        readFully(bArr, i8, i9, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void advancePeekPosition(int i8) throws IOException, InterruptedException {
        advancePeekPosition(i8, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public final void skipFully(int i8) throws IOException, InterruptedException {
        skipFully(i8, false);
    }
}
