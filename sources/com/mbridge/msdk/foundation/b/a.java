package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static int f20241b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static String f20242c = "BaseCandidateCache";

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.foundation.db.c f20243a;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f20244d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f20245e;

    /* renamed from: f, reason: collision with root package name */
    private String f20246f;

    /* renamed from: com.mbridge.msdk.foundation.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0396a {

        /* renamed from: a, reason: collision with root package name */
        private b f20248a;

        /* renamed from: b, reason: collision with root package name */
        private double f20249b;

        public C0396a(double d8, b bVar) {
            this.f20249b = d8;
            this.f20248a = bVar;
        }

        public final b a() {
            return this.f20248a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f20244d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i8 = 0; i8 < this.f20244d.length(); i8++) {
                try {
                    JSONObject optJSONObject = this.f20244d.optJSONObject(i8);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f20245e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return null;
        }
        return this.f20244d.optJSONObject(0);
    }

    public final String b(String str) {
        c c8 = c(str);
        if (c8 != null && c8.g() != c.f20262c && c8.g() != c.f20260a) {
            String[] split = x.a(str.split("_")[3]).split("\\|");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public final c c(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f20244d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a9 = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a9)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.f20260a);
                    return cVar;
                }
                String[] split = a9.split("\\|");
                if (split.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.f20260a);
                    return cVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.f20260a);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f20246f)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f20262c);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.f20260a);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.f20260a);
        return cVar;
    }

    public final double d(String str) {
        c c8 = c(str);
        if (c8 != null && c8.g() != c.f20262c && c8.g() != c.f20260a) {
            try {
                String[] split = x.a(str.split("_")[3]).split("\\|");
                if (split.length > 0) {
                    return Double.parseDouble(split[0]);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return -1.0d;
    }

    public final void e(String str) {
        this.f20246f = str;
    }

    private List<String> b(List<String> list, int i8, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            arrayList.add(a(list.get(i9), i8, str, str2));
        }
        return arrayList;
    }

    public final void a(JSONArray jSONArray) {
        this.f20244d = jSONArray;
    }

    public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i8, String str2, int i9, double d8) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        CampaignEx campaignEx = list.get(i10);
                        campaignEx.setReadyState(0);
                        if (bVar != null) {
                            campaignEx.setNLRid(bVar.f());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i8);
                        String b9 = x.b(d8 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i9, str, b9));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i9, str, b9));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i9, str, b9));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i9, str, b9));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i9, str, b9));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.k(a(nativeVideoTracking.l(), i9, str, b9));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i9, str, b9));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i9, str, b9));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i9, str, b9));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i9, str, b9));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i9, str, b9));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i9, str, b9));
                            nativeVideoTracking.u(a(nativeVideoTracking.v(), i9, str, b9));
                            nativeVideoTracking.t(a(nativeVideoTracking.v(), i9, str, b9));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i9, str, b9));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i9, str, b9));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i9, str, b9));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i9, str, b9));
                            nativeVideoTracking.n(a(nativeVideoTracking.o(), i9, str, b9));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i9, str, b9));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i9, str, b9));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i9, str, b9));
                            nativeVideoTracking.i(a(nativeVideoTracking.j(), i9, str, b9));
                            nativeVideoTracking.j(a(nativeVideoTracking.k(), i9, str, b9));
                            nativeVideoTracking.l(a(nativeVideoTracking.m(), i9, str, b9));
                            nativeVideoTracking.a(a(nativeVideoTracking.i(), i9, str, b9));
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i9, str, b9));
                            nativeVideoTracking.m(a(nativeVideoTracking.n(), i9, str, b9));
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(b(campaignEx.getPv_urls(), i9, str, b9));
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final c a() {
        JSONArray jSONArray;
        c cVar = new c();
        try {
            jSONArray = this.f20244d;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f20262c);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            if (this.f20243a == null) {
                cVar.d("db error");
                cVar.a(c.f20262c);
                return cVar;
            }
            return cVar;
        }
        cVar.d("setting config is null");
        cVar.a(c.f20260a);
        return cVar;
    }

    public final void a(List<C0396a> list, int i8) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new Comparator<C0396a>() { // from class: com.mbridge.msdk.foundation.b.a.1
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(C0396a c0396a, C0396a c0396a2) {
                            return Double.compare(c0396a.f20249b, c0396a2.f20249b);
                        }
                    });
                    int size = list.size() - i8;
                    if (size > 0) {
                        List<C0396a> subList = list.subList(0, size);
                        if (this.f20243a == null || subList.size() <= 0) {
                            return;
                        }
                        for (int i9 = 0; i9 < subList.size(); i9++) {
                            b bVar = subList.get(i9).f20248a;
                            this.f20243a.a(this.f20246f, bVar.e(), bVar.d());
                            a(f20241b, 1, null, true, bVar.e(), bVar.d(), -1, this.f20246f);
                        }
                    }
                }
            } catch (Exception e8) {
                ad.a(f20242c, e8);
            }
        }
    }

    private String a(String str, int i8, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (ao.c(str) > 0) {
            return str + "&ca_sce=" + i8 + "&real_rid=" + str2 + "&real_bp=" + str3;
        }
        return str + "?ca_sce=" + i8 + "&real_rid=" + str2 + "&real_bp=" + str3;
    }

    private String a(Map<Integer, String> map, int i8, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i8, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i8, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i9 = 0; i9 < strArr.length; i9++) {
            strArr2[i9] = a(strArr[i9], i8, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> a(List<Map<Integer, String>> list, int i8, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Map<Integer, String> map = list.get(i9);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i8, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public final long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String a9 = x.a(ecppv);
        if (TextUtils.isEmpty(a9)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(a9) <= 0.0d) {
                return 0L;
            }
            JSONObject a10 = a(b(str));
            int optInt = a10 != null ? a10.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f20243a;
            if (cVar == null || optInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f20246f);
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public final void a(String str, String str2, int i8, String str3) {
        try {
            if (this.f20243a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i8 == 1) {
                this.f20243a.a(str2, str, this.f20246f, i8);
                a(f20241b, 3, null, true, str2, str, -1, this.f20246f);
            } else if (i8 == 2) {
                this.f20243a.a(this.f20246f, str2, str);
                a(f20241b, 1, null, true, str2, str, -1, this.f20246f);
            } else if (i8 == 3) {
                this.f20243a.b(str2, str, this.f20246f);
                a(f20241b, 4, null, true, str2, str, -1, this.f20246f);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:3:0x0011, B:6:0x0031, B:8:0x0069, B:11:0x0079, B:13:0x007f, B:17:0x0086, B:19:0x0091, B:22:0x0098, B:24:0x009e, B:26:0x00a6, B:28:0x0104, B:32:0x0108, B:36:0x0113, B:39:0x0119, B:42:0x011f, B:44:0x012d, B:46:0x0131, B:48:0x0142, B:50:0x0148, B:52:0x0150, B:54:0x0168, B:57:0x016b, B:59:0x017f, B:61:0x0187, B:62:0x018c, B:69:0x0177), top: B:2:0x0011, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.b.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final List<b> a(int i8, long j8) {
        com.mbridge.msdk.foundation.db.c cVar;
        if (i8 >= 0 && (cVar = this.f20243a) != null) {
            cVar.a(this.f20246f, i8);
            a(f20241b, 1, null, true, "", "", i8, this.f20246f);
        }
        com.mbridge.msdk.foundation.db.c cVar2 = this.f20243a;
        if (cVar2 != null) {
            return cVar2.a(this.f20246f, 0, j8);
        }
        return null;
    }
}
