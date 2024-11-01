package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class c extends e<JSONArray> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20882c = "c";

    public c(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONArray> eVar) {
        super(i8, str, str2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.foundation.same.net.i
    public final k<JSONArray> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            return k.a(new JSONArray(new String(cVar.f20894a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.f20895b))), cVar);
        } catch (UnsupportedEncodingException e8) {
            ad.b(f20882c, e8.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        } catch (JSONException e9) {
            ad.b(f20882c, e9.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }
}
