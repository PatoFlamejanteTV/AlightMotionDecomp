package com.mbridge.msdk.video.dynview.f;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.click.i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23285a = "com.mbridge.msdk.video.dynview.f.a";

    public static void a(CampaignEx campaignEx, Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000091&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20649U)) {
                    stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.f20649U + "&");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f20658g)) {
                    stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f20658g + "&");
                }
                stringBuffer.append("hb=0&");
                if (!TextUtils.isEmpty(str3)) {
                    stringBuffer.append("rid_n=");
                    stringBuffer.append(str3);
                    stringBuffer.append("&");
                }
                stringBuffer.append("reason=" + str);
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null) {
                    stringBuffer.append("&dyview=");
                    stringBuffer.append(ai.b(campaignEx.getRewardTemplateMode().e()));
                }
                if (e.a().b()) {
                    e.a().a(stringBuffer.toString());
                    return;
                }
                String stringBuffer2 = stringBuffer.toString();
                if (TextUtils.isEmpty(stringBuffer2)) {
                    return;
                }
                try {
                    new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().f20935c, k.a(stringBuffer2, context), new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.dynview.f.a.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str4) {
                            ad.b(a.f23285a, str4);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str4) {
                            ad.b(a.f23285a, str4);
                        }
                    });
                } catch (Exception e8) {
                    e8.printStackTrace();
                    ad.b(f23285a, e8.getMessage());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.mbridge.msdk.foundation.entity.CampaignUnit r9, int r10, int r11, java.lang.String r12) {
        /*
            if (r9 == 0) goto Lb1
            java.util.ArrayList r0 = r9.getAds()
            if (r0 == 0) goto Lb1
            java.util.ArrayList r0 = r9.getAds()
            int r0 = r0.size()
            if (r0 <= 0) goto Lb1
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto Lb1
            if (r11 != 0) goto L2d
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            boolean r0 = r0.mMoreOfferImpShow
            if (r0 == 0) goto L2d
            return
        L2d:
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_testuid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L5b
            java.util.ArrayList r0 = r9.getAds()
            java.lang.Object r0 = r0.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            java.lang.String r0 = r0.getendcard_url()
            java.lang.String r1 = "mof_uid"
            java.lang.String r0 = com.mbridge.msdk.foundation.tools.ao.a(r0, r1)
        L5b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L63
            r4 = r12
            goto L64
        L63:
            r4 = r0
        L64:
            if (r11 == 0) goto L82
            r12 = 1
            if (r11 == r12) goto L6f
            java.lang.String r11 = ""
            r12 = 0
            r5 = r11
            r8 = 0
            goto L93
        L6f:
            int r11 = com.mbridge.msdk.click.a.a.f19312h
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getOnlyImpressionURL()
        L7f:
            r8 = r11
            r5 = r12
            goto L93
        L82:
            int r11 = com.mbridge.msdk.click.a.a.f19311g
            java.util.ArrayList r12 = r9.getAds()
            java.lang.Object r12 = r12.get(r10)
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12
            java.lang.String r12 = r12.getImpressionURL()
            goto L7f
        L93:
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto Lb1
            com.mbridge.msdk.foundation.controller.c r11 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r2 = r11.c()
            java.util.ArrayList r9 = r9.getAds()
            java.lang.Object r9 = r9.get(r10)
            r3 = r9
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            r6 = 0
            r7 = 1
            com.mbridge.msdk.click.a.a(r2, r3, r4, r5, r6, r7, r8)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.f.a.a(com.mbridge.msdk.foundation.entity.CampaignUnit, int, int, java.lang.String):void");
    }

    public static void a(Context context, CampaignEx campaignEx, String str, View view) {
        if (context == null || campaignEx == null) {
            return;
        }
        if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
            com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
        }
        com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(context, str);
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view;
            aVar.a(new i() { // from class: com.mbridge.msdk.video.dynview.f.a.2
                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onFinishRedirection(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.a(campaign, viewGroup);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onRedirectionFailed(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.a(campaign, viewGroup);
                }

                @Override // com.mbridge.msdk.out.BaseTrackingListener
                public final void onStartRedirection(Campaign campaign, String str2) {
                    if (campaign == null) {
                        return;
                    }
                    ah.b(campaign, viewGroup);
                }
            });
        }
        aVar.a(campaignEx);
    }
}
