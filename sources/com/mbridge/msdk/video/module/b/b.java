package com.mbridge.msdk.video.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f23829a = new HashMap<>();

    public static void a(String str) {
        f23829a.remove(str);
    }

    public static void b(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().j() != null) {
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().j(), false, false);
        }
    }

    public static void c(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().k() != null) {
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().k(), false, false);
        }
    }

    public static void d(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            ArrayList<String> arrayList = f23829a.get(campaignUnitId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                f23829a.put(campaignUnitId, arrayList);
            }
            if (!arrayList.contains(campaignEx.getId())) {
                try {
                    c.a().a("2000142", campaignEx);
                } catch (Exception unused) {
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
                arrayList.add(campaignEx.getId());
            }
        }
    }

    public static void e(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().s() != null) {
            c.a().a("2000143", campaignEx);
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().s(), false, false);
        }
    }

    public static void f(Context context, CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().m() != null) {
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m(), false, false);
        }
    }

    public static void a(String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
            e a9 = k.a(str, com.mbridge.msdk.foundation.controller.c.m().c(), str2);
            a9.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
            aVar.post(0, d.f().f20935c, a9, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.module.b.b.1
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(String str3) {
                    ad.b("VideoViewReport", str3);
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b("VideoViewReport", str3);
                }
            });
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b("VideoViewReport", e8.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        c.a().a("2000141", campaignEx);
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().p(), false, false);
    }

    public static void a(Context context, CampaignEx campaignEx, int i8, int i9) {
        try {
            String[] r8 = campaignEx.getNativeVideoTracking().r();
            if (campaignEx.getNativeVideoTracking() == null || r8 == null) {
                return;
            }
            String[] strArr = new String[r8.length];
            for (int i10 = 0; i10 < r8.length; i10++) {
                String str = r8[i10];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i8);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = x.b(jSONObject2);
                }
                if (!TextUtils.isEmpty(jSONObject2)) {
                    str = str + "&value=" + URLEncoder.encode(jSONObject2);
                }
                strArr[i10] = campaignEx.getSpareOfferFlag() == 1 ? str + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i9 : str + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i9;
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", Integer.valueOf(i8));
                c.a().a("2000144", campaignEx, dVar);
                c.a().a("2000147", campaignEx, dVar);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
        } catch (Throwable unused2) {
            ad.b("VideoViewReport", "reportEndcardshowData error");
        }
    }

    public static void a(Context context, CampaignEx campaignEx, int i8, int i9, int i10) {
        String str;
        if (i9 == 0 || context == null || campaignEx == null) {
            return;
        }
        try {
            List<Map<Integer, String>> i11 = campaignEx.getNativeVideoTracking().i();
            int i12 = ((i8 + 1) * 100) / i9;
            if (i11 != null) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < i11.size()) {
                    Map<Integer, String> map = i11.get(i13);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        int i15 = i13;
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            Integer key = next.getKey();
                            int intValue = key.intValue();
                            String value = next.getValue();
                            if (campaignEx.getSpareOfferFlag() == 1) {
                                str = value + "&to=1&cbt=" + campaignEx.getCbt() + "&tmorl=" + i10;
                            } else {
                                str = value + "&to=0&cbt=" + campaignEx.getCbt() + "&tmorl=" + i10;
                            }
                            if (intValue <= i12 && !TextUtils.isEmpty(str)) {
                                String[] strArr = {str};
                                if (i14 < 1) {
                                    i14++;
                                    try {
                                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                                        dVar.a("percent", key);
                                        c.a().a("2000140", campaignEx, dVar);
                                    } catch (Exception unused) {
                                    }
                                }
                                int i16 = i14;
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), strArr, false, true);
                                it.remove();
                                i11.remove(i15);
                                i15--;
                                i14 = i16;
                            }
                        }
                        i13 = i15;
                    }
                    i13++;
                }
            }
        } catch (Throwable unused2) {
            ad.b("VideoViewReport", "reportPlayPercentageData error");
        }
    }

    public static void a(CampaignEx campaignEx, Map<Integer, String> map, String str, int i8) {
        if (campaignEx == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i8 == key.intValue() && !TextUtils.isEmpty(value)) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, str, value, false, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAdUrlList() == null || campaignEx.getAdUrlList().size() <= 0) {
                    return;
                }
                for (String str2 : campaignEx.getAdUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, str, str2, false, false);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (campaignEx == null || cVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.video.module.c.b bVar = new com.mbridge.msdk.video.module.c.b(com.mbridge.msdk.foundation.controller.c.m().c());
            e eVar = new e();
            eVar.a("user_id", x.b(str2));
            eVar.a("cb_type", "1");
            eVar.a(CampaignEx.JSON_KEY_REWARD_NAME, cVar.a());
            eVar.a(CampaignEx.JSON_KEY_REWARD_AMOUNT, cVar.b() + "");
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("click_id", campaignEx.getRequestIdNotice());
            if (!TextUtils.isEmpty(str3)) {
                eVar.a("extra", str3);
            }
            bVar.addExtraParams("", eVar);
            String str6 = campaignEx.getHost() + "/addReward?";
            String trim = eVar.b().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!str6.endsWith("?") && !str6.endsWith("&")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str6);
                    if (!str6.contains("?")) {
                        str4 = "?";
                    }
                    sb.append(str4);
                    str6 = sb.toString();
                }
                str5 = str6 + trim;
            }
            String str7 = str5;
            ad.b("VideoViewReport", "rewardUrl:" + str7);
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, campaignEx.getCampaignUnitId(), str7, false, false);
        } catch (Throwable th) {
            ad.a("VideoViewReport", th.getMessage(), th);
        }
    }
}
