package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23903g = 0;

    /* renamed from: e, reason: collision with root package name */
    private Handler f23904e = new Handler(Looper.getMainLooper());

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(final Object obj, final String str) {
        if (ai.g()) {
            super.appendSubView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.30
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.appendSubView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(final Object obj, final String str) {
        if (ai.g()) {
            super.appendViewTo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.31
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.appendViewTo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(final Object obj, final String str) {
        if (ai.g()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.35
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.bringViewToFront(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(final Object obj, final String str) {
        if (ai.g()) {
            super.broadcast(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.63
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.broadcast(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(final Object obj, final String str) {
        if (ai.g()) {
            super.clearAllCache(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.75
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.clearAllCache(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(final Object obj, final String str) {
        if (ai.g()) {
            super.click(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.12
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.click(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(final Object obj, final String str) {
        if (ai.g()) {
            super.closeAd(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.62
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.closeAd(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(final Object obj, final String str) {
        if (ai.g()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.78
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.closeVideoOperte(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(final Object obj, final String str) {
        if (ai.g()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.15
            @Override // java.lang.Runnable
            public final void run() {
                VideoCommunication.super.closeWeb(obj, str);
            }
        });
        ad.b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(final Object obj, final String str) {
        if (ai.g()) {
            super.createNativeEC(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.71
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.createNativeEC(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(final Object obj, final String str) {
        if (ai.g()) {
            super.createPlayerView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.24
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.createPlayerView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(final Object obj, final String str) {
        if (ai.g()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.25
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.createSubPlayTemplateView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(final Object obj, final String str) {
        if (ai.g()) {
            super.createView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.22
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.createView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(final Object obj, final String str) {
        if (ai.g()) {
            super.createWebview(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.21
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.createWebview(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(final Object obj, final String str) {
        if (ai.g()) {
            super.destroyComponent(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.26
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.destroyComponent(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(final Object obj, final String str) {
        if (ai.g()) {
            super.getAllCache(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.74
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getAllCache(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(final Object obj, final String str) {
        if (ai.g()) {
            super.getAppSetting(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.77
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getAppSetting(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(final Object obj, final String str) {
        if (ai.g()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.27
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getComponentOptions(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(final Object obj, final String str) {
        if (ai.g()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.3
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getCurrentProgress(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(final Object obj, final String str) {
        if (ai.g()) {
            super.getCutout(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.76
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getCutout(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(final Object obj, final String str) {
        if (ai.g()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.82
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getEncryptPrice(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(final Object obj, final String str) {
        if (ai.g()) {
            super.getFileInfo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.17
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getFileInfo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(final Object obj, final String str) {
        if (ai.g()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.79
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getRewardSetting(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(final Object obj, final String str) {
        if (ai.g()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.80
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getRewardUnitSetting(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(final Object obj, final String str) {
        if (ai.g()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.16
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getSDKInfo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(final Object obj, final String str) {
        if (ai.g()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.81
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.getUnitSetting(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(final Object obj, final String str) {
        if (ai.g()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.69
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.handleNativeObject(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(final Object obj, final String str) {
        if (ai.g()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.8
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.handlerH5Exception(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(final Object obj, final String str) {
        if (ai.g()) {
            super.hideView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.36
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.hideView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(final Object obj, final String str) {
        if (ai.g()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.68
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.increaseOfferFrequence(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(final Object obj, final String str) {
        if (ai.g()) {
            super.init(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.1
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.init(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(final Object obj, final String str) {
        if (ai.g()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.41
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.insertViewAbove(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(final Object obj, final String str) {
        if (ai.g()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.42
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.insertViewBelow(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(final Object obj, final String str) {
        if (ai.g()) {
            super.isSystemResume(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.9
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.isSystemResume(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(final Object obj, final String str) {
        if (ai.g()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.64
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.ivRewardAdsWithoutVideo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(final Object obj, final String str) {
        if (ai.g()) {
            super.loadads(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.18
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.loadads(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(final Object obj, final String str) {
        if (ai.g()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.70
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.loadingResourceStatus(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.6
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.notifyCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(final Object obj, final String str) {
        if (ai.g()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.32
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.onlyAppendSubView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(final Object obj, final String str) {
        if (ai.g()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.33
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.onlyAppendViewTo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(final Object obj, final String str) {
        if (ai.g()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.43
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.onlyInsertViewAbove(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(final Object obj, final String str) {
        if (ai.g()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.44
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.onlyInsertViewBelow(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(final Object obj, final String str) {
        if (ai.g()) {
            super.openURL(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.13
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.openURL(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(final Object obj, final String str) {
        if (ai.g()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.11
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playVideoFinishOperate(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(final Object obj, final String str) {
        if (ai.g()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.58
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerGetMuteState(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(final Object obj, final String str) {
        if (ai.g()) {
            super.playerMute(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.55
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerMute(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(final Object obj, final String str) {
        if (ai.g()) {
            super.playerPause(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.51
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerPause(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(final Object obj, final String str) {
        if (ai.g()) {
            super.playerPlay(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.50
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerPlay(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(final Object obj, final String str) {
        if (ai.g()) {
            super.playerResume(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.52
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerResume(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(final Object obj, final String str) {
        if (ai.g()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.60
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerSetRenderType(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(final Object obj, final String str) {
        if (ai.g()) {
            super.playerSetSource(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.59
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerSetSource(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(final Object obj, final String str) {
        if (ai.g()) {
            super.playerStop(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.53
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerStop(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(final Object obj, final String str) {
        if (ai.g()) {
            super.playerUnmute(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.57
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerUnmute(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(final Object obj, final String str) {
        if (ai.g()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.54
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.playerUpdateFrame(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(final Object obj, final String str) {
        if (ai.g()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.61
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.preloadSubPlayTemplateView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(final Object obj, final String str) {
        if (ai.g()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.2
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.progressBarOperate(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(final Object obj, final String str) {
        if (ai.g()) {
            super.progressOperate(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.83
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.progressOperate(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(final Object obj, final String str) {
        if (ai.g()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.19
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.reactDeveloper(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(final Object obj, final String str) {
        ad.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (ai.g()) {
            super.readyStatus(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.10
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.readyStatus(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(final Object obj, final String str) {
        if (ai.g()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.73
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.removeCacheItem(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(final Object obj, final String str) {
        if (ai.g()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.29
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.removeFromSuperView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(final Object obj, final String str) {
        if (ai.g()) {
            super.reportUrls(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.20
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.reportUrls(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(final Object obj, final String str) {
        if (ai.g()) {
            super.setCacheItem(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.72
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setCacheItem(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(final Object obj, final String str) {
        if (ai.g()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.5
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setScaleFitXY(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(final Object obj, final String str) {
        if (ai.g()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.65
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setSubPlayTemplateInfo(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(final Object obj, final String str) {
        if (ai.g()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.39
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setViewAlpha(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(final Object obj, final String str) {
        if (ai.g()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.38
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setViewBgColor(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(final Object obj, final String str) {
        if (ai.g()) {
            super.setViewRect(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.28
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setViewRect(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(final Object obj, final String str) {
        if (ai.g()) {
            super.setViewScale(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.40
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.setViewScale(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(final Object obj, final String str) {
        if (ai.g()) {
            super.showAlertView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.14
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.showAlertView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(final Object obj, final String str) {
        if (ai.g()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.4
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.showVideoClickView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(final Object obj, final String str) {
        if (ai.g()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.45
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.showVideoLocation(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(final Object obj, final String str) {
        if (ai.g()) {
            super.showView(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.37
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.showView(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(final Object obj, final String str) {
        if (ai.g()) {
            super.soundOperate(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.56
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.soundOperate(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(final Object obj, final String str) {
        if (ai.g()) {
            super.statistics(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.23
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.statistics(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.7
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.toggleCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(final Object obj, final String str) {
        if (ai.g()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.34
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.triggerCloseBtn(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(final Object obj, final String str) {
        if (ai.g()) {
            super.videoOperate(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.67
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.videoOperate(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(final Object obj, final String str) {
        if (ai.g()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.66
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.webviewFireEvent(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(final Object obj, final String str) {
        if (ai.g()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.48
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.webviewGoBack(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(final Object obj, final String str) {
        if (ai.g()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.49
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.webviewGoForward(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(final Object obj, final String str) {
        if (ai.g()) {
            super.webviewLoad(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.46
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.webviewLoad(obj, str);
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(final Object obj, final String str) {
        if (ai.g()) {
            super.webviewReload(obj, str);
        } else {
            this.f23904e.post(new Runnable() { // from class: com.mbridge.msdk.video.signal.communication.VideoCommunication.47
                @Override // java.lang.Runnable
                public final void run() {
                    VideoCommunication.super.webviewReload(obj, str);
                }
            });
        }
    }
}
