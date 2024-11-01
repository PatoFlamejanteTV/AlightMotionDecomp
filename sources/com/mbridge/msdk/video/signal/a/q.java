package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.video.module.MBridgeVideoView;

/* loaded from: classes4.dex */
public final class q extends r {
    public q(MBridgeVideoView mBridgeVideoView) {
        this.f23872a = mBridgeVideoView;
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void alertWebViewShowed() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.alertWebViewShowed();
        } else {
            super.alertWebViewShowed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void closeVideoOperate(int i8, int i9) {
        super.closeVideoOperate(i8, i9);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.closeVideoOperate(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void dismissAllAlert() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.dismissAllAlert();
        } else {
            super.dismissAllAlert();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewHeight() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getBorderViewHeight();
        }
        return super.getBorderViewHeight();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewLeft() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getBorderViewLeft();
        }
        return super.getBorderViewLeft();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewRadius() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getBorderViewRadius();
        }
        return super.getBorderViewRadius();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewTop() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getBorderViewTop();
        }
        return super.getBorderViewTop();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final int getBorderViewWidth() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getBorderViewWidth();
        }
        return super.getBorderViewWidth();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final String getCurrentProgress() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.getCurrentProgress();
        }
        return super.getCurrentProgress();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void hideAlertView(int i8) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.hideAlertView(i8);
        } else {
            super.hideAlertView(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final boolean isH5Canvas() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            return mBridgeVideoView.isH5Canvas();
        }
        return super.isH5Canvas();
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void progressBarOperate(int i8) {
        super.progressBarOperate(i8);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.progressBarOperate(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void progressOperate(int i8, int i9) {
        super.progressOperate(i8, i9);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.progressOperate(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setCover(boolean z8) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(z8);
        } else {
            super.setCover(z8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setMiniEndCardState(boolean z8) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setMiniEndCardState(z8);
        } else {
            super.setMiniEndCardState(z8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setScaleFitXY(int i8) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setScaleFitXY(i8);
        } else {
            super.setScaleFitXY(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void setVisible(int i8) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVisible(i8);
        } else {
            super.setVisible(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showAlertView() {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showAlertView();
        } else {
            super.showAlertView();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showIVRewardAlertView(String str) {
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showIVRewardAlertView(str);
        } else {
            super.showIVRewardAlertView(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void showVideoLocation(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        super.showVideoLocation(i8, i9, i10, i11, i12, i13, i14, i15, i16);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showVideoLocation(i8, i9, i10, i11, i12, i13, i14, i15, i16);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void soundOperate(int i8, int i9) {
        super.soundOperate(i8, i9);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.soundOperate(i8, i9);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void videoOperate(int i8) {
        super.videoOperate(i8);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.videoOperate(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.h, com.mbridge.msdk.video.signal.j
    public final void soundOperate(int i8, int i9, String str) {
        super.soundOperate(i8, i9, str);
        MBridgeVideoView mBridgeVideoView = this.f23872a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.soundOperate(i8, i9, str);
        }
    }
}
