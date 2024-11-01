package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j8) throws IOException, IllegalAccessException;

    void setLength(long j8) throws IOException, IllegalAccessException;

    void write(byte[] bArr, int i8, int i9) throws IOException;
}
