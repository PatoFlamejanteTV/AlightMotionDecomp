package com.mbridge.msdk.mbbanner.common.d;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;

/* loaded from: classes4.dex */
public final class a {
    public static void a(String str, CampaignEx campaignEx, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(c.m().c());
            StringBuilder sb = new StringBuilder();
            if (campaignEx.isBidCampaign()) {
                sb.append("hb=");
                sb.append(1);
                sb.append("&");
            }
            sb.append(LeanbackPreferenceDialogFragment.ARG_KEY);
            sb.append("=");
            sb.append(URLEncoder.encode("2000070", "utf-8"));
            sb.append("&");
            sb.append("rid_n");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestIdNotice(), "utf-8"));
            sb.append("&");
            sb.append("rid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getRequestId(), "utf-8"));
            sb.append("&");
            sb.append("cid");
            sb.append("=");
            sb.append(URLEncoder.encode(campaignEx.getId(), "utf-8"));
            sb.append("&");
            sb.append(MBridgeConstans.PROPERTIES_UNIT_ID);
            sb.append("=");
            sb.append(URLEncoder.encode(str, "utf-8"));
            sb.append("&");
            sb.append(CampaignEx.JSON_KEY_CLICK_URL);
            sb.append("=");
            sb.append(URLEncoder.encode(str2, "utf-8"));
            sb.append("&");
            sb.append("network_type");
            sb.append("=");
            sb.append(URLEncoder.encode(String.valueOf(z.l(c.m().c())), "utf-8"));
            if (e.a().b()) {
                e.a().a(sb.toString());
            } else {
                aVar.post(0, d.f().f20935c, k.a(sb.toString(), c.m().c(), str), new b() { // from class: com.mbridge.msdk.mbbanner.common.d.a.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str3) {
                        ad.a("", "Mraid Expand REPORT FAILED");
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str3) {
                        ad.a("", "Mraid Expand REPORT SUCCESS");
                    }
                });
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(com.mbridge.msdk.mbbanner.common.a.a aVar, String str) {
        if (aVar != null) {
            aVar.a("2000068");
            if (e.a().b()) {
                e.a().a(aVar.b());
            } else {
                h.a(aVar.b(), c.m().c(), str);
            }
        }
    }
}
