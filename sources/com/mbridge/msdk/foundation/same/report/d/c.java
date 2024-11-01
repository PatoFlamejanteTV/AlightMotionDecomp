package com.mbridge.msdk.foundation.same.report.d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.a.a.g;
import com.mbridge.msdk.e.m;
import com.mbridge.msdk.e.o;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f21107a;

    /* renamed from: b, reason: collision with root package name */
    private volatile m f21108b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, d> f21109c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private LinkedHashMap<String, b> f21110d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, d> f21111e = new HashMap();

    private c() {
        if (this.f21108b == null) {
            this.f21108b = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), c());
        }
        JSONObject a9 = com.mbridge.msdk.foundation.same.report.c.a();
        if (this.f21108b != null) {
            this.f21108b.a(a9);
            this.f21108b.a();
        }
    }

    private w c() {
        o oVar;
        try {
            int a9 = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
            int a10 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
            int a11 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
            int a12 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
            int a13 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
            int a14 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
            if (a14 != 0 && a14 != 1) {
                a14 = 0;
            }
            w.a a15 = new w.a().e(a9).a(a10).d(a11).b(a12).c(a13).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.b()).a(new com.mbridge.msdk.foundation.same.report.o());
            if (a14 == 1) {
                oVar = new o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().f20941i, com.mbridge.msdk.foundation.same.net.g.d.f().f20945m);
            } else {
                oVar = new o(new g(), DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS, 0);
            }
            return a15.a(a14, oVar).a();
        } catch (Exception e8) {
            ad.b("EventLibraryReport", "configTrackManager error: " + e8.getMessage());
            return null;
        }
    }

    public final void a(b bVar) {
        if (bVar != null) {
            try {
                if (this.f21109c != null) {
                    d dVar = new d();
                    dVar.a("rs_rid", bVar.k());
                    dVar.a("r_stid", bVar.m());
                    dVar.a("rus_rid", bVar.l());
                    dVar.a("u_stid", bVar.t());
                    this.f21109c.put(bVar.i(), dVar);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }

    public final void b(String str, d dVar) {
        try {
            b bVar = new b();
            if (dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                bVar.d(String.valueOf(dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (dVar.b("lrid") != null && (dVar.b("lrid") instanceof String)) {
                bVar.c(String.valueOf(dVar.b("lrid")));
            }
            bVar.a(str, dVar);
            new e().b(str, this.f21108b, bVar, null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final d a(String str) {
        Map<String, d> map;
        d dVar = new d();
        try {
            return (TextUtils.isEmpty(str) || (map = this.f21109c) == null || !map.containsKey(str)) ? dVar : this.f21109c.get(str);
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return dVar;
            }
            e8.printStackTrace();
            return dVar;
        }
    }

    private void b(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (Arrays.asList(a.f21073c).contains(str)) {
                bVar.m(str);
            }
            Map<String, d> map = this.f21111e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f21111e.get(str));
            }
            new e().a(str, this.f21108b, bVar, aVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(String str, d dVar) {
        Map<String, d> map = this.f21111e;
        if (map != null) {
            map.put(str, dVar);
        }
    }

    public final d a(int i8, int i9, String str, boolean z8, int i10) {
        d dVar = new d();
        try {
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i8));
            dVar.a("adtp", Integer.valueOf(i9));
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z8) {
                dVar.a("auto_load", Integer.valueOf(i10));
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
        return dVar;
    }

    public final LinkedHashMap<String, b> b() {
        return this.f21110d;
    }

    public final b b(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f21110d) != null && linkedHashMap.containsKey(str)) {
                return this.f21110d.get(str);
            }
            return null;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            return null;
        }
    }

    public static c a() {
        if (f21107a == null) {
            synchronized (c.class) {
                try {
                    if (f21107a == null) {
                        f21107a = new c();
                    }
                } finally {
                }
            }
        }
        return f21107a;
    }

    public final b b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            return (b) bVar.clone();
        } catch (CloneNotSupportedException e8) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e8.printStackTrace();
            return null;
        }
    }

    public final void a(String str, CampaignEx campaignEx, d dVar) {
        b bVar;
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getLocalRequestId();
                bVar = this.f21110d.get(str2);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (Arrays.asList(a.f21078h).contains(str)) {
                bVar = b(bVar);
            }
        } else {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(str2);
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void c(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f21110d) != null && linkedHashMap.containsKey(str)) {
                this.f21110d.remove(str);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCurrentLocalRid();
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f21110d.get(str2);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(str2);
        b(str, bVar, null);
    }

    public final void a(String str, List<CampaignEx> list, d dVar) {
        CampaignEx campaignEx;
        String str2 = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str2 = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f21110d.get(str2);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.b(list);
        if (list != null && list.size() > 0) {
            bVar.c(list.get(0).getCurrentLocalRid());
        }
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void a(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        b(str, bVar, aVar);
    }

    public final void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        d dVar = new d();
        dVar.a("result", Integer.valueOf(nVar.m()));
        dVar.a("scenes", nVar.b("scenes", ""));
        dVar.a("resource_type", Integer.valueOf(nVar.A()));
        dVar.a("url", nVar.b("url", ""));
        dVar.a("reason", nVar.h());
        dVar.a("mraid_type", Integer.valueOf(nVar.y()));
        a().a(nVar.a(), campaignEx, dVar);
    }

    public final void a(String str, b bVar) {
        try {
            Map<String, d> map = this.f21111e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f21111e.get(str));
            }
            new e().a(str, this.f21108b, bVar, null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(String str, b bVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (bVar == null) {
                bVar = new b();
            }
            d dVar = new d();
            dVar.a("st", Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                dVar.a("cid", campaignEx.getId());
                dVar.a("lrid", campaignEx.getLocalRequestId());
                dVar.a("rid", campaignEx.getRequestId());
                dVar.a("rid_n", campaignEx.getRequestIdNotice());
                dVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                dVar.a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                dVar.a("network_type", Integer.valueOf(z.l(context)));
            }
            bVar.a(str, dVar);
            b(str, bVar, aVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
