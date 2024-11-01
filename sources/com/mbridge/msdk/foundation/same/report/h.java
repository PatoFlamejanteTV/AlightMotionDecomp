package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f21139a = new Handler(Looper.getMainLooper());

    public static void a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", TextUtils.isEmpty(campaignEx.getMraid()) ^ true ? 1 : 3, MBridgeConstans.ENDCARD_URL_TYPE_PL, "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
        nVar.e(campaignEx.getId());
        nVar.f(campaignEx.getRequestId());
        nVar.s(campaignEx.getCurrentLocalRid());
        nVar.g(campaignEx.getRequestIdNotice());
        nVar.c(campaignEx.getAdSpaceT());
        nVar.d(str3);
        nVar.e(7);
        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        String b9 = com.mbridge.msdk.foundation.entity.n.b(nVar);
        if (e.a().b()) {
            e.a().a(b9);
        } else {
            a(b9, context, str);
        }
    }

    public static void c(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        String c8 = com.mbridge.msdk.foundation.entity.n.c(nVar);
        if (e.a().b()) {
            e.a().a(c8);
        } else {
            a(c8, context, str);
        }
    }

    public static void d(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000060");
            nVar.c(str);
            nVar.a(z.l(context));
            String f8 = com.mbridge.msdk.foundation.entity.n.f(nVar);
            if (e.a().b()) {
                e.a().a(f8);
            } else {
                a(f8, context, str);
            }
        }
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        if (nVar != null) {
            nVar.a("2000059");
            nVar.c(str);
            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
            nVar.j(com.mbridge.msdk.foundation.tools.e.c());
            String g8 = com.mbridge.msdk.foundation.entity.n.g(nVar);
            if (e.a().b()) {
                e.a().a(g8);
            } else {
                a(g8, com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        int adType;
        if (nVar != null) {
            nVar.j(com.mbridge.msdk.foundation.tools.e.c());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
                return;
            }
            String e8 = com.mbridge.msdk.foundation.entity.n.e(nVar);
            if (e.a().b()) {
                e.a().a(e8);
            } else {
                a(e8, com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
    }

    public static void a(String str, Context context, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a(new com.mbridge.msdk.foundation.same.f.a(str, str2));
    }

    private static void a(Runnable runnable) {
        Handler handler = f21139a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000063");
            nVar.c(str);
            nVar.a(z.l(context));
            String d8 = com.mbridge.msdk.foundation.entity.n.d(nVar);
            if (e.a().b()) {
                e.a().a(d8);
            } else {
                a(d8, context, str);
            }
        }
    }
}
