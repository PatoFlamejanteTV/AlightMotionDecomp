package com.mbridge.msdk.foundation.same.report.e;

import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class b extends f<String> {
    private static final String TAG = "b";

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(TAG, "errorCode = " + aVar.f20840a);
        onFailed(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    public abstract void onFailed(String str);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<String> kVar) {
        if (kVar != null) {
            onSuccess(kVar.f21000c);
        }
    }

    public abstract void onSuccess(String str);
}
