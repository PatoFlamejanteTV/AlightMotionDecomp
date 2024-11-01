package com.mbridge.msdk.video.module.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f23767a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f23768b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f23767a = activity;
        this.f23768b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public void a(int i8, Object obj) {
        super.a(i8, obj);
        if (i8 == 106 && this.f23767a != null && this.f23768b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a9 = com.mbridge.msdk.click.c.a(this.f23768b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a9)) {
                    intent.setData(Uri.parse(a9));
                    this.f23767a.startActivity(intent);
                }
            } catch (Throwable th) {
                ad.a("NotifyListener", th.getMessage(), th);
            }
            this.f23767a.finish();
        }
    }
}
