package com.mbridge.msdk.video.module.a.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.b.c cVar, String str, String str2, com.mbridge.msdk.video.module.a.a aVar2, int i8, boolean z8) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i8, z8);
    }

    @Override // com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        if (this.f23780a) {
            try {
                CampaignEx campaignEx = this.f23781b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    b(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i8 != 105 && i8 != 106 && i8 != 113) {
                if (i8 != 122) {
                    switch (i8) {
                        case 109:
                            b(2);
                            a(2);
                            return;
                        case 110:
                            b(1);
                            a(1);
                            return;
                        case 111:
                            a(1);
                            return;
                        default:
                            return;
                    }
                }
                a();
                return;
            }
            com.mbridge.msdk.video.module.b.b.d(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b);
            if (i8 != 105) {
                String noticeUrl = this.f23781b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (!noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f20664m)) {
                        noticeUrl = noticeUrl + "&" + com.mbridge.msdk.foundation.same.a.f20664m + "=2";
                    } else {
                        noticeUrl = noticeUrl.replace(com.mbridge.msdk.foundation.same.a.f20664m + "=" + Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f20664m), com.mbridge.msdk.foundation.same.a.f20664m + "=2");
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23781b, this.f23786g, noticeUrl, true, false, com.mbridge.msdk.click.a.a.f19313i);
            }
        }
    }
}
