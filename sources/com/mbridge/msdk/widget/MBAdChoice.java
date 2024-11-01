package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.net.g.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.Campaign;

/* loaded from: classes4.dex */
public class MBAdChoice extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24399a;

    /* renamed from: b, reason: collision with root package name */
    private String f24400b;

    /* renamed from: c, reason: collision with root package name */
    private String f24401c;

    /* renamed from: d, reason: collision with root package name */
    private String f24402d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f24403e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.d.a f24404f;

    public MBAdChoice(Context context) {
        super(context);
        this.f24400b = "";
        this.f24401c = "";
        this.f24402d = "";
        this.f24399a = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f24404f == null) {
            this.f24404f = new com.mbridge.msdk.foundation.d.a() { // from class: com.mbridge.msdk.widget.MBAdChoice.1
                @Override // com.mbridge.msdk.foundation.d.a
                public final void a() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void b() {
                }

                @Override // com.mbridge.msdk.foundation.d.a
                public final void a(String str) {
                }
            };
        }
        ai.a(this.f24403e, this.f24404f, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        boolean z8;
        if (campaign instanceof CampaignEx) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            this.f24403e = campaignEx;
            g b9 = h.a().b(c.m().k());
            this.f24403e = campaignEx;
            if (campaignEx != null) {
                String privacyUrl = campaignEx.getPrivacyUrl();
                this.f24401c = privacyUrl;
                if (TextUtils.isEmpty(privacyUrl)) {
                    CampaignEx.a adchoice = campaignEx.getAdchoice();
                    if (adchoice != null) {
                        this.f24401c = adchoice.c();
                    }
                    if (TextUtils.isEmpty(this.f24401c) && b9 != null) {
                        this.f24401c = b9.g();
                    }
                    if (TextUtils.isEmpty(this.f24401c)) {
                        this.f24401c = d.f().f20938f;
                    }
                }
            } else if (b9 != null) {
                this.f24401c = b9.g();
            }
            this.f24403e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice2 = campaignEx.getAdchoice();
                if (adchoice2 != null) {
                    this.f24400b = adchoice2.b();
                }
                if (TextUtils.isEmpty(this.f24400b) && b9 != null) {
                    this.f24400b = b9.f();
                }
            } else if (b9 != null) {
                this.f24400b = b9.f();
            }
            this.f24403e = campaignEx;
            if (campaignEx != null) {
                CampaignEx.a adchoice3 = campaignEx.getAdchoice();
                if (adchoice3 != null) {
                    this.f24402d = adchoice3.d();
                }
                if (TextUtils.isEmpty(this.f24402d) && b9 != null) {
                    this.f24402d = b9.h();
                }
            } else if (b9 != null) {
                this.f24402d = b9.h();
            }
            if (!TextUtils.isEmpty(this.f24400b) && !TextUtils.isEmpty(this.f24401c) && !TextUtils.isEmpty(this.f24402d)) {
                z8 = true;
            } else {
                z8 = false;
            }
            setImageUrl(this.f24400b);
            if (z8 && this.f24399a != null) {
                b.a(c.m().c()).a(this.f24400b, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.widget.MBAdChoice.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onFailedLoad(String str, String str2) {
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        MBAdChoice.this.setImageBitmap(bitmap);
                    }
                });
                return;
            }
            return;
        }
        this.f24403e = null;
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.d.a aVar) {
        this.f24404f = aVar;
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24400b = "";
        this.f24401c = "";
        this.f24402d = "";
        this.f24399a = context;
        a();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24400b = "";
        this.f24401c = "";
        this.f24402d = "";
        this.f24399a = context;
        a();
    }
}
