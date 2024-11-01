package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class H5DownLoadManager {
    public static final String SP_ENDING_PAGE_SAVE_TIME = "ending_page_save_time";
    public static final String SP_ENDING_PAGE_SOURCE = "ending_page_source";
    private static final String TAG = "H5DownLoadManager";
    private static volatile H5DownLoadManager sH5Manager;
    private final String DOWN_TYPE = "down_type";
    private final String LOCAL_RID = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private HTMLResourceManager htmlResourceManager;
    private boolean isUseDownloadModule;
    private CopyOnWriteArrayList<String> mResDownloadingList;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private ResourceManager resourceManager;

    /* loaded from: classes4.dex */
    public interface H5ResDownloadListerInter {
        void onFailed(String str, String str2);

        void onSuccess(String str, String str2, boolean z8);
    }

    /* loaded from: classes4.dex */
    public interface IH5SourceDownloadListener extends H5ResDownloadListerInter {
    }

    /* loaded from: classes4.dex */
    public interface IOnDownLoadH5Source {
        void onFailed(String str);

        void onStart();

        void onSuccess(String str, byte[] bArr, String str2);
    }

    /* loaded from: classes4.dex */
    public interface ZipDownloadListener extends H5ResDownloadListerInter {
    }

    private H5DownLoadManager() {
        this.isUseDownloadModule = false;
        try {
            this.resourceManager = ResourceManager.getinstance();
            this.htmlResourceManager = HTMLResourceManager.getInstance();
            this.mResDownloadingList = new CopyOnWriteArrayList<>();
            this.mResDownloadingMap = new ConcurrentHashMap();
            g b9 = h.a().b(c.m().k());
            if (b9 != null) {
                this.isUseDownloadModule = b9.y(1);
            }
        } catch (Throwable th) {
            ad.a(TAG, th.getMessage(), th);
        }
    }

    private void downloadHTML(final b bVar, final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        try {
            ad.b(TAG, "download url:" + str);
            final d dVar = new d();
            dVar.a("scenes", "1");
            dVar.a("url", str);
            if (bVar != null) {
                dVar.a("resource_type", Integer.valueOf(bVar.b()));
            }
            if (this.mResDownloadingList.contains(str)) {
                return;
            }
            this.mResDownloadingList.add(str);
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2
                @Override // com.mbridge.msdk.foundation.same.e.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.e.a
                public void pauseTask(boolean z8) {
                }

                @Override // com.mbridge.msdk.foundation.same.e.a
                public void runTask() {
                    if (!TextUtils.isEmpty(H5DownLoadManager.this.htmlResourceManager.getHtmlContentFromUrl(str))) {
                        dVar.a("cache", 2);
                        H5DownLoadManager.this.mResDownloadingList.remove(str);
                        H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                        if (h5ResDownloadListerInter2 != null) {
                            h5ResDownloadListerInter2.onSuccess(str, "", true);
                        }
                        bVar.a("m_download_start", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        return;
                    }
                    DownLoadUtils.getSourceCodeFromNetUrl(str, new IOnDownLoadH5Source() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2.1
                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onFailed(String str2) {
                            try {
                                H5DownLoadManager.this.mResDownloadingList.remove(str);
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter3 != null) {
                                    h5ResDownloadListerInter3.onFailed(str, str2);
                                }
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    e8.printStackTrace();
                                }
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter4 != null) {
                                    h5ResDownloadListerInter4.onFailed(str, str2);
                                }
                            }
                            AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                            if (h5ResDownloadListerInter == null) {
                                dVar.a("result", 3);
                                AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                bVar.a("m_download_end", dVar);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                            }
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onStart() {
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onSuccess(String str2, byte[] bArr, String str3) {
                            try {
                                H5DownLoadManager.this.mResDownloadingList.remove(str3);
                                if (bArr != null && bArr.length > 0) {
                                    if (H5DownLoadManager.this.htmlResourceManager.saveResHtmlFile(str3, bArr)) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                        if (h5ResDownloadListerInter3 != null) {
                                            h5ResDownloadListerInter3.onSuccess(str3, "", false);
                                            return;
                                        }
                                        dVar.a("result", 3);
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        bVar.a("m_download_end", dVar);
                                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter4 != null) {
                                        h5ResDownloadListerInter4.onFailed(str3, "save file failed");
                                        return;
                                    }
                                    dVar.a("result", 3);
                                    AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                    bVar.a("m_download_end", dVar);
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                                }
                            } catch (Exception e8) {
                                if (MBridgeConstans.DEBUG) {
                                    e8.printStackTrace();
                                }
                                AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter5 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter5 != null) {
                                    h5ResDownloadListerInter5.onFailed(str3, e8.getMessage());
                                    return;
                                }
                                dVar.a("result", 3);
                                AnonymousClass2 anonymousClass26 = AnonymousClass2.this;
                                bVar.a("m_download_end", dVar);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                            }
                        }
                    }, true);
                    dVar.a("cache", 1);
                    bVar.a("m_download_start", dVar);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                }
            });
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    private void downloadHTMLByDownloadModule(final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (TextUtils.isEmpty(str)) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is null", str);
                return;
            }
            return;
        }
        try {
            new URL(str);
            String str2 = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML) + "/";
            String md5 = SameMD5.getMD5(ao.b(str));
            MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, md5 + ".html", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(str2).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.1
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "下载取消： ");
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "下载结束： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType() + " " + downloadMessage.getSaveFilePath());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", false);
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                    ad.a(H5DownLoadManager.TAG, "下载结束失败： " + downloadError.getException().getMessage());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "开始下载 html： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType());
                }
            }).build().start();
        } catch (Exception unused) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is unlawful", str);
            }
        }
    }

    private void downloadZipByDownloadModule(final b bVar, String str, final ZipDownloadListener zipDownloadListener) {
        if (TextUtils.isEmpty(str)) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is null");
                return;
            }
            return;
        }
        try {
            new URL(str);
            final d dVar = new d();
            dVar.a("scenes", "1");
            dVar.a("url", str);
            if (bVar != null) {
                dVar.a("resource_type", Integer.valueOf(bVar.b()));
            }
            String a9 = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
            String md5 = SameMD5.getMD5(ao.b(str));
            String str2 = a9 + "/";
            final String str3 = a9 + "/" + md5;
            DownloadMessage<?> downloadMessage = new DownloadMessage<>(bVar, str, md5 + ".zip", 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
            if (bVar != null) {
                downloadMessage.setUseCronetDownload(bVar.n());
            }
            MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(str2).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.3
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage2) {
                    int i8;
                    ad.a(H5DownLoadManager.TAG, "下载取消： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        if (downloadMessage2.isCache()) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        dVar2.a("cache", Integer.valueOf(i8));
                    }
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a("m_download_start", dVar);
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                    if (!TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage2) {
                    int i8;
                    ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + " " + downloadMessage2.getSaveFilePath());
                    try {
                        d dVar2 = dVar;
                        if (dVar2 != null) {
                            if (downloadMessage2.isCache()) {
                                i8 = 1;
                            } else {
                                i8 = 2;
                            }
                            dVar2.a("cache", Integer.valueOf(i8));
                        }
                        b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a("m_download_start", dVar);
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                            MBResourceManager.getInstance().unZip(downloadMessage2.getSaveFilePath(), str3);
                        }
                        String str4 = "";
                        try {
                            str4 = (String) downloadMessage2.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            ad.b(H5DownLoadManager.TAG, th.getMessage());
                        }
                        ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压成功： " + str3);
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), str4, downloadMessage2.isCache());
                        }
                    } catch (IOException e8) {
                        ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压失败： " + e8.getMessage());
                        ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                        if (zipDownloadListener3 != null) {
                            zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), e8.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage2, DownloadError downloadError) {
                    int i8;
                    ad.a(H5DownLoadManager.TAG, "下载错误： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + "  " + downloadError.getException().getMessage());
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        if (downloadMessage2.isCache()) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        dVar2.a("cache", Integer.valueOf(i8));
                    }
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a("m_download_start", dVar);
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                    if (!TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage2) {
                    ad.a(H5DownLoadManager.TAG, "开始下载 zip： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                }
            }).build().start();
        } catch (Exception unused) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is unlawful");
            }
        }
    }

    private void downloadZipByOldDownloadModule(b bVar, String str, ZipDownloadListener zipDownloadListener) {
        d dVar = new d();
        dVar.a("scenes", "1");
        dVar.a("url", str);
        if (bVar != null) {
            dVar.a("resource_type", Integer.valueOf(bVar.b()));
        }
        try {
            if (TextUtils.isEmpty(this.resourceManager.getResDirFromCampaign(str))) {
                dVar.a("cache", 2);
                if (this.mResDownloadingMap.containsKey(str)) {
                    DownLoadH5SourceListener downLoadH5SourceListener = this.mResDownloadingMap.get(str);
                    if (downLoadH5SourceListener != null) {
                        downLoadH5SourceListener.setZipDownloadListener(zipDownloadListener);
                    }
                    if (bVar != null && !bVar.a()) {
                        bVar.a("m_download_start", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        return;
                    }
                    return;
                }
                DownLoadH5SourceListener downLoadH5SourceListener2 = new DownLoadH5SourceListener(this.mResDownloadingMap, this.resourceManager, zipDownloadListener, str);
                this.mResDownloadingMap.put(str, downLoadH5SourceListener2);
                DownLoadUtils.getSourceCodeFromNetUrl(str, downLoadH5SourceListener2, true);
            } else {
                dVar.a("cache", 1);
                if (zipDownloadListener != null) {
                    zipDownloadListener.onSuccess(str, "", true);
                }
            }
            if (bVar != null && !bVar.a()) {
                bVar.a("m_download_start", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            }
        } catch (Exception e8) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "downloadzip failed");
            }
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    private String getHtmlAddress(String str) {
        HTMLResourceManager hTMLResourceManager = this.htmlResourceManager;
        if (hTMLResourceManager != null) {
            return hTMLResourceManager.getHtmlPathFromUrl(str);
        }
        return str;
    }

    public static H5DownLoadManager getInstance() {
        if (sH5Manager == null) {
            synchronized (H5DownLoadManager.class) {
                try {
                    if (sH5Manager == null) {
                        sH5Manager = new H5DownLoadManager();
                    }
                } finally {
                }
            }
        }
        return sH5Manager;
    }

    private long getPreSaveTimeFromSp(String str) {
        try {
            Object a9 = al.a(c.m().c(), SP_ENDING_PAGE_SAVE_TIME + str, 0L);
            if (a9 != null && (a9 instanceof Long)) {
                return ((Long) a9).longValue();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return 0L;
    }

    private void saveSourceContent(String str, String str2) {
        try {
            ad.c(TAG, "sourceContent:" + str);
            al.b(c.m().c(), SP_ENDING_PAGE_SOURCE + str2, str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private void updateEndingPageSaveTime(String str) {
        try {
            al.b(c.m().c(), SP_ENDING_PAGE_SAVE_TIME + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void download(b bVar, String str) {
        download(bVar, str, null);
    }

    public void downloadH5Res(b bVar, String str) {
        downloadH5Res(bVar, str, null);
    }

    public void downloadZip(b bVar, String str, ZipDownloadListener zipDownloadListener) {
        if (this.isUseDownloadModule) {
            downloadZipByDownloadModule(bVar, str, zipDownloadListener);
        } else {
            downloadZipByOldDownloadModule(bVar, str, zipDownloadListener);
        }
    }

    public String getH5ResAddress(String str) {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (!TextUtils.isEmpty(path)) {
            if (!TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                return str;
            }
            if (path.toLowerCase().endsWith(".zip")) {
                return getResAddress(str);
            }
            return getHtmlAddress(str);
        }
        return str;
    }

    public String getResAddress(String str) {
        ResourceManager resourceManager = this.resourceManager;
        if (resourceManager != null) {
            return resourceManager.getResDirFromCampaign(str);
        }
        return null;
    }

    public String getSourceContentFromSp(String str) {
        try {
            Object a9 = al.a(c.m().c(), SP_ENDING_PAGE_SOURCE + str, "");
            if (a9 != null && (a9 instanceof String)) {
                String str2 = (String) a9;
                if (an.b(str2)) {
                    return str2;
                }
                return null;
            }
            return null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public void download(b bVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (this.isUseDownloadModule) {
            downloadHTMLByDownloadModule(str, h5ResDownloadListerInter);
        } else {
            downloadHTML(bVar, str, h5ResDownloadListerInter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void downloadH5Res(com.mbridge.msdk.foundation.same.report.d.b r3, java.lang.String r4, com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter r5) {
        /*
            r2 = this;
            com.mbridge.msdk.foundation.same.report.d.c r0 = com.mbridge.msdk.foundation.same.report.d.c.a()
            com.mbridge.msdk.foundation.same.report.d.b r3 = r0.b(r3)
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL     // Catch: java.lang.Exception -> L1b
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch: java.lang.Exception -> L1b
            boolean r0 = r0.matches()     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L1d
            boolean r0 = android.webkit.URLUtil.isValidUrl(r4)     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L45
            goto L1d
        L1b:
            r3 = move-exception
            goto L42
        L1d:
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L1b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1b
            if (r1 != 0) goto L45
            java.lang.String r0 = r0.toLowerCase()     // Catch: java.lang.Exception -> L1b
            java.lang.String r1 = ".zip"
            boolean r0 = r0.endsWith(r1)     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L3e
            r0 = r5
            com.mbridge.msdk.foundation.download.download.H5DownLoadManager$ZipDownloadListener r0 = (com.mbridge.msdk.foundation.download.download.H5DownLoadManager.ZipDownloadListener) r0     // Catch: java.lang.Exception -> L1b
            r2.downloadZip(r3, r4, r0)     // Catch: java.lang.Exception -> L1b
            goto L41
        L3e:
            r2.download(r3, r4, r5)     // Catch: java.lang.Exception -> L1b
        L41:
            return
        L42:
            r3.printStackTrace()
        L45:
            if (r5 == 0) goto L4c
            java.lang.String r3 = "The URL does not contain a path "
            r5.onFailed(r4, r3)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.downloadH5Res(com.mbridge.msdk.foundation.same.report.d.b, java.lang.String, com.mbridge.msdk.foundation.download.download.H5DownLoadManager$H5ResDownloadListerInter):void");
    }

    public void downloadH5Res(String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        downloadH5Res(new b(), str, h5ResDownloadListerInter);
    }
}
