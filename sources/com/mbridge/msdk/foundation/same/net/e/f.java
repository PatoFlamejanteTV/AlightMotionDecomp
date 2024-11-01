package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class f extends i<String> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20886c = "f";

    /* renamed from: d, reason: collision with root package name */
    private String f20887d;

    public f(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<String> eVar) {
        super(i8, str, eVar);
        this.f20887d = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.foundation.same.net.i
    public final k<String> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            return k.a(new String(cVar.f20894a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.f20895b)), cVar);
        } catch (UnsupportedEncodingException e8) {
            ad.b(f20886c, e8.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    public final byte[] h() {
        try {
            String str = this.f20887d;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            ad.b(f20886c, "Unsupported Encoding while trying to get the bytes of " + this.f20887d + " using utf-8");
            return null;
        }
    }
}
