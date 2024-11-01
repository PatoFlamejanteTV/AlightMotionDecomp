package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i8, int i9, int i10) {
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        ad.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        ad.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        ad.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        ad.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i8) {
        ad.a("DefaultJSContainerModule", "notifyCloseBtn:state = " + i8);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i8) {
        ad.a("DefaultJSContainerModule", "readyStatus:isReady=" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i8, int i9, int i10) {
        ad.a("DefaultJSContainerModule", "showMiniCard width = " + i8 + " height = " + i9 + " radius = " + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        ad.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i8) {
        ad.a("DefaultJSContainerModule", "showEndcard,type=" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        ad.a("DefaultJSContainerModule", "showMiniCard top = " + i8 + " left = " + i9 + " width = " + i10 + " height = " + i11 + " radius = " + i12);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i8) {
        ad.a("DefaultJSContainerModule", "showVideoClickView:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        ad.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i8) {
        ad.a("DefaultJSContainerModule", "toggleCloseBtn:state=" + i8);
    }
}
