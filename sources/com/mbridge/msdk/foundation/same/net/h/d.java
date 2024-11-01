package com.mbridge.msdk.foundation.same.net.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20964a = "d";

    private void a(k<JSONObject> kVar) {
        JSONObject jSONObject = kVar.f21000c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -9999);
        if (optInt == -9999) {
            a(kVar.f21000c);
            return;
        }
        if (optInt != 1 && optInt != 200) {
            String optString = kVar.f21000c.optString(NotificationCompat.CATEGORY_MESSAGE);
            if (TextUtils.isEmpty(optString)) {
                optString = "error message is null";
            }
            a(optString);
            return;
        }
        a(kVar.f21000c.optJSONObject(DataSchemeDataSource.SCHEME_DATA));
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.b(f20964a, "errorCode = " + aVar.f20840a);
        a(com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        if (kVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(kVar);
        com.mbridge.msdk.foundation.same.net.f.c cVar = kVar.f20999b;
        if (cVar == null) {
            a(kVar);
        } else if (cVar.f20897d == 204) {
            a(new JSONObject());
        } else {
            a(kVar);
        }
    }
}
