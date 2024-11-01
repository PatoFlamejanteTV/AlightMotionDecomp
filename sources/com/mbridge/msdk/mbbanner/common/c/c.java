package com.mbridge.msdk.mbbanner.common.c;

import android.content.Context;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public final class c extends d {
    public c(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.b.c cVar, String str, String str2, boolean z8, k kVar) {
        super(mBBannerView, cVar, str, str2, z8, kVar);
    }

    @Override // com.mbridge.msdk.mbbanner.common.c.d
    public final void a(CampaignEx campaignEx, boolean z8, String str) {
        if (!this.f21614d) {
            return;
        }
        if (this.f21616f == null) {
            this.f21616f = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f21615e);
        }
        this.f21616f.a(new NativeListener.TrackingExListener() { // from class: com.mbridge.msdk.mbbanner.common.c.c.1
            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDismissLoading(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadFinish(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadProgress(int i8) {
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onDownloadStart(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onFinishRedirection(Campaign campaign, String str2) {
                ah.a(campaign, c.this.f21613c);
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final boolean onInterceptDefaultLoadingDialog() {
                return false;
            }

            @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
            public final void onLeaveApp() {
                com.mbridge.msdk.mbbanner.common.b.c cVar = c.this.f21611a;
                if (cVar != null) {
                    cVar.b();
                }
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onRedirectionFailed(Campaign campaign, String str2) {
                ah.a(campaign, c.this.f21613c);
            }

            @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
            public final void onShowLoading(Campaign campaign) {
            }

            @Override // com.mbridge.msdk.out.BaseTrackingListener
            public final void onStartRedirection(Campaign campaign, String str2) {
                ah.b(campaign, c.this.f21613c);
            }
        });
        campaignEx.setCampaignUnitId(this.f21615e);
        this.f21616f.a(campaignEx);
        if (!this.f21612b.isReportClick()) {
            this.f21612b.setReportClick(true);
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().l() != null) {
                com.mbridge.msdk.click.a.a(c8, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
            }
        }
        com.mbridge.msdk.mbbanner.common.b.c cVar = this.f21611a;
        if (cVar != null) {
            cVar.a();
        }
    }
}
