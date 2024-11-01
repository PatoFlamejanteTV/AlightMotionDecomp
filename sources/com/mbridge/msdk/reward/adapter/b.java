package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.compose.runtime.ComposerKt;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.q;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.videocommon.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b */
    private static ConcurrentHashMap<String, a> f22512b;

    /* renamed from: a */
    private final h f22513a;

    /* renamed from: c */
    private boolean f22514c;

    /* renamed from: d */
    private final String f22515d;

    /* renamed from: e */
    private final String f22516e;

    /* renamed from: f */
    private final String f22517f;

    /* renamed from: g */
    private volatile List<WindVaneWebView> f22518g;

    /* renamed from: com.mbridge.msdk.reward.adapter.b$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CopyOnWriteArrayList f22519a;

        /* renamed from: b */
        final /* synthetic */ Context f22520b;

        /* renamed from: c */
        final /* synthetic */ String f22521c;

        /* renamed from: d */
        final /* synthetic */ int f22522d;

        /* renamed from: e */
        final /* synthetic */ String f22523e;

        /* renamed from: f */
        final /* synthetic */ String f22524f;

        /* renamed from: g */
        final /* synthetic */ i f22525g;

        AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i8, String str2, String str3, i iVar) {
            r2 = copyOnWriteArrayList;
            r3 = context;
            r4 = str;
            r5 = i8;
            r6 = str2;
            r7 = str3;
            r8 = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0377  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 981
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$3 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a */
        final /* synthetic */ String f22530a;

        /* renamed from: b */
        final /* synthetic */ String f22531b;

        /* renamed from: c */
        final /* synthetic */ String f22532c;

        /* renamed from: d */
        final /* synthetic */ i f22533d;

        /* renamed from: e */
        final /* synthetic */ Context f22534e;

        /* renamed from: f */
        final /* synthetic */ CampaignEx f22535f;

        AnonymousClass3(String str, String str2, String str3, i iVar, Context context, CampaignEx campaignEx) {
            r2 = str;
            r3 = str2;
            r4 = str3;
            r5 = iVar;
            r6 = context;
            r7 = campaignEx;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onFailed(java.lang.String r21, java.lang.String r22) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            try {
                ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle.putString("request_id", r4);
                bundle.putString("url", str);
                obtain.setData(bundle);
                b.this.f22513a.sendMessage(obtain);
                i iVar = r5;
                if (iVar != null) {
                    iVar.a(r3, r2, r4, str);
                }
                if (!z8) {
                    b.a(b.this, r6, 1, r7, str, "", r2, str2);
                }
            } catch (Exception e8) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message obtain2 = Message.obtain();
                obtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle2.putString("request_id", r4);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                b.this.f22513a.sendMessage(obtain2);
                if (r5 != null) {
                    try {
                        r5.a(str, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e8, null));
                    } catch (Exception e9) {
                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                    }
                }
                b.a(b.this, r6, 3, r7, str, e8.getLocalizedMessage(), r2, str2);
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$4 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CampaignEx f22537a;

        /* renamed from: b */
        final /* synthetic */ Context f22538b;

        /* renamed from: c */
        final /* synthetic */ int f22539c;

        /* renamed from: d */
        final /* synthetic */ String f22540d;

        /* renamed from: e */
        final /* synthetic */ String f22541e;

        /* renamed from: f */
        final /* synthetic */ String f22542f;

        /* renamed from: g */
        final /* synthetic */ String f22543g;

        AnonymousClass4(CampaignEx campaignEx, Context context, int i8, String str, String str2, String str3, String str4) {
            r2 = campaignEx;
            r3 = context;
            r4 = i8;
            r5 = str;
            r6 = str2;
            r7 = str3;
            r8 = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (r2 != null && r3 != null) {
                try {
                    n nVar = new n();
                    nVar.a("m_download_end");
                    Context context = r3;
                    if (context != null) {
                        nVar.a(z.l(context.getApplicationContext()));
                    }
                    nVar.b(r4);
                    CampaignEx campaignEx = r2;
                    if (campaignEx != null) {
                        nVar.e(campaignEx.getId());
                        nVar.f(r2.getRequestId());
                        nVar.s(r2.getCurrentLocalRid());
                        nVar.g(r2.getRequestIdNotice());
                    }
                    nVar.q(r5);
                    nVar.h(r6);
                    nVar.c(r7);
                    if (!TextUtils.isEmpty(r8)) {
                        nVar.t(r8);
                    }
                    nVar.e(1);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar.a(), r2);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$5 */
    /* loaded from: classes4.dex */
    final class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f22545a;

        /* renamed from: b */
        final /* synthetic */ WindVaneWebView f22546b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f22547c;

        /* renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f22548d;

        /* renamed from: e */
        final /* synthetic */ String f22549e;

        /* renamed from: f */
        final /* synthetic */ com.mbridge.msdk.videocommon.d.c f22550f;

        /* renamed from: g */
        final /* synthetic */ String f22551g;

        AnonymousClass5(boolean z8, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.d.c cVar, String str2) {
            r2 = z8;
            r3 = windVaneWebView;
            r4 = campaignEx;
            r5 = copyOnWriteArrayList;
            r6 = str;
            r7 = cVar;
            r8 = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.video.signal.a.k kVar;
            boolean z8 = r2;
            WindVaneWebView windVaneWebView = r3;
            String e8 = r4.getRewardTemplateMode().e();
            CampaignEx campaignEx = r4;
            CopyOnWriteArrayList copyOnWriteArrayList = r5;
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(r4.getRewardTemplateMode().e());
            String str = r6;
            com.mbridge.msdk.videocommon.d.c cVar = r7;
            String str2 = r8;
            boolean z9 = b.this.f22514c;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000154", campaignEx, dVar);
                a.C0440a c0440a = new a.C0440a();
                WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                if (campaignEx != null) {
                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                c0440a.a(windVaneWebView2);
                String str3 = "";
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> a9 = com.mbridge.msdk.videocommon.download.b.getInstance().a(str);
                    if (a9 != null && a9.size() > 0) {
                        for (int i8 = 0; i8 < copyOnWriteArrayList.size(); i8++) {
                            CampaignEx campaignEx2 = (CampaignEx) copyOnWriteArrayList.get(i8);
                            for (CampaignEx campaignEx3 : a9) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = a9;
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i8, campaignEx2);
                                }
                                a9 = copyOnWriteArrayList2;
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx, copyOnWriteArrayList);
                    str3 = ((CampaignEx) copyOnWriteArrayList.get(0)).getRequestId();
                } else {
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx);
                    if (campaignEx != null) {
                        str3 = campaignEx.getRequestId();
                    }
                }
                String str4 = str3;
                kVar.a(0);
                kVar.a(str);
                kVar.c(str2);
                kVar.a(cVar);
                kVar.d(z8);
                windVaneWebView2.setWebViewListener(new l(str2, false, windVaneWebView, e8, str, c0440a, campaignEx, z9, str4));
                windVaneWebView2.setObject(kVar);
                windVaneWebView2.loadUrl(h5ResAddress);
                windVaneWebView2.setRid(str4);
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        boolean f22553a;

        /* renamed from: b */
        boolean f22554b;

        /* renamed from: c */
        int f22555c;

        /* renamed from: d */
        int f22556d;

        /* renamed from: e */
        String f22557e;

        /* renamed from: f */
        String f22558f;

        /* renamed from: g */
        int f22559g;

        /* renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f22560h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f22561i;

        public a(boolean z8, boolean z9, int i8, int i9, String str, String str2, int i10, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22553a = z8;
            this.f22554b = z9;
            this.f22555c = i8;
            this.f22556d = i9;
            this.f22557e = str;
            this.f22558f = str2;
            this.f22559g = i10;
            this.f22560h = copyOnWriteArrayList;
            this.f22561i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar);
    }

    /* loaded from: classes4.dex */
    public static final class d implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: b */
        private int f22583b;

        /* renamed from: c */
        private final String f22584c;

        /* renamed from: d */
        private final String f22585d;

        /* renamed from: e */
        private final String f22586e;

        /* renamed from: f */
        private CampaignEx f22587f;

        /* renamed from: g */
        private i f22588g;

        /* renamed from: h */
        private Handler f22589h;

        /* renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f22590i;

        /* renamed from: a */
        private boolean f22582a = false;

        /* renamed from: j */
        private final long f22591j = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$d$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22592a;

            /* renamed from: b */
            final /* synthetic */ long f22593b;

            /* renamed from: c */
            final /* synthetic */ String f22594c;

            /* renamed from: d */
            final /* synthetic */ String f22595d;

            /* renamed from: e */
            final /* synthetic */ String f22596e;

            AnonymousClass1(int i8, long j8, String str, String str2, String str3) {
                r2 = i8;
                r3 = j8;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f22587f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f22587f.getId(), d.this.f22585d, r6, "2");
                    nVar.f(d.this.f22587f.getRequestId());
                    nVar.s(d.this.f22587f.getCurrentLocalRid());
                    nVar.g(d.this.f22587f.getRequestIdNotice());
                    nVar.e(d.this.f22587f.getId());
                    nVar.c(d.this.f22587f.getAdSpaceT());
                    nVar.a("scenes", "1");
                    nVar.a("url", r5);
                    if (d.this.f22587f.getAdType() == 287) {
                        nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (d.this.f22587f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    if (!TextUtils.isEmpty(r7)) {
                        nVar.t(r7);
                    }
                    b.a(nVar, d.this.f22587f);
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, d.this.f22585d, d.this.f22587f);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }

        public d(int i8, String str, String str2, String str3, CampaignEx campaignEx, i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22583b = i8;
            this.f22584c = str;
            this.f22585d = str2;
            this.f22586e = str3;
            this.f22587f = campaignEx;
            this.f22588g = iVar;
            this.f22589h = handler;
            this.f22590i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i8 = this.f22583b;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 205;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
                        bundle.putString("request_id", this.f22586e);
                        bundle.putString("message", str2);
                        obtain.setData(bundle);
                        this.f22589h.sendMessage(obtain);
                        if (this.f22588g != null) {
                            try {
                                this.f22588g.a(str, this.f22586e, b.b(880006, new MBridgeIds(this.f22584c, this.f22585d, this.f22586e), str2, null, null));
                                return;
                            } catch (Exception e8) {
                                ad.b("RewardCampaignsResourceManager", e8.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = ComposerKt.providerKey;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
                bundle2.putString("request_id", this.f22586e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f22589h.sendMessage(obtain2);
                if (this.f22582a) {
                    a(3, System.currentTimeMillis() - this.f22591j, str, "url download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = ComposerKt.providerKey;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
            bundle3.putString("request_id", this.f22586e);
            bundle3.putString("url", str);
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.f22589h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i8 = this.f22583b;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 105;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
                        bundle.putString("request_id", this.f22586e);
                        obtain.setData(bundle);
                        this.f22589h.sendMessage(obtain);
                        i iVar = this.f22588g;
                        if (iVar != null) {
                            iVar.a(this.f22584c, this.f22585d, this.f22586e, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
                bundle2.putString("request_id", this.f22586e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22589h.sendMessage(obtain2);
                if (this.f22582a) {
                    a(1, System.currentTimeMillis() - this.f22591j, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22585d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22584c);
            bundle3.putString("request_id", this.f22586e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f22589h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f22582a = z8;
        }

        private void a(int i8, long j8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.d.1

                /* renamed from: a */
                final /* synthetic */ int f22592a;

                /* renamed from: b */
                final /* synthetic */ long f22593b;

                /* renamed from: c */
                final /* synthetic */ String f22594c;

                /* renamed from: d */
                final /* synthetic */ String f22595d;

                /* renamed from: e */
                final /* synthetic */ String f22596e;

                AnonymousClass1(int i82, long j82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = j82;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f22587f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f22587f.getId(), d.this.f22585d, r6, "2");
                        nVar.f(d.this.f22587f.getRequestId());
                        nVar.s(d.this.f22587f.getCurrentLocalRid());
                        nVar.g(d.this.f22587f.getRequestIdNotice());
                        nVar.e(d.this.f22587f.getId());
                        nVar.c(d.this.f22587f.getAdSpaceT());
                        nVar.a("scenes", "1");
                        nVar.a("url", r5);
                        if (d.this.f22587f.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (d.this.f22587f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        if (!TextUtils.isEmpty(r7)) {
                            nVar.t(r7);
                        }
                        b.a(nVar, d.this.f22587f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, d.this.f22585d, d.this.f22587f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class e implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a */
        private Handler f22598a;

        /* renamed from: b */
        private int f22599b;

        /* renamed from: c */
        private String f22600c;

        /* renamed from: d */
        private String f22601d;

        /* renamed from: e */
        private String f22602e;

        /* renamed from: f */
        private CampaignEx f22603f;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$e$1 */
        /* loaded from: classes4.dex */
        final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f22604a;

            AnonymousClass1(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f22603f != null) {
                    try {
                        q a9 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        ad.a("RewardCampaignsResourceManager", "campaign is null");
                        n nVar = new n();
                        nVar.a("2000044");
                        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                        nVar.e(e.this.f22603f.getId());
                        nVar.p(e.this.f22603f.getImageUrl());
                        nVar.f(e.this.f22603f.getRequestId());
                        nVar.s(e.this.f22603f.getCurrentLocalRid());
                        nVar.g(e.this.f22603f.getRequestIdNotice());
                        nVar.c(e.this.f22600c);
                        nVar.h(r2);
                        nVar.a("scenes", "1");
                        a9.a(nVar);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public e(Handler handler, int i8, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f22598a = handler;
            this.f22599b = i8;
            this.f22601d = str;
            this.f22600c = str2;
            this.f22602e = str3;
            this.f22603f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            int i8;
            Message obtain = Message.obtain();
            if (this.f22599b == 0) {
                i8 = ComposerKt.compositionLocalMapKey;
            } else {
                i8 = ComposerKt.providerMapsKey;
            }
            obtain.what = i8;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22600c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22601d);
            bundle.putString("request_id", this.f22602e);
            obtain.setData(bundle);
            this.f22598a.sendMessage(obtain);
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.e.1

                /* renamed from: a */
                final /* synthetic */ String f22604a;

                AnonymousClass1(String str3) {
                    r2 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f22603f != null) {
                        try {
                            q a9 = q.a(com.mbridge.msdk.foundation.db.h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            ad.a("RewardCampaignsResourceManager", "campaign is null");
                            n nVar = new n();
                            nVar.a("2000044");
                            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                            nVar.e(e.this.f22603f.getId());
                            nVar.p(e.this.f22603f.getImageUrl());
                            nVar.f(e.this.f22603f.getRequestId());
                            nVar.s(e.this.f22603f.getCurrentLocalRid());
                            nVar.g(e.this.f22603f.getRequestIdNotice());
                            nVar.c(e.this.f22600c);
                            nVar.h(r2);
                            nVar.a("scenes", "1");
                            a9.a(nVar);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass1);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            int i8;
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            if (this.f22599b == 0) {
                i8 = 102;
            } else {
                i8 = 104;
            }
            obtain.what = i8;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22600c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22601d);
            bundle.putString("request_id", this.f22602e);
            obtain.setData(bundle);
            this.f22598a.sendMessage(obtain);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: b */
        private Context f22611b;

        /* renamed from: c */
        private String f22612c;

        /* renamed from: d */
        private String f22613d;

        /* renamed from: e */
        private String f22614e;

        /* renamed from: f */
        private CampaignEx f22615f;

        /* renamed from: g */
        private int f22616g;

        /* renamed from: h */
        private Handler f22617h;

        /* renamed from: i */
        private i f22618i;

        /* renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f22619j;

        /* renamed from: a */
        private boolean f22610a = false;

        /* renamed from: k */
        private long f22620k = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22621a;

            /* renamed from: b */
            final /* synthetic */ String f22622b;

            /* renamed from: c */
            final /* synthetic */ String f22623c;

            /* renamed from: d */
            final /* synthetic */ String f22624d;

            AnonymousClass1(int i8, String str, String str2, String str3) {
                r2 = i8;
                r3 = str;
                r4 = str2;
                r5 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f22615f != null && g.this.f22611b != null) {
                    try {
                        n nVar = new n();
                        nVar.a("m_download_end");
                        if (g.this.f22611b != null) {
                            nVar.a(z.l(g.this.f22611b.getApplicationContext()));
                        }
                        nVar.b(r2);
                        if (g.this.f22615f != null) {
                            nVar.e(g.this.f22615f.getId());
                            nVar.f(g.this.f22615f.getRequestId());
                            nVar.s(g.this.f22615f.getCurrentLocalRid());
                            nVar.g(g.this.f22615f.getRequestIdNotice());
                        }
                        nVar.q(r3);
                        nVar.h(r4);
                        nVar.c(g.this.f22612c);
                        if (!TextUtils.isEmpty(r5)) {
                            nVar.t(r5);
                        }
                        nVar.e(2);
                        nVar.a("scenes", "1");
                        nVar.a("url", r3);
                        b.a(nVar, g.this.f22615f);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f22615f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$2 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22626a;

            /* renamed from: b */
            final /* synthetic */ long f22627b;

            /* renamed from: c */
            final /* synthetic */ String f22628c;

            /* renamed from: d */
            final /* synthetic */ String f22629d;

            /* renamed from: e */
            final /* synthetic */ String f22630e;

            AnonymousClass2(int i8, long j8, String str, String str2, String str3) {
                r2 = i8;
                r3 = j8;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f22615f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f22615f.getId(), g.this.f22612c, r6, "1");
                    nVar.f(g.this.f22615f.getRequestId());
                    nVar.s(g.this.f22615f.getCurrentLocalRid());
                    nVar.g(g.this.f22615f.getRequestIdNotice());
                    nVar.e(g.this.f22615f.getId());
                    nVar.c(g.this.f22615f.getAdSpaceT());
                    nVar.t(r7);
                    nVar.a("scenes", "1");
                    if (g.this.f22615f.getAdType() == 287) {
                        nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (g.this.f22615f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    nVar.a("url", r5);
                    nVar.e(3);
                    b.a(nVar, g.this.f22615f);
                    com.mbridge.msdk.foundation.same.report.h.a(nVar, g.this.f22612c, g.this.f22615f);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    }
                }
            }
        }

        public g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i8, Handler handler, i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22611b = context;
            this.f22613d = str;
            this.f22612c = str2;
            this.f22614e = str3;
            this.f22615f = campaignEx;
            this.f22616g = i8;
            this.f22617h = handler;
            this.f22618i = iVar;
            this.f22619j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f22620k;
            int i8 = this.f22616g;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = ComposerKt.providerValuesKey;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
                        bundle.putString("request_id", this.f22614e);
                        bundle.putString("url", str2);
                        bundle.putString("message", str);
                        obtain.setData(bundle);
                        this.f22617h.sendMessage(obtain);
                        if (this.f22618i != null) {
                            try {
                                this.f22618i.a(str2, this.f22614e, b.b(880006, new MBridgeIds(this.f22613d, this.f22612c, this.f22614e), "", null, null));
                            } catch (Exception e8) {
                                ad.b("RewardCampaignsResourceManager", e8.getMessage());
                            }
                        }
                        a(3, str2, str, "");
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = ComposerKt.providerKey;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
                bundle2.putString("request_id", this.f22614e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f22617h.sendMessage(obtain2);
                if (this.f22610a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
            bundle3.putString("request_id", this.f22614e);
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.f22617h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f22620k;
            int i8 = this.f22616g;
            if (i8 != 313) {
                if (i8 != 497) {
                    if (i8 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 103;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
                        bundle.putString("request_id", this.f22614e);
                        obtain.setData(bundle);
                        this.f22617h.sendMessage(obtain);
                        i iVar = this.f22618i;
                        if (iVar != null) {
                            iVar.a(this.f22613d, this.f22612c, this.f22614e, str);
                        }
                        if (!z8) {
                            a(1, str, "", str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
                bundle2.putString("request_id", this.f22614e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f22617h.sendMessage(obtain2);
                if (this.f22610a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22612c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f22613d);
            bundle3.putString("request_id", this.f22614e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f22617h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f22610a = z8;
        }

        private void a(int i8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.1

                /* renamed from: a */
                final /* synthetic */ int f22621a;

                /* renamed from: b */
                final /* synthetic */ String f22622b;

                /* renamed from: c */
                final /* synthetic */ String f22623c;

                /* renamed from: d */
                final /* synthetic */ String f22624d;

                AnonymousClass1(int i82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = str4;
                    r4 = str22;
                    r5 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f22615f != null && g.this.f22611b != null) {
                        try {
                            n nVar = new n();
                            nVar.a("m_download_end");
                            if (g.this.f22611b != null) {
                                nVar.a(z.l(g.this.f22611b.getApplicationContext()));
                            }
                            nVar.b(r2);
                            if (g.this.f22615f != null) {
                                nVar.e(g.this.f22615f.getId());
                                nVar.f(g.this.f22615f.getRequestId());
                                nVar.s(g.this.f22615f.getCurrentLocalRid());
                                nVar.g(g.this.f22615f.getRequestIdNotice());
                            }
                            nVar.q(r3);
                            nVar.h(r4);
                            nVar.c(g.this.f22612c);
                            if (!TextUtils.isEmpty(r5)) {
                                nVar.t(r5);
                            }
                            nVar.e(2);
                            nVar.a("scenes", "1");
                            nVar.a("url", r3);
                            b.a(nVar, g.this.f22615f);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f22615f);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                            }
                        }
                    }
                }
            });
        }

        private void a(int i8, long j8, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.2

                /* renamed from: a */
                final /* synthetic */ int f22626a;

                /* renamed from: b */
                final /* synthetic */ long f22627b;

                /* renamed from: c */
                final /* synthetic */ String f22628c;

                /* renamed from: d */
                final /* synthetic */ String f22629d;

                /* renamed from: e */
                final /* synthetic */ String f22630e;

                AnonymousClass2(int i82, long j82, String str4, String str22, String str32) {
                    r2 = i82;
                    r3 = j82;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f22615f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f22615f.getId(), g.this.f22612c, r6, "1");
                        nVar.f(g.this.f22615f.getRequestId());
                        nVar.s(g.this.f22615f.getCurrentLocalRid());
                        nVar.g(g.this.f22615f.getRequestIdNotice());
                        nVar.e(g.this.f22615f.getId());
                        nVar.c(g.this.f22615f.getAdSpaceT());
                        nVar.t(r7);
                        nVar.a("scenes", "1");
                        if (g.this.f22615f.getAdType() == 287) {
                            nVar.d(ExifInterface.GPS_MEASUREMENT_3D);
                        } else if (g.this.f22615f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        nVar.a("url", r5);
                        nVar.e(3);
                        b.a(nVar, g.this.f22615f);
                        com.mbridge.msdk.foundation.same.report.h.a(nVar, g.this.f22612c, g.this.f22615f);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends Handler {

        /* renamed from: a */
        private Context f22632a;

        /* renamed from: b */
        private ConcurrentHashMap<String, c> f22633b;

        /* renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f22634c;

        public h(Looper looper) {
            super(looper);
            this.f22633b = new ConcurrentHashMap<>();
            this.f22634c = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, String str3, c cVar) {
            this.f22633b.put(str2 + "_" + str3, cVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(19:6|(1:8)|9|(1:(1:(1:(1:14)(1:233))(1:234))(1:235))(1:236)|15|(1:232)(1:19)|20|21|22|23|(3:68|69|(4:71|(6:(2:78|(1:(2:81|(2:83|(2:86|(1:88)(2:89|(2:93|(1:97))))(1:85))(2:98|(1:100)))(2:101|(1:103)))(2:104|(1:106)))|107|108|109|110|111)(7:115|(1:(2:118|(2:120|(1:(1:131)(2:129|130)))(1:(4:164|(4:167|(2:171|172)|173|165)|176|177)(2:162|163)))(1:(4:187|(6:190|(1:194)|195|(2:199|200)|201|188)|204|205)(2:185|186)))(5:(1:226)(2:211|(2:213|214))|215|(4:218|(2:220|221)(1:223)|222|216)|224|225)|132|133|134|135|(3:144|145|147)(2:137|(5:139|140|141|32|33)(1:143)))|66|67))|25|26|27|28|(1:30)(4:(2:41|(1:(2:44|(2:46|(1:51))(2:52|(1:54)))(2:55|(1:57)))(2:58|(1:60)))|61|62|63)|31|32|33) */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x03ce, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x03cf, code lost:            r10 = r15;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0494  */
        /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v3, types: [int] */
        /* JADX WARN: Type inference failed for: r10v4, types: [int] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r18v0, types: [com.mbridge.msdk.videocommon.download.b] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r31) {
            /*
                Method dump skipped, instructions count: 1230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.h.handleMessage(android.os.Message):void");
        }

        public final void a(Context context) {
            this.f22632a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f22634c.put(str, copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface i {
        void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(String str, String str2, String str3, a.C0440a c0440a, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0440a c0440a);
    }

    /* loaded from: classes4.dex */
    public static final class m {

        /* renamed from: a */
        private static final b f22678a = new b();
    }

    /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    private b() {
        this.f22515d = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f22516e = "down_type";
        this.f22517f = "h3c";
        this.f22518g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f22512b = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f22513a = new h(handlerThread.getLooper());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String b(int i8) {
        synchronized (b.class) {
            if (i8 == 200) {
                return MimeTypes.BASE_TYPE_VIDEO;
            }
            if (i8 == 201) {
                return "zip/html";
            }
            if (i8 == 203) {
                return "temp";
            }
            if (i8 != 205) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return "tpl";
        }
    }

    public static b a() {
        return m.f22678a;
    }

    public final synchronized void a(Context context, boolean z8, int i8, boolean z9, int i9, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, c cVar, i iVar) {
        String str4 = str2 + "_" + str3;
        f22512b.put(str4, new a(z8, z9, i8, copyOnWriteArrayList.size(), str2, str3, i9, copyOnWriteArrayList));
        this.f22513a.a(str, str2, str3, cVar);
        this.f22513a.a(context);
        this.f22513a.a(str4, copyOnWriteArrayList);
        this.f22513a.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.1

            /* renamed from: a */
            final /* synthetic */ CopyOnWriteArrayList f22519a;

            /* renamed from: b */
            final /* synthetic */ Context f22520b;

            /* renamed from: c */
            final /* synthetic */ String f22521c;

            /* renamed from: d */
            final /* synthetic */ int f22522d;

            /* renamed from: e */
            final /* synthetic */ String f22523e;

            /* renamed from: f */
            final /* synthetic */ String f22524f;

            /* renamed from: g */
            final /* synthetic */ i f22525g;

            AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList2, Context context2, String str22, int i92, String str5, String str32, i iVar2) {
                r2 = copyOnWriteArrayList2;
                r3 = context2;
                r4 = str22;
                r5 = i92;
                r6 = str5;
                r7 = str32;
                r8 = iVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    Method dump skipped, instructions count: 981
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
            }
        });
    }

    public static com.mbridge.msdk.foundation.c.b b(int i8, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i8);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.a(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* loaded from: classes4.dex */
    private static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a */
        private Handler f22606a;

        /* renamed from: b */
        private final String f22607b;

        /* renamed from: c */
        private final String f22608c;

        /* renamed from: d */
        private final String f22609d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f22606a = handler;
            this.f22608c = str;
            this.f22607b = str2;
            this.f22609d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22607b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22608c);
            bundle.putString("request_id", this.f22609d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f22606a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f22607b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f22608c);
            bundle.putString("request_id", this.f22609d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f22606a.sendMessage(obtain);
        }
    }

    public void a(int i8, CampaignEx campaignEx, String str, String str2) {
        com.mbridge.msdk.foundation.tools.n.a(i8, str, str2, new n.a() { // from class: com.mbridge.msdk.reward.adapter.b.2

            /* renamed from: a */
            final /* synthetic */ int f22527a;

            /* renamed from: b */
            final /* synthetic */ CampaignEx f22528b;

            AnonymousClass2(int i82, CampaignEx campaignEx2) {
                r2 = i82;
                r3 = campaignEx2;
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, String str4, String str5, String str6, boolean z8) {
                if (z8) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    int i9 = r2;
                    if (i9 == 0) {
                        nVar.e(1);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i9 == 1) {
                        nVar.e(2);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i9 == 2) {
                        nVar.e(3);
                        nVar.b(1);
                        nVar.a("m_download_end");
                        nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
                        nVar.o("1");
                    }
                    nVar.g(r3.getRequestIdNotice());
                    nVar.a("url", str3);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e8.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, DownloadError downloadError) {
                String str4 = "";
                if (downloadError != null) {
                    try {
                        if (downloadError.getException() != null) {
                            str4 = downloadError.getException().getMessage();
                        }
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            e8.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i9 = r2;
                if (i9 == 0) {
                    nVar.e(1);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i9 == 1) {
                    nVar.e(2);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i9 == 2) {
                    nVar.e(3);
                    nVar.b(3);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
                    nVar.o("1");
                }
                b.a(nVar, r3);
                nVar.g(r3.getRequestIdNotice());
                nVar.h(str4);
                nVar.a("scenes", "1");
                nVar.a("url", str3);
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            }
        }, campaignEx2);
    }

    public final synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, i iVar) {
        try {
            this.f22513a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (ai.a(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message obtain = Message.obtain();
                    obtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("url", cMPTEntryUrl);
                    obtain.setData(bundle);
                    this.f22513a.sendMessage(obtain);
                    if (iVar != null) {
                        iVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.b b9 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
                    if (b9 == null) {
                        b9 = new com.mbridge.msdk.foundation.same.report.d.b();
                    }
                    com.mbridge.msdk.foundation.same.report.d.b bVar = b9;
                    bVar.a(campaignEx);
                    bVar.a(1);
                    bVar.c(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getCMPTEntryUrl(), new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.reward.adapter.b.3

                        /* renamed from: a */
                        final /* synthetic */ String f22530a;

                        /* renamed from: b */
                        final /* synthetic */ String f22531b;

                        /* renamed from: c */
                        final /* synthetic */ String f22532c;

                        /* renamed from: d */
                        final /* synthetic */ i f22533d;

                        /* renamed from: e */
                        final /* synthetic */ Context f22534e;

                        /* renamed from: f */
                        final /* synthetic */ CampaignEx f22535f;

                        AnonymousClass3(String str22, String str4, String str32, i iVar2, Context context2, CampaignEx campaignEx2) {
                            r2 = str22;
                            r3 = str4;
                            r4 = str32;
                            r5 = iVar2;
                            r6 = context2;
                            r7 = campaignEx2;
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                        public final void onFailed(String str4, String str5) {
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                */
                            /*
                                Method dump skipped, instructions count: 269
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                        public final void onSuccess(String str4, String str22, boolean z8) {
                            try {
                                ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, true);
                                Message obtain2 = Message.obtain();
                                obtain2.what = 105;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                                bundle2.putString("request_id", r4);
                                bundle2.putString("url", str4);
                                obtain2.setData(bundle2);
                                b.this.f22513a.sendMessage(obtain2);
                                i iVar2 = r5;
                                if (iVar2 != null) {
                                    iVar2.a(r3, r2, r4, str4);
                                }
                                if (!z8) {
                                    b.a(b.this, r6, 1, r7, str4, "", r2, str22);
                                }
                            } catch (Exception e8) {
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, false);
                                Message obtain22 = Message.obtain();
                                obtain22.what = 205;
                                Bundle bundle22 = new Bundle();
                                bundle22.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                                bundle22.putString(MBridgeConstans.PLACEMENT_ID, r3);
                                bundle22.putString("request_id", r4);
                                bundle22.putString("url", str4);
                                obtain22.setData(bundle22);
                                b.this.f22513a.sendMessage(obtain22);
                                if (r5 != null) {
                                    try {
                                        r5.a(str4, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e8, null));
                                    } catch (Exception e9) {
                                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                                    }
                                }
                                b.a(b.this, r6, 3, r7, str4, e8.getLocalizedMessage(), r2, str22);
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                                }
                            }
                        }
                    });
                } catch (Exception e8) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$2 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements n.a {

        /* renamed from: a */
        final /* synthetic */ int f22527a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f22528b;

        AnonymousClass2(int i82, CampaignEx campaignEx2) {
            r2 = i82;
            r3 = campaignEx2;
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, String str4, String str5, String str6, boolean z8) {
            if (z8) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i9 = r2;
                if (i9 == 0) {
                    nVar.e(1);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i9 == 1) {
                    nVar.e(2);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i9 == 2) {
                    nVar.e(3);
                    nVar.b(1);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
                    nVar.o("1");
                }
                nVar.g(r3.getRequestIdNotice());
                nVar.a("url", str3);
                nVar.a("scenes", "1");
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, DownloadError downloadError) {
            String str4 = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        str4 = downloadError.getException().getMessage();
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        e8.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i9 = r2;
            if (i9 == 0) {
                nVar.e(1);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i9 == 1) {
                nVar.e(2);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i9 == 2) {
                nVar.e(3);
                nVar.b(3);
                nVar.a("m_download_end");
                nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f20587a : com.mbridge.msdk.foundation.entity.n.f20588b);
                nVar.o("1");
            }
            b.a(nVar, r3);
            nVar.g(r3.getRequestIdNotice());
            nVar.h(str4);
            nVar.a("scenes", "1");
            nVar.a("url", str3);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$b */
    /* loaded from: classes4.dex */
    public static class C0421b extends com.mbridge.msdk.mbsignalcommon.b.a {

        /* renamed from: a */
        private final Handler f22562a;

        /* renamed from: b */
        private final Runnable f22563b;

        /* renamed from: c */
        private final boolean f22564c;

        /* renamed from: d */
        private final boolean f22565d;

        /* renamed from: e */
        private int f22566e;

        /* renamed from: f */
        private String f22567f;

        /* renamed from: g */
        private String f22568g;

        /* renamed from: h */
        private String f22569h;

        /* renamed from: i */
        private String f22570i;

        /* renamed from: j */
        private a.C0440a f22571j;

        /* renamed from: k */
        private CampaignEx f22572k;

        /* renamed from: l */
        private CopyOnWriteArrayList<CampaignEx> f22573l;

        /* renamed from: m */
        private com.mbridge.msdk.videocommon.d.c f22574m;

        /* renamed from: n */
        private final j f22575n;

        /* renamed from: o */
        private boolean f22576o;

        /* renamed from: p */
        private boolean f22577p;

        /* renamed from: q */
        private boolean f22578q;

        /* renamed from: r */
        private int f22579r = 0;

        /* renamed from: s */
        private boolean f22580s;

        /* renamed from: t */
        private long f22581t;

        public C0421b(boolean z8, Handler handler, Runnable runnable, boolean z9, boolean z10, int i8, String str, String str2, String str3, String str4, a.C0440a c0440a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.d.c cVar, j jVar, boolean z11, long j8) {
            this.f22562a = handler;
            this.f22563b = runnable;
            this.f22564c = z9;
            this.f22565d = z10;
            this.f22566e = i8;
            this.f22567f = str;
            this.f22569h = str2;
            this.f22568g = str3;
            this.f22570i = str4;
            this.f22571j = c0440a;
            this.f22572k = campaignEx;
            this.f22573l = copyOnWriteArrayList;
            this.f22574m = cVar;
            this.f22575n = jVar;
            this.f22576o = z11;
            this.f22580s = z8;
            this.f22581t = j8;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 1);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22572k, dVar);
            } catch (Throwable th) {
                ad.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.f22578q) {
                return;
            }
            String str = this.f22568g + "_" + this.f22567f;
            if (i8 == 1) {
                if (this.f22576o) {
                    com.mbridge.msdk.videocommon.a.e(this.f22568g + "_" + this.f22570i);
                } else {
                    com.mbridge.msdk.videocommon.a.d(this.f22568g + "_" + this.f22570i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f22568g + "_" + this.f22570i + "_" + this.f22567f, this.f22571j, true, this.f22576o);
                Handler handler = this.f22562a;
                if (handler != null && (runnable = this.f22563b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22568g + "_" + this.f22570i + "_" + this.f22567f, true);
                a.C0440a c0440a = this.f22571j;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                j jVar = this.f22575n;
                if (jVar != null) {
                    jVar.a(str, this.f22569h, this.f22568g, this.f22570i, this.f22567f, this.f22571j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22568g + "_" + this.f22570i + "_" + this.f22567f, false);
                a.C0440a c0440a2 = this.f22571j;
                if (c0440a2 != null) {
                    c0440a2.a(false);
                }
                if (this.f22575n != null) {
                    this.f22575n.a(str, this.f22570i, this.f22567f, this.f22571j, b.b(880008, new MBridgeIds(this.f22569h, this.f22568g, this.f22570i), "readyState:" + i8, null, this.f22572k));
                }
            }
            this.f22578q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        public final void a(WebView webView, String str, String str2, int i8, int i9) {
            boolean z8 = true;
            if (i8 == 1) {
                try {
                    com.mbridge.msdk.reward.b.a aVar = new com.mbridge.msdk.reward.b.a();
                    aVar.b(false);
                    if (i9 != 2) {
                        z8 = false;
                    }
                    aVar.a(z8);
                    aVar.b(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.b.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, i9, str2, true, 1));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RVWindVaneWebView", e8.getMessage());
                    }
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:54)|11|(3:14|15|(5:20|(3:22|23|24)(2:36|(1:41)(1:40))|25|26|28))|46|47|48|25|26|28) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L107;     */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x012d, code lost:            com.mbridge.msdk.foundation.tools.ad.b("RewardCampaignsResourceManager", r0.getLocalizedMessage());     */
        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.C0421b.a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.f22577p) {
                return;
            }
            String str2 = this.f22568g + "_" + this.f22567f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22568g + "_" + this.f22570i + "_" + this.f22567f, true);
                Handler handler = this.f22562a;
                if (handler != null && (runnable = this.f22563b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0440a c0440a = this.f22571j;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                j jVar = this.f22575n;
                if (jVar != null) {
                    jVar.a(str2, this.f22569h, this.f22568g, this.f22570i, this.f22567f, this.f22571j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22577p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            super.a(webView, i8, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22568g + "_" + this.f22570i + "_" + this.f22567f, false);
            if (this.f22575n != null) {
                String str3 = this.f22568g + "_" + this.f22567f;
                a.C0440a c0440a = this.f22571j;
                if (c0440a != null) {
                    c0440a.a(false);
                }
                this.f22575n.a(str3, this.f22570i, this.f22567f, this.f22571j, b.b(880008, new MBridgeIds(this.f22569h, this.f22568g, this.f22570i), "onReceivedError： " + i8 + "  " + str, null, this.f22572k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> b9 = com.mbridge.msdk.video.bt.a.d.c().b(this.f22568g, this.f22570i);
                        if (b9 != null && !b9.isEmpty()) {
                            for (View view : b9.values()) {
                                if (view instanceof MBridgeBTContainer) {
                                    ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b("OperateViews", th.getMessage());
                    }
                } catch (Throwable th2) {
                    ad.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private Handler f22635a;

        /* renamed from: b */
        private Runnable f22636b;

        /* renamed from: c */
        private final boolean f22637c;

        /* renamed from: d */
        private final boolean f22638d;

        /* renamed from: e */
        private String f22639e;

        /* renamed from: f */
        private final j f22640f;

        /* renamed from: g */
        private final WindVaneWebView f22641g;

        /* renamed from: h */
        private final String f22642h;

        /* renamed from: i */
        private final String f22643i;

        /* renamed from: j */
        private final String f22644j;

        /* renamed from: k */
        private final a.C0440a f22645k;

        /* renamed from: l */
        private final CampaignEx f22646l;

        /* renamed from: m */
        private CopyOnWriteArrayList<CampaignEx> f22647m;

        /* renamed from: n */
        private long f22648n;

        /* renamed from: o */
        private boolean f22649o;

        /* renamed from: p */
        private boolean f22650p;

        /* renamed from: q */
        private final Runnable f22651q;

        /* renamed from: r */
        private final Runnable f22652r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$1 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f22653a;

            /* renamed from: b */
            final /* synthetic */ a.C0440a f22654b;

            /* renamed from: c */
            final /* synthetic */ String f22655c;

            /* renamed from: d */
            final /* synthetic */ String f22656d;

            /* renamed from: e */
            final /* synthetic */ String f22657e;

            /* renamed from: f */
            final /* synthetic */ String f22658f;

            AnonymousClass1(j jVar, a.C0440a c0440a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0440a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a9;
                a.C0440a c0440a;
                if (r2 != null && (c0440a = r3) != null) {
                    c0440a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0440a c0440a2 = r3;
                if (c0440a2 != null && (a9 = c0440a2.a()) != null) {
                    try {
                        a9.release();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getMessage());
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$2 */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f22660a;

            /* renamed from: b */
            final /* synthetic */ a.C0440a f22661b;

            /* renamed from: c */
            final /* synthetic */ String f22662c;

            /* renamed from: d */
            final /* synthetic */ String f22663d;

            /* renamed from: e */
            final /* synthetic */ String f22664e;

            /* renamed from: f */
            final /* synthetic */ String f22665f;

            AnonymousClass2(j jVar, a.C0440a c0440a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0440a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a9;
                a.C0440a c0440a;
                if (r2 != null && (c0440a = r3) != null) {
                    c0440a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0440a c0440a2 = r3;
                if (c0440a2 != null && (a9 = c0440a2.a()) != null) {
                    try {
                        a9.release();
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getMessage());
                        }
                    }
                }
            }
        }

        public k(Handler handler, Runnable runnable, boolean z8, boolean z9, String str, j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0440a c0440a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j8) {
            this.f22635a = handler;
            this.f22636b = runnable;
            this.f22637c = z8;
            this.f22638d = z9;
            this.f22639e = str;
            this.f22640f = jVar;
            this.f22641g = windVaneWebView;
            this.f22642h = str2;
            this.f22643i = str4;
            this.f22644j = str3;
            this.f22645k = c0440a;
            this.f22646l = campaignEx;
            this.f22647m = copyOnWriteArrayList;
            this.f22648n = j8;
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.1

                /* renamed from: a */
                final /* synthetic */ j f22653a;

                /* renamed from: b */
                final /* synthetic */ a.C0440a f22654b;

                /* renamed from: c */
                final /* synthetic */ String f22655c;

                /* renamed from: d */
                final /* synthetic */ String f22656d;

                /* renamed from: e */
                final /* synthetic */ String f22657e;

                /* renamed from: f */
                final /* synthetic */ String f22658f;

                AnonymousClass1(j jVar2, a.C0440a c0440a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0440a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a9;
                    a.C0440a c0440a2;
                    if (r2 != null && (c0440a2 = r3) != null) {
                        c0440a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0440a c0440a22 = r3;
                    if (c0440a22 != null && (a9 = c0440a22.a()) != null) {
                        try {
                            a9.release();
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e8.getMessage());
                            }
                        }
                    }
                }
            };
            this.f22652r = anonymousClass1;
            this.f22651q = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.2

                /* renamed from: a */
                final /* synthetic */ j f22660a;

                /* renamed from: b */
                final /* synthetic */ a.C0440a f22661b;

                /* renamed from: c */
                final /* synthetic */ String f22662c;

                /* renamed from: d */
                final /* synthetic */ String f22663d;

                /* renamed from: e */
                final /* synthetic */ String f22664e;

                /* renamed from: f */
                final /* synthetic */ String f22665f;

                AnonymousClass2(j jVar2, a.C0440a c0440a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0440a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a9;
                    a.C0440a c0440a2;
                    if (r2 != null && (c0440a2 = r3) != null) {
                        c0440a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0440a c0440a22 = r3;
                    if (c0440a22 != null && (a9 = c0440a22.a()) != null) {
                        try {
                            a9.release();
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e8.getMessage());
                            }
                        }
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(anonymousClass1, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i8);
            Handler handler2 = this.f22635a;
            if (handler2 != null && (runnable2 = this.f22651q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f22635a;
            if (handler3 != null && (runnable = this.f22652r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22646l, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f22650p) {
                return;
            }
            String str = this.f22643i + "_" + this.f22642h;
            if (i8 == 1) {
                Runnable runnable3 = this.f22636b;
                if (runnable3 != null && (handler = this.f22635a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22643i + "_" + this.f22639e + "_" + this.f22642h, true);
                a.C0440a c0440a = this.f22645k;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                if (this.f22637c) {
                    if (this.f22638d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22646l.getRequestIdNotice(), this.f22645k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f22646l.getRequestIdNotice(), this.f22645k);
                    }
                } else if (this.f22638d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22646l.getRequestIdNotice(), this.f22645k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f22646l.getRequestIdNotice(), this.f22645k);
                }
                j jVar = this.f22640f;
                if (jVar != null) {
                    jVar.a(str, this.f22644j, this.f22643i, this.f22639e, this.f22642h, this.f22645k);
                }
            } else if (this.f22640f != null) {
                this.f22640f.a(str, this.f22639e, this.f22642h, this.f22645k, b.b(880009, new MBridgeIds(this.f22644j, this.f22643i, this.f22639e), "readyState:" + i8, null, this.f22646l));
            }
            this.f22650p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            super.a(webView, i8, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22643i + "_" + this.f22639e + "_" + this.f22642h, false);
            Handler handler = this.f22635a;
            if (handler != null) {
                if (this.f22651q != null) {
                    handler.removeCallbacks(this.f22652r);
                }
                Runnable runnable = this.f22651q;
                if (runnable != null) {
                    this.f22635a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f22643i + "_" + this.f22642h;
                a.C0440a c0440a = this.f22645k;
                if (c0440a != null) {
                    c0440a.a(false);
                }
                if (this.f22640f != null) {
                    this.f22640f.a(str3, this.f22639e, str2, this.f22645k, b.b(880009, new MBridgeIds(this.f22644j, this.f22643i, this.f22639e), i8 + "#" + str, null, this.f22646l));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e8.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22643i + "_" + this.f22639e + "_" + this.f22642h, false);
            Handler handler = this.f22635a;
            if (handler != null) {
                if (this.f22651q != null) {
                    handler.removeCallbacks(this.f22652r);
                }
                Runnable runnable = this.f22651q;
                if (runnable != null) {
                    this.f22635a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f22643i + "_" + this.f22642h;
                a.C0440a c0440a = this.f22645k;
                if (c0440a != null) {
                    c0440a.a(false);
                }
                if (this.f22640f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f22644j, this.f22643i, this.f22639e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f22640f.a(str, this.f22639e, this.f22642h, this.f22645k, b.b(880009, mBridgeIds, sb.toString(), null, this.f22646l));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e8.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.f22635a;
            if (handler2 != null && (runnable2 = this.f22652r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f22649o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.f22643i + "_" + this.f22642h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22643i + "_" + this.f22639e + "_" + this.f22642h, true);
                Runnable runnable3 = this.f22636b;
                if (runnable3 != null && (handler = this.f22635a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0440a c0440a = this.f22645k;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                if (this.f22637c) {
                    if (this.f22646l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22646l.getRequestIdNotice(), this.f22645k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f22646l.getRequestIdNotice(), this.f22645k);
                    }
                } else if (this.f22646l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22646l.getRequestIdNotice(), this.f22645k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f22646l.getRequestIdNotice(), this.f22645k);
                }
                j jVar = this.f22640f;
                if (jVar != null) {
                    jVar.a(str2, this.f22644j, this.f22643i, this.f22639e, this.f22642h, this.f22645k);
                }
            } else {
                Handler handler3 = this.f22635a;
                if (handler3 != null && (runnable = this.f22651q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22649o = true;
        }
    }

    /* loaded from: classes4.dex */
    private static class l extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private String f22667a;

        /* renamed from: b */
        private final boolean f22668b;

        /* renamed from: c */
        private final WindVaneWebView f22669c;

        /* renamed from: d */
        private final String f22670d;

        /* renamed from: e */
        private final String f22671e;

        /* renamed from: f */
        private final a.C0440a f22672f;

        /* renamed from: g */
        private final CampaignEx f22673g;

        /* renamed from: h */
        private boolean f22674h;

        /* renamed from: i */
        private String f22675i;

        /* renamed from: j */
        private boolean f22676j;

        /* renamed from: k */
        private boolean f22677k;

        public l(String str, boolean z8, WindVaneWebView windVaneWebView, String str2, String str3, a.C0440a c0440a, CampaignEx campaignEx, boolean z9, String str4) {
            this.f22668b = z8;
            this.f22669c = windVaneWebView;
            this.f22670d = str2;
            this.f22671e = str3;
            this.f22672f = c0440a;
            this.f22673g = campaignEx;
            this.f22667a = str;
            this.f22674h = z9;
            this.f22675i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i8));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f22673g, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f22677k) {
                return;
            }
            if (this.f22669c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f22667a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i8);
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "");
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22669c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e8.getLocalizedMessage());
                    }
                }
            }
            String str = this.f22671e + "_" + this.f22673g.getId() + "_" + this.f22673g.getRequestId() + "_" + this.f22670d;
            if (i8 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22671e + "_" + this.f22675i + "_" + this.f22670d, true);
                a.C0440a c0440a = this.f22672f;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                if (this.f22668b) {
                    if (this.f22673g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f22672f, false, this.f22674h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f22672f, false, this.f22674h);
                    }
                } else if (this.f22673g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f22672f, false, this.f22674h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f22672f, false, this.f22674h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22671e + "_" + this.f22675i + "_" + this.f22670d, false);
                a.C0440a c0440a2 = this.f22672f;
                if (c0440a2 != null) {
                    c0440a2.a(false);
                }
            }
            this.f22677k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i8, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22671e + "_" + this.f22675i + "_" + this.f22670d, false);
            a.C0440a c0440a = this.f22672f;
            if (c0440a != null) {
                c0440a.a(false);
            }
            if (this.f22669c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f22667a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22669c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e8.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            if (this.f22676j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f22669c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f22667a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f22669c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e8.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f22671e + "_" + this.f22675i + "_" + this.f22670d, true);
                a.C0440a c0440a = this.f22672f;
                if (c0440a != null) {
                    c0440a.a(true);
                }
                String str2 = this.f22671e + "_" + this.f22673g.getId() + "_" + this.f22673g.getRequestId() + "_" + this.f22670d;
                if (this.f22668b) {
                    if (this.f22673g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f22673g.getRequestIdNotice(), this.f22672f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f22672f, false, this.f22674h);
                    }
                } else if (this.f22673g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f22673g.getRequestIdNotice(), this.f22672f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f22672f, false, this.f22674h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f22676j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01c4 A[Catch: all -> 0x003c, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:25:0x008c, B:28:0x0092, B:30:0x0098, B:32:0x00a7, B:35:0x00dd, B:37:0x00f3, B:44:0x01c0, B:46:0x01c4, B:48:0x01cf, B:50:0x00a1, B:63:0x0118, B:66:0x0128, B:68:0x013a, B:58:0x0176), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:25:0x008c, B:28:0x0092, B:30:0x0098, B:32:0x00a7, B:35:0x00dd, B:37:0x00f3, B:44:0x01c0, B:46:0x01c4, B:48:0x01cf, B:50:0x00a1, B:63:0x0118, B:66:0x0128, B:68:0x013a, B:58:0x0176), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.d.c r38, com.mbridge.msdk.reward.adapter.b.j r39) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.d.c r41, com.mbridge.msdk.reward.adapter.b.j r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j, boolean):void");
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            ad.b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    public com.mbridge.msdk.foundation.same.report.d.b a(CampaignEx campaignEx, int i8) {
        com.mbridge.msdk.foundation.same.report.d.b b9 = campaignEx != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid()) : null;
        if (b9 == null) {
            b9 = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        b9.a(campaignEx);
        b9.c(a(campaignEx));
        b9.a(i8);
        return b9;
    }

    static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.b a9 = bVar.a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                g gVar = new g(context, str, str2, str3, campaignEx, 497, bVar.f22513a, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a9, str4, gVar);
                return;
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            d dVar = new d(497, str, str2, str3, campaignEx, iVar, bVar.f22513a, copyOnWriteArrayList);
            dVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a9, str4, dVar);
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
            }
        }
    }

    static /* synthetic */ void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId());
            if (a9 != null) {
                nVar.v(a9.l());
            }
            com.mbridge.msdk.videocommon.d.a b9 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b9 != null) {
                nVar.u(b9.c());
            }
        } catch (Exception e8) {
            ad.b("RewardCampaignsResourceManager", e8.getMessage());
        }
    }

    static /* synthetic */ void a(b bVar, Context context, int i8, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.f.b.g().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.4

            /* renamed from: a */
            final /* synthetic */ CampaignEx f22537a;

            /* renamed from: b */
            final /* synthetic */ Context f22538b;

            /* renamed from: c */
            final /* synthetic */ int f22539c;

            /* renamed from: d */
            final /* synthetic */ String f22540d;

            /* renamed from: e */
            final /* synthetic */ String f22541e;

            /* renamed from: f */
            final /* synthetic */ String f22542f;

            /* renamed from: g */
            final /* synthetic */ String f22543g;

            AnonymousClass4(CampaignEx campaignEx2, Context context2, int i82, String str5, String str22, String str32, String str42) {
                r2 = campaignEx2;
                r3 = context2;
                r4 = i82;
                r5 = str5;
                r6 = str22;
                r7 = str32;
                r8 = str42;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (r2 != null && r3 != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.a("m_download_end");
                        Context context2 = r3;
                        if (context2 != null) {
                            nVar.a(z.l(context2.getApplicationContext()));
                        }
                        nVar.b(r4);
                        CampaignEx campaignEx2 = r2;
                        if (campaignEx2 != null) {
                            nVar.e(campaignEx2.getId());
                            nVar.f(r2.getRequestId());
                            nVar.s(r2.getCurrentLocalRid());
                            nVar.g(r2.getRequestIdNotice());
                        }
                        nVar.q(r5);
                        nVar.h(r6);
                        nVar.c(r7);
                        if (!TextUtils.isEmpty(r8)) {
                            nVar.t(r8);
                        }
                        nVar.e(1);
                        nVar.a("scenes", "1");
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar.a(), r2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                        }
                    }
                }
            }
        });
    }
}
