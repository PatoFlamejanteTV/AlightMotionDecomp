package H1;

import C1.d;
import C1.m;
import C1.n;
import F1.g;
import I1.f;
import android.os.Handler;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c extends H1.a {

    /* renamed from: f, reason: collision with root package name */
    private WebView f3188f;

    /* renamed from: g, reason: collision with root package name */
    private Long f3189g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map f3190h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3191i;

    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f3192a;

        a() {
            this.f3192a = c.this.f3188f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3192a.destroy();
        }
    }

    public c(Map map, String str) {
        this.f3190h = map;
        this.f3191i = str;
    }

    @Override // H1.a
    public void e(n nVar, d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map f8 = dVar.f();
        for (String str : f8.keySet()) {
            I1.c.i(jSONObject, str, ((m) f8.get(str)).f());
        }
        f(nVar, dVar, jSONObject);
    }

    @Override // H1.a
    public void o() {
        long convert;
        super.o();
        if (this.f3189g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f3189g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.f3188f = null;
    }

    @Override // H1.a
    public void w() {
        super.w();
        y();
    }

    void y() {
        WebView webView = new WebView(F1.f.c().a());
        this.f3188f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f3188f.getSettings().setAllowContentAccess(false);
        h(this.f3188f);
        g.a().p(this.f3188f, this.f3191i);
        for (String str : this.f3190h.keySet()) {
            g.a().e(this.f3188f, ((m) this.f3190h.get(str)).c().toExternalForm(), str);
        }
        this.f3189g = Long.valueOf(f.b());
    }
}
