package l2;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import g2.AbstractC2889a;
import h2.q;
import i2.InterfaceC2968b;
import i2.InterfaceC2969c;
import j2.C3149a;
import java.io.InputStream;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3317c extends WebView implements q.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2968b f34648a;

    /* renamed from: b, reason: collision with root package name */
    private final C3320f f34649b;

    /* renamed from: c, reason: collision with root package name */
    private Function1 f34650c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34651d;

    /* renamed from: l2.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends WebChromeClient {

        /* renamed from: l2.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0792a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebChromeClient.CustomViewCallback f34653a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0792a(WebChromeClient.CustomViewCallback customViewCallback) {
                super(0);
                this.f34653a = customViewCallback;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5563invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5563invoke() {
                this.f34653a.onCustomViewHidden();
            }
        }

        a() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            if (defaultVideoPoster == null) {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            }
            return defaultVideoPoster;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            super.onHideCustomView();
            C3317c.this.f34648a.onExitFullscreen();
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            AbstractC3292y.i(view, "view");
            AbstractC3292y.i(callback, "callback");
            super.onShowCustomView(view, callback);
            C3317c.this.f34648a.a(view, new C0792a(callback));
        }
    }

    public /* synthetic */ C3317c(Context context, InterfaceC2968b interfaceC2968b, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, interfaceC2968b, (i9 & 4) != 0 ? null : attributeSet, (i9 & 8) != 0 ? 0 : i8);
    }

    private final void d(C3149a c3149a) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setCacheMode(-1);
        addJavascriptInterface(new q(this), "YouTubePlayerBridge");
        InputStream openRawResource = getResources().openRawResource(AbstractC2889a.f31933a);
        AbstractC3292y.h(openRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        loadDataWithBaseURL(c3149a.b(), n.z(AbstractC3318d.a(openRawResource), "<<injectedPlayerVars>>", c3149a.toString(), false, 4, null), "text/html", "utf-8", null);
        setWebChromeClient(new a());
    }

    @Override // h2.q.b
    public void a() {
        Function1 function1 = this.f34650c;
        if (function1 == null) {
            AbstractC3292y.y("youTubePlayerInitListener");
            function1 = null;
        }
        function1.invoke(this.f34649b);
    }

    public final boolean c(InterfaceC2969c listener) {
        AbstractC3292y.i(listener, "listener");
        return this.f34649b.h().add(listener);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f34649b.k();
        super.destroy();
    }

    public final void e(Function1 initListener, C3149a c3149a) {
        AbstractC3292y.i(initListener, "initListener");
        this.f34650c = initListener;
        if (c3149a == null) {
            c3149a = C3149a.f33666b.a();
        }
        d(c3149a);
    }

    public final boolean f() {
        return this.f34651d;
    }

    @Override // h2.q.b
    public h2.e getInstance() {
        return this.f34649b;
    }

    @Override // h2.q.b
    public Collection<InterfaceC2969c> getListeners() {
        return AbstractC1435t.b1(this.f34649b.h());
    }

    public final h2.e getYoutubePlayer$core_release() {
        return this.f34649b;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        if (this.f34651d && (i8 == 8 || i8 == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(i8);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z8) {
        this.f34651d = z8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3317c(Context context, InterfaceC2968b listener, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f34648a = listener;
        this.f34649b = new C3320f(this);
    }
}
