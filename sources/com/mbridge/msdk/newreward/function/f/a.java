package com.mbridge.msdk.newreward.function.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f22446a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f22447b;

    private boolean a(com.mbridge.msdk.newreward.function.d.a.a aVar) {
        CampaignEx g8;
        if (aVar != null && (g8 = aVar.g()) != null) {
            try {
                if (g8.getPlayable_ads_without_video() == 2) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b b() {
        return this.f22446a;
    }

    public final boolean c() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22446a;
        return bVar != null && bVar.y();
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) throws MBridgeError {
        boolean z8;
        if (bVar != null && bVar.s() != null) {
            for (com.mbridge.msdk.newreward.function.d.a.a aVar : bVar.s()) {
                CampaignEx g8 = aVar.g();
                if (g8 != null && g8.getOfferType() != 99) {
                    if (a(aVar)) {
                        z8 = (an.a(g8.getendcard_url()) && TextUtils.isEmpty(g8.getMraid())) ? false : true;
                        if (aVar.f() == null && aVar.e() == null) {
                            throw new MBridgeError(880003, "playable offer endcard or mraid is null");
                        }
                    } else {
                        z8 = !an.a(g8.getVideoUrlEncode());
                        if (aVar.d() == null) {
                            throw new MBridgeError(880003, "No video campaign");
                        }
                    }
                    if (z8) {
                        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (com.mbridge.msdk.f.b.a() && ai.c(g8)) {
                            g8.setRtinsType(ai.c(c8, g8.getPackageName()) ? 1 : 2);
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.b b9 = com.mbridge.msdk.foundation.same.report.d.c.a().b(g8.getLocalRequestId());
                            if (b9 == null) {
                                b9 = new com.mbridge.msdk.foundation.same.report.d.b();
                                b9.c(g8.getLocalRequestId());
                                b9.b(g8.getAdType());
                                b9.d(g8.getCampaignUnitId());
                                b9.i(g8.isBidCampaign() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
                            }
                            b9.a(g8);
                            com.mbridge.msdk.newreward.a.e eVar = this.f22447b;
                            if (eVar != null && eVar.r() != null) {
                                com.mbridge.msdk.videocommon.d.a a9 = this.f22447b.r().a();
                                if (a9 != null) {
                                    b9.h(a9.b());
                                    b9.f(a9.c());
                                }
                                com.mbridge.msdk.videocommon.d.c b10 = this.f22447b.r().b();
                                if (b10 != null) {
                                    b9.g(b10.l());
                                    b9.n(b10.k());
                                }
                            }
                            com.mbridge.msdk.foundation.same.c.a(g8, com.mbridge.msdk.foundation.controller.c.m().c(), b9, new c.a() { // from class: com.mbridge.msdk.newreward.function.f.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar2);
                                }
                            });
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                e8.printStackTrace();
                            }
                        }
                        if (!com.mbridge.msdk.foundation.same.c.a(c8, g8)) {
                            ai.a(bVar.c(), g8, com.mbridge.msdk.foundation.same.a.f20675x);
                            throw new MBridgeError(880021, "APP ALREADY INSTALLED");
                        }
                    } else {
                        continue;
                    }
                }
            }
            return;
        }
        throw new MBridgeError(880003, "Need show campaign list is NULL!");
    }

    public final void c(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        if (bVar == null || bVar.s() == null) {
            return;
        }
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        k a9 = k.a(h.a(c8));
        Iterator<com.mbridge.msdk.newreward.function.d.a.a> it = bVar.s().iterator();
        while (it.hasNext()) {
            CampaignEx g8 = it.next().g();
            if (g8 != null) {
                if (com.mbridge.msdk.f.b.a()) {
                    if (!ai.c(c8, g8.getPackageName())) {
                        a(a9, g8);
                    }
                } else {
                    a(a9, g8);
                }
            }
        }
    }

    public final List<CampaignEx> a() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22446a;
        if (bVar == null) {
            return null;
        }
        return bVar.C();
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f22446a = bVar;
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.g.a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        this.f22447b = eVar;
        try {
            new com.mbridge.msdk.newreward.a.b.c(eVar).a(aVar, new C0419a(eVar, this, bVar));
        } catch (IOException e8) {
            if (bVar != null) {
                bVar.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
            }
        }
    }

    private void a(k kVar, CampaignEx campaignEx) {
        if (kVar == null || kVar.b(campaignEx.getId())) {
            return;
        }
        g gVar = new g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        kVar.a(gVar);
    }

    /* renamed from: com.mbridge.msdk.newreward.function.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0419a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.e f22449a;

        /* renamed from: b, reason: collision with root package name */
        private a f22450b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f22451c;

        public C0419a(com.mbridge.msdk.newreward.a.e eVar, a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22449a = eVar;
            this.f22450b = aVar;
            this.f22451c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
                bVar.b(this.f22449a.z());
                int J8 = (int) (this.f22449a.J() * 1.2d);
                bVar.d(J8);
                bVar.e(J8);
                bVar.b(Math.max(this.f22449a.L(), bVar.n()));
                this.f22450b.a(bVar);
                if (!TextUtils.isEmpty(bVar.i())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.i();
                }
                MBridgeSharedPreferenceModel.getInstance().putInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, bVar.c()), bVar.D());
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar);
                com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22451c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(obj);
            } catch (Exception e8) {
                ad.a("CampaignModel", "reqSuccessful: ", e8);
                com.mbridge.msdk.newreward.a.b.b bVar3 = this.f22451c;
                if (bVar3 != null) {
                    bVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22451c;
            if (bVar2 == null) {
                return;
            }
            try {
                bVar2.a(bVar);
            } catch (Exception e8) {
                ad.a("CampaignModel", "reqFailed: ", e8);
            }
        }
    }
}
