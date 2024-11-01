package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AesCipherDataSource implements DataSource {
    private AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final DataSource upstream;

    public AesCipherDataSource(byte[] bArr, DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.cipher = null;
        this.upstream.close();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        long open = this.upstream.open(dataSpec);
        this.cipher = new AesFlushingCipher(2, this.secretKey, CryptoUtil.getFNV64Hash(dataSpec.key), dataSpec.absoluteStreamPosition);
        return open;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i8, int i9) throws IOException {
        if (i9 == 0) {
            return 0;
        }
        int read = this.upstream.read(bArr, i8, i9);
        if (read == -1) {
            return -1;
        }
        this.cipher.updateInPlace(bArr, i8, read);
        return read;
    }
}
