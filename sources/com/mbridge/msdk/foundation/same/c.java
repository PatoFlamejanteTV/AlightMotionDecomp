package com.mbridge.msdk.foundation.same;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* loaded from: classes4.dex */
    public static abstract class a {
        public abstract void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar);
    }

    public static String a(List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null && campaignEx.getCreativeId() != 0) {
                arrayList.add(campaignEx);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            try {
                CampaignEx campaignEx2 = (CampaignEx) arrayList.get(i8);
                if (campaignEx2 != null) {
                    long creativeId = campaignEx2.getCreativeId();
                    if (i8 == arrayList.size() - 1) {
                        sb.append(creativeId);
                    } else {
                        sb.append(creativeId);
                        sb.append(",");
                    }
                }
            } catch (Exception e8) {
                ad.a("SameCommon", "getCreativeID", e8);
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, CampaignEx campaignEx) {
        if (context != null && campaignEx != null) {
            boolean c8 = ai.c(context, campaignEx.getPackageName());
            if (ai.c(campaignEx) || campaignEx.getWtick() == 1 || !c8) {
                return true;
            }
        }
        return false;
    }

    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.b bVar, a aVar) {
        if (campaignEx == null || aVar == null) {
            return;
        }
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean c8 = ai.c(campaignEx);
        int d8 = ai.d(context, campaignEx.getPackageName());
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("cid", campaignEx.getId());
        dVar.a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
        dVar.a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
        dVar.a("ind", Integer.valueOf(d8));
        dVar.a("stage", 1);
        if (c8) {
            if (d8 != 1) {
                bVar.a("m_campaign_filtered", dVar);
                aVar.a("m_campaign_filtered", bVar);
            }
            bVar.a("m_campaign_ind_retarget", dVar);
            aVar.a("m_campaign_ind_retarget", bVar);
            return;
        }
        if (d8 == 1) {
            bVar.a("m_campaign_filtered", dVar);
            aVar.a("m_campaign_filtered", bVar);
        }
        bVar.a("m_campaign_ind_unretarget", dVar);
        aVar.a("m_campaign_ind_unretarget", bVar);
    }
}
