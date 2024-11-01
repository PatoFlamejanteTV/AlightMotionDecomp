package com.mbridge.msdk.out.reveue;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.same.report.f;

/* loaded from: classes4.dex */
public class MBridgeRevenueManager {
    public static void track(Context context, MBridgeRevenueParamsEntity mBridgeRevenueParamsEntity) {
        if (c.m().c() == null) {
            c.m().b(context);
        }
        try {
            d dVar = new d();
            dVar.a("name", mBridgeRevenueParamsEntity.getMediationName());
            b bVar = new b();
            bVar.a("m_start_ad_rev", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_start_ad_rev", bVar);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        f.a().a(mBridgeRevenueParamsEntity.getReportData());
    }
}
