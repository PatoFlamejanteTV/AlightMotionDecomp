package com.mbridge.msdk.mbbanner.common.f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.d.b;
import com.mbridge.msdk.foundation.same.net.f;
import com.mbridge.msdk.foundation.same.net.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends f<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21678a = "a";

    /* renamed from: b, reason: collision with root package name */
    private String f21679b = "";

    public abstract void a(int i8, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        ad.c(f21678a, "onFailed errorCode = " + aVar.f20840a);
        a(aVar.f20840a, com.mbridge.msdk.foundation.same.net.g.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<JSONObject> kVar) {
        super.onSuccess(kVar);
        List<b> list = kVar.f20999b.f20895b;
        final JSONObject jSONObject = kVar.f21000c;
        ad.c(f21678a, "parseLoad content = " + jSONObject);
        final int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            final String optString = jSONObject.optString("version");
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    final CampaignUnit parseCampaignUnit;
                    if ("v5".equals(optString)) {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), a.this.f21679b);
                    } else {
                        parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA), a.this.f21679b);
                    }
                    com.mbridge.msdk.foundation.same.f.b.e().post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.f.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            CampaignUnit campaignUnit = parseCampaignUnit;
                            if (campaignUnit != null && campaignUnit.getAds() != null && parseCampaignUnit.getAds().size() > 0) {
                                a.this.a(parseCampaignUnit);
                                if (!TextUtils.isEmpty(a.this.f21679b)) {
                                    a.this.saveHbState(1);
                                }
                                a.this.saveRequestTime(parseCampaignUnit.getAds().size());
                                return;
                            }
                            CampaignUnit campaignUnit2 = parseCampaignUnit;
                            if (campaignUnit2 != null) {
                                str = campaignUnit2.getMsg();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.this.a(optInt, str);
                        }
                    });
                }
            });
            return;
        }
        a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    public final void a(String str) {
        this.f21679b = str;
    }
}
