package l2;

import R5.AbstractC1435t;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i2.InterfaceC2969c;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3320f implements h2.e {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f34657a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f34658b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f34659c;

    public C3320f(WebView webView) {
        AbstractC3292y.i(webView, "webView");
        this.f34657a = webView;
        this.f34658b = new Handler(Looper.getMainLooper());
        this.f34659c = new LinkedHashSet();
    }

    private final void i(final WebView webView, final String str, Object... objArr) {
        String obj;
        final ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            if (obj2 instanceof String) {
                StringBuilder sb = new StringBuilder();
                sb.append('\'');
                sb.append(obj2);
                sb.append('\'');
                obj = sb.toString();
            } else {
                obj = obj2.toString();
            }
            arrayList.add(obj);
        }
        this.f34658b.post(new Runnable() { // from class: l2.e
            @Override // java.lang.Runnable
            public final void run() {
                C3320f.j(webView, str, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WebView this_invoke, String function, List stringArgs) {
        AbstractC3292y.i(this_invoke, "$this_invoke");
        AbstractC3292y.i(function, "$function");
        AbstractC3292y.i(stringArgs, "$stringArgs");
        this_invoke.loadUrl("javascript:" + function + '(' + AbstractC1435t.w0(stringArgs, ",", null, null, 0, null, null, 62, null) + ')');
    }

    @Override // h2.e
    public void a() {
        i(this.f34657a, "toggleFullscreen", new Object[0]);
    }

    @Override // h2.e
    public void b(String videoId, float f8) {
        AbstractC3292y.i(videoId, "videoId");
        i(this.f34657a, "cueVideo", videoId, Float.valueOf(f8));
    }

    @Override // h2.e
    public boolean c(InterfaceC2969c listener) {
        AbstractC3292y.i(listener, "listener");
        return this.f34659c.remove(listener);
    }

    @Override // h2.e
    public void d(String videoId, float f8) {
        AbstractC3292y.i(videoId, "videoId");
        i(this.f34657a, "loadVideo", videoId, Float.valueOf(f8));
    }

    @Override // h2.e
    public void e() {
        i(this.f34657a, CampaignEx.JSON_NATIVE_VIDEO_MUTE, new Object[0]);
    }

    @Override // h2.e
    public boolean f(InterfaceC2969c listener) {
        AbstractC3292y.i(listener, "listener");
        return this.f34659c.add(listener);
    }

    public final Set h() {
        return this.f34659c;
    }

    public final void k() {
        this.f34659c.clear();
        this.f34658b.removeCallbacksAndMessages(null);
    }

    @Override // h2.e
    public void pause() {
        i(this.f34657a, "pauseVideo", new Object[0]);
    }

    @Override // h2.e
    public void play() {
        i(this.f34657a, "playVideo", new Object[0]);
    }
}
