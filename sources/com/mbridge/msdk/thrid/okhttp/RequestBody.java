package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Okio;
import com.mbridge.msdk.thrid.okio.Source;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class RequestBody {
    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static RequestBody create(final MediaType mediaType, final ByteString byteString) {
        return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.1
            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public long contentLength() throws IOException {
                return byteString.size();
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i8, final int i9) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i8, i9);
            return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.2
                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public long contentLength() {
                    return i9;
                }

                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    bufferedSink.write(bArr, i8, i9);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: com.mbridge.msdk.thrid.okhttp.RequestBody.3
                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    Source source = null;
                    try {
                        source = Okio.source(file);
                        bufferedSink.writeAll(source);
                    } finally {
                        Util.closeQuietly(source);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
