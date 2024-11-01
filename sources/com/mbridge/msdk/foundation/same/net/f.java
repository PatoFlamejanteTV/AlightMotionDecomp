package com.mbridge.msdk.foundation.same.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f<T> implements e<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.a.b mRequestTime = null;

    public void calcRequestTime(long j8) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = new com.mbridge.msdk.foundation.same.report.a.b(new com.mbridge.msdk.foundation.entity.h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j8 - this.startTime) + "");
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onCancel() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onFinish() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onNetworking() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onProgressChange(long j8, long j9) {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.e
    public void onSuccess(k<T> kVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.m().k() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            com.mbridge.msdk.c.h.a();
            ad.b("Listener", kVar.f21000c + " " + str);
            T t8 = kVar.f21000c;
            if (t8 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.g.c.a().a(str, ((JSONObject) t8).optInt(NotificationCompat.CATEGORY_STATUS), ((JSONObject) kVar.f21000c).toString(), System.currentTimeMillis());
            }
            if (kVar.f21000c instanceof String) {
                com.mbridge.msdk.foundation.same.net.g.c.a().a(str, new JSONObject((String) kVar.f21000c).optInt(NotificationCompat.CATEGORY_STATUS), (String) kVar.f21000c, System.currentTimeMillis());
            }
        } catch (Exception e8) {
            ad.b("Listener", e8.getMessage());
        }
    }

    public void saveHbState(int i8) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i8);
        }
    }

    public void saveRequestTime(int i8) {
        com.mbridge.msdk.foundation.same.report.a.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i8);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i8) {
        this.adType = i8;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }
}
