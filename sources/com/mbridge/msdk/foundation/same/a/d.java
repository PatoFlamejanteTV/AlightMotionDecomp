package com.mbridge.msdk.foundation.same.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> f20687d = null;

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f20688e = null;

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f20689f = null;

    /* renamed from: n, reason: collision with root package name */
    private static final String f20697n = "d";

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20684a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20685b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20686c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20690g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20691h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20692i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20693j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, Long> f20694k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20695l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f20696m = new HashMap();

    public static void a(String str, String str2, String str3, long j8, long j9, long j10) {
        if (f20687d == null) {
            f20687d = new ConcurrentHashMap<>();
        }
        try {
            if (f20687d.containsKey(str)) {
                ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap = f20687d.get(str);
                if (concurrentHashMap != null) {
                    com.mbridge.msdk.foundation.entity.c cVar = concurrentHashMap.get(str2);
                    if (cVar == null) {
                        com.mbridge.msdk.foundation.entity.c cVar2 = new com.mbridge.msdk.foundation.entity.c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        cVar2.a(arrayList);
                        cVar2.a(j8);
                        cVar2.b(j9);
                        cVar2.c(j10);
                        concurrentHashMap.put(str2, cVar2);
                        return;
                    }
                    if (cVar.c() != null) {
                        cVar.a(j8);
                        cVar.b(j9);
                        cVar.c(j10);
                        cVar.c().add(str3);
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap2 = new ConcurrentHashMap<>();
            com.mbridge.msdk.foundation.entity.c cVar3 = new com.mbridge.msdk.foundation.entity.c();
            cVar3.a(arrayList2);
            cVar3.a(j8);
            cVar3.b(j9);
            cVar3.c(j10);
            concurrentHashMap2.put(str2, cVar3);
            f20687d.put(str, concurrentHashMap2);
        } catch (Throwable th) {
            ad.b(f20697n, th.getMessage());
        }
    }

    public static String b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f20689f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f20689f.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f20687d) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f20687d.remove(str);
            return;
        }
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMap2 = f20687d.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2)) {
            return;
        }
        concurrentHashMap2.remove(str2);
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d(String str) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    c8 = 1;
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c8 = 2;
                    break;
                }
                break;
            case -895866265:
                if (str.equals("splash")) {
                    c8 = 3;
                    break;
                }
                break;
            case 538816457:
                if (str.equals("h5_native")) {
                    c8 = 4;
                    break;
                }
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c8 = 5;
                    break;
                }
                break;
            case 1844104930:
                if (str.equals("interactive")) {
                    c8 = 6;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return f20685b;
            case 1:
                return f20692i;
            case 2:
                return f20693j;
            case 3:
                return f20695l;
            case 4:
                return f20686c;
            case 5:
                return f20691h;
            case 6:
                return f20690g;
            default:
                return null;
        }
    }

    public static com.mbridge.msdk.foundation.entity.d b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        com.mbridge.msdk.foundation.entity.d dVar = new com.mbridge.msdk.foundation.entity.d();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return dVar;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f20688e;
            if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f20688e.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                dVar.a(1);
                dVar.c(concurrentHashMap.get(str2));
            }
        } catch (Exception e8) {
            ad.a(f20697n, e8.getMessage());
        }
        return dVar;
    }

    public static void c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f20689f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f20689f.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    public static void d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f20688e;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f20688e.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e8) {
            ad.a(f20697n, e8.getMessage());
        }
    }

    public static void a(String str, String str2, int i8) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f20689f == null) {
            f20689f = new ConcurrentHashMap<>();
        }
        try {
            if (f20689f.containsKey(str)) {
                copyOnWriteArrayList = f20689f.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f20689f.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i8;
            if (size >= 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    copyOnWriteArrayList.remove(i9);
                }
            }
        } catch (Exception e8) {
            ad.a(f20697n, e8.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f20688e == null) {
                f20688e = new ConcurrentHashMap<>();
            }
            if (f20688e.containsKey(str)) {
                if (f20688e.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f20688e.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f20688e.put(str, concurrentHashMap2);
        } catch (Exception e8) {
            ad.a(f20697n, e8.getMessage());
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d8;
        List<com.mbridge.msdk.foundation.same.d.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f20692i.containsKey(str)) {
                d8 = f20692i;
            } else if (f20693j.containsKey(str)) {
                d8 = f20693j;
            } else if (f20690g.containsKey(str)) {
                d8 = f20690g;
            } else if (f20696m.containsKey(str)) {
                d8 = f20696m;
            } else if (f20691h.containsKey(str)) {
                d8 = f20691h;
            } else if (f20685b.containsKey(str)) {
                d8 = f20685b;
            } else if (f20695l.containsKey(str)) {
                d8 = f20695l;
            } else {
                d8 = f20686c.containsKey(str) ? f20686c : null;
            }
        } else {
            d8 = d(str2);
        }
        if (d8 != null) {
            try {
                if (an.b(str) && d8.containsKey(str) && (list = d8.get(str)) != null && list.size() > 0) {
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", list.get(i8).a());
                        jSONObject.put("1", list.get(i8).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public static ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c>> concurrentHashMap = f20687d;
        if (concurrentHashMap == null) {
            f a9 = f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            if (a9 != null) {
                a9.d(str, "");
                f20687d = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f20687d.get(str);
        }
        return null;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d8 = d(str2);
        if (campaignEx == null || d8 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.d.a aVar = new com.mbridge.msdk.foundation.same.d.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (d8.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.d.a> list = d8.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            d8.put(str, arrayList);
        } catch (Throwable th) {
            ad.a(f20697n, th.getMessage(), th);
        }
    }
}
