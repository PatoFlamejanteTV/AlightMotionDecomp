package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class DownLoadH5SourceListener implements H5DownLoadManager.IOnDownLoadH5Source {
    private static String TAG = "DownLoadH5SourceListener";
    private CopyOnWriteArrayList<H5DownLoadManager.ZipDownloadListener> listeners;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private String mUrl;
    private ResourceManager resourceManager;

    public DownLoadH5SourceListener(ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap, ResourceManager resourceManager, H5DownLoadManager.ZipDownloadListener zipDownloadListener, String str) {
        CopyOnWriteArrayList<H5DownLoadManager.ZipDownloadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.listeners = copyOnWriteArrayList;
        this.mResDownloadingMap = concurrentMap;
        this.resourceManager = resourceManager;
        copyOnWriteArrayList.add(zipDownloadListener);
        this.mUrl = str;
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onFailed(String str) {
        ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap;
        try {
            concurrentMap = this.mResDownloadingMap;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            try {
                str = e8.getMessage();
            } catch (Throwable th) {
                ad.a(TAG, th.getMessage(), th);
            }
        }
        if (concurrentMap == null) {
            Iterator<H5DownLoadManager.ZipDownloadListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                H5DownLoadManager.ZipDownloadListener next = it.next();
                if (next != null) {
                    next.onFailed(this.mUrl, "mResDownloadingMap  is null");
                    this.listeners.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.mUrl)) {
            this.mResDownloadingMap.remove(this.mUrl);
        }
        Iterator<H5DownLoadManager.ZipDownloadListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            H5DownLoadManager.ZipDownloadListener next2 = it2.next();
            if (next2 != null) {
                next2.onFailed(this.mUrl, str);
                this.listeners.remove(next2);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onStart() {
    }

    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
    public void onSuccess(String str, byte[] bArr, String str2) {
        ConcurrentMap<String, DownLoadH5SourceListener> concurrentMap;
        String str3 = "";
        try {
            concurrentMap = this.mResDownloadingMap;
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
            try {
                str3 = e8.getMessage();
            } catch (Throwable th) {
                ad.a(TAG, th.getMessage(), th);
            }
        }
        if (concurrentMap == null) {
            Iterator<H5DownLoadManager.ZipDownloadListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                H5DownLoadManager.ZipDownloadListener next = it.next();
                if (next != null) {
                    next.onFailed(str2, "mResDownloadingMap  is null");
                    this.listeners.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(str2)) {
            this.mResDownloadingMap.remove(str2);
        }
        if (bArr != null && bArr.length > 0) {
            String saveResFile = this.resourceManager.saveResFile(str2, bArr);
            if (TextUtils.isEmpty(saveResFile)) {
                Iterator<H5DownLoadManager.ZipDownloadListener> it2 = this.listeners.iterator();
                while (it2.hasNext()) {
                    H5DownLoadManager.ZipDownloadListener next2 = it2.next();
                    if (next2 != null) {
                        next2.onSuccess(str2, "", false);
                        this.listeners.remove(next2);
                    }
                }
                return;
            }
            str3 = "data save failed:" + saveResFile;
        } else {
            str3 = "response data is error";
        }
        Iterator<H5DownLoadManager.ZipDownloadListener> it3 = this.listeners.iterator();
        while (it3.hasNext()) {
            H5DownLoadManager.ZipDownloadListener next3 = it3.next();
            if (next3 != null) {
                next3.onFailed(str2, str3);
            }
        }
    }

    public void setZipDownloadListener(H5DownLoadManager.ZipDownloadListener zipDownloadListener) {
        this.listeners.add(zipDownloadListener);
    }
}
