package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class d {
    public static int a(CampaignEx campaignEx, String str) {
        int b9;
        if (campaignEx == null) {
            return -1;
        }
        try {
            if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                b9 = ai.b(campaignEx.getMof_template_url());
            } else {
                b9 = ai.b(str);
            }
            return b9;
        } catch (Exception e8) {
            ad.b("SameTools", e8.getMessage());
            return -1;
        }
    }
}
