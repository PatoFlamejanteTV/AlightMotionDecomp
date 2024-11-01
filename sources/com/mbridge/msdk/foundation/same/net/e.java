package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes4.dex */
public interface e<T> {
    void onCancel();

    void onError(com.mbridge.msdk.foundation.same.net.b.a aVar);

    void onFinish();

    void onNetworking();

    void onPreExecute();

    void onProgressChange(long j8, long j9);

    void onRetry();

    void onSuccess(k<T> kVar);
}
