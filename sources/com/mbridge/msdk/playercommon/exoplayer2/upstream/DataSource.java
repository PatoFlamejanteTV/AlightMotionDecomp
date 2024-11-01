package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface DataSource {

    /* loaded from: classes4.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    void close() throws IOException;

    Uri getUri();

    long open(DataSpec dataSpec) throws IOException;

    int read(byte[] bArr, int i8, int i9) throws IOException;
}
