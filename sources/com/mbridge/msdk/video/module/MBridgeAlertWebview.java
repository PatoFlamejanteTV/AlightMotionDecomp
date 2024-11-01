package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.g.a;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.videocommon.download.d;
import com.mbridge.msdk.videocommon.download.e;

/* loaded from: classes4.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {

    /* renamed from: x, reason: collision with root package name */
    private String f23491x;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        String a9 = a();
        if (this.f23498f && this.f23494b != null && !TextUtils.isEmpty(a9)) {
            a aVar = new a(this.f23494b);
            aVar.a(this.f23494b.getAppName());
            this.f23582q.setDownloadListener(aVar);
            this.f23582q.setCampaignId(this.f23494b.getId());
            setCloseVisible(8);
            this.f23582q.setApiManagerJSFactory(bVar);
            this.f23582q.setWebViewListener(new com.mbridge.msdk.mbsignalcommon.b.b() { // from class: com.mbridge.msdk.video.module.MBridgeAlertWebview.1
                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, String str) {
                    super.a(webView, str);
                    ad.b("MBridgeAlertWebview", "finish+" + str);
                    g.a().a(webView);
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8, String str, String str2) {
                    super.a(webView, i8, str, str2);
                    ad.b("MBridgeAlertWebview", "onReceivedError");
                    if (MBridgeAlertWebview.this.f23586u) {
                        return;
                    }
                    ad.a(MBridgeBaseView.TAG, "onReceivedError,url:" + str2);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    k.a(mBridgeAlertWebview.f23493a, mBridgeAlertWebview.f23494b, mBridgeAlertWebview.f23491x, MBridgeAlertWebview.this.unitId, 2, str, 1);
                    MBridgeAlertWebview.this.f23586u = true;
                }

                @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
                public final void a(WebView webView, int i8) {
                    String str;
                    super.a(webView, i8);
                    ad.b("MBridgeAlertWebview", "readyState  :  " + i8);
                    MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
                    if (mBridgeAlertWebview.f23586u) {
                        return;
                    }
                    boolean z8 = i8 == 1;
                    mBridgeAlertWebview.f23585t = z8;
                    if (z8) {
                        str = "readyState state is " + i8;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
                    k.a(mBridgeAlertWebview2.f23493a, mBridgeAlertWebview2.f23494b, mBridgeAlertWebview2.f23491x, MBridgeAlertWebview.this.unitId, i8, str2, 1);
                }
            });
            setHtmlSource(e.a().b(a9));
            this.f23585t = false;
            if (TextUtils.isEmpty(this.f23584s)) {
                ad.a(MBridgeBaseView.TAG, "load url:" + a9);
                this.f23582q.loadUrl(a9);
            } else {
                ad.a(MBridgeBaseView.TAG, "load html...");
                this.f23582q.loadDataWithBaseURL(a9, this.f23584s, "text/html", C.UTF8_NAME, null);
            }
            this.f23582q.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.f23497e.a(101, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f23580o;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        k.a(this.f23493a, this.f23494b, this.f23491x, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        if (!TextUtils.isEmpty(this.unitId)) {
            com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.unitId, false);
            String str = com.mbridge.msdk.videocommon.d.c.f24238a;
            this.f23491x = str;
            if (!TextUtils.isEmpty(str)) {
                return d.a().a(this.f23491x);
            }
            return "";
        }
        return "";
    }
}
