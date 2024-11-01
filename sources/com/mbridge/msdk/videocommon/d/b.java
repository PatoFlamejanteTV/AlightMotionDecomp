package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f24231d;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f24232c = false;

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f24233e = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f24230b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public static a f24229a = null;

    private b() {
    }

    public static b a() {
        if (f24231d == null) {
            synchronized (b.class) {
                try {
                    if (f24231d == null) {
                        f24231d = new b();
                    }
                } finally {
                }
            }
        }
        return f24231d;
    }

    public static boolean e(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (optJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(optString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private void g(String str, String str2) {
        if (this.f24232c) {
            return;
        }
        this.f24232c = true;
        new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2);
    }

    private void h(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.d.b(true), str, new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.videocommon.d.b.1
            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onFailed(String str3, String str4) {
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, str4);
            }

            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onSuccess(String str3, String str4, boolean z8) {
                k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 1, "");
            }
        });
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f24233e.remove(str);
        } catch (Exception unused) {
        }
    }

    public final a c() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.mbridge.msdk.videocommon.b.c("Virtual Item", 1));
        aVar.a(hashMap);
        aVar.b(hashMap2);
        aVar.a(43200L);
        aVar.b(5400L);
        aVar.c(3600L);
        aVar.d(3600L);
        aVar.e(5L);
        aVar.a(1);
        return aVar;
    }

    public final boolean d() {
        return this.f24232c;
    }

    public final void f(String str) {
        try {
            String a9 = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a9);
            jSONObject.put("current_time", System.currentTimeMillis());
            c(str, jSONObject.toString());
        } catch (Throwable th) {
            ad.b("RewardSettingManager", th.getMessage());
        }
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f24233e.contains(str);
    }

    public final a b() {
        a aVar = f24229a;
        if (aVar != null) {
            return aVar;
        }
        String a9 = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + com.mbridge.msdk.foundation.controller.c.m().k());
        if (!TextUtils.isEmpty(a9)) {
            a a10 = a.a(a9);
            if (a10 != null) {
                if (a10.i() + a10.d() > System.currentTimeMillis()) {
                    return a10;
                }
            }
            g(com.mbridge.msdk.foundation.controller.c.m().k(), com.mbridge.msdk.foundation.controller.c.m().b());
            return c();
        }
        g(com.mbridge.msdk.foundation.controller.c.m().k(), com.mbridge.msdk.foundation.controller.c.m().b());
        return c();
    }

    public final void d(String str, String str2) {
        try {
            String a9 = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a9);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            ad.b("RewardSettingManager", th.getMessage());
        }
    }

    public final String g(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str);
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f24233e.add(str);
        } catch (Exception unused) {
        }
    }

    public final c f(String str, String str2) {
        String str3 = "reward_" + str + "_" + str2;
        if (f24230b.containsKey(str3)) {
            return f24230b.get(str3);
        }
        c c8 = c.c(com.mbridge.msdk.foundation.a.a.a.a().a(str3));
        if (c8 != null) {
            f24230b.put(str3, c8);
        }
        return c8;
    }

    public final String e(String str, String str2) {
        return com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str + "_" + str2);
    }

    public final void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.c.c cVar) {
        if (!TextUtils.isEmpty(str3) && !this.f24233e.contains(str3)) {
            a(str3);
            new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, str3, cVar);
            return;
        }
        ad.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
    }

    public final a e() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.m().k();
        if (f24229a == null) {
            String a9 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            if (!TextUtils.isEmpty(a9)) {
                a a10 = a.a(a9);
                if (a10 != null) {
                    f24229a = a10;
                }
                return a10;
            }
        }
        return f24229a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.d.c a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reward"
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f24230b
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L42
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f24230b     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L32
            com.mbridge.msdk.videocommon.d.c r0 = (com.mbridge.msdk.videocommon.d.c) r0     // Catch: java.lang.Exception -> L32
            boolean r1 = r4.a(r0)     // Catch: java.lang.Exception -> L33
            goto L34
        L32:
            r0 = r2
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L41
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r4.a(r5, r1, r6, r2)
        L41:
            return r0
        L42:
            com.mbridge.msdk.foundation.a.a.a r1 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.d.c r1 = com.mbridge.msdk.videocommon.d.c.c(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L60
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
            return r2
        L60:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r5 = com.mbridge.msdk.videocommon.d.b.f24230b
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.a(java.lang.String, java.lang.String):com.mbridge.msdk.videocommon.d.c");
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, false);
        String str2 = c.f24238a;
        if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    public final c b(boolean z8) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.b.b(1, 60, null));
            cVar.a((List<com.mbridge.msdk.videocommon.b.b>) arrayList);
            cVar.m(1);
            cVar.l(1);
            cVar.n(1);
            cVar.q(1);
            cVar.o(1);
            cVar.p(1);
            cVar.h(3);
            cVar.i(80);
            cVar.j(100);
            cVar.k(0);
            cVar.g(2);
            cVar.e(-1);
            cVar.x(70);
            cVar.d(2);
            if (z8) {
                cVar.c(5);
            } else {
                cVar.c(-1);
            }
            cVar.b(0);
            cVar.a(0);
            cVar.f(1);
            cVar.r(1);
            cVar.t(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.u(1);
            cVar.v(1);
            cVar.w(60);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return cVar;
    }

    public final void c(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str, str2);
        f24229a = a.a(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.d.c a(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reward_"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f24230b
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L3f
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r7 = com.mbridge.msdk.videocommon.d.b.f24230b     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L2f
            com.mbridge.msdk.videocommon.d.c r7 = (com.mbridge.msdk.videocommon.d.c) r7     // Catch: java.lang.Exception -> L2f
            boolean r0 = r4.a(r7)     // Catch: java.lang.Exception -> L30
            goto L31
        L2f:
            r7 = r2
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L3e
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
        L3e:
            return r7
        L3f:
            com.mbridge.msdk.foundation.a.a.a r1 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.d.c r1 = com.mbridge.msdk.videocommon.d.c.c(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L64
            if (r1 != 0) goto L63
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
            com.mbridge.msdk.videocommon.d.c r5 = r4.b(r7)
            return r5
        L63:
            return r1
        L64:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r5 = com.mbridge.msdk.videocommon.d.b.f24230b
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.a(java.lang.String, java.lang.String, boolean):com.mbridge.msdk.videocommon.d.c");
    }

    private final boolean a(c cVar) {
        a b9 = b();
        if (b9 == null || cVar == null) {
            return true;
        }
        return cVar.x() + b9.e() <= System.currentTimeMillis();
    }

    public final void a(String str, String str2, String str3) {
        String str4 = "reward_" + str + "_" + str2;
        com.mbridge.msdk.foundation.a.a.a.a().a(str4, str3);
        f24230b.put(str4, c.c(str3));
        if (com.mbridge.msdk.f.b.a() || TextUtils.isEmpty(c.f24238a)) {
            return;
        }
        h(c.f24238a, str2);
    }

    public final void a(boolean z8) {
        this.f24232c = z8;
    }
}
