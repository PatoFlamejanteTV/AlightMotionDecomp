package com.mbridge.msdk.video.dynview.j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.video.dynview.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    public final com.mbridge.msdk.video.dynview.c a(Context context, List<CampaignEx> list) {
        String str;
        int i8;
        int i9;
        int i10;
        if (list == null) {
            return null;
        }
        try {
            float f8 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
            float e8 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                str = "";
                i8 = 1;
                i9 = 0;
                i10 = 0;
            } else {
                CampaignEx campaignEx = list.get(0);
                i8 = (campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? 1 : campaignEx.getRewardTemplateMode().b();
                i9 = list.get(0).getMof_tplid();
                str = list.get(0).getMof_template_url();
                i10 = list.get(0).getDynamicTempCode();
            }
            if (i9 != 0 && !TextUtils.isEmpty(str)) {
                arrayList = ab.a(n.a(0, i9 + "", str), "template_" + i9 + "_" + i8);
            }
            String str2 = "mbridge_same_choice_one_layout_portrait";
            if (i8 != 1) {
                if (i8 == 2) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                } else if (context.getResources().getConfiguration().orientation == 2) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                    i8 = 2;
                } else {
                    i8 = 1;
                }
            }
            return new c.a().a(context).a(str2).a(1).a(e8).b(f8).a(list).b(i8).b(arrayList).e(i10).d(i9).a();
        } catch (Exception e9) {
            ad.b("ViewOptionWrapper", e9.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId(), false);
            int g8 = a9 != null ? a9.g() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return new c.a().a("mbridge_reward_layer_floor_bottom").a(3).a(arrayList).a(view.getContext()).a(view).c(g8).b(z.r(view.getContext())).a();
        } catch (Exception e8) {
            ad.b("ViewOptionWrapper", e8.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.video.dynview.c b(Context context, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float f8 = ai.f(com.mbridge.msdk.foundation.controller.c.m().c());
                    float e8 = ai.e(com.mbridge.msdk.foundation.controller.c.m().c());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int r8 = z.r(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = ab.a(n.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + "_" + r8);
                    }
                    return new c.a().a(r8 == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").a(5).a(context).a(e8).b(f8).a(list).b(r8).b(arrayList).e(dynamicTempCode).d(mof_tplid).a();
                }
            } catch (Exception e9) {
                ad.b("ViewOptionWrapper", e9.getMessage());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:6:0x0004, B:9:0x0016, B:10:0x002c, B:17:0x003e, B:18:0x0052, B:20:0x006e, B:21:0x0072, B:23:0x0078, B:24:0x00a1), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:6:0x0004, B:9:0x0016, B:10:0x002c, B:17:0x003e, B:18:0x0052, B:20:0x006e, B:21:0x0072, B:23:0x0078, B:24:0x00a1), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.video.dynview.c a(android.view.View r14, com.mbridge.msdk.foundation.entity.CampaignEx r15) {
        /*
            r13 = this;
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L27
            r1.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r15.getCampaignUnitId()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.entity.CampaignEx$c r3 = r15.getRewardTemplateMode()     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = ""
            r5 = 0
            if (r3 == 0) goto L2a
            com.mbridge.msdk.foundation.entity.CampaignEx$c r3 = r15.getRewardTemplateMode()     // Catch: java.lang.Exception -> L27
            int r3 = r3.f()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.entity.CampaignEx$c r6 = r15.getRewardTemplateMode()     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = r6.e()     // Catch: java.lang.Exception -> L27
            goto L2c
        L27:
            r14 = move-exception
            goto Lf8
        L2a:
            r6 = r4
            r3 = 0
        L2c:
            java.lang.String r7 = "ia_tp"
            r8 = -5
            int r7 = com.mbridge.msdk.foundation.tools.ai.a(r6, r7, r8)     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L50
            r8 = 102(0x66, float:1.43E-43)
            if (r3 == r8) goto L50
            r8 = 202(0xca, float:2.83E-43)
            if (r3 != r8) goto L3e
            goto L50
        L3e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r8.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r9 = "mbridge_reward_layer_floor_"
            r8.append(r9)     // Catch: java.lang.Exception -> L27
            r8.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L27
            goto L52
        L50:
            java.lang.String r8 = "mbridge_reward_layer_floor"
        L52:
            boolean r9 = com.mbridge.msdk.video.dynview.i.a.a(r6)     // Catch: java.lang.Exception -> L27
            java.lang.String r10 = "whs_chn"
            java.lang.String r10 = com.mbridge.msdk.video.dynview.i.a.a(r6, r10)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.videocommon.d.b r11 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.foundation.controller.c r12 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L27
            java.lang.String r12 = r12.k()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.videocommon.d.c r2 = r11.a(r12, r2, r5)     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L72
            int r5 = r2.g()     // Catch: java.lang.Exception -> L27
        L72:
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L27
            if (r2 != 0) goto La1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r1.<init>()     // Catch: java.lang.Exception -> L27
            r1.append(r3)     // Catch: java.lang.Exception -> L27
            r1.append(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L27
            r2 = 1
            java.lang.String r1 = com.mbridge.msdk.foundation.tools.n.a(r2, r1, r6)     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = "template_"
            r2.append(r4)     // Catch: java.lang.Exception -> L27
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L27
            java.util.List r1 = com.mbridge.msdk.foundation.tools.ab.a(r1, r2)     // Catch: java.lang.Exception -> L27
        La1:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            r2.add(r15)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$a r4 = new com.mbridge.msdk.video.dynview.c$a     // Catch: java.lang.Exception -> L27
            r4.<init>()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r4 = r4.a(r8)     // Catch: java.lang.Exception -> L27
            r6 = 2
            com.mbridge.msdk.video.dynview.c$b r4 = r4.a(r6)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r2 = r4.a(r2)     // Catch: java.lang.Exception -> L27
            android.content.Context r4 = r14.getContext()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r2 = r2.a(r4)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r2 = r2.a(r14)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r2 = r2.c(r5)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r2 = r2.f(r7)     // Catch: java.lang.Exception -> L27
            android.content.Context r14 = r14.getContext()     // Catch: java.lang.Exception -> L27
            int r14 = com.mbridge.msdk.foundation.tools.z.r(r14)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r2.b(r14)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r14.d(r3)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r14.a(r9)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r14.c(r10)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r14.b(r1)     // Catch: java.lang.Exception -> L27
            int r15 = r15.getDynamicTempCode()     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c$b r14 = r14.e(r15)     // Catch: java.lang.Exception -> L27
            com.mbridge.msdk.video.dynview.c r14 = r14.a()     // Catch: java.lang.Exception -> L27
            return r14
        Lf8:
            java.lang.String r15 = "ViewOptionWrapper"
            java.lang.String r14 = r14.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r15, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.j.c.a(android.view.View, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.video.dynview.c");
    }

    public final com.mbridge.msdk.video.dynview.c a(Context context, CampaignEx campaignEx, int i8, String str) {
        String str2;
        String str3;
        StringBuilder sb;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int r8 = z.r(context);
            int a9 = ai.a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (r8 == 1) {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_portrait_");
                    sb.append(ecTemplateId);
                } else {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_landscape_");
                    sb.append(ecTemplateId);
                }
                str2 = sb.toString();
                str3 = "template_" + str + r8 + "_" + ecTemplateId;
            } else {
                str2 = r8 == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str3 = "template_" + str + r8;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = ab.a(n.a(2, i8 + "", campaignEx.getendcard_url()), str3);
            }
            return new c.a().a(str2).a(4).a(context).b(z.r(context)).b(arrayList).e(campaignEx.getDynamicTempCode()).d(i8).b(str).g(a9).a();
        } catch (Exception e8) {
            ad.b("ViewOptionWrapper", e8.getMessage());
            return null;
        }
    }
}
