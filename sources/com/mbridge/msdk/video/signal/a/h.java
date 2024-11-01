package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        ad.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i8, int i9) {
        ad.a("DefaultJSVideoModule", "closeOperte:close=" + i8 + "closeViewVisible=" + i9);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        ad.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        ad.a("DefaultJSVideoModule", "getCurrentProgress");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i8) {
        ad.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i8) {
        ad.a("DefaultJSVideoModule", "notifyCloseBtn:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i8) {
        ad.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i8, int i9) {
        ad.a("DefaultJSVideoModule", "progressOperate:progress=" + i8 + "progressViewVisible=" + i9);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z8) {
        ad.a("DefaultJSVideoModule", "setCover:" + z8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z8) {
        ad.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i8) {
        ad.a("DefaultJSVideoModule", "setScaleFitXY:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i8) {
        ad.a("DefaultJSVideoModule", "setVisible:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        ad.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        ad.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ad.a("DefaultJSVideoModule", "showVideoLocation:marginTop=" + i8 + ",marginLeft=" + i9 + ",width=" + i10 + ",height=" + i11 + ",radius=" + i12 + ",borderTop=" + i13 + ",borderTop=" + i13 + ",borderLeft=" + i14 + ",borderWidth=" + i15 + ",borderHeight=" + i16);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i8, int i9) {
        ad.a("DefaultJSVideoModule", "soundOperate:mute=" + i8 + ",soundViewVisible=" + i9);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i8) {
        ad.a("DefaultJSVideoModule", "videoOperate:" + i8);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i8, int i9, String str) {
        ad.a("DefaultJSVideoModule", "soundOperate:mute=" + i8 + ",soundViewVisible=" + i9 + ",pt=" + str);
    }
}
