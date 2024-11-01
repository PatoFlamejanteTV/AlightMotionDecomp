package com.mbridge.msdk.scheme.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.e.b;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class AppletsReport {
    public static final String APPLETS_API_VALUE = "2000118";
    private static final String TAG = "com.mbridge.msdk.scheme.report.AppletsReport";

    public static void reportAppletsLoadState(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000118&");
                    stringBuffer.append("network_type=" + z.l(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(a.f20649U)) {
                        stringBuffer.append("b=" + a.f20649U + "&");
                    }
                    if (!TextUtils.isEmpty(a.f20658g)) {
                        stringBuffer.append("c=" + a.f20658g + "&");
                    }
                    stringBuffer.append("hb=0&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        reportLoadData(context, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void reportLoadData(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                new com.mbridge.msdk.foundation.same.report.e.a(context).post(0, d.f().f20935c, k.a(str, context), new b() { // from class: com.mbridge.msdk.scheme.report.AppletsReport.1
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public void onFailed(String str2) {
                        ad.b(AppletsReport.TAG, str2);
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public void onSuccess(String str2) {
                        ad.b(AppletsReport.TAG, str2);
                    }
                });
            } catch (Exception e8) {
                e8.printStackTrace();
                ad.b(TAG, e8.getMessage());
            }
        }
    }
}
