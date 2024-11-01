package com.mbridge.msdk.video.dynview.i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {
    public static String a(Context context, int i8) {
        String str;
        if (i8 == 1) {
            str = "_por";
        } else {
            str = "_land";
        }
        String s8 = z.s(context);
        if (s8.startsWith("zh")) {
            if (!s8.contains("TW") && !s8.contains("HK")) {
                return "mbridge_reward_two_title_zh";
            }
            return "mbridge_reward_two_title_zh_trad";
        }
        if (s8.startsWith("ja")) {
            return "mbridge_reward_two_title_japan" + str;
        }
        if (s8.startsWith(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
            return "mbridge_reward_two_title_germany" + str;
        }
        if (s8.startsWith("ko")) {
            return "mbridge_reward_two_title_korea" + str;
        }
        if (s8.startsWith("fr")) {
            return "mbridge_reward_two_title_france" + str;
        }
        if (s8.startsWith("ar")) {
            return "mbridge_reward_two_title_arabia" + str;
        }
        if (s8.startsWith("ru")) {
            return "mbridge_reward_two_title_russian" + str;
        }
        return "mbridge_reward_two_title_en" + str;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter("alecfc");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return queryParameter;
                }
            }
            return "";
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            return "";
        }
    }

    public static int a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
            int f8 = campaignEx.getRewardTemplateMode().f();
            if (f8 == 302 || f8 == 802 || f8 == 902) {
                return -3;
            }
            if (f8 == 904) {
                return !a(campaignEx.getRewardTemplateMode().e()) ? -1 : -3;
            }
        }
        return 100;
    }
}
