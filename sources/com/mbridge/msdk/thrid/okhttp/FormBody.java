package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.BufferedSink;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.get(ShareTarget.ENCODING_TYPE_URL_ENCODED);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null);
        }

        public Builder add(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                    this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.charset));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        public Builder addEncoded(String str, String str2) {
            if (str != null) {
                if (str2 != null) {
                    this.names.add(HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                    this.values.add(HttpUrl.canonicalize(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.charset));
                    return this;
                }
                throw new NullPointerException("value == null");
            }
            throw new NullPointerException("name == null");
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList();
            this.values = new ArrayList();
            this.charset = charset;
        }
    }

    FormBody(List<String> list, List<String> list2) {
        this.encodedNames = Util.immutableList(list);
        this.encodedValues = Util.immutableList(list2);
    }

    private long writeOrCountBytes(BufferedSink bufferedSink, boolean z8) {
        Buffer buffer;
        if (z8) {
            buffer = new Buffer();
        } else {
            buffer = bufferedSink.buffer();
        }
        int size = this.encodedNames.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.encodedNames.get(i8));
            buffer.writeByte(61);
            buffer.writeUtf8(this.encodedValues.get(i8));
        }
        if (z8) {
            long size2 = buffer.size();
            buffer.clear();
            return size2;
        }
        return 0L;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public String encodedName(int i8) {
        return this.encodedNames.get(i8);
    }

    public String encodedValue(int i8) {
        return this.encodedValues.get(i8);
    }

    public String name(int i8) {
        return HttpUrl.percentDecode(encodedName(i8), true);
    }

    public int size() {
        return this.encodedNames.size();
    }

    public String value(int i8) {
        return HttpUrl.percentDecode(encodedValue(i8), true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        writeOrCountBytes(bufferedSink, false);
    }
}
