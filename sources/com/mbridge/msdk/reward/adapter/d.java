package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f22779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22780b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22781c;

    /* renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.videocommon.d.c f22782d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22783e;

    public d(String str, String str2, boolean z8, com.mbridge.msdk.videocommon.d.c cVar, String str3) {
        this.f22779a = str;
        this.f22780b = str2;
        this.f22781c = z8;
        this.f22782d = cVar;
        this.f22783e = str3;
    }

    public final e a(boolean z8, String str, int i8, String str2, String str3, String str4, String str5, boolean z9, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str6;
        String str7;
        String str8;
        String str9;
        String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        if (z8) {
            i10 = 2;
        } else {
            i10 = 3;
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.f22782d;
        if (cVar != null) {
            i11 = cVar.t();
            i12 = this.f22782d.u();
        } else {
            i11 = 0;
            i12 = 0;
        }
        String a9 = com.mbridge.msdk.foundation.same.a.d.a(this.f22780b, "reward");
        if (this.f22781c) {
            i13 = 287;
        } else {
            i13 = 94;
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.APP_ID, k8);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f22780b);
        if (!TextUtils.isEmpty(this.f22779a)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f22779a);
        }
        String str10 = "";
        if (com.mbridge.msdk.f.b.a()) {
            if (str4 == null) {
                str8 = "";
            } else {
                str8 = str4;
            }
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ttc_ids", str8);
            if (str3 == null) {
                str9 = "";
            } else {
                str9 = str3;
            }
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "install_ids", str9);
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "req_type", String.valueOf(i10));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_num", String.valueOf(i11));
        if (this.f22781c) {
            i12 = 1;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "tnum", String.valueOf(i12));
        String str11 = "1";
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, e.f20968d, a9);
        String str12 = e.f20969e;
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, str12, str6);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        String str13 = e.f20970f;
        if (str2 == null) {
            str7 = "";
        } else {
            str7 = str2;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, str13, str7);
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ad_type", String.valueOf(i13));
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, TypedValues.CycleType.S_WAVE_OFFSET, String.valueOf(i8));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "token", str5);
        }
        if (this.f22781c) {
            if (i9 != com.mbridge.msdk.foundation.same.a.f20636H && i9 != com.mbridge.msdk.foundation.same.a.f20635G) {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            } else {
                com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "ivrwd", "1");
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar2 = this.f22782d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.k())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "u_stid", this.f22782d.k());
        }
        com.mbridge.msdk.videocommon.d.a b9 = com.mbridge.msdk.videocommon.d.b.a().b();
        if (b9 != null && !TextUtils.isEmpty(b9.b())) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "r_stid", b9.b());
        }
        if (!z9) {
            str11 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "rw_plus", str11);
        String d8 = ai.d(this.f22780b);
        if (!TextUtils.isEmpty(d8)) {
            com.mbridge.msdk.foundation.same.net.g.b.a(eVar, "j", d8);
        }
        String str14 = this.f22783e;
        if (str14 != null) {
            str10 = str14;
        }
        com.mbridge.msdk.foundation.same.net.g.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str10);
        return eVar;
    }
}
