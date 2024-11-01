package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface HttpDataSource extends DataSource {
    public static final Predicate<String> REJECT_PAYWALL_TYPES = new Predicate<String>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.util.Predicate
        public boolean evaluate(String str) {
            String lowerInvariant = Util.toLowerInvariant(str);
            return (TextUtils.isEmpty(lowerInvariant) || (lowerInvariant.contains(MimeTypes.BASE_TYPE_TEXT) && !lowerInvariant.contains(MimeTypes.TEXT_VTT)) || lowerInvariant.contains("html") || lowerInvariant.contains("xml")) ? false : true;
        }
    };

    /* loaded from: classes4.dex */
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void clearAllDefaultRequestProperties() {
            this.defaultRequestProperties.clear();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void clearDefaultRequestProperty(String str) {
            this.defaultRequestProperties.remove(str);
        }

        protected abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final RequestProperties getDefaultRequestProperties() {
            return this.defaultRequestProperties;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory
        public final void setDefaultRequestProperty(String str, String str2) {
            this.defaultRequestProperties.set(str, str2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.Factory, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    /* loaded from: classes4.dex */
    public interface Factory extends DataSource.Factory {
        void clearAllDefaultRequestProperties();

        void clearDefaultRequestProperty(String str);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        /* bridge */ /* synthetic */ DataSource createDataSource();

        @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        RequestProperties getDefaultRequestProperties();

        void setDefaultRequestProperty(String str, String str2);
    }

    /* loaded from: classes4.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 1);
            this.contentType = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i8, Map<String, List<String>> map, DataSpec dataSpec) {
            super("Response code: " + i8, dataSpec, 1);
            this.responseCode = i8;
            this.headerFields = map;
        }
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    void close() throws HttpDataSourceException;

    Map<String, List<String>> getResponseHeaders();

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    int read(byte[] bArr, int i8, int i9) throws HttpDataSourceException;

    void setRequestProperty(String str, String str2);

    /* loaded from: classes4.dex */
    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        /* loaded from: classes4.dex */
        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i8) {
            this.dataSpec = dataSpec;
            this.type = i8;
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i8) {
            super(str);
            this.dataSpec = dataSpec;
            this.type = i8;
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i8) {
            super(iOException);
            this.dataSpec = dataSpec;
            this.type = i8;
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i8) {
            super(str, iOException);
            this.dataSpec = dataSpec;
            this.type = i8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        private Map<String, String> requestPropertiesSnapshot;

        public final synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public final synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public final synchronized Map<String, String> getSnapshot() {
            try {
                if (this.requestPropertiesSnapshot == null) {
                    this.requestPropertiesSnapshot = DesugarCollections.unmodifiableMap(new HashMap(this.requestProperties));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.requestPropertiesSnapshot;
        }

        public final synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public final synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public final synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
