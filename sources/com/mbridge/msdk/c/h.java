package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19256a = "h";

    /* renamed from: b, reason: collision with root package name */
    private static volatile h f19257b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f19258c;

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, k> f19259d = new HashMap<>();

    private h() {
    }

    public static void a(Context context, String str) {
        FastKV fastKV;
        com.mbridge.msdk.foundation.controller.d.a();
        Map<String, Object> map = null;
        try {
            fastKV = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "mbridge").build();
        } catch (Exception unused) {
            fastKV = null;
        }
        if (fastKV != null) {
            try {
                map = fastKV.getAll();
            } catch (Exception unused2) {
            }
            if (map != null) {
                try {
                    for (String str2 : map.keySet()) {
                        if (str2.startsWith(str + "_")) {
                            f19259d.put(str2, k.g((String) map.get(str2)));
                        }
                    }
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            Map<String, ?> all = context.getSharedPreferences("mbridge", 0).getAll();
            for (String str3 : all.keySet()) {
                if (str3.startsWith(str + "_")) {
                    f19259d.put(str3, k.g((String) all.get(str3)));
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private k i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
        }
        String str3 = str + "_" + str2;
        if (f19259d.containsKey(str3)) {
            return f19259d.get(str3);
        }
        k kVar = null;
        try {
            kVar = k.g(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
            f19259d.put(str3, kVar);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return kVar;
    }

    public final g b(String str) {
        if (f19258c == null) {
            try {
                String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (!TextUtils.isEmpty(a9)) {
                    JSONObject jSONObject = new JSONObject(a9);
                    if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    }
                    if (jSONObject.has("c")) {
                        jSONObject.remove("c");
                    }
                    f19258c = g.e(jSONObject.toString());
                    if (f19258c != null) {
                        f19258c.aK();
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return f19258c;
    }

    public final String c(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str);
    }

    public final k d(String str, String str2) {
        k i8 = i(str, str2);
        if (i8 != null && i8.v() == 0) {
            i8.a(1);
        }
        return i8;
    }

    public final boolean e(String str, String str2) {
        g b9 = b(str2);
        if (d(str2) && a(str2, 1, str)) {
            new j().a(com.mbridge.msdk.foundation.controller.c.m().c(), str2, com.mbridge.msdk.foundation.controller.c.m().b());
        }
        k d8 = d(str2, str);
        if (b9 != null && d8 != null) {
            long as = b9.as() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long i8 = d8.i() + as;
            if (i8 > currentTimeMillis) {
                ad.c(f19256a, "unit setting  nexttime is not ready  [settingNextRequestTime= " + i8 + " currentTime = " + currentTimeMillis + "]");
                return false;
            }
        }
        ad.c(f19256a, "unit setting timeout or not exists");
        return true;
    }

    public final void f(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a("ivreward_" + str, str2);
    }

    public final String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            return a9 == null ? "" : a9;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            return "";
        }
    }

    public final void h(String str, String str2) {
        try {
            String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str2);
            if (!TextUtils.isEmpty(a9)) {
                JSONObject jSONObject = new JSONObject(a9);
                jSONObject.put("current_time", System.currentTimeMillis());
                a(str, str2, jSONObject.toString());
            }
        } catch (Throwable th) {
            ad.b(f19256a, th.getMessage());
        }
    }

    public final k c(String str, String str2) {
        k d8 = d(str, str2);
        return d8 == null ? k.y() : d8;
    }

    public final void f(String str) {
        try {
            String g8 = g(str);
            if (TextUtils.isEmpty(g8)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(g8);
            jSONObject.put("current_time", System.currentTimeMillis());
            g(str, jSONObject.toString());
        } catch (Throwable th) {
            ad.b(f19256a, th.getMessage());
        }
    }

    public final boolean d(String str) {
        g b9 = b(str);
        if (b9 != null) {
            long E8 = b9.E() * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            long A8 = b9.A() + E8;
            if (A8 > currentTimeMillis) {
                ad.c(f19256a, "app setting nexttime is not ready  [settingNextRequestTime= " + A8 + " currentTime = " + currentTimeMillis + "]");
                return false;
            }
        }
        ad.c(f19256a, "app setting timeout or not exists");
        return true;
    }

    public final void g(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a(str, str2);
        f19258c = g.e(str2);
        if (f19258c != null) {
            f19258c.aK();
        }
    }

    public final void e(String str) {
        com.mbridge.msdk.foundation.a.a.a.a().c("ivreward_" + str);
    }

    public final k b(String str, String str2) {
        return i(str, str2);
    }

    public static h a() {
        if (f19257b == null) {
            synchronized (h.class) {
                try {
                    if (f19257b == null) {
                        f19257b = new h();
                    }
                } finally {
                }
            }
        }
        return f19257b;
    }

    public final g a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i.a();
            }
            g b9 = b(str);
            return b9 == null ? i.a() : b9;
        } catch (Exception unused) {
            return i.a();
        }
    }

    public final boolean a(String str, int i8, String str2) {
        try {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            String str3 = str + "_" + i8 + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j8 = 0;
            long longValue = ((Long) al.a(c8, str3, 0L)).longValue();
            g b9 = b(str);
            if (b9 == null) {
                a();
                b9 = i.a();
            } else {
                j8 = longValue;
            }
            if (j8 + (b9.an() * 1000) > currentTimeMillis) {
                return false;
            }
            al.b(c8, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public final void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        com.mbridge.msdk.foundation.a.a.a.a().a(str4, str3);
        f19259d.put(str4, k.g(str3));
    }

    public final k a(String str, String str2) {
        k i8 = i(str, str2);
        return i8 == null ? k.y() : i8;
    }
}
