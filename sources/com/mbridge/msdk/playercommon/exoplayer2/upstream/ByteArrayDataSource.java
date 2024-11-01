package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSource implements DataSource {
    private int bytesRemaining;
    private final byte[] data;
    private int readPosition;
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        boolean z8;
        Assertions.checkNotNull(bArr);
        if (bArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.data = bArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.uri = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        long j8 = dataSpec.position;
        int i8 = (int) j8;
        this.readPosition = i8;
        long j9 = dataSpec.length;
        if (j9 == -1) {
            j9 = this.data.length - j8;
        }
        int i9 = (int) j9;
        this.bytesRemaining = i9;
        if (i9 > 0 && i8 + i9 <= this.data.length) {
            return i9;
        }
        throw new IOException("Unsatisfiable range: [" + this.readPosition + ", " + dataSpec.length + "], length: " + this.data.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        int i10 = this.bytesRemaining;
        if (i10 == 0) {
            return -1;
        }
        int min = Math.min(i9, i10);
        System.arraycopy(this.data, this.readPosition, bArr, i8, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        return min;
    }
}
