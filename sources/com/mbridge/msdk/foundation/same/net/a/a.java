package com.mbridge.msdk.foundation.same.net.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f20819a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f20820b;

    /* renamed from: c, reason: collision with root package name */
    private CronetEngine.Builder f20821c;

    /* renamed from: d, reason: collision with root package name */
    private CronetEngine f20822d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0404a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f20823a = new a();
    }

    public static a a() {
        return C0404a.f20823a;
    }

    private CronetEngine.Builder d() {
        if (this.f20821c == null) {
            this.f20821c = new CronetEngine.Builder(com.mbridge.msdk.foundation.controller.c.m().c());
            this.f20821c.setStoragePath(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER)).enableHttpCache(2, 5242880L).enableHttp2(true).enableQuic(true);
        }
        return this.f20821c;
    }

    public final ExecutorService b() {
        return this.f20819a;
    }

    public final CronetEngine c() {
        if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return null;
        }
        CronetEngine cronetEngine = this.f20822d;
        if (cronetEngine != null) {
            return cronetEngine;
        }
        if (this.f20821c == null) {
            this.f20821c = d();
        }
        CronetEngine build = this.f20821c.build();
        this.f20822d = build;
        return build;
    }

    private a() {
        this.f20819a = Executors.newCachedThreadPool();
        this.f20820b = new ArrayList<>();
        if (this.f20821c == null) {
            this.f20821c = d();
        }
        this.f20822d = this.f20821c.build();
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f20820b.contains(str)) {
                return;
            }
            this.f20820b.add(str);
            if (this.f20821c == null) {
                this.f20821c = d();
            }
            CronetEngine.Builder builder = this.f20821c;
            if (builder != null) {
                builder.addQuicHint(str, 443, 443);
            }
        } catch (Throwable th) {
            ad.b("CronetEngineManager", th.getMessage());
        }
    }
}
