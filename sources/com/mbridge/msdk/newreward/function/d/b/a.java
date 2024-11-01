package com.mbridge.msdk.newreward.function.d.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.e.a.o;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.u;
import com.mbridge.msdk.e.a.v;
import com.mbridge.msdk.e.a.y;
import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a extends p<JSONObject> implements r.a {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.newreward.function.d.a.b f22308a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f22309b;

    /* renamed from: c, reason: collision with root package name */
    protected int f22310c;

    /* renamed from: d, reason: collision with root package name */
    protected String f22311d;

    /* renamed from: e, reason: collision with root package name */
    protected String f22312e;

    /* renamed from: f, reason: collision with root package name */
    protected String f22313f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f22314g;

    /* renamed from: h, reason: collision with root package name */
    private c f22315h;

    /* renamed from: i, reason: collision with root package name */
    private v f22316i;

    /* renamed from: j, reason: collision with root package name */
    private long f22317j;

    /* renamed from: k, reason: collision with root package name */
    private long f22318k;

    /* renamed from: l, reason: collision with root package name */
    private String f22319l;

    /* renamed from: m, reason: collision with root package name */
    private String f22320m;

    /* renamed from: n, reason: collision with root package name */
    private String f22321n;

    /* renamed from: o, reason: collision with root package name */
    private String f22322o;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, String> f22323p;

    /* renamed from: com.mbridge.msdk.newreward.function.d.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0418a implements a.InterfaceC0414a {

        /* renamed from: a, reason: collision with root package name */
        private final a f22324a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f22325b;

        public C0418a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f22324a = aVar;
            this.f22325b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
        public final void a(String str, long j8) {
            ad.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j8);
            f.a();
            a aVar = this.f22324a;
            if (aVar != null && !aVar.m()) {
                aVar.c();
            }
            a.a(this.f22324a, this.f22325b, j8);
        }
    }

    public a(int i8, String str, String str2, String str3, long j8, String str4) {
        super(0, str4);
        this.f22309b = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f22310c = i8;
        this.f22311d = str;
        this.f22312e = str2;
        this.f22313f = str3;
        this.f22319l = UUID.randomUUID().toString();
        this.f22317j = SystemClock.elapsedRealtime();
        this.f22322o = str4;
        this.f22308a = new com.mbridge.msdk.newreward.function.d.a.b(this.f22310c, this.f22311d, this.f22312e, this.f22313f);
        a((r.a) this);
        c(true);
        b(true);
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22319l, j8 <= 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j8, new C0418a(this, this.f22308a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final /* synthetic */ void a(JSONObject jSONObject) {
        c cVar;
        JSONObject jSONObject2 = jSONObject;
        if (MBridgeConstans.DEBUG) {
            ad.a("BaseCampaignRequest", "deliverResponse: " + jSONObject2);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22319l);
        int optInt = jSONObject2.optInt(NotificationCompat.CATEGORY_STATUS);
        if (optInt == 1) {
            JSONObject optJSONObject = jSONObject2.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                CampaignUnit parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject, this.f22320m);
                this.f22308a.a(optJSONObject);
                this.f22308a.f(optJSONObject.optString("c"));
                this.f22308a.e(optJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.f22308a.d(optJSONObject.optString("a"));
                this.f22308a.b(optJSONObject.optInt("template"));
                this.f22308a.a(System.currentTimeMillis());
                this.f22308a.c(this.f22320m);
                this.f22308a.g(optJSONObject.optString(com.mbridge.msdk.foundation.same.a.f20647S));
                this.f22308a.a(1);
                this.f22308a.c(0);
                this.f22308a.a(parseCampaignUnit.getRequestId());
                this.f22308a.a(parseCampaignUnit.getEcppv());
                this.f22308a.i(this.f22322o);
                ArrayList arrayList = new ArrayList();
                ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                for (CampaignEx campaignEx : ads) {
                    campaignEx.setRequestId(this.f22308a.d());
                    campaignEx.setLocalRequestId(this.f22321n);
                    com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(this.f22308a);
                    aVar.c(campaignEx.getRequestIdNotice());
                    aVar.b(campaignEx.getAppName());
                    aVar.a(campaignEx.getId());
                    aVar.a(campaignEx);
                    arrayList.add(aVar);
                    this.f22308a.h(campaignEx.getCMPTEntryUrl());
                    this.f22308a.f(campaignEx.getMof_tplid());
                    long candidateCacheTime = campaignEx.getCandidateCacheTime();
                    if (candidateCacheTime > 0) {
                        this.f22308a.b((candidateCacheTime * 1000) + System.currentTimeMillis());
                    }
                    this.f22308a.h(campaignEx.getVcn());
                    this.f22308a.i(campaignEx.getTokenRule());
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        this.f22308a.g(rewardTemplateMode.b());
                    }
                }
                this.f22308a.b(ads);
                this.f22308a.a(arrayList);
                com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22308a;
                if (bVar != null && (cVar = this.f22315h) != null) {
                    try {
                        cVar.a(bVar, this);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e8);
                        }
                    }
                }
            } else {
                a(this, this.f22308a, new b(7, "data is null"));
            }
        } else {
            b bVar2 = new b(9);
            bVar2.a(jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar2.a(optInt);
            bVar2.c(jSONObject2.toString());
            a(this, this.f22308a, bVar2);
        }
        this.f22318k = SystemClock.elapsedRealtime();
    }

    public final void b(String str) {
        this.f22321n = str;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final void c() {
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22319l);
        super.c();
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        if (this.f22323p == null) {
            this.f22323p = new HashMap();
        }
        return this.f22323p;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final v b() {
        if (this.f22316i == null) {
            this.f22316i = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.f22316i;
    }

    public final void b(String str, String str2) {
        if (this.f22323p == null) {
            this.f22323p = new HashMap();
        }
        this.f22323p.put(str, str2);
    }

    public final void a(c cVar) {
        this.f22315h = cVar;
    }

    public final void a(String str, String str2) {
        if (this.f22314g == null) {
            this.f22314g = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.f22314g;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public final void a(String str) {
        this.f22320m = str;
    }

    public final void a(Map<String, String> map) {
        if (this.f22314g == null) {
            this.f22314g = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.f22314g.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.f22314g == null) {
            this.f22314g = new HashMap();
        }
        return this.f22314g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                byte[] bArr = mVar.f20053b;
                if (bArr != null && bArr.length != 0) {
                    return r.a(new JSONObject(new String(bArr, com.mbridge.msdk.e.a.a.e.a(mVar.f20054c))), com.mbridge.msdk.e.a.a.e.a(mVar));
                }
            } catch (UnsupportedEncodingException e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse UnsupportedEncodingException: ", e8);
                }
                return r.a(new com.mbridge.msdk.e.a.g(e8));
            } catch (JSONException e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e9);
                }
                return r.a(new o(e9));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("BaseCampaignRequest", "parseNetworkResponse Exception: ", e10);
                }
                return r.a(new y(e10));
            }
        }
        return r.a(new u());
    }

    @Override // com.mbridge.msdk.e.a.r.a
    public final void a(z zVar) {
        c cVar;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22319l);
        if (MBridgeConstans.DEBUG) {
            ad.b("BaseCampaignRequest", "onErrorResponse: " + zVar.getMessage());
        }
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22308a;
        if (bVar == null || (cVar = this.f22315h) == null) {
            return;
        }
        try {
            cVar.b(bVar, this, VolleyErrorUtils.parseVolleyError(zVar));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onError Exception: ", e8);
            }
        }
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, b bVar2) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f22315h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, bVar2);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e8);
            }
        }
    }

    static /* synthetic */ void a(a aVar, com.mbridge.msdk.newreward.function.d.a.b bVar, long j8) {
        c cVar;
        if (aVar == null || bVar == null || (cVar = aVar.f22315h) == null) {
            return;
        }
        try {
            cVar.a(bVar, aVar, j8, new b(10, "v3 is timeout"));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("BaseCampaignRequest", "onTimeout Exception: ", e8);
            }
        }
    }
}
