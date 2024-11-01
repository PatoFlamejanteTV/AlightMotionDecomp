package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0414a {

    /* renamed from: a, reason: collision with root package name */
    private final String f22370a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22371b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22372c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f22373d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f22374e;

    /* renamed from: f, reason: collision with root package name */
    private c f22375f;

    /* renamed from: g, reason: collision with root package name */
    private String f22376g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadMessage f22377h;

    /* renamed from: i, reason: collision with root package name */
    private DownloadRequest f22378i;

    /* renamed from: j, reason: collision with root package name */
    private String f22379j;

    /* renamed from: k, reason: collision with root package name */
    private x f22380k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22381l;

    /* renamed from: m, reason: collision with root package name */
    private String f22382m;

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f22381l = false;
        this.f22373d = bVar;
        this.f22374e = aVar;
        this.f22375f = cVar;
        this.f22376g = cVar.j();
        String a9 = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
        String md5 = SameMD5.getMD5(ao.b(this.f22376g));
        this.f22370a = md5;
        this.f22371b = a9 + "/";
        this.f22372c = a9 + "/" + md5;
        this.f22375f.a(true);
        String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f22376g);
        if (!TextUtils.isEmpty(resDirFromCampaign)) {
            this.f22381l = true;
            this.f22375f.a(1);
            this.f22375f.a(resDirFromCampaign);
            this.f22375f.b(true);
            this.f22375f.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        this.f22380k = xVar;
        int v8 = this.f22373d.v();
        this.f22379j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.f22373d, this.f22374e, this);
        }
        if (this.f22381l) {
            x xVar2 = this.f22380k;
            if (xVar2 != null) {
                xVar2.b(this.f22373d, this.f22374e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22379j, v8, this);
        String str = this.f22370a + ".zip";
        this.f22382m = this.f22371b + str;
        this.f22377h = new DownloadMessage(this.f22373d, this.f22376g, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f22377h).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f22371b).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f22378i = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22379j);
        String str = this.f22378i.get("cache", "2");
        c cVar = this.f22375f;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f22375f.b(false);
        this.f22375f.a(false);
        if (this.f22375f.c()) {
            x xVar = this.f22380k;
            if (xVar != null) {
                xVar.b(this.f22373d, this.f22374e, this);
                return;
            }
            return;
        }
        x xVar2 = this.f22380k;
        if (xVar2 != null) {
            xVar2.a(this.f22373d, this.f22374e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22379j);
        try {
            try {
                MBResourceManager.getInstance().unZip(this.f22382m, this.f22372c);
                String resDirFromCampaign = ResourceManager.getinstance().getResDirFromCampaign(this.f22376g);
                if (!TextUtils.isEmpty(resDirFromCampaign)) {
                    String str = this.f22378i.get("cache", "2");
                    c cVar = this.f22375f;
                    if (TextUtils.equals(str, "2")) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    cVar.a(i8);
                    this.f22375f.b(true);
                    this.f22375f.a(false);
                    this.f22375f.a(2);
                    this.f22375f.a(resDirFromCampaign);
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f22375f.c()) {
                    xVar2 = this.f22380k;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f22380k;
                    if (xVar != null) {
                        bVar = this.f22373d;
                        aVar = this.f22374e;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f22375f.c()) {
                xVar2 = this.f22380k;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f22373d, this.f22374e, this);
                return;
            }
            xVar = this.f22380k;
            if (xVar != null) {
                bVar = this.f22373d;
                aVar = this.f22374e;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f22375f.c()) {
                x xVar3 = this.f22380k;
                if (xVar3 != null) {
                    xVar3.b(this.f22373d, this.f22374e, this);
                }
            } else {
                x xVar4 = this.f22380k;
                if (xVar4 != null) {
                    xVar4.a(this.f22373d, this.f22374e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22379j);
        String str2 = this.f22378i.get("cache", "2");
        c cVar = this.f22375f;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        cVar.a(i8);
        this.f22375f.b(false);
        this.f22375f.a(false);
        if (this.f22375f.c()) {
            x xVar = this.f22380k;
            if (xVar != null) {
                xVar.b(this.f22373d, this.f22374e, this);
                return;
            }
            return;
        }
        if (this.f22380k != null) {
            c cVar2 = this.f22375f;
            if (cVar2 != null) {
                int h8 = cVar2.h();
                if (h8 != 2) {
                    if (h8 != 3) {
                        if (h8 == 4) {
                            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
                        }
                    } else {
                        str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
                    }
                } else {
                    str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
                }
                MBridgeError mBridgeError = new MBridgeError(2, str);
                mBridgeError.setException(downloadError.getException());
                this.f22380k.a(this.f22373d, this.f22374e, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f22380k.a(this.f22373d, this.f22374e, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str);
        }
        DownloadRequest downloadRequest = this.f22378i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f22377h);
        }
    }
}
