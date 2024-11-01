package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;

/* loaded from: classes4.dex */
public interface RequestBuilder<T> {
    DownloadRequest<T> build();

    RequestBuilder<T> with(String str, String str2);

    RequestBuilder<T> withConnectTimeout(long j8);

    RequestBuilder<T> withDirectoryPathExternal(String str);

    RequestBuilder<T> withDirectoryPathInternal(String str);

    RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority);

    RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener);

    RequestBuilder<T> withHeader(String str, String str2);

    RequestBuilder<T> withHttpRetryCounter(int i8);

    RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener);

    RequestBuilder<T> withReadTimeout(long j8);

    RequestBuilder<T> withTimeout(long j8);

    RequestBuilder<T> withUserAgent(String str);

    RequestBuilder<T> withWriteTimeout(long j8);
}
