package com.mbridge.msdk.foundation.same.net.c;

import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class a extends f<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20843a = "a";

    public abstract void a(String str);

    public abstract void b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f20843a, "errorCode = " + aVar.f20840a);
        a(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<String> kVar) {
        if (kVar != null) {
            b(kVar.f21000c);
        }
    }
}
