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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.File;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0414a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f22358a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f22359b;

    /* renamed from: c, reason: collision with root package name */
    private b f22360c;

    /* renamed from: d, reason: collision with root package name */
    private String f22361d;

    /* renamed from: e, reason: collision with root package name */
    private String f22362e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadMessage f22363f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadRequest f22364g;

    /* renamed from: h, reason: collision with root package name */
    private String f22365h;

    /* renamed from: i, reason: collision with root package name */
    private String f22366i;

    /* renamed from: j, reason: collision with root package name */
    private x f22367j;

    /* renamed from: k, reason: collision with root package name */
    private String f22368k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22369l;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.f22369l = false;
        this.f22358a = bVar;
        this.f22359b = aVar;
        this.f22360c = bVar2;
        this.f22361d = bVar2.j();
        String a9 = com.mbridge.msdk.newreward.function.h.a.a(this.f22361d);
        this.f22362e = a9;
        this.f22366i = this.f22368k + a9.replace(".zip", "").replace(".xml", "");
        this.f22360c.a(true);
        File a10 = a(this.f22366i);
        if (a10 != null && a10.exists()) {
            this.f22369l = true;
            this.f22360c.a(1);
            this.f22360c.a(a10);
            this.f22360c.b(true);
            this.f22360c.a(false);
        }
    }

    protected abstract String a();

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public void a(int i8, x xVar) {
        this.f22367j = xVar;
        if (xVar != null) {
            xVar.a(this.f22358a, this.f22359b, this);
        }
        if (this.f22369l) {
            if (xVar != null) {
                xVar.b(this.f22358a, this.f22359b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f22361d)) {
            if (this.f22360c.c()) {
                if (xVar != null) {
                    xVar.b(this.f22358a, this.f22359b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.f22358a, this.f22359b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int v8 = this.f22358a.v();
        this.f22365h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22365h, v8, this);
        this.f22363f = new DownloadMessage(this.f22358a, this.f22361d, this.f22362e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f22363f).withReadTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withConnectTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withWriteTimeout(WorkRequest.MIN_BACKOFF_MILLIS).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f22368k).withDownloadStateListener(this).withProgressStateListener(this).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f22364g = build;
        build.start();
    }

    public com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f22359b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b c() {
        return this.f22358a;
    }

    public a<?> d() {
        return this.f22360c;
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + d().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22365h);
        String str = this.f22364g.get("cache", "2");
        b bVar = this.f22360c;
        if (TextUtils.equals(str, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f22360c.b(false);
        this.f22360c.a(false);
        if (this.f22360c.c()) {
            x xVar = this.f22367j;
            if (xVar != null) {
                xVar.b(this.f22358a, this.f22359b, this);
                return;
            }
            return;
        }
        x xVar2 = this.f22367j;
        if (xVar2 != null) {
            xVar2.a(this.f22358a, this.f22359b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i8;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + d().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22365h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.f22368k);
                String str = this.f22364g.get("cache", "2");
                b bVar2 = this.f22360c;
                if (TextUtils.equals(str, "2")) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bVar2.a(i8);
                this.f22360c.b(true);
                this.f22360c.a(false);
                this.f22360c.a(a(this.f22366i));
                this.f22360c.a(2);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e8.getMessage());
                }
                if (this.f22360c.c()) {
                    xVar2 = this.f22367j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f22367j;
                    if (xVar != null) {
                        bVar = this.f22358a;
                        aVar = this.f22359b;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f22360c.c()) {
                xVar2 = this.f22367j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f22358a, this.f22359b, this);
                return;
            }
            xVar = this.f22367j;
            if (xVar != null) {
                bVar = this.f22358a;
                aVar = this.f22359b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f22360c.c()) {
                x xVar3 = this.f22367j;
                if (xVar3 != null) {
                    xVar3.b(this.f22358a, this.f22359b, this);
                }
            } else {
                x xVar4 = this.f22367j;
                if (xVar4 != null) {
                    xVar4.a(this.f22358a, this.f22359b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i8;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f22365h);
        String str2 = this.f22364g.get("cache", "2");
        b bVar = this.f22360c;
        if (TextUtils.equals(str2, "2")) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        bVar.a(i8);
        this.f22360c.b(false);
        this.f22360c.a(false);
        if (this.f22367j != null) {
            b bVar2 = this.f22360c;
            if (bVar2 != null) {
                int h8 = bVar2.h();
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
                this.f22367j.a(this.f22358a, this.f22359b, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f22367j.a(this.f22358a, this.f22359b, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    private File b(String str) {
        JSONArray jSONArray;
        String a9 = com.mbridge.msdk.newreward.function.h.a.a(new File(str + File.separator + "template_config.json"));
        if (TextUtils.isEmpty(a9)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e8.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("xml_type", "");
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, a())) {
                    File file = new File(str + File.separator + optJSONObject.optString("name", ""));
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
    public void a(String str, long j8) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onTimeout: " + str + " " + d().j());
        }
        DownloadRequest downloadRequest = this.f22364g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f22363f);
        }
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str + ".xml");
        return (file.isFile() && file.exists()) ? file : b(str);
    }
}
