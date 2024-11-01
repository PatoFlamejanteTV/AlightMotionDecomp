package com.mbridge.msdk.newreward.function.b;

import androidx.core.os.EnvironmentCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.a.a;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.videocommon.d.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f22139a = "RewardCandidateController";

    /* renamed from: b, reason: collision with root package name */
    private final c f22140b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.a.c f22141c;

    public a(String str, boolean z8, c cVar) {
        this.f22140b = cVar;
        try {
            com.mbridge.msdk.newreward.function.a.c a9 = com.mbridge.msdk.newreward.function.a.a.a.a().a(str, b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, z8).G());
            this.f22141c = a9;
            a9.a(cVar);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> b(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> s8;
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i8);
                if (bVar2 != null && (s8 = bVar2.s()) != null && s8.size() != 0) {
                    arrayList.add(bVar2);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final com.mbridge.msdk.newreward.function.a.b a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.c.b bVar2, e eVar, int i8) {
        String str;
        CampaignEx campaignEx;
        int i9;
        String str2;
        String requestId;
        String str3;
        int i10;
        String str4;
        com.mbridge.msdk.newreward.function.a.b a9;
        com.mbridge.msdk.newreward.function.a.b bVar3 = new com.mbridge.msdk.newreward.function.a.b();
        if (eVar == null) {
            str = "";
            campaignEx = null;
            str2 = null;
            i9 = 94;
        } else {
            try {
                String C8 = eVar.C();
                CampaignEx campaignEx2 = (eVar.x() == null || eVar.x().b() == null || eVar.x().b().C() == null || eVar.x().b().C().size() <= 0) ? null : eVar.x().b().C().get(0);
                if (this.f22141c == null) {
                    str = "";
                    campaignEx = campaignEx2;
                    i9 = 94;
                } else {
                    int p8 = eVar.p();
                    String w8 = eVar.w();
                    this.f22141c.a(p8);
                    this.f22141c.f(w8);
                    this.f22141c.a(eVar);
                    i9 = p8;
                    campaignEx = campaignEx2;
                    str = w8;
                }
                str2 = C8;
            } catch (Exception unused) {
                bVar3.d("getCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f20262c);
                return bVar3;
            }
        }
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                requestId = campaignEx.getRequestId();
            } catch (Exception unused2) {
                bVar3.d("getRewardCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f20262c);
                return bVar3;
            }
        }
        if (bVar2 != null) {
            i10 = bVar2.f();
            str3 = bVar2.b();
        } else {
            str3 = null;
            i10 = 0;
        }
        com.mbridge.msdk.newreward.function.a.c cVar = this.f22141c;
        if (cVar == null) {
            a9 = new com.mbridge.msdk.newreward.function.a.b();
            a9.d("can not get manager");
            a9.a(com.mbridge.msdk.foundation.b.c.f20262c);
        } else {
            com.mbridge.msdk.newreward.function.a.b c8 = cVar.c(str2);
            if (c8.h() > com.mbridge.msdk.foundation.b.c.f20261b) {
                return c8;
            }
            String[] split = x.a(str2.split("_")[3]).split("\\|");
            double parseDouble = Double.parseDouble(split[0]);
            if (split.length <= 1) {
                str4 = "";
            } else {
                str4 = split[1];
            }
            a9 = a(parseDouble, str4, bVar, str2, eVar, i8, i9, str);
            if (a9 != null && a9.a() != null) {
                this.f22141c.a(a9.a().s(), bVar, requestId, i10, str3, i8, parseDouble);
            }
        }
        return a9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    private com.mbridge.msdk.newreward.function.a.b a(double d8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, e eVar, int i8, int i9, String str3) {
        JSONObject jSONObject;
        com.mbridge.msdk.newreward.function.a.b bVar2;
        ArrayList arrayList;
        int i10;
        JSONObject jSONObject2;
        List<com.mbridge.msdk.newreward.function.d.a.a> s8;
        com.mbridge.msdk.newreward.function.a.b bVar3 = this;
        com.mbridge.msdk.newreward.function.a.b a9 = bVar3.f22141c.a();
        try {
        } catch (Exception unused) {
            bVar3 = a9;
        }
        if (a9.h() > 0) {
            return a9;
        }
        JSONObject a10 = bVar3.f22141c.a(str);
        try {
            if (a10 != null) {
                int optInt = a10.optInt("max_usage_limit", 10);
                if (a10.optInt("max_cache_num", 20) > 0) {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a11 = bVar3.f22141c.a(optInt, i9, str3);
                    if (a11 != null && a11.size() > 0) {
                        com.mbridge.msdk.newreward.function.a.b bVar4 = new com.mbridge.msdk.newreward.function.a.b();
                        if (a11.size() == 0) {
                            bVar4.d("candidate is null");
                            bVar4.a(com.mbridge.msdk.foundation.b.c.f20262c);
                        } else {
                            for (int i11 = 0; i11 < a11.size(); i11++) {
                                com.mbridge.msdk.newreward.function.d.a.b bVar5 = a11.get(i11);
                                if (bVar5 != null) {
                                    bVar4.a(bVar5.d());
                                }
                            }
                            if (a11.size() > 0) {
                                if (a11.size() != 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i12 = 0; i12 < a11.size(); i12++) {
                                        com.mbridge.msdk.newreward.function.d.a.b bVar6 = a11.get(i12);
                                        if (bVar6 != null && (s8 = bVar6.s()) != null && s8.size() != 0) {
                                            int i13 = 0;
                                            boolean z8 = false;
                                            while (true) {
                                                if (i13 >= s8.size()) {
                                                    break;
                                                }
                                                com.mbridge.msdk.newreward.function.d.a.a aVar = s8.get(i13);
                                                boolean c8 = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), aVar.g().getPackageName());
                                                if (c8) {
                                                    bVar4.c(bVar6.d());
                                                    com.mbridge.msdk.newreward.function.a.c cVar = bVar3.f22141c;
                                                    if (cVar != null) {
                                                        cVar.a(bVar6.e(), bVar6.d(), 2, aVar.h().q());
                                                    }
                                                    z8 = c8;
                                                } else {
                                                    i13++;
                                                    z8 = c8;
                                                }
                                            }
                                            if (!z8) {
                                                arrayList2.add(bVar6);
                                            }
                                        }
                                    }
                                    a11 = arrayList2;
                                }
                                if (a11.size() == 0) {
                                    bVar4.d("existed");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f20262c);
                                }
                            }
                            if (a11.size() > 0 && ((a11 = bVar3.a(a11, bVar4)) == null || a11.size() == 0)) {
                                bVar4.d("not ready");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f20262c);
                            }
                            if (a11.size() > 0 && ((a11 = bVar3.b(a11, bVar4)) == null || a11.size() == 0)) {
                                bVar4.d("had in cache");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f20262c);
                            }
                            if (a11 == null || a11.size() <= 0) {
                                jSONObject = a10;
                                bVar2 = a9;
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                double optDouble = a10.optDouble("t_disc", 0.8d);
                                double optDouble2 = a10.optDouble("u_disc", 0.95d);
                                double optDouble3 = a10.optDouble("max_ecppv_diff", 0.0d);
                                int optInt2 = a10.optInt("time_interval", 1800);
                                int size = a11.size();
                                double d9 = 0.0d;
                                com.mbridge.msdk.newreward.function.d.a.b bVar7 = null;
                                int i14 = 0;
                                while (i14 < size) {
                                    com.mbridge.msdk.newreward.function.d.a.b bVar8 = a11.get(i14);
                                    if (bVar8 != null) {
                                        bVar2 = a9;
                                        i10 = size;
                                        jSONObject2 = a10;
                                        try {
                                            double pow = Math.pow(optDouble2, bVar8.r()) * bVar8.q() * Math.pow(optDouble, (System.currentTimeMillis() - bVar8.G()) / (optInt2 * 1000.0d));
                                            arrayList3.add(new a.C0415a(pow, bVar8));
                                            if (pow >= d8 - optDouble3 && pow > d9) {
                                                d9 = pow;
                                                bVar7 = bVar8;
                                            }
                                        } catch (Exception unused2) {
                                            bVar3 = bVar2;
                                            bVar3.d("getHighestCampaigns exception");
                                            bVar3.a(com.mbridge.msdk.foundation.b.c.f20262c);
                                            return bVar3;
                                        }
                                    } else {
                                        i10 = size;
                                        jSONObject2 = a10;
                                        bVar2 = a9;
                                    }
                                    i14++;
                                    a10 = jSONObject2;
                                    size = i10;
                                    a9 = bVar2;
                                }
                                jSONObject = a10;
                                bVar2 = a9;
                                if (bVar7 != null) {
                                    bVar4.a(bVar7);
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f20263d);
                                } else {
                                    bVar4.d("no match campaign");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f20262c);
                                }
                                arrayList = arrayList3;
                            }
                            a(bVar, str2, bVar4, arrayList, jSONObject, eVar, i8);
                        }
                        return bVar4;
                    }
                    com.mbridge.msdk.newreward.function.a.b bVar9 = a9;
                    bVar9.d("no cache");
                    bVar9.a(com.mbridge.msdk.foundation.b.c.f20262c);
                    a(bVar, str2, bVar9, null, a10, eVar, 2);
                    bVar3 = bVar9;
                } else {
                    com.mbridge.msdk.newreward.function.a.b bVar10 = a9;
                    bVar10.d("max cache num error");
                    bVar10.a(com.mbridge.msdk.foundation.b.c.f20262c);
                    bVar3 = bVar10;
                }
            } else {
                com.mbridge.msdk.newreward.function.a.b bVar11 = a9;
                bVar11.d("setting config not mapping");
                bVar11.a(com.mbridge.msdk.foundation.b.c.f20262c);
                bVar3 = bVar11;
            }
        } catch (Exception unused3) {
        }
        return bVar3;
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> a(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> s8;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i8);
            if (bVar2 != null && (s8 = bVar2.s()) != null && s8.size() != 0) {
                int i9 = 0;
                boolean z8 = false;
                while (true) {
                    if (i9 >= s8.size()) {
                        break;
                    }
                    com.mbridge.msdk.newreward.function.d.a.a aVar = s8.get(i9);
                    boolean y8 = aVar.h().y();
                    if (y8) {
                        i9++;
                        z8 = y8;
                    } else {
                        bVar.b(bVar2.d());
                        com.mbridge.msdk.newreward.function.a.c cVar = this.f22141c;
                        if (cVar != null) {
                            cVar.a(bVar2.e(), bVar2.d(), 2, aVar.h().q());
                        }
                        z8 = y8;
                    }
                }
                if (z8) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject a9;
        try {
            com.mbridge.msdk.newreward.function.a.c cVar = this.f22141c;
            if (cVar != null && (a9 = cVar.a(cVar.b(str))) != null) {
                return a9.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.newreward.function.a.b bVar2, List<a.C0415a> list, JSONObject jSONObject, e eVar, int i8) {
        String str2;
        try {
            d dVar = new d();
            if (i8 == 1) {
                str2 = "cb";
            } else if (i8 == 2) {
                str2 = "candidate";
            } else if (i8 != 3) {
                str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            } else {
                str2 = "track";
            }
            dVar.a("scene", str2);
            com.mbridge.msdk.newreward.function.a.c cVar = this.f22141c;
            if (cVar != null) {
                double d8 = cVar.d(str);
                if (d8 >= 0.0d) {
                    dVar.a("bp", x.b(d8 + ""));
                }
                dVar.a("cb_state", a(str) ? "open" : CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                try {
                    com.mbridge.msdk.newreward.function.a.c cVar2 = this.f22141c;
                    JSONObject a9 = cVar2.a(cVar2.b(str));
                    if (a9 != null) {
                        dVar.a("config", a9.toString());
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            if (bVar2 != null) {
                if (bVar2.h() == com.mbridge.msdk.foundation.b.c.f20263d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", bVar2.b());
                }
                dVar.a("acr", bVar2.c());
                dVar.a("her", bVar2.e());
                dVar.a("nrr", bVar2.d());
                dVar.a("cer", bVar2.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < list.size(); i9++) {
                    com.mbridge.msdk.newreward.function.d.a.b a10 = list.get(i9).a();
                    if (a10 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(a10.q() + ""));
                        jSONObject2.put("showCount", a10.r());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a10.G());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a(DataSchemeDataSource.SCHEME_DATA, jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (bVar2 != null && bVar2.a() != null && eVar != null) {
                    bVar.b(eVar.x().a());
                }
            }
            c cVar3 = this.f22140b;
            cVar3.a(eVar, com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE, cVar3.a("metrics_data", dVar));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
