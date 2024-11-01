package com.mbridge.msdk.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.video.bt.module.b.g;

/* loaded from: classes4.dex */
public class RewardVideoListenerWrapper implements com.mbridge.msdk.newout.RewardVideoListener {
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final g rewardVideoListener;

    public RewardVideoListenerWrapper(g gVar) {
        this.rewardVideoListener = gVar;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z8, int i8) {
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onLoadSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onVideoAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.mainHandler.post(new Runnable() { // from class: com.mbridge.msdk.out.RewardVideoListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (RewardVideoListenerWrapper.this.rewardVideoListener != null) {
                    RewardVideoListenerWrapper.this.rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}
