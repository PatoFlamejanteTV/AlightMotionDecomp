package com.mbridge.msdk.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.foundation.same.c.c {

    /* renamed from: a, reason: collision with root package name */
    private CampaignEx f23772a;

    /* renamed from: b, reason: collision with root package name */
    protected ImageView f23773b;

    /* renamed from: c, reason: collision with root package name */
    private String f23774c;

    public e(ImageView imageView) {
        this.f23773b = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onFailedLoad(final String str, String str2) {
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.video.module.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    q a9 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    if (e.this.f23772a == null) {
                        ad.a("ImageLoaderListener", "campaign is null");
                        return;
                    }
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.a("2000044");
                    nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                    nVar.e(e.this.f23772a.getId());
                    nVar.p(e.this.f23772a.getImageUrl());
                    nVar.f(e.this.f23772a.getRequestId());
                    nVar.g(e.this.f23772a.getRequestIdNotice());
                    nVar.c(e.this.f23774c);
                    nVar.h(str);
                    a9.a(nVar);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
        ad.b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.c.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                ad.b("ImageLoaderListener", "bitmap=null");
            } else if (this.f23773b != null && !bitmap.isRecycled()) {
                this.f23773b.setImageBitmap(bitmap);
                this.f23773b.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f23773b = imageView;
        this.f23772a = campaignEx;
        this.f23774c = str;
    }
}
