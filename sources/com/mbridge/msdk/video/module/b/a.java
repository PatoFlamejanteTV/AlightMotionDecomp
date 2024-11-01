package com.mbridge.msdk.video.module.b;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ao;

/* loaded from: classes4.dex */
public final class a {
    public static void a(String str, CampaignEx campaignEx, d dVar) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str) && campaignEx != null && dVar != null) {
            try {
                String mof_template_url = campaignEx.getMof_template_url();
                String str4 = "";
                if (TextUtils.isEmpty(mof_template_url)) {
                    str2 = "";
                    str3 = str2;
                } else {
                    str3 = ao.a(mof_template_url, "cltp");
                    str2 = ao.a(mof_template_url, "xt");
                }
                if (!TextUtils.isEmpty(str3)) {
                    dVar.a("cltp", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    dVar.a("xt", str2);
                }
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                if (rewardTemplateMode != null) {
                    String e8 = rewardTemplateMode.e();
                    if (!TextUtils.isEmpty(e8)) {
                        str4 = ao.a(e8, "alecfc");
                    }
                }
                if (!TextUtils.isEmpty(str4)) {
                    dVar.a("alecfc", str4);
                }
                c.a().a(str, campaignEx, dVar);
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
        }
    }
}
