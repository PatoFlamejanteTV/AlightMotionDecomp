package com.mbridge.msdk.video.dynview.f.a;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.d.b;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.f.c;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private int f23287a;

    /* renamed from: b, reason: collision with root package name */
    private String f23288b;

    public abstract void a(int i8, String str);

    public abstract void a(List<b> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        a(aVar.f20840a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        c cVar;
        CampaignUnit parseCampaignUnit;
        String str;
        super.onSuccess(kVar);
        if (kVar != null && (cVar = kVar.f20999b) != null && this.f23287a == 0) {
            List<b> list = cVar.f20895b;
            JSONObject jSONObject = kVar.f21000c;
            int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
            if (1 == optInt) {
                calcRequestTime(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f23288b);
                } else {
                    parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), this.f23288b);
                }
                if (parseCampaignUnit != null && parseCampaignUnit.getAds() != null && parseCampaignUnit.getAds().size() > 0) {
                    a(list, parseCampaignUnit);
                    saveRequestTime(parseCampaignUnit.getAds().size());
                    return;
                }
                if (parseCampaignUnit != null) {
                    str = parseCampaignUnit.getMsg();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(optInt, str);
                return;
            }
            a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }
}
