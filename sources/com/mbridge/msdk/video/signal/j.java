package com.mbridge.msdk.video.signal;

/* loaded from: classes4.dex */
public interface j {
    void alertWebViewShowed();

    void closeVideoOperate(int i8, int i9);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i8);

    boolean isH5Canvas();

    void notifyCloseBtn(int i8);

    void progressBarOperate(int i8);

    void progressOperate(int i8, int i9);

    void setCover(boolean z8);

    void setMiniEndCardState(boolean z8);

    void setScaleFitXY(int i8);

    void setVisible(int i8);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    void soundOperate(int i8, int i9);

    void soundOperate(int i8, int i9, String str);

    void videoOperate(int i8);
}
