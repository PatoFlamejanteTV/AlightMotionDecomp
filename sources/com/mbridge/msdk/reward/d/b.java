package com.mbridge.msdk.reward.d;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.net.h.f;
import com.mbridge.msdk.foundation.tools.j;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;

/* loaded from: classes4.dex */
public final class b extends com.mbridge.msdk.foundation.same.net.h.b {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.h.a, com.mbridge.msdk.foundation.same.net.h.c
    public final void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, z.e(this.mContext));
        eVar.a("app_version_name", z.p(this.mContext));
        eVar.a("app_version_code", z.q(this.mContext) + "");
        eVar.a("orientation", z.r(this.mContext) + "");
        eVar.a("model", z.h());
        eVar.a("brand", z.w());
        eVar.a("gaid", "");
        eVar.a("gaid2", com.mbridge.msdk.foundation.tools.e.b());
        int l8 = z.l(this.mContext);
        eVar.a("network_type", l8 + "");
        eVar.a("network_str", z.a(this.mContext, l8) + "");
        eVar.a("language", z.s(this.mContext));
        eVar.a("timezone", z.x());
        eVar.a("useragent", z.g());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", z.i(this.mContext) + "x" + z.g(this.mContext));
        if (com.mbridge.msdk.f.b.a()) {
            eVar.a("gp_version", j.c(this.mContext));
        }
        eVar.a("version_flag", "1");
        f.a(eVar, this.mContext);
        f.a(eVar);
        f.c(eVar);
        f.e(eVar);
    }
}
