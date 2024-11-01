package H1;

import C1.d;
import C1.m;
import C1.n;
import F1.g;
import I1.f;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private L1.b f3179a;

    /* renamed from: b, reason: collision with root package name */
    private C1.a f3180b;

    /* renamed from: c, reason: collision with root package name */
    private D1.b f3181c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0061a f3182d;

    /* renamed from: e, reason: collision with root package name */
    private long f3183e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0061a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a() {
        a();
        this.f3179a = new L1.b(null);
    }

    public void a() {
        this.f3183e = f.b();
        this.f3182d = EnumC0061a.AD_STATE_IDLE;
    }

    public void b(float f8) {
        g.a().c(v(), f8);
    }

    public void c(C1.a aVar) {
        this.f3180b = aVar;
    }

    public void d(C1.c cVar) {
        g.a().j(v(), cVar.d());
    }

    public void e(n nVar, d dVar) {
        f(nVar, dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(n nVar, d dVar, JSONObject jSONObject) {
        String v8 = nVar.v();
        JSONObject jSONObject2 = new JSONObject();
        I1.c.i(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        I1.c.i(jSONObject2, "adSessionType", dVar.c());
        I1.c.i(jSONObject2, "deviceInfo", I1.b.d());
        I1.c.i(jSONObject2, "deviceCategory", I1.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        I1.c.i(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        I1.c.i(jSONObject3, "partnerName", dVar.h().b());
        I1.c.i(jSONObject3, "partnerVersion", dVar.h().c());
        I1.c.i(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        I1.c.i(jSONObject4, "libraryVersion", "1.4.2-Mmadbridge");
        I1.c.i(jSONObject4, "appId", F1.f.c().a().getApplicationContext().getPackageName());
        I1.c.i(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (dVar.d() != null) {
            I1.c.i(jSONObject2, "contentUrl", dVar.d());
        }
        if (dVar.e() != null) {
            I1.c.i(jSONObject2, "customReferenceData", dVar.e());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (m mVar : dVar.i()) {
            I1.c.i(jSONObject5, mVar.d(), mVar.e());
        }
        g.a().g(v(), v8, jSONObject2, jSONObject5, jSONObject);
    }

    public void g(D1.b bVar) {
        this.f3181c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(WebView webView) {
        this.f3179a = new L1.b(webView);
    }

    public void i(String str) {
        g.a().f(v(), str, null);
    }

    public void j(String str, long j8) {
        if (j8 >= this.f3183e) {
            EnumC0061a enumC0061a = this.f3182d;
            EnumC0061a enumC0061a2 = EnumC0061a.AD_STATE_NOTVISIBLE;
            if (enumC0061a != enumC0061a2) {
                this.f3182d = enumC0061a2;
                g.a().d(v(), str);
            }
        }
    }

    public void k(String str, JSONObject jSONObject) {
        g.a().f(v(), str, jSONObject);
    }

    public void l(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(date.getTime()));
        g.a().o(v(), jSONObject);
    }

    public void m(JSONObject jSONObject) {
        g.a().n(v(), jSONObject);
    }

    public void n(boolean z8) {
        String str;
        if (s()) {
            if (z8) {
                str = "foregrounded";
            } else {
                str = "backgrounded";
            }
            g.a().m(v(), str);
        }
    }

    public void o() {
        this.f3179a.clear();
    }

    public void p(String str, long j8) {
        if (j8 >= this.f3183e) {
            this.f3182d = EnumC0061a.AD_STATE_VISIBLE;
            g.a().d(v(), str);
        }
    }

    public C1.a q() {
        return this.f3180b;
    }

    public D1.b r() {
        return this.f3181c;
    }

    public boolean s() {
        if (this.f3179a.get() != 0) {
            return true;
        }
        return false;
    }

    public void t() {
        g.a().b(v());
    }

    public void u() {
        g.a().l(v());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebView v() {
        return (WebView) this.f3179a.get();
    }

    public void w() {
    }
}
