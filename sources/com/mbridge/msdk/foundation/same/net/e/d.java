package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d extends e<JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20883c = "d";

    public d(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        super(i8, str, str2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.foundation.same.net.i
    public final k<JSONObject> a(com.mbridge.msdk.foundation.same.net.f.c cVar) {
        try {
            String str = new String(cVar.f20894a, com.mbridge.msdk.foundation.same.net.g.b.a(cVar.f20895b));
            if (cVar.f20897d == 204) {
                return k.a(new JSONObject(), cVar);
            }
            return k.a(new JSONObject(str), cVar);
        } catch (UnsupportedEncodingException e8) {
            ad.b(f20883c, e8.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        } catch (JSONException e9) {
            ad.b(f20883c, e9.getMessage());
            return k.a(new com.mbridge.msdk.foundation.same.net.b.a(8, cVar));
        }
    }

    public d(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar, boolean z8) {
        super(i8, str, str2, eVar, z8);
    }
}
