package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes4.dex */
public final class DataSchemeDataSource implements DataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRead;
    private byte[] data;
    private DataSpec dataSpec;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.dataSpec = null;
        this.data = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if (SCHEME_DATA.equals(scheme)) {
            String[] split = Util.split(uri.getSchemeSpecificPart(), ",");
            if (split.length == 2) {
                String str = split[1];
                if (split[0].contains(";base64")) {
                    try {
                        this.data = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e8) {
                        throw new ParserException("Error while parsing Base64 encoded string: " + str, e8);
                    }
                } else {
                    this.data = URLDecoder.decode(str, C.ASCII_NAME).getBytes();
                }
                return this.data.length;
            }
            throw new ParserException("Unexpected URI format: " + uri);
        }
        throw new ParserException("Unsupported scheme: " + scheme);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        int length = this.data.length - this.bytesRead;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i9, length);
        System.arraycopy(this.data, this.bytesRead, bArr, i8, min);
        this.bytesRead += min;
        return min;
    }
}
