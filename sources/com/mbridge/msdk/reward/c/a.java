package com.mbridge.msdk.reward.c;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.net.h.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.videocommon.d.b;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22901a = "com.mbridge.msdk.reward.c.a";

    /* renamed from: b, reason: collision with root package name */
    private static String f22902b = "";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                q a9 = q.a(h.a(context));
                if (TextUtils.isEmpty(str) || a9 == null || a9.a() <= 0) {
                    return;
                }
                List<n> a10 = a9.a("m_download_end");
                List<n> a11 = a9.a("2000021");
                List<n> a12 = a9.a("2000039");
                List<n> a13 = a9.a("m_download_end");
                List<n> a14 = a9.a("m_download_end");
                List<n> a15 = a9.a("2000044");
                String e8 = n.e(a11);
                String a16 = n.a(a10);
                String c8 = n.c(a12);
                String b9 = n.b(a13);
                String f8 = n.f(a14);
                String d8 = n.d(a15);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(e8)) {
                    sb.append(e8);
                }
                if (!TextUtils.isEmpty(a16)) {
                    sb.append(a16);
                }
                if (!TextUtils.isEmpty(c8)) {
                    sb.append(c8);
                }
                if (!TextUtils.isEmpty(b9)) {
                    sb.append(b9);
                }
                if (!TextUtils.isEmpty(f8)) {
                    sb.append(f8);
                }
                if (!TextUtils.isEmpty(d8)) {
                    sb.append(d8);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    return;
                }
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(sb2) || TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
                    e a17 = k.a(sb2, context, str);
                    a17.a("r_stid", b.a().b().b());
                    aVar.post(0, d.f().f20935c, a17, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.reward.c.a.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str2) {
                            ad.b(a.f22901a, str2);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str2) {
                            ad.b(a.f22901a, str2);
                        }
                    });
                } catch (Exception e9) {
                    e9.printStackTrace();
                    ad.b(f22901a, e9.getMessage());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(final Context context, CampaignEx campaignEx, String str) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000048&");
            stringBuffer.append("st=" + System.currentTimeMillis() + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            if (ai.c(campaignEx)) {
                stringBuffer.append("rtins_type=");
                stringBuffer.append(campaignEx.getRtinsType());
                stringBuffer.append("&");
            }
            if (campaignEx.isBidCampaign()) {
                stringBuffer.append("hb=1&");
            } else {
                stringBuffer.append("hb=0&");
            }
            stringBuffer.append("rid=" + campaignEx.getRequestId() + "&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(campaignEx.getAdSpaceT());
            stringBuffer.append(sb.toString());
            if (campaignEx.getRewardTemplateMode() != null) {
                try {
                    int a9 = com.mbridge.msdk.foundation.same.d.a(campaignEx, campaignEx.getRewardTemplateMode().e());
                    if (a9 != -1) {
                        stringBuffer.append("&dyview=");
                        stringBuffer.append(a9);
                    }
                } catch (Exception unused) {
                }
            }
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                return;
            }
            final String stringBuffer2 = stringBuffer.toString();
            if (TextUtils.isEmpty(stringBuffer2) || TextUtils.isEmpty(str)) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
                e a10 = k.a(stringBuffer2, context, str);
                a10.a("r_stid", b.a().b().b());
                aVar.post(0, d.f().f20935c, a10, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.reward.c.a.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(final String str2) {
                        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.c.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                l lVar = new l();
                                lVar.a(stringBuffer2);
                                lVar.a(System.currentTimeMillis());
                                lVar.a(0);
                                lVar.b(ShareTarget.METHOD_POST);
                                lVar.c(d.f().f20935c);
                                com.mbridge.msdk.foundation.db.n.a(h.a(context)).a(lVar);
                                ad.b(a.f22901a, str2);
                            }
                        });
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str2) {
                        ad.b(a.f22901a, str2);
                    }
                });
            } catch (Exception e8) {
                e8.printStackTrace();
                ad.b(f22901a, e8.getMessage());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
