package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: com.mbridge.msdk.newreward.function.f.c$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22475a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22475a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DB.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22475a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar2) {
        List<CampaignEx> C8;
        if (eVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b b9 = com.mbridge.msdk.foundation.same.report.d.c.a().b(eVar.z());
            if (b9 == null) {
                b9 = new com.mbridge.msdk.foundation.same.report.d.b();
                b9.c(eVar.z());
                b9.b(eVar.p());
            }
            b9.d(eVar.A());
            b9.e(eVar.C());
            b9.i(eVar.K() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            if (eVar.x() != null) {
                b9.b(eVar.x().a());
            }
            if (eVar.r() != null) {
                com.mbridge.msdk.videocommon.d.a a9 = eVar.r().a();
                if (a9 != null) {
                    b9.h(a9.b());
                    b9.f(a9.c());
                }
                com.mbridge.msdk.videocommon.d.c b10 = eVar.r().b();
                if (b10 != null) {
                    b9.g(b10.l());
                    b9.n(b10.k());
                }
            }
            Object obj = (map == null || !map.containsKey("metrics_data")) ? null : map.get("metrics_data");
            switch (AnonymousClass1.f22475a[eVar2.ordinal()]) {
                case 1:
                    b9.a("2000125");
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a(map);
                    b9.a("2000125", dVar);
                    break;
                case 2:
                    b9.a("2000126");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b9.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a(map);
                    b9.a("2000126", dVar2);
                    break;
                case 3:
                    b9.a("2000126");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a(map);
                    b9.a("2000126", dVar3);
                    break;
                case 4:
                    b9.a("m_v3_req_retry_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar4 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar4.a(map);
                    b9.a("m_v3_req_retry_start", dVar4);
                    break;
                case 5:
                    b9.a("m_v3_req_retry_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar5 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar5.a(map);
                    b9.a("m_v3_req_retry_end", dVar5);
                    break;
                case 6:
                    b9.a("2000127");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b9.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar6 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar6.a(map);
                    b9.a("2000127", dVar6);
                    break;
                case 7:
                    b9.a("2000048");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b9.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar7 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar7.a(map);
                    b9.a("2000048", dVar7);
                    break;
                case 8:
                    b9.a("2000047");
                    if (obj != null && (obj instanceof com.mbridge.msdk.foundation.c.b)) {
                        b9.a((com.mbridge.msdk.foundation.c.b) obj);
                        break;
                    }
                    break;
                case 9:
                    com.mbridge.msdk.foundation.same.report.d.d dVar8 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar8.a("m_load_check", Integer.valueOf(eVar.l() ? 1 : 0));
                    b9.a("2000128", dVar8);
                    b9.a("2000128");
                    break;
                case 10:
                    b9.a("m_download_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar9 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar9.a(map);
                    int intValue = (map == null || !(map.get("resource_type") instanceof Integer)) ? 0 : ((Integer) map.get("resource_type")).intValue();
                    b9.a("m_download_start", dVar9, intValue);
                    b9.a(intValue);
                    break;
                case 11:
                    b9.a("m_download_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar10 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar10.a(map);
                    int intValue2 = (map == null || !(map.get("resource_type") instanceof Integer)) ? 0 : ((Integer) map.get("resource_type")).intValue();
                    b9.a("m_download_end", dVar10, intValue2);
                    b9.a(intValue2);
                    break;
                case 12:
                    b9.a("m_candidate_data");
                    b9.a("m_candidate_data", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 13:
                    b9.a("m_candidate_db");
                    b9.a("m_candidate_db", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 14:
                    b9.a("m_load_check");
                    com.mbridge.msdk.newreward.function.d.a.b bVar = (map == null || !map.containsKey("campaign")) ? null : (com.mbridge.msdk.newreward.function.d.a.b) map.remove("campaign");
                    if (bVar != null && (C8 = bVar.C()) != null) {
                        b9.b(C8);
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar11 = new com.mbridge.msdk.foundation.same.report.d.d();
                    if (map != null) {
                        dVar11.a(map);
                    }
                    b9.a("m_load_check", dVar11);
                    break;
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(b9);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(b9.c(), b9, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.newreward.b.b bVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(bVar.b());
            bVar2.b(bVar.e());
            bVar2.d(bVar.c());
            bVar2.i(bVar.f() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            if (bVar.g() != null) {
                com.mbridge.msdk.videocommon.d.a a9 = bVar.g().a();
                if (a9 != null) {
                    bVar2.h(a9.b());
                    bVar2.f(a9.c());
                }
                com.mbridge.msdk.videocommon.d.c b9 = bVar.g().b();
                if (b9 != null) {
                    bVar2.g(b9.l());
                    bVar2.n(b9.k());
                }
            }
            int i8 = AnonymousClass1.f22475a[eVar.ordinal()];
            if (i8 == 9) {
                bVar2.a("2000128");
            } else if (i8 == 15) {
                bVar2.a("2000131");
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(map);
                bVar2.a("2000131", dVar);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2.c(), bVar2, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
