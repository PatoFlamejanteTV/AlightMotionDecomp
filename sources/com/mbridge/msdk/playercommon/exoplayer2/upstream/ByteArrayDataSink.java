package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream stream;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void close() throws IOException {
        this.stream.close();
    }

    public final byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void open(DataSpec dataSpec) throws IOException {
        boolean z8;
        long j8 = dataSpec.length;
        if (j8 == -1) {
            this.stream = new ByteArrayOutputStream();
            return;
        }
        if (j8 <= 2147483647L) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.stream = new ByteArrayOutputStream((int) dataSpec.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i8, int i9) throws IOException {
        this.stream.write(bArr, i8, i9);
    }
}
