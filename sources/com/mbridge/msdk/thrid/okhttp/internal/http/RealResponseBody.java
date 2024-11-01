package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import com.mbridge.msdk.thrid.okio.BufferedSource;

/* loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(String str, long j8, BufferedSource bufferedSource) {
        this.contentTypeString = str;
        this.contentLength = j8;
        this.source = bufferedSource;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
