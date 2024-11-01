package com.mbridge.msdk.foundation.same.net.h;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class f {
    public static void a(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f20655d);
    }

    public static void b(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                com.mbridge.msdk.foundation.same.a.f20649U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f20649U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                com.mbridge.msdk.foundation.same.a.f20658g = com.mbridge.msdk.foundation.a.a.a.a().a("c");
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                eVar.a("c", com.mbridge.msdk.foundation.same.a.f20658g);
            }
        } catch (Exception e8) {
            ad.b("CommonRequestParamsForAdd", e8.getMessage());
        }
    }

    public static void c(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f20674w);
    }

    public static void d(e eVar) {
        String str;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.u() + "");
            eVar.a("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()) + "");
            eVar.a("integrated_wx", z.y() + "");
            eVar.a("opensdk_ver", z.t() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String i8 = z.i();
            if (!TextUtils.isEmpty(i8)) {
                eVar.a("hardware", i8);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                str = "1";
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            eVar.a("adid_limit_dev", str);
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f20971g, z.n());
        }
        g.b(eVar);
        a(eVar, false);
        g(eVar);
        b(eVar);
        h(eVar);
        i(eVar);
    }

    public static void e(e eVar) {
        if (z.q() == 0) {
            return;
        }
        eVar.a("tun", z.q() + "");
    }

    public static void f(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a("ua");
                eVar.a("language");
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.f20965a);
                eVar.a(e.f20966b);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a("gaid");
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    private static void g(e eVar) {
        int s8 = z.s();
        if (s8 != -1) {
            eVar.a("unknown_source", s8 + "");
        }
    }

    private static void h(e eVar) {
        String e8 = com.mbridge.msdk.foundation.tools.e.e();
        if (!TextUtils.isEmpty(e8)) {
            eVar.a("az_aid_info", e8);
        }
    }

    private static void i(e eVar) {
        String str = com.mbridge.msdk.f.c.f20232a;
        if (!TextUtils.isEmpty(str)) {
            eVar.a("cronet_env", str);
        }
    }

    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.u() + "");
            eVar.a("has_wx", z.u(context) + "");
            eVar.a("integrated_wx", z.y() + "");
            eVar.a("opensdk_ver", z.t() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String i8 = z.i();
            if (!TextUtils.isEmpty(i8)) {
                eVar.a("hardware", i8);
            }
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.j();
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f20967c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f20965a, ag.b() + "");
            eVar.a(e.f20966b, ag.a() + "");
            eVar.a(e.f20971g, z.n());
        }
        eVar.a("pkg_source", z.a(z.e(context), context));
        if (com.mbridge.msdk.foundation.controller.c.m().i() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.m().i().toString());
        }
        eVar.a("http_req", "2");
        g.a(eVar, context);
        a(eVar, true);
        g(eVar);
        b(eVar);
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 == null) {
            com.mbridge.msdk.c.h.a();
            b9 = i.a();
        }
        if (b9.I() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        } else if (b9.aG()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        }
        String i9 = com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().i();
        if (!TextUtils.isEmpty(i9)) {
            eVar.a("tc_string", i9);
        }
        h(eVar);
        i(eVar);
        g.a(eVar);
    }

    private static void a(e eVar, boolean z8) {
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (b9 != null) {
            if (!TextUtils.isEmpty(b9.a()) && z8) {
                eVar.a("a_stid", b9.a());
            }
            try {
                g.a(eVar, c8, z8, b9);
            } catch (Exception e8) {
                ad.b("CommonRequestParamsForAdd", e8.getMessage());
            }
        }
    }
}
