package com.mbridge.msdk.mbbanner.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.g;
import com.mbridge.msdk.foundation.same.a.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BannerUtils {
    private static final String TAG = "BannerUtils";

    private static synchronized List<com.mbridge.msdk.foundation.same.d.a> fillIdInList(List<com.mbridge.msdk.foundation.same.d.a> list, List<CampaignEx> list2) {
        synchronized (BannerUtils.class) {
            if (list2 != null) {
                try {
                    if (list2.size() > 0) {
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        for (CampaignEx campaignEx : list2) {
                            if (campaignEx != null) {
                                com.mbridge.msdk.foundation.same.d.a aVar = new com.mbridge.msdk.foundation.same.d.a(campaignEx.getId(), campaignEx.getCreativeId());
                                if (list.size() >= 20) {
                                    list.remove(0);
                                }
                                list.add(aVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return list;
    }

    public static String getCloseIds(String str) {
        List<com.mbridge.msdk.foundation.same.d.a> list;
        try {
            Map<String, List<com.mbridge.msdk.foundation.same.d.a>> map = d.f20684a;
            if (map == null || !an.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i8 = 0; i8 < list.size(); i8++) {
                JSONObject jSONObject = new JSONObject();
                com.mbridge.msdk.foundation.same.d.a aVar = list.get(i8);
                jSONObject.put("cid", aVar.a());
                jSONObject.put("crid", aVar.b());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static void inserCloseId(String str, List<CampaignEx> list) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> map = d.f20684a;
        if (map != null && list != null && list.size() > 0) {
            if (an.b(str)) {
                if (map.containsKey(str)) {
                    map.put(str, fillIdInList(map.get(str), list));
                } else {
                    map.put(str, fillIdInList(new ArrayList(), list));
                }
            }
            d.f20684a = map;
        }
    }

    public static CampaignEx managerCampaignEX(String str, CampaignEx campaignEx) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject campaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(campaignToJsonObject);
                if (parseCampaignWithBackData == null) {
                    parseCampaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    String optString = campaignToJsonObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                    if (!TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f20661j);
                    if (optJSONObject != null) {
                        str2 = String.valueOf(ai.a(c.m().c(), Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f20659h)).intValue()));
                        str3 = String.valueOf(ai.a(c.m().c(), Integer.valueOf(optJSONObject.getString(com.mbridge.msdk.foundation.same.a.f20660i)).intValue()));
                    } else {
                        str2 = "-999";
                        str3 = "-999";
                    }
                    parseCampaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(parseCampaignWithBackData.getClickURL(), str2, str3));
                    String noticeUrl = parseCampaignWithBackData.getNoticeUrl();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f20659h.equals(next) || com.mbridge.msdk.foundation.same.a.f20660i.equals(next)) {
                                optString2 = String.valueOf(ai.a(c.m().c(), Integer.valueOf(optString2).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(optString2);
                        }
                        parseCampaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return parseCampaignWithBackData;
            } catch (Throwable unused) {
                return campaignEx;
            }
        }
        try {
            JSONObject campaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys2 = jSONObject.keys();
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    campaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused2) {
            }
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                campaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx parseCampaignWithBackData2 = CampaignEx.parseCampaignWithBackData(campaignToJsonObject2);
            String optString3 = campaignToJsonObject2.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (!TextUtils.isEmpty(optString3)) {
                parseCampaignWithBackData2.setCampaignUnitId(optString3);
            }
            return parseCampaignWithBackData2;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return campaignEx;
        }
    }

    public static void uisList(Context context, List<CampaignEx> list) {
        if (context != null && list != null && list.size() != 0) {
            k a9 = k.a(h.a(context));
            for (int i8 = 0; i8 < list.size(); i8++) {
                CampaignEx campaignEx = list.get(i8);
                if (a9 != null && !a9.b(campaignEx.getId())) {
                    g gVar = new g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    a9.a(gVar);
                }
            }
        }
    }
}
