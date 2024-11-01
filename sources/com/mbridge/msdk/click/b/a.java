package com.mbridge.msdk.click.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.e;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.io.File;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f19342a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f19343b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f19344c = 1500;

    /* renamed from: d, reason: collision with root package name */
    private static String f19345d = "2000109";

    /* renamed from: e, reason: collision with root package name */
    private static String f19346e = "DspFilterUtils";

    public static boolean a(CampaignEx campaignEx, String str, int i8) {
        boolean z8 = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            if (campaignEx.getFac() != 0) {
                z8 = true;
            }
            try {
                Context c8 = c.m().c();
                if (c8 != null) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace("file://", ""));
                        if (file.exists()) {
                            str = ab.b(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + f19345d + "&");
                    stringBuffer.append("type=" + i8 + "&");
                    stringBuffer.append("html=" + str + "&");
                    stringBuffer.append("network_type=" + z.l(c8) + "&");
                    stringBuffer.append("unit_id=" + campaignEx.getCampaignUnitId() + "&");
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=");
                        stringBuffer.append("1");
                        stringBuffer.append("&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("cid=" + campaignEx.getId());
                    if (e.a().b()) {
                        e.a().a(stringBuffer.toString());
                    } else {
                        k.b(c8, stringBuffer.toString());
                    }
                }
            } catch (Throwable th) {
                ad.b(f19346e, th.getMessage());
            }
        }
        return z8;
    }
}
