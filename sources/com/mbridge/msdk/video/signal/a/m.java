package com.mbridge.msdk.video.signal.a;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* loaded from: classes4.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    private MBridgeContainerView f23868a;

    public m(MBridgeContainerView mBridgeContainerView) {
        this.f23868a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void configurationChanged(int i8, int i9, int i10) {
        super.configurationChanged(i8, i9, i10);
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i8, i9, i10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f23868a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f23868a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void readyStatus(int i8) {
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i8);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.readyStatus(i8);
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void resizeMiniCard(int i8, int i9, int i10) {
        super.resizeMiniCard(i8, i9, i10);
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i8, i9, i10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f23868a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showEndcard(int i8) {
        super.showEndcard(i8);
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i8);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showMiniCard(int i8, int i9, int i10, int i11, int i12) {
        super.showMiniCard(i8, i9, i10, i11, i12);
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i8, i9, i10, i11, i12);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoClickView(int i8) {
        super.showVideoClickView(i8);
        MBridgeContainerView mBridgeContainerView = this.f23868a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i8);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.f
    public final void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.e, com.mbridge.msdk.video.signal.h
    public final void toggleCloseBtn(int i8) {
        super.toggleCloseBtn(i8);
        try {
            MBridgeContainerView mBridgeContainerView = this.f23868a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.toggleCloseBtn(i8);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
