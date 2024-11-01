package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.net.URLEncoder;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f21135a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f21136b = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.report.g.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("mb-common-report-thread");
            return newThread;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.e.m f21137c;

    public static g a() {
        if (f21135a == null) {
            synchronized (g.class) {
                try {
                    if (f21135a == null) {
                        f21135a = new g();
                    }
                } finally {
                }
            }
        }
        return f21135a;
    }

    private w e() {
        com.mbridge.msdk.e.o oVar;
        int a9 = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
        int a10 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
        int a11 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
        int a12 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
        int a13 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
        int a14 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
        if (a14 != 0 && a14 != 1) {
            a14 = 0;
        }
        try {
            w.a a15 = new w.a().e(a9).a(a10).d(a11).b(a12).c(a13).a(new d()).a(c.b()).a(new o());
            if (a14 == 1) {
                oVar = new com.mbridge.msdk.e.o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().f20941i, com.mbridge.msdk.foundation.same.net.g.d.f().f20945m);
            } else {
                oVar = new com.mbridge.msdk.e.o(new com.mbridge.msdk.e.a.a.g(), DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS, 0);
            }
            return a15.a(a14, oVar).a();
        } catch (Exception e8) {
            ad.b("EventLibraryReport", "configTrackManager error: " + e8.getMessage());
            return null;
        }
    }

    public final void b() {
        if (this.f21137c != null) {
            this.f21137c.e();
        }
    }

    public final void c() {
        if (af.a().a("metrics", "e_t_l", af.a().a("e_t_l", 1)) == 1) {
            d().e();
        }
    }

    public final com.mbridge.msdk.e.m d() {
        if (this.f21137c == null) {
            this.f21137c = com.mbridge.msdk.e.m.a("mtg_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), e());
            this.f21137c.a(c.a());
            this.f21137c.a();
        }
        return this.f21137c;
    }

    public final void a(Context context, String str, String str2, String str3, String str4, int i8) {
        com.mbridge.msdk.e.m d8 = a().d();
        if (d8 == null) {
            return;
        }
        if (!d8.a("2000105")) {
            ad.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, "utf-8"));
            }
            jSONObject.put("type", i8);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] g8 = d8.g();
                jSONObject.put("track_time", g8[0]);
                jSONObject.put("track_count", g8[1]);
                jSONObject.put("session_id", d8.b());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, "utf-8"));
            com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e("2000105");
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            eVar.a(c.c());
            d8.a(eVar);
        } catch (Exception e8) {
            ad.b("MetricsReportUtil", e8.getMessage());
        }
    }
}
