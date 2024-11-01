package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.v;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class o extends v {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.v
    public final r<String> a(com.mbridge.msdk.e.a.m mVar) {
        String str;
        try {
            str = new String(mVar.f20053b, com.mbridge.msdk.e.a.a.e.a(mVar.f20054c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(mVar.f20053b);
        }
        return r.a(str, com.mbridge.msdk.e.a.a.e.a(mVar));
    }
}
