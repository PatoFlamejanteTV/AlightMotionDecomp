package com.mbridge.msdk.f;

import N.C1344g;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f20232a = "";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f20233b = false;

    public static boolean a(boolean z8) {
        return f20233b && z8;
    }

    public static boolean b() {
        if (!af.a().a("cronet_engine_open", false) || !f20233b) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        return f20233b;
    }

    private static String d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.m().c().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.m().c()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    ad.b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            ad.b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }

    public static void a() {
        if (af.a().a("cronet_env_check", false)) {
            try {
                C1344g.n().a(com.mbridge.msdk.foundation.controller.c.m().c());
                C1344g.n().k(com.mbridge.msdk.foundation.controller.c.m().c(), 11925000);
                try {
                    String d8 = d();
                    boolean z8 = !TextUtils.isEmpty(d8);
                    f20233b = z8;
                    if (z8) {
                        f20232a = d8;
                    }
                } catch (Throwable th) {
                    ad.b("CronetEnvCheckUtil", th.getMessage());
                }
            } catch (Throwable th2) {
                ad.b("CronetEnvCheckUtil", th2.getMessage());
                f20233b = false;
            }
        }
    }
}
