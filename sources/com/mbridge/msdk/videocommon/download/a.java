package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.p;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private int f24287A;

    /* renamed from: B, reason: collision with root package name */
    private File f24288B;

    /* renamed from: D, reason: collision with root package name */
    private int f24290D;

    /* renamed from: E, reason: collision with root package name */
    private int f24291E;

    /* renamed from: F, reason: collision with root package name */
    private int f24292F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f24293G;

    /* renamed from: H, reason: collision with root package name */
    private k f24294H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f24295I;

    /* renamed from: J, reason: collision with root package name */
    private k f24296J;

    /* renamed from: b, reason: collision with root package name */
    private int f24307b;

    /* renamed from: c, reason: collision with root package name */
    private int f24308c;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f24310e;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f24312g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f24313h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f24314i;

    /* renamed from: j, reason: collision with root package name */
    private String f24315j;

    /* renamed from: k, reason: collision with root package name */
    private Context f24316k;

    /* renamed from: l, reason: collision with root package name */
    private long f24317l;

    /* renamed from: m, reason: collision with root package name */
    private String f24318m;

    /* renamed from: n, reason: collision with root package name */
    private String f24319n;

    /* renamed from: o, reason: collision with root package name */
    private long f24320o;

    /* renamed from: p, reason: collision with root package name */
    private String f24321p;

    /* renamed from: r, reason: collision with root package name */
    private long f24323r;

    /* renamed from: u, reason: collision with root package name */
    private p f24326u;

    /* renamed from: w, reason: collision with root package name */
    private String f24328w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f24329x;

    /* renamed from: y, reason: collision with root package name */
    private int f24330y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f24331z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24306a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24309d = false;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f24311f = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private boolean f24322q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f24324s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f24325t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24327v = false;

    /* renamed from: C, reason: collision with root package name */
    private int f24289C = 1;

    /* renamed from: K, reason: collision with root package name */
    private boolean f24297K = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f24298L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f24299M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f24300N = false;

    /* renamed from: O, reason: collision with root package name */
    private boolean f24301O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f24302P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f24303Q = false;

    /* renamed from: R, reason: collision with root package name */
    private OnDownloadStateListener f24304R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f24320o + "    " + a.this.f24317l);
                if (a.this.f24326u == null) {
                    a.this.f24326u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.f24326u.a(a.this.f24318m, a.this.f24320o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        ad.b("CampaignDownLoadTask", th.getMessage());
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f24320o, true, str);
                    a.this.f24326u.a(a.this.f24318m, a.this.f24320o, 5);
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f24320o, true, "");
                    a.a(a.this, 1, true);
                }
                str = "";
                a aVar3 = a.this;
                aVar3.a(aVar3.f24320o, true, str);
                a.this.f24326u.a(a.this.f24318m, a.this.f24320o, 5);
                a aVar22 = a.this;
                aVar22.a(aVar22.f24320o, true, "");
                a.a(a.this, 1, true);
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            String str;
            if (a.this.f24329x != null && a.this.f24329x.getStatus() != DownloadStatus.CANCELLED) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f24329x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f24314i, dVar);
                if (downloadError != null && downloadError.getException() != null) {
                    str = downloadError.getException().getMessage();
                } else {
                    str = "Video Download Error";
                }
                a.this.v();
                a.this.a(3, str, "");
                a.this.a(str);
                a aVar2 = a.this;
                a.a(aVar2, 3, aVar2.f24331z);
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f24310e = 1;
            if (a.this.f24326u == null) {
                a.this.f24326u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.f24326u.a(a.this.f24314i, a.this.f24317l, a.this.f24321p, a.this.f24310e);
        }
    };

    /* renamed from: S, reason: collision with root package name */
    private OnProgressStateListener f24305S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f24329x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f24314i, dVar);
                a.this.f24320o = downloadProgress.getCurrent();
                a.this.f24317l = downloadProgress.getTotal();
                a.this.f24330y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f24324s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f24324s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f24324s + " " + a.this.f24308c);
                    if (!a.this.f24309d) {
                        a.this.f24309d = true;
                        if (!a.this.f24331z) {
                            a.a(a.this, 1, true);
                            a.this.a(downloadProgress.getCurrent(), false, "");
                        }
                        if (a.this.f24329x != null && a.this.f24289C == 2 && !a.this.f24331z) {
                            a.this.f24329x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i8) {
        File file;
        File file2;
        this.f24307b = 1;
        this.f24310e = 0;
        this.f24320o = 0L;
        int i9 = 100;
        this.f24293G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g a9 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a9 != null) {
            this.f24293G = a9.aF();
        }
        this.f24290D = com.mbridge.msdk.foundation.same.a.f20672u;
        this.f24291E = com.mbridge.msdk.foundation.same.a.f20673v;
        this.f24292F = com.mbridge.msdk.foundation.same.a.f20671t;
        this.f24323r = System.currentTimeMillis();
        this.f24316k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f24314i = campaignEx;
        this.f24315j = str;
        this.f24307b = i8;
        if (campaignEx != null) {
            this.f24318m = campaignEx.getVideoUrlEncode();
        }
        this.f24328w = ab.c(this.f24318m);
        this.f24319n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f24321p = this.f24319n + this.f24328w;
        ad.c("CampaignDownLoadTask", this.f24314i.getAppName() + " videoLocalPath:" + this.f24321p + " videoUrl: " + this.f24314i.getVideoUrlEncode() + " " + this.f24324s);
        try {
            if (!TextUtils.isEmpty(this.f24318m)) {
                if (!TextUtils.isEmpty(this.f24319n)) {
                    file = new File(this.f24319n);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                if (file != null && file.exists() && ((file2 = this.f24288B) == null || !file2.exists())) {
                    File file3 = new File(file + "/.nomedia");
                    this.f24288B = file3;
                    if (!file3.exists()) {
                        this.f24288B.createNewFile();
                    }
                }
                p a10 = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                m a11 = a10.a(this.f24318m, "");
                if (a11 != null) {
                    this.f24320o = a11.c();
                    if (this.f24310e != 2) {
                        this.f24310e = a11.b();
                    }
                    if (this.f24310e == 1) {
                        this.f24310e = 2;
                    }
                    this.f24317l = a11.d();
                    if (a11.a() > 0) {
                        this.f24323r = a11.a();
                    }
                    if (this.f24310e == 5) {
                        if (Objects.exists(new File(this.f24319n + this.f24328w), this.f24319n, this.f24328w)) {
                            this.f24321p = this.f24319n + this.f24328w;
                        } else {
                            u();
                        }
                    } else if (this.f24310e != 0) {
                        this.f24321p = this.f24319n + this.f24328w;
                    }
                } else {
                    a10.a(this.f24318m, this.f24323r);
                }
                try {
                    long j8 = this.f24317l;
                    if (j8 > 0) {
                        if (this.f24320o * 100 >= j8 * b(this.f24314i)) {
                            if (b(this.f24314i) != 100) {
                                if (this.f24310e == 5) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            a(this.f24314i, dVar);
                        }
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                    }
                }
                String str2 = this.f24318m;
                if (TextUtils.isEmpty(str2)) {
                    this.f24313h.a("VideoUrl is NULL, Please check it.", "");
                    return;
                }
                if (this.f24310e == 1) {
                    ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    return;
                }
                if (this.f24310e == 5 && Utils.getDownloadRate(this.f24317l, this.f24320o) >= this.f24324s) {
                    ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                    com.mbridge.msdk.videocommon.listener.a aVar = this.f24312g;
                    if (aVar != null) {
                        aVar.a(this.f24318m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24313h;
                    if (aVar2 != null) {
                        aVar2.a(this.f24318m);
                    }
                    try {
                        File file4 = new File(this.f24321p);
                        if (Objects.exists(file4, this.f24319n, this.f24328w) && file4.isFile()) {
                            file4.setLastModified(System.currentTimeMillis());
                        }
                    } catch (Exception e9) {
                        ad.b("CampaignDownLoadTask", e9.getMessage());
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a("cache", 1);
                    a(this.f24314i, dVar2);
                    return;
                }
                if (this.f24307b == 3) {
                    ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                    a(0L, false, "");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a("cache", 1);
                    a(this.f24314i, dVar3);
                    return;
                }
                try {
                    i9 = b(this.f24314i);
                } catch (Exception unused) {
                }
                c(i9);
                if (i9 == 0) {
                    com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24312g;
                    if (aVar3 != null) {
                        aVar3.a(this.f24318m);
                    }
                    com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24313h;
                    if (aVar4 != null) {
                        aVar4.a(this.f24318m);
                    }
                }
                DownloadMessage downloadMessage = new DownloadMessage(this.f24314i, str2, this.f24328w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(e(this.f24314i));
                downloadMessage.addExtra("resource_type", 4);
                this.f24329x = a(downloadMessage, this.f24304R, this.f24305S, "1");
            }
        } catch (Exception e10) {
            ad.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void u() {
        if (this.f24326u == null) {
            this.f24326u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.f24326u.b(this.f24318m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f24321p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } finally {
                this.f24310e = 0;
            }
        } catch (Throwable unused) {
            ad.b("CampaignDownLoadTask", "del DB or file failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            String str = com.mbridge.msdk.reward.b.a.f22786b;
            com.mbridge.msdk.reward.b.a.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(com.mbridge.msdk.reward.b.a.class.newInstance(), this.f24315j, this.f24314i);
            Class<?> cls = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            cls.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(cls.newInstance(), this.f24315j, this.f24314i);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f24318m)) {
                return;
            }
            if (this.f24318m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f24318m).getPath());
            }
            if (this.f24324s == 0 && this.f24289C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f24329x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f24312g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24313h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void p() {
        if (this.f24303Q) {
            return;
        }
        try {
            this.f24331z = true;
            if (this.f24289C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f24289C);
                return;
            }
            if (this.f24307b == 3) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f24307b);
                return;
            }
            ad.b("CampaignDownLoadTask", "resume()");
            this.f24301O = false;
            this.f24302P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f24318m, this.f24328w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.f24314i));
            DownloadRequest<?> a9 = a(downloadMessage, this.f24304R, this.f24305S, "2");
            this.f24329x = a9;
            a9.start();
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    public final String q() {
        String str = "";
        if (this.f24307b == 3) {
            return "";
        }
        String str2 = this.f24319n + this.f24328w;
        File file = new File(str2);
        try {
            if (Objects.exists(file, this.f24319n, this.f24328w)) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.length() > 0) {
                            this.f24321p = str2;
                        } else {
                            str = "file length is 0 ";
                        }
                    } else {
                        str = "file can not read ";
                    }
                } else {
                    str = "file is not file ";
                }
            } else {
                str = "file is not exist ";
            }
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f24310e == 5 && !TextUtils.isEmpty(str)) {
            u();
        }
        return str;
    }

    public final void r() {
        if (this.f24311f != null) {
            this.f24311f = null;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.f24314i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                return;
            }
            com.mbridge.msdk.videocommon.a.a a9 = com.mbridge.msdk.videocommon.a.a.a();
            if (a9 != null) {
                a9.a(this.f24314i);
            }
        } finally {
            this.f24310e = 0;
        }
    }

    public final String t() {
        if (this.f24303Q) {
            try {
                File file = new File(this.f24321p);
                if (file.exists() && file.isFile()) {
                    return this.f24321p;
                }
                return this.f24318m;
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", e8.getMessage());
                return this.f24318m;
            }
        }
        try {
            File file2 = new File(this.f24321p);
            if (Objects.exists(file2, this.f24319n, this.f24328w) && file2.isFile()) {
                return this.f24321p;
            }
        } catch (Exception e9) {
            ad.b("CampaignDownLoadTask", e9.getMessage());
        }
        return this.f24318m;
    }

    public final void c(boolean z8) {
        this.f24299M = z8;
    }

    public final void d(boolean z8) {
        this.f24300N = z8;
    }

    public final String e() {
        return this.f24318m;
    }

    public final boolean f() {
        return this.f24327v;
    }

    public final long g() {
        return this.f24323r;
    }

    public final String h() {
        return this.f24321p;
    }

    public final boolean i() {
        return this.f24303Q;
    }

    public final long j() {
        return this.f24317l;
    }

    public final int k() {
        return this.f24310e;
    }

    public final CampaignEx l() {
        return this.f24314i;
    }

    public final long m() {
        return this.f24320o;
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f24318m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f24312g;
                if (aVar != null) {
                    aVar.a(this.f24318m);
                    return;
                }
                return;
            }
            if (this.f24318m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f24318m).getPath());
            }
            if (this.f24307b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24312g;
                if (aVar2 != null) {
                    aVar2.a(this.f24318m);
                    return;
                }
                return;
            }
            if (this.f24324s == 0 && this.f24289C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24312g;
                if (aVar3 != null) {
                    aVar3.a(this.f24318m);
                    return;
                }
                return;
            }
            try {
                if (this.f24310e == 5 && Utils.getDownloadRate(this.f24317l, this.f24320o) >= this.f24324s) {
                    if (Objects.exists(new File(this.f24319n + this.f24328w), this.f24319n, this.f24328w)) {
                        this.f24321p = this.f24319n + this.f24328w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24312g;
                        if (aVar4 != null) {
                            aVar4.a(this.f24318m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e8) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: " + e8.getMessage());
            }
            DownloadRequest downloadRequest = this.f24329x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f24312g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final boolean c() {
        return this.f24299M;
    }

    public final boolean d() {
        return this.f24300N;
    }

    public final void e(boolean z8) {
        this.f24327v = z8;
    }

    public final void f(boolean z8) {
        this.f24322q = z8;
    }

    public final void b(boolean z8) {
        this.f24298L = z8;
    }

    public final void c(int i8) {
        ad.a("CampaignDownLoadTask", "set ready rate: " + i8);
        this.f24324s = i8;
    }

    public final void d(int i8) {
        this.f24287A = i8;
    }

    public final void e(int i8) {
        this.f24289C = i8;
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f24296J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e8.getMessage());
            return 100;
        }
    }

    private int e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    public final boolean b() {
        return this.f24298L;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f24294H == null) {
                    this.f24294H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24315j);
                }
                return this.f24294H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.f24296J == null) {
                    this.f24296J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24315j);
                }
                return d((CampaignEx) null);
            }
            if (this.f24295I == null) {
                this.f24295I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f24315j, false);
            }
            return this.f24295I.r();
        } catch (Throwable th) {
            ad.a("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    public final void b(int i8) {
        this.f24308c = i8;
    }

    private int b(CampaignEx campaignEx) {
        int c8;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            c8 = campaignEx.getReady_rate();
            ad.a("CampaignDownLoadTask", "ready_rate(campaign): " + c8);
        } else {
            c8 = c(campaignEx);
            ad.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + c8);
        }
        try {
            return Math.max(c8, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void a(boolean z8) {
        this.f24297K = z8;
    }

    public final boolean a() {
        return this.f24297K;
    }

    public final void d(String str) {
        this.f24318m = str;
    }

    public final void a(int i8) {
        this.f24307b = i8;
    }

    public final void a(int i8, int i9) {
        this.f24310e = i8;
        if (this.f24326u == null) {
            this.f24326u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.f24326u.a(this.f24318m, i9, i8);
    }

    public final void b(String str) {
        v();
        a(2, str, "");
        this.f24310e = 4;
    }

    public final void a(CampaignEx campaignEx) {
        this.f24314i = campaignEx;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.f24290D).withConnectTimeout(this.f24292F).withWriteTimeout(this.f24291E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f24319n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).with("do_us_fi_re", Boolean.toString(this.f24293G)).with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f24324s)).with("scenes", str).build();
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f24313h = aVar;
    }

    public final void a(long j8, boolean z8, String str) {
        p pVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f24320o + "  progressSize " + j8 + "  " + this.f24330y + "%   FileSize : " + this.f24317l + "  " + this.f24314i.getAppName());
        if (this.f24324s == 100 && this.f24307b != 3 && j8 != this.f24317l && !z8) {
            File file = new File(this.f24321p);
            ad.b("CampaignDownLoadTask", "progressSize = " + j8 + " fileSize = " + this.f24317l + " " + z8 + " absFileSize = " + (Objects.exists(file, this.f24319n, this.f24328w) ? file.length() : 0L));
            a("File size is not match witch download size.");
            return;
        }
        this.f24310e = 5;
        if (j8 == this.f24317l) {
            a(1, "", str);
        }
        long j9 = this.f24317l;
        if (j9 != 0 && (pVar = this.f24326u) != null) {
            pVar.b(this.f24318m, j9);
        }
        this.f24306a = false;
        a(j8, this.f24310e);
    }

    public final void c(String str) {
        this.f24321p = str;
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f24312g;
        if (aVar != null) {
            aVar.a(str, this.f24318m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24313h;
        if (aVar2 != null) {
            aVar2.a(str, this.f24318m);
        }
        ad.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f24310e == 4 || this.f24310e == 2 || this.f24310e == 5) {
            return;
        }
        this.f24310e = 4;
        CampaignEx campaignEx = this.f24314i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f24314i.getRsIgnoreCheckRule().size() > 0 && this.f24314i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f24320o, this.f24310e);
        }
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f24311f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f24312g = aVar;
    }

    private void a(long j8, int i8) {
        this.f24320o = j8;
        int i9 = this.f24324s;
        if (100 * j8 >= i9 * this.f24317l && !this.f24325t && i8 != 4) {
            if (i9 == 100 && i8 != 5) {
                this.f24310e = 5;
                return;
            }
            this.f24325t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i8 + " progress : " + j8);
            String q8 = q();
            if (TextUtils.isEmpty(q8)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f24312g;
                if (aVar != null) {
                    aVar.a(this.f24318m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f24313h;
                if (aVar2 != null) {
                    aVar2.a(this.f24318m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f24312g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + q8, this.f24318m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f24313h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + q8, this.f24318m);
                }
            }
        }
        if (!this.f24306a && j8 > 0) {
            this.f24306a = true;
            if (this.f24326u == null) {
                this.f24326u = p.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.f24326u.a(this.f24318m, j8, this.f24310e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f24311f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j8, i8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str, String str2) {
        n nVar = new n(this.f24316k, this.f24314i, i8, Long.toString(this.f24323r != 0 ? System.currentTimeMillis() - this.f24323r : 0L), this.f24317l, this.f24287A);
        nVar.e(this.f24314i.getId());
        nVar.m(this.f24314i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.f24314i.getRequestId());
        nVar.s(this.f24314i.getCurrentLocalRid());
        nVar.g(this.f24314i.getRequestIdNotice());
        nVar.c(this.f24315j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f24324s));
        nVar.a("url", this.f24314i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f24329x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.f24329x.get("resumed_breakpoint", ""));
        }
        int i9 = this.f24287A;
        if (i9 == 94 || i9 == 287) {
            return;
        }
        q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.f24301O || campaignEx == null || dVar == null) {
            return;
        }
        this.f24301O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f24329x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.f24329x.get("resumed_breakpoint", "2"));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f24324s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e8) {
            ad.b("CampaignDownLoadTask", e8.getMessage());
        }
    }

    static /* synthetic */ void a(a aVar, int i8, boolean z8) {
        if (aVar.f24302P) {
            return;
        }
        try {
            aVar.f24302P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.f24329x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.f24318m);
                dVar.a("resumed_breakpoint", aVar.f24329x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.f24317l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.f24324s));
            dVar.a("result", Integer.valueOf(i8));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.f24314i, dVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
