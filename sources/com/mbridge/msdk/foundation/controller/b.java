package com.mbridge.msdk.foundation.controller;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.b.d> f20325a;

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static b f20326a = new b();
    }

    public static b a() {
        return a.f20326a;
    }

    private b() {
        this.f20325a = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.foundation.b.d a(java.lang.String r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f20325a
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f20325a = r0
        Lb:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f20325a
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L8b
            if (r8 != 0) goto L63
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L55
            r0.<init>()     // Catch: java.lang.Exception -> L55
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L53
            r8.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "c_cb"
            r2 = 0
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "t_disc"
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "u_disc"
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "max_ecppv_diff"
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "max_cache_num"
            r2 = 20
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "max_usage_limit"
            r2 = 10
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r1 = "time_interval"
            r2 = 7200(0x1c20, float:1.009E-41)
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L53
            r0.put(r8)     // Catch: java.lang.Exception -> L53
        L51:
            r8 = r0
            goto L63
        L53:
            r8 = move-exception
            goto L59
        L55:
            r0 = move-exception
            r5 = r0
            r0 = r8
            r8 = r5
        L59:
            java.lang.String r1 = "CandidateController"
            java.lang.String r8 = r8.getMessage()
            android.util.Log.e(r1, r8)
            goto L51
        L63:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f20325a
            if (r0 != 0) goto L6e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f20325a = r0
        L6e:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f20325a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L7f
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f20325a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.foundation.b.d r7 = (com.mbridge.msdk.foundation.b.d) r7
            goto L8a
        L7f:
            com.mbridge.msdk.foundation.b.d r0 = new com.mbridge.msdk.foundation.b.d
            r0.<init>(r7, r8)
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f20325a
            r8.put(r7, r0)
            r7 = r0
        L8a:
            return r7
        L8b:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f20325a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.foundation.b.d r7 = (com.mbridge.msdk.foundation.b.d) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.b.a(java.lang.String, org.json.JSONArray):com.mbridge.msdk.foundation.b.d");
    }
}
