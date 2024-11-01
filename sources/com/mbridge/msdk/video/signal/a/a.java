package com.mbridge.msdk.video.signal.a;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* renamed from: j, reason: collision with root package name */
    protected String f23839j;

    /* renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.d.c f23840k;

    /* renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f23841l;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f23830a = false;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f23831b = false;

    /* renamed from: c, reason: collision with root package name */
    protected int f23832c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f23833d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f23834e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected int f23835f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected int f23836g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected int f23837h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected int f23838i = -1;

    /* renamed from: m, reason: collision with root package name */
    public a.InterfaceC0438a f23842m = new C0439a();

    /* renamed from: n, reason: collision with root package name */
    protected int f23843n = 2;

    /* renamed from: com.mbridge.msdk.video.signal.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0439a implements a.InterfaceC0438a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public void a() {
            ad.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public void b() {
            ad.a("DefaultJSCommon", "videoLocationReady");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i8) {
            ad.a("DefaultJSCommon", "onDownloadProgress,progress:" + i8);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            ad.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            ad.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            ad.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            ad.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public void a(boolean z8) {
            ad.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public void a(int i8, String str) {
            ad.a("DefaultJSCommon", "onH5Error,code:" + i8 + "，msg:" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(int i8) {
        this.f23843n = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(int i8) {
        this.f23833d = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void c(int i8) {
        this.f23832c = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i8, String str) {
        ad.a("DefaultJSCommon", "click:type" + i8 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void d(int i8) {
        this.f23834e = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e(int i8) {
        this.f23836g = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int g() {
        return this.f23838i;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void h(int i8) {
        ad.a("DefaultJSCommon", "setAlertDialogRole " + i8);
        this.f23837h = i8;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i8, String str) {
        ad.a("DefaultJSCommon", "handlerH5Exception,code=" + i8 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String i() {
        ad.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    public final int j() {
        if (this.f23832c == 0 && this.f23831b) {
            this.f23832c = 1;
        }
        return this.f23832c;
    }

    public final int k() {
        if (this.f23833d == 0 && this.f23831b) {
            this.f23833d = 1;
        }
        return this.f23833d;
    }

    public final int l() {
        if (this.f23834e == 0 && this.f23831b) {
            this.f23834e = 1;
        }
        return this.f23834e;
    }

    public final boolean m() {
        return this.f23831b;
    }

    /* loaded from: classes4.dex */
    public static class b implements a.InterfaceC0438a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f23844a;

        /* renamed from: b, reason: collision with root package name */
        private a.InterfaceC0438a f23845b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0438a interfaceC0438a) {
            this.f23844a = dVar;
            this.f23845b = interfaceC0438a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public final void a() {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.a();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public final void b() {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.b();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDismissLoading(Campaign campaign) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadProgress(int i8) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onDownloadProgress(i8);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onDownloadStart(Campaign campaign) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f23844a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null && interfaceC0438a.onInterceptDefaultLoadingDialog()) {
                return true;
            }
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f23844a;
            if (dVar != null) {
                dVar.d();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public final void onShowLoading(Campaign campaign) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public final void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public final void a(boolean z8) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.a(z8);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0438a
        public final void a(int i8, String str) {
            a.InterfaceC0438a interfaceC0438a = this.f23845b;
            if (interfaceC0438a != null) {
                interfaceC0438a.a(i8, str);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int a() {
        return this.f23836g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final boolean b() {
        return this.f23830a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        ad.a("DefaultJSCommon", "init");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d() {
        ad.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void e() {
        ad.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f23841l;
        if (aVar != null) {
            aVar.a(false);
            this.f23841l.a((NativeListener.NativeTrackingListener) null);
            this.f23841l.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void f(int i8) {
        this.f23838i = i8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g(int i8) {
        ad.a("DefaultJSCommon", "getSDKInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(boolean z8) {
        ad.a("DefaultJSCommon", "setIsShowingTransparent:" + z8);
        this.f23831b = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void b(boolean z8) {
        this.f23830a = z8;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final int h() {
        ad.a("DefaultJSCommon", "getAlertDialogRole " + this.f23837h);
        return this.f23837h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(String str) {
        ad.a("DefaultJSCommon", "setNotchArea");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(String str) {
        ad.a("DefaultJSCommon", "setUnitId:" + str);
        this.f23839j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(a.InterfaceC0438a interfaceC0438a) {
        ad.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0438a);
        this.f23842m = interfaceC0438a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        ad.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f23840k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i8, String str) {
        ad.a("DefaultJSCommon", "statistics,type:" + i8 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(Activity activity) {
        ad.a("DefaultJSCommon", "setActivity ");
    }
}
