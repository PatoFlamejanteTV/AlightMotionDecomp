package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, String> f22489a;

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<String, String> a() {
        if (f22489a == null) {
            e eVar = new e();
            eVar.a("platform", "1");
            eVar.a("os_version", Build.VERSION.RELEASE);
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, z.e(c8));
            eVar.a("app_version_name", z.p(c8));
            eVar.a("app_version_code", z.q(c8) + "");
            eVar.a("orientation", z.r(c8) + "");
            eVar.a("model", z.h());
            eVar.a("brand", z.w());
            eVar.a("gaid2", com.mbridge.msdk.foundation.tools.e.b());
            eVar.a("gaid", "");
            int l8 = z.l(c8);
            eVar.a("network_type", l8 + "");
            eVar.a("network_str", z.a(c8, l8));
            eVar.a("language", z.s(c8));
            eVar.a("timezone", z.x());
            eVar.a("useragent", z.g());
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("screen_size", z.i(c8) + "x" + z.g(c8));
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            String a9 = Aa.a();
            if (a9 == null) {
                a9 = "";
            }
            eVar.a("channel", a9);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().d() + "");
            eVar.a("open", com.mbridge.msdk.foundation.same.a.f20646R);
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                eVar.a("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
            }
            long currentTimeMillis = System.currentTimeMillis();
            String l9 = com.mbridge.msdk.foundation.controller.c.m().l();
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", l9);
            eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
            if (com.mbridge.msdk.f.b.a()) {
                eVar.a("st", SameMD5.getMD5(l9 + currentTimeMillis));
            } else {
                eVar.a("st", SameMD5.getMD5(currentTimeMillis + l9));
            }
            f22489a = eVar.a();
        }
        return f22489a;
    }
}
