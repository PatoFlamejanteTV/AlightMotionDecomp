package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface DataSink {

    /* loaded from: classes4.dex */
    public interface Factory {
        DataSink createDataSink();
    }

    void close() throws IOException;

    void open(DataSpec dataSpec) throws IOException;

    void write(byte[] bArr, int i8, int i9) throws IOException;
}
