package com.mbridge.msdk.newreward.function.f;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f22481a = com.mbridge.msdk.foundation.controller.c.m().k();

    /* renamed from: b, reason: collision with root package name */
    private String f22482b;

    /* renamed from: c, reason: collision with root package name */
    private int f22483c;

    /* renamed from: d, reason: collision with root package name */
    private g f22484d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f22485e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f22486f;

    public final com.mbridge.msdk.videocommon.d.c b() {
        return this.f22486f;
    }

    public final com.mbridge.msdk.videocommon.d.a a() {
        return this.f22485e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:            if ((r8.f22485e.i() + r10.d()) <= java.lang.System.currentTimeMillis()) goto L52;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r9, com.mbridge.msdk.newreward.a.b.b r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.f.e.a(java.lang.Object, com.mbridge.msdk.newreward.a.b.b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i8, String str) {
        int i9;
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a(LeanbackPreferenceDialogFragment.ARG_KEY, "2000112");
            dVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.g.d.f().f20951s));
            if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_START) {
                i9 = 3;
            } else if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_SUCCESS) {
                i9 = 1;
            } else {
                i9 = eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_FAIL ? 2 : 0;
            }
            dVar.a("result", Integer.valueOf(i9));
            dVar.a("type", Integer.valueOf(i8));
            dVar.a("url", com.mbridge.msdk.foundation.same.net.g.d.f().f20950r ? com.mbridge.msdk.foundation.same.net.g.d.f().f20916J : com.mbridge.msdk.foundation.same.net.g.d.f().f20915I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th) {
            ad.b("SettingModel", th.getMessage());
        }
    }
}
