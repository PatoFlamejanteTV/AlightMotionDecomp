package com.mbridge.msdk.mbbanner.a;

import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import com.mbridge.msdk.mbbanner.common.a.b;
import com.mbridge.msdk.mbbanner.common.c.c;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f21507a = "BannerController";

    /* renamed from: b, reason: collision with root package name */
    private String f21508b;

    /* renamed from: c, reason: collision with root package name */
    private String f21509c;

    /* renamed from: d, reason: collision with root package name */
    private MBridgeIds f21510d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21511e;

    /* renamed from: f, reason: collision with root package name */
    private int f21512f;

    /* renamed from: g, reason: collision with root package name */
    private MBBannerView f21513g;

    /* renamed from: h, reason: collision with root package name */
    private int f21514h;

    /* renamed from: i, reason: collision with root package name */
    private int f21515i;

    /* renamed from: j, reason: collision with root package name */
    private int f21516j;

    /* renamed from: l, reason: collision with root package name */
    private BannerAdListener f21518l;

    /* renamed from: m, reason: collision with root package name */
    private CampaignUnit f21519m;

    /* renamed from: n, reason: collision with root package name */
    private c f21520n;

    /* renamed from: o, reason: collision with root package name */
    private k f21521o;

    /* renamed from: p, reason: collision with root package name */
    private j f21522p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21523q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21524r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21525s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21526t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21527u;

    /* renamed from: k, reason: collision with root package name */
    private int f21517k = -1;

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.c f21528v = new com.mbridge.msdk.mbbanner.common.b.c() { // from class: com.mbridge.msdk.mbbanner.a.a.1
        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(List<CampaignEx> list) {
            if (a.this.f21518l != null) {
                a.this.f21518l.onLoadSuccessed(a.this.f21510d);
            }
            ad.b(a.f21507a, "onShowSuccessed:");
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void b() {
            if (a.this.f21518l != null) {
                a.this.f21518l.onLeaveApp(a.this.f21510d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void c() {
            if (a.this.f21518l != null) {
                a.this.f21518l.showFullScreen(a.this.f21510d);
                a.this.f21527u = true;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, a.this.f21509c, a.this.f21508b, null, null);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void d() {
            if (a.this.f21518l != null) {
                a.this.f21518l.closeFullScreen(a.this.f21510d);
                a.this.f21527u = false;
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, a.this.f21509c, a.this.f21508b, new b(a.this.f21515i + "x" + a.this.f21514h, a.this.f21516j * 1000), a.this.f21529w);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void e() {
            if (a.this.f21518l != null) {
                a.this.f21518l.onCloseBanner(a.this.f21510d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(CampaignEx campaignEx) {
            a.this.d();
            if (a.this.f21518l != null) {
                a.this.f21518l.onLogImpression(a.this.f21510d);
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a(String str) {
            a.this.b(str);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.c
        public final void a() {
            if (a.this.f21518l != null) {
                a.this.f21518l.onClick(a.this.f21510d);
            }
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.b.b f21529w = new com.mbridge.msdk.mbbanner.common.b.b() { // from class: com.mbridge.msdk.mbbanner.a.a.2
        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, CampaignUnit campaignUnit, boolean z8) {
            a.this.f21519m = campaignUnit;
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void b(com.mbridge.msdk.foundation.c.b bVar) {
            boolean z8;
            CampaignEx campaignEx;
            if (a.this.f21518l != null) {
                a.this.f21518l.onLoadFailed(a.this.f21510d, "banner res load failed");
            }
            a.this.d();
            String str = "";
            if (bVar != null) {
                String b9 = bVar.b();
                if (!TextUtils.isEmpty(b9)) {
                    str = b9;
                }
                z8 = bVar.e();
                campaignEx = bVar.c();
            } else {
                z8 = false;
                campaignEx = null;
            }
            com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f21508b, z8, campaignEx);
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            String str;
            CampaignEx campaignEx;
            boolean z8;
            str = "";
            if (bVar != null) {
                String b9 = bVar.b();
                str = TextUtils.isEmpty(b9) ? "" : b9;
                campaignEx = bVar.c();
                z8 = bVar.e();
            } else {
                campaignEx = null;
                z8 = false;
            }
            if (a.this.f21518l != null) {
                a.this.f21518l.onLoadFailed(a.this.f21510d, str);
            }
            a.this.d();
            try {
                com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, a.this.f21508b, z8, campaignEx);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.mbbanner.common.b.b
        public final void a(String str, boolean z8) {
            if (a.this.f21519m != null) {
                try {
                    com.mbridge.msdk.foundation.same.report.k.a(com.mbridge.msdk.foundation.controller.c.m().c(), a.this.f21519m.getAds(), a.this.f21508b, z8);
                } catch (Exception unused) {
                }
            }
            if (a.this.f21513g != null) {
                a.this.f21526t = true;
                a.this.i();
            }
        }
    };

    public a(MBBannerView mBBannerView, BannerSize bannerSize, String str, String str2) {
        this.f21513g = mBBannerView;
        if (bannerSize != null) {
            this.f21514h = bannerSize.getHeight();
            this.f21515i = bannerSize.getWidth();
        }
        this.f21508b = str2;
        str = TextUtils.isEmpty(str) ? "" : str;
        this.f21509c = str;
        this.f21510d = new MBridgeIds(str, this.f21508b);
        String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b9 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f21522p == null) {
            this.f21522p = new j();
        }
        this.f21522p.a(com.mbridge.msdk.foundation.controller.c.m().c(), k8, b9, this.f21508b);
        h();
    }

    private int b(int i8) {
        if (i8 <= 0) {
            return i8;
        }
        if (i8 < 10) {
            return 10;
        }
        return i8 > 180 ? SubsamplingScaleImageView.ORIENTATION_180 : i8;
    }

    private void h() {
        k d8 = h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f21508b);
        this.f21521o = d8;
        if (d8 == null) {
            this.f21521o = k.d(this.f21508b);
        }
        if (this.f21517k == -1) {
            this.f21516j = b(this.f21521o.q());
        }
        if (this.f21512f == 0) {
            boolean z8 = this.f21521o.f() == 1;
            this.f21511e = z8;
            c cVar = this.f21520n;
            if (cVar != null) {
                cVar.a(z8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f21525s || !this.f21526t) {
            return;
        }
        MBBannerView mBBannerView = this.f21513g;
        if (this.f21519m != null) {
            if (this.f21520n == null) {
                this.f21520n = new c(mBBannerView, this.f21528v, this.f21509c, this.f21508b, this.f21511e, this.f21521o);
            }
            this.f21520n.b(this.f21523q);
            this.f21520n.c(this.f21524r);
            this.f21520n.a(this.f21511e, this.f21512f);
            this.f21520n.a(this.f21519m);
        } else {
            b("banner show failed because campain is exception");
        }
        this.f21526t = false;
    }

    private void j() {
        MBBannerView mBBannerView = this.f21513g;
        if (mBBannerView != null) {
            if (this.f21523q && this.f21524r && !this.f21527u && !aq.a(mBBannerView, 1)) {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f21509c, this.f21508b, new b(this.f21515i + "x" + this.f21514h, this.f21516j * 1000), this.f21529w);
            } else {
                com.mbridge.msdk.mbbanner.common.c.a.a().a(2, this.f21509c, this.f21508b, null, null);
            }
            if (this.f21523q) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21509c, this.f21508b, null, null);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21508b);
        }
    }

    private void k() {
        j();
        c cVar = this.f21520n;
        if (cVar != null) {
            cVar.b(this.f21523q);
            this.f21520n.c(this.f21524r);
        }
    }

    public final void c() {
        this.f21525s = true;
        if (this.f21518l != null) {
            this.f21518l = null;
        }
        if (this.f21529w != null) {
            this.f21529w = null;
        }
        if (this.f21528v != null) {
            this.f21528v = null;
        }
        if (this.f21513g != null) {
            this.f21513g = null;
        }
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21509c, this.f21508b, null, null);
        com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21508b);
        com.mbridge.msdk.mbbanner.common.c.a.a().b();
        c cVar = this.f21520n;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        if (this.f21525s) {
            return;
        }
        j();
        h();
        b bVar = new b(this.f21515i + "x" + this.f21514h, this.f21516j * 1000);
        bVar.b(this.f21509c);
        bVar.a(true);
        com.mbridge.msdk.mbbanner.common.c.a.a().b(this.f21509c, this.f21508b, bVar, this.f21529w);
    }

    public final void e() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(4, this.f21509c, this.f21508b, new b(this.f21515i + "x" + this.f21514h, this.f21516j * 1000), this.f21529w);
    }

    public final void f() {
        com.mbridge.msdk.mbbanner.common.c.a.a().a(3, this.f21509c, this.f21508b, new b(this.f21515i + "x" + this.f21514h, this.f21516j * 1000), this.f21529w);
    }

    public final String b() {
        CampaignUnit campaignUnit = this.f21519m;
        if (campaignUnit != null) {
            return com.mbridge.msdk.foundation.same.c.a(campaignUnit.getAds());
        }
        return "";
    }

    public final String a() {
        CampaignUnit campaignUnit = this.f21519m;
        if (campaignUnit != null && campaignUnit.getRequestId() != null) {
            return this.f21519m.getRequestId();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        BannerAdListener bannerAdListener = this.f21518l;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.f21510d, str);
        }
        ad.b(f21507a, "showFailed:" + str);
        d();
    }

    public final void a(BannerSize bannerSize) {
        if (bannerSize != null) {
            this.f21514h = bannerSize.getHeight();
            this.f21515i = bannerSize.getWidth();
        }
    }

    public final void a(int i8) {
        int b9 = b(i8);
        this.f21517k = b9;
        this.f21516j = b9;
    }

    public final void b(boolean z8) {
        this.f21523q = z8;
        k();
        i();
    }

    public final void a(boolean z8) {
        this.f21511e = z8;
        this.f21512f = z8 ? 1 : 2;
    }

    public final void a(String str) {
        boolean z8;
        if (this.f21514h >= 1 && this.f21515i >= 1) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                BannerAdListener bannerAdListener = this.f21518l;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.f21510d, "banner load failed because WebView is not available");
                    return;
                }
                return;
            }
            b bVar = new b(this.f21515i + "x" + this.f21514h, this.f21516j * 1000);
            bVar.a(str);
            bVar.b(this.f21509c);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(this.f21509c, this.f21508b, bVar, this.f21529w);
            com.mbridge.msdk.mbbanner.common.c.a.a().a(1, this.f21509c, this.f21508b, bVar, this.f21529w);
            return;
        }
        BannerAdListener bannerAdListener2 = this.f21518l;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.f21510d, "banner load failed because params are exception");
        }
    }

    public final void c(boolean z8) {
        this.f21524r = z8;
        k();
    }

    public final void a(BannerAdListener bannerAdListener) {
        this.f21518l = bannerAdListener;
    }

    public final void a(int i8, int i9, int i10, int i11) {
        c cVar = this.f21520n;
        if (cVar != null) {
            cVar.a(i8, i9, i10, i11);
        }
    }
}
