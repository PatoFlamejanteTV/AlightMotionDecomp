package com.mbridge.msdk.video.module.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class k extends f {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f23780a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f23781b;

    /* renamed from: c, reason: collision with root package name */
    protected List<CampaignEx> f23782c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f23783d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.download.a f23784e;

    /* renamed from: f, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.b.c f23785f;

    /* renamed from: g, reason: collision with root package name */
    protected String f23786g;

    /* renamed from: h, reason: collision with root package name */
    protected String f23787h;

    /* renamed from: i, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.a.a f23788i;

    /* renamed from: j, reason: collision with root package name */
    protected int f23789j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23790k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23791l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23792m = false;

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        this.f23783d = false;
        this.f23788i = new f();
        this.f23789j = 1;
        if (!z8 && campaignEx != null && an.b(str2) && aVar != null && aVar2 != null) {
            this.f23781b = campaignEx;
            this.f23787h = str;
            this.f23786g = str2;
            this.f23784e = aVar;
            this.f23785f = cVar;
            this.f23788i = aVar2;
            this.f23780a = true;
            this.f23789j = i8;
            this.f23783d = false;
            return;
        }
        if (z8 && campaignEx != null && an.b(str2) && aVar2 != null) {
            this.f23781b = campaignEx;
            this.f23787h = str;
            this.f23786g = str2;
            this.f23784e = aVar;
            this.f23785f = cVar;
            this.f23788i = aVar2;
            this.f23780a = true;
            this.f23789j = i8;
            this.f23783d = true;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f23781b = campaignEx;
    }

    public final void b(int i8) {
        CampaignEx campaignEx = this.f23781b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i8 == 1 || i8 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&endscreen_type=");
                        sb.append(i8);
                    } else {
                        sb.append("?endscreen_type=");
                        sb.append(i8);
                    }
                    noticeUrl = sb.toString();
                } else if (i8 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f23781b.setNoticeUrl(noticeUrl);
            }
        }
    }

    public final void c() {
        try {
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        k kVar = k.this;
                        if (kVar.f23780a && kVar.f23781b != null && an.b(kVar.f23786g)) {
                            com.mbridge.msdk.videocommon.a.a a9 = com.mbridge.msdk.videocommon.a.a.a();
                            k kVar2 = k.this;
                            a9.a(kVar2.f23781b, kVar2.f23786g);
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        com.mbridge.msdk.videocommon.a.a a10 = com.mbridge.msdk.videocommon.a.a.a();
                        k kVar3 = k.this;
                        a10.c(kVar3.f23787h, kVar3.f23781b.getAdType());
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            e9.printStackTrace();
                        }
                    } catch (Throwable th) {
                        ad.a("NotifyListener", th.getMessage());
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f23784e;
        if (aVar != null) {
            aVar.f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f23781b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f23783d && !this.f23781b.isCampaignIsFiltered()) {
                this.f23791l = true;
                return;
            }
            if (this.f23780a && (campaignEx = this.f23781b) != null && !TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = com.mbridge.msdk.foundation.same.a.d.f20694k) != null && !map.containsKey(this.f23781b.getOnlyImpressionURL()) && !this.f23791l) {
                com.mbridge.msdk.foundation.same.a.d.f20694k.put(this.f23781b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
                String onlyImpressionURL = this.f23781b.getOnlyImpressionURL();
                if (this.f23781b.getSpareOfferFlag() == 1) {
                    str = onlyImpressionURL + "&to=1&cbt=" + this.f23781b.getCbt() + "&tmorl=" + this.f23789j;
                } else {
                    str = onlyImpressionURL + "&to=0&cbt=" + this.f23781b.getCbt() + "&tmorl=" + this.f23789j;
                }
                String str2 = str;
                if (!this.f23783d || this.f23781b.isCampaignIsFiltered()) {
                    com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b, this.f23786g, str2, false, true, com.mbridge.msdk.click.a.a.f19312h);
                    c();
                }
                this.f23791l = true;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        String str;
        try {
            if (this.f23780a && !this.f23790k && !TextUtils.isEmpty(this.f23781b.getImpressionURL())) {
                this.f23790k = true;
                if (this.f23781b.isBidCampaign() && this.f23781b != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        List<com.mbridge.msdk.foundation.entity.d> a9 = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f23781b.getCampaignUnitId(), this.f23781b.getRequestId());
                        if (a9 != null && a9.size() > 0 && a9.get(0) != null) {
                            if (a9.get(0).c() == 1) {
                                hashMap.put("encrypt_p=", "encrypt_p=" + a9.get(0).b());
                                hashMap.put("irlfa=", "irlfa=1");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    String str3 = (String) entry.getValue();
                                    CampaignEx campaignEx = this.f23781b;
                                    campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str2, str3));
                                    CampaignEx campaignEx2 = this.f23781b;
                                    campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str2, str3));
                                }
                            }
                            ad.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(this.f23781b.getRequestId()));
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
                String impressionURL = this.f23781b.getImpressionURL();
                if (this.f23781b.getSpareOfferFlag() == 1) {
                    str = impressionURL + "&to=1&cbt=" + this.f23781b.getCbt() + "&tmorl=" + this.f23789j;
                } else {
                    str = impressionURL + "&to=0&cbt=" + this.f23781b.getCbt() + "&tmorl=" + this.f23789j;
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b, this.f23786g, str, false, true, com.mbridge.msdk.click.a.a.f19311g);
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b);
                new Thread(new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.mbridge.msdk.foundation.db.k.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(k.this.f23781b.getId());
                        } catch (Throwable th) {
                            ad.a("NotifyListener", th.getMessage(), th);
                        }
                    }
                }).start();
                if (this.f23780a && com.mbridge.msdk.foundation.same.a.d.f20693j != null && !TextUtils.isEmpty(this.f23781b.getId())) {
                    com.mbridge.msdk.foundation.same.a.d.a(this.f23786g, this.f23781b, "reward");
                }
            }
        } catch (Throwable th) {
            ad.a("NotifyListener", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (this.f23780a && !this.f23792m && (campaignEx = this.f23781b) != null) {
                this.f23792m = true;
                if ((!campaignEx.isDynamicView() || !this.f23783d || this.f23781b.isCampaignIsFiltered()) && (pv_urls = this.f23781b.getPv_urls()) != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b, this.f23786g, it.next(), false, true);
                    }
                }
            }
        } catch (Throwable th) {
            ad.b("NotifyListener", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        CampaignEx campaignEx = this.f23781b;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && this.f23781b.getNativeVideoTracking() != null && this.f23781b.getNativeVideoTracking().o() != null) {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            CampaignEx campaignEx2 = this.f23781b;
            com.mbridge.msdk.click.a.a(c8, campaignEx2, campaignEx2.getCampaignUnitId(), this.f23781b.getNativeVideoTracking().o(), false, false);
        }
    }

    public final void a(List<CampaignEx> list) {
        this.f23782c = list;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        this.f23788i.a(i8, obj);
    }

    public final void a(int i8) {
        if (this.f23781b != null) {
            if (i8 == 1 || i8 == 2) {
                com.mbridge.msdk.video.module.b.b.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b, i8, this.f23789j);
            }
        }
    }

    public final void a() {
        if (!this.f23780a || this.f23781b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f23781b.getId(), this.f23781b.getRequestId(), this.f23781b.getRequestIdNotice(), this.f23786g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(this.f23781b.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
        com.mbridge.msdk.foundation.same.report.h.b(nVar, com.mbridge.msdk.foundation.controller.c.m().c(), this.f23786g);
    }

    public final void a(int i8, String str) {
        if (this.f23781b != null) {
            com.mbridge.msdk.foundation.same.report.h.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f23781b.getId(), this.f23781b.getRequestId(), this.f23781b.getRequestIdNotice(), this.f23786g, z.l(com.mbridge.msdk.foundation.controller.c.m().c()), i8, str), com.mbridge.msdk.foundation.controller.c.m().c(), this.f23786g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        try {
            if (this.f23781b != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("url", this.f23781b.getVideoUrlEncode());
                dVar.a("reason", str);
                String noticeUrl = this.f23781b.getNoticeUrl();
                String clickURL = this.f23781b.getClickURL();
                if (TextUtils.isEmpty(noticeUrl)) {
                    if (!TextUtils.isEmpty(clickURL)) {
                        dVar.a("offer_url", clickURL);
                    }
                } else {
                    dVar.a("offer_url", noticeUrl);
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000021", this.f23781b, dVar);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b() {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    k kVar = k.this;
                    if (kVar.f23780a && kVar.f23781b != null && an.b(kVar.f23786g) && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                        com.mbridge.msdk.foundation.db.j a9 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                        fVar.a(System.currentTimeMillis());
                        fVar.b(k.this.f23786g);
                        fVar.a(k.this.f23781b.getId());
                        a9.a(fVar);
                    }
                } catch (Throwable th) {
                    ad.a("NotifyListener", th.getMessage(), th);
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        List<CampaignEx> list;
        if (this.f23781b == null || (list = this.f23782c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f23781b = this.f23782c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("NotifyListener", e8.getMessage());
            }
        }
    }
}
