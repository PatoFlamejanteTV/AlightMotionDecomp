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
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0414a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f22386a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f22387b;

    /* renamed from: c, reason: collision with root package name */
    private final n f22388c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22389d;

    /* renamed from: e, reason: collision with root package name */
    private final String f22390e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22391f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadMessage f22392g;

    /* renamed from: i, reason: collision with root package name */
    private int f22394i;

    /* renamed from: j, reason: collision with root package name */
    private DownloadRequest f22395j;

    /* renamed from: k, reason: collision with root package name */
    private String f22396k;

    /* renamed from: l, reason: collision with root package name */
    private x f22397l;

    /* renamed from: m, reason: collision with root package name */
    private String f22398m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22400o;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22393h = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f22399n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i8) {
        this.f22400o = false;
        this.f22386a = bVar;
        this.f22387b = aVar;
        this.f22388c = nVar;
        this.f22394i = i8;
        String j8 = nVar.j();
        this.f22389d = j8;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f22390e = str;
        String a9 = com.mbridge.msdk.newreward.function.h.a.a(j8);
        this.f22391f = a9;
        this.f22398m = str + a9;
        nVar.a(new File(this.f22398m));
        nVar.a(true);
        File file = new File(this.f22398m);
        if (file.exists() && file.isFile()) {
            this.f22400o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i8, x xVar) {
        int i9;
        this.f22397l = xVar;
        if (TextUtils.isEmpty(this.f22389d)) {
            if (this.f22388c.c()) {
                x xVar2 = this.f22397l;
                if (xVar2 != null) {
                    xVar2.a(this.f22386a, this.f22387b, this);
                    this.f22397l.b(this.f22386a, this.f22387b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.f22397l;
            if (xVar3 != null) {
                xVar3.a(this.f22386a, this.f22387b, this);
                this.f22397l.a(this.f22386a, this.f22387b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.f22400o) {
            x xVar4 = this.f22397l;
            if (xVar4 != null) {
                xVar4.a(this.f22386a, this.f22387b, this);
                this.f22397l.b(this.f22386a, this.f22387b, this);
                return;
            }
            return;
        }
        this.f22399n = false;
        int v8 = this.f22386a.v();
        this.f22396k = UUID.randomUUID().toString();
        int videoCtnType = this.f22387b.g().getVideoCtnType();
        if (i8 == 1 || (i9 = this.f22394i) == 100) {
            this.f22393h = false;
            this.f22392g = new DownloadMessage(this.f22386a, this.f22389d, this.f22391f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else if (videoCtnType == 1) {
            this.f22393h = false;
            this.f22392g = new DownloadMessage(this.f22386a, this.f22389d, this.f22391f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.f22393h = true;
            this.f22392g = new DownloadMessage(this.f22386a, this.f22389d, this.f22391f, i9, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22396k, v8, this);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f22392g).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f22390e).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f22395j = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.f22396k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22396k);
        if (this.f22399n) {
            x xVar = this.f22397l;
            if (xVar != null) {
                xVar.b(this.f22386a, this.f22387b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.f22397l;
        if (xVar2 != null) {
            xVar2.a(this.f22386a, this.f22387b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.f22396k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22396k);
        String str = this.f22395j.get("cache", "2");
        n nVar = this.f22388c;
        int i9 = 2;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f22388c.b(true);
        this.f22388c.a(false);
        n nVar2 = this.f22388c;
        if (!TextUtils.equals(this.f22395j.get("cache", "2"), "2")) {
            i9 = 1;
        }
        nVar2.a(i9);
        x xVar = this.f22397l;
        if (xVar != null) {
            xVar.b(this.f22386a, this.f22387b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.f22396k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22396k);
        String str = this.f22395j.get("cache", "2");
        n nVar = this.f22388c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        nVar.a(i8);
        this.f22388c.b(false);
        this.f22388c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.f22397l;
        if (xVar != null) {
            xVar.a(this.f22386a, this.f22387b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.f22396k);
        }
        x xVar = this.f22397l;
        if (xVar != null) {
            xVar.a(this.f22386a, this.f22387b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        int i8;
        if (downloadProgress.getCurrentDownloadRate() >= this.f22394i) {
            String str = this.f22395j.get("cache", "2");
            n nVar = this.f22388c;
            if (TextUtils.equals(str, "2")) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            nVar.a(i8);
            this.f22388c.b(true);
            this.f22388c.a(false);
            if (this.f22393h) {
                this.f22395j.cancel(downloadMessage);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
    public final void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout taskID: " + str);
        }
        if (this.f22395j != null) {
            this.f22399n = true;
            this.f22395j.cancel(this.f22392g);
        }
    }
}
