package com.mbridge.msdk.video.bt.module.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23224a = "com.mbridge.msdk.video.bt.module.b.f";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                q a9 = q.a(com.mbridge.msdk.foundation.db.h.a(context));
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
                    com.mbridge.msdk.foundation.same.net.h.e a17 = k.a(sb2, context, str);
                    a17.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
                    aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a17, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.bt.module.b.f.1
                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onFailed(String str2) {
                            ad.b(f.f23224a, str2);
                        }

                        @Override // com.mbridge.msdk.foundation.same.report.e.b
                        public final void onSuccess(String str2) {
                            ad.b(f.f23224a, str2);
                        }
                    });
                } catch (Exception e9) {
                    e9.printStackTrace();
                    ad.b(f23224a, e9.getMessage());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private static void a(final Context context, final String str, String str2) {
        if (com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            context = com.mbridge.msdk.foundation.controller.c.m().c();
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(context);
            com.mbridge.msdk.foundation.same.net.h.e a9 = k.a(str, context, str2);
            a9.a("r_stid", com.mbridge.msdk.videocommon.d.b.a().b().b());
            aVar.post(0, com.mbridge.msdk.foundation.same.net.g.d.f().f20935c, a9, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.video.bt.module.b.f.2
                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onFailed(final String str3) {
                    com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.video.bt.module.b.f.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            l lVar = new l();
                            lVar.a(str);
                            lVar.a(System.currentTimeMillis());
                            lVar.a(0);
                            lVar.b(ShareTarget.METHOD_POST);
                            lVar.c(com.mbridge.msdk.foundation.same.net.g.d.f().f20935c);
                            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.h.a(context)).a(lVar);
                            ad.b(f.f23224a, str3);
                        }
                    });
                }

                @Override // com.mbridge.msdk.foundation.same.report.e.b
                public final void onSuccess(String str3) {
                    ad.b(f.f23224a, str3);
                }
            });
        } catch (Exception e8) {
            e8.printStackTrace();
            ad.b(f23224a, e8.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, int i8) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            stringBuffer.append("cid=" + campaignEx.getId() + "&");
            stringBuffer.append("reason=&");
            stringBuffer.append("templateshowtype=" + i8 + " offer show success&");
            stringBuffer.append("result=2&");
            if (campaignEx.getAdType() == 287) {
                stringBuffer.append("ad_type=3&");
            } else if (campaignEx.getAdType() == 94) {
                stringBuffer.append("ad_type=1&");
            } else {
                stringBuffer.append("ad_type=1&");
            }
            String str2 = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append("creative=" + URLEncoder.encode(str2) + "&");
            }
            stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
            stringBuffer.append("rid=");
            stringBuffer.append(campaignEx.getRequestId());
            stringBuffer.append("&");
            stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
            stringBuffer.append("&");
            stringBuffer.append("adspace_t=");
            stringBuffer.append(campaignEx.getAdSpaceT());
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i8) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                stringBuffer.append("cid=" + campaignEx.getId() + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("templateshowtype=" + i8 + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("result=1&");
                if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                    stringBuffer.append("creative=" + URLEncoder.encode(campaignEx.getendcard_url()) + "&");
                }
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                if (campaignEx.getAdType() == 287) {
                    stringBuffer.append("ad_type=3&");
                } else if (campaignEx.getAdType() == 94) {
                    stringBuffer.append("ad_type=1&");
                } else {
                    stringBuffer.append("ad_type=1&");
                }
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(context, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.size() <= 0 || TextUtils.isEmpty(str)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000054&");
            stringBuffer.append("network_type=" + z.l(context) + "&");
            stringBuffer.append("unit_id=" + str + "&");
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                arrayList.add(list.get(i8).getId());
            }
            stringBuffer.append("cid=" + arrayList.toString() + "&");
            stringBuffer.append("result=2&");
            if (list.get(0) != null) {
                CampaignEx campaignEx = list.get(0);
                stringBuffer.append("reason=&");
                stringBuffer.append("templateshowtype=two offer ec show success&");
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("&adspace_t=");
                stringBuffer.append(campaignEx.getAdSpaceT());
            }
            if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
            } else {
                a(context, stringBuffer.toString(), str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000054&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                String[] strArr = new String[list.size()];
                for (int i8 = 0; i8 < list.size(); i8++) {
                    strArr[i8] = list.get(i8).getId();
                }
                stringBuffer.append("cid=" + strArr + "&");
                stringBuffer.append("reason=" + str2 + "&");
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                if (list.get(0) != null) {
                    CampaignEx campaignEx = list.get(0);
                    stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                    stringBuffer.append("rid=");
                    stringBuffer.append(campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                    stringBuffer.append("&");
                    stringBuffer.append("templateshowtype=" + campaignEx.getMof_tplid());
                    stringBuffer.append("&");
                    stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                }
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(context, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i8) {
        try {
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c8 != null && campaignEx != null && !TextUtils.isEmpty(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000115&");
                stringBuffer.append("network_type=" + z.l(c8) + "&");
                stringBuffer.append("unit_id=" + str + "&");
                stringBuffer.append("cid=" + campaignEx.getId() + "&");
                stringBuffer.append("play_cur_time=" + i8 + "&");
                stringBuffer.append("reason=close ad in advance " + campaignEx.getMof_tplid() + "&");
                stringBuffer.append("result=1&");
                stringBuffer.append("devid=" + com.mbridge.msdk.foundation.tools.e.c() + "&");
                stringBuffer.append("ad_type=" + campaignEx.getAdType() + "&");
                stringBuffer.append("rid=");
                stringBuffer.append(campaignEx.getRequestId());
                stringBuffer.append("&");
                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                stringBuffer.append("&");
                stringBuffer.append("adspace_t=" + campaignEx.getAdSpaceT());
                if (com.mbridge.msdk.foundation.same.report.e.a().b()) {
                    com.mbridge.msdk.foundation.same.report.e.a().a(stringBuffer.toString());
                } else {
                    a(c8, stringBuffer.toString(), str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
