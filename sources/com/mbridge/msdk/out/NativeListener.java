package com.mbridge.msdk.out;

import java.util.List;

/* loaded from: classes4.dex */
public class NativeListener {

    /* loaded from: classes4.dex */
    public interface FilpListener {
        void filpEvent(int i8);
    }

    /* loaded from: classes4.dex */
    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i8);

        void onLoggingImpression(int i8);
    }

    /* loaded from: classes4.dex */
    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i8);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    /* loaded from: classes4.dex */
    public static class Template {
        private int adNum;
        private int id;

        public Template(int i8, int i9) {
            this.id = i8;
            this.adNum = i9;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.id;
        }

        public void setAdNum(int i8) {
            this.adNum = i8;
        }

        public void setId(int i8) {
            this.id = i8;
        }
    }

    /* loaded from: classes4.dex */
    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
