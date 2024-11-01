package com.mbridge.msdk.thrid.okhttp.internal.cache2;

import com.mbridge.msdk.thrid.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j8, Buffer buffer, long j9) throws IOException {
        if (j9 >= 0) {
            while (j9 > 0) {
                long transferTo = this.fileChannel.transferTo(j8, j9, buffer);
                j8 += transferTo;
                j9 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j8, Buffer buffer, long j9) throws IOException {
        if (j9 >= 0 && j9 <= buffer.size()) {
            long j10 = j8;
            long j11 = j9;
            while (j11 > 0) {
                long transferFrom = this.fileChannel.transferFrom(buffer, j10, j11);
                j10 += transferFrom;
                j11 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
