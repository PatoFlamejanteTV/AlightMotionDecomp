package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.video.signal.factory.b;

/* loaded from: classes4.dex */
public class MBridgeLandingPageView extends MBridgeH5EndCardView {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements com.mbridge.msdk.mbsignalcommon.base.a {
        private a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.a
        public final boolean a(String str) {
            if (TextUtils.isEmpty(str) || URLUtil.isNetworkUrl(str)) {
                return false;
            }
            ah.a(c.m().c(), str, (BaseTrackingListener) null);
            return true;
        }
    }

    public MBridgeLandingPageView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx != null) {
            return com.mbridge.msdk.click.c.a(campaignEx.getClickURL(), "-999", "-999");
        }
        return null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        if (this.f23498f) {
            this.f23582q.setFilter(new a());
        }
        super.preLoadData(bVar);
        setVisibility(0);
        setCloseVisible(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        try {
            ad.a(MBridgeBaseView.TAG, "webviewshow");
            g.a().a((WebView) this.f23582q, "webviewshow", "");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public MBridgeLandingPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
