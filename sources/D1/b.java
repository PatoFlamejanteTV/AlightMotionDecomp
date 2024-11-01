package D1;

import C1.n;
import F1.h;
import I1.g;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final n f1220a;

    private b(n nVar) {
        this.f1220a = nVar;
    }

    private void e(float f8) {
        if (f8 > 0.0f) {
        } else {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void f(float f8) {
        if (f8 >= 0.0f && f8 <= 1.0f) {
        } else {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static b g(C1.b bVar) {
        n nVar = (n) bVar;
        g.d(bVar, "AdSession is null");
        g.k(nVar);
        g.h(nVar);
        g.g(nVar);
        g.m(nVar);
        b bVar2 = new b(nVar);
        nVar.w().g(bVar2);
        return bVar2;
    }

    public void a(a aVar) {
        g.d(aVar, "InteractionType is null");
        g.c(this.f1220a);
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, "interactionType", aVar);
        this.f1220a.w().k("adUserInteraction", jSONObject);
    }

    public void b() {
        g.c(this.f1220a);
        this.f1220a.w().i("bufferFinish");
    }

    public void c() {
        g.c(this.f1220a);
        this.f1220a.w().i("bufferStart");
    }

    public void d() {
        g.c(this.f1220a);
        this.f1220a.w().i(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void h() {
        g.c(this.f1220a);
        this.f1220a.w().i("firstQuartile");
    }

    public void i() {
        g.c(this.f1220a);
        this.f1220a.w().i(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void j() {
        g.c(this.f1220a);
        this.f1220a.w().i(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void k() {
        g.c(this.f1220a);
        this.f1220a.w().i(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void l() {
        g.c(this.f1220a);
        this.f1220a.w().i("skipped");
    }

    public void m(float f8, float f9) {
        e(f8);
        f(f9);
        g.c(this.f1220a);
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, TypedValues.TransitionType.S_DURATION, Float.valueOf(f8));
        I1.c.i(jSONObject, "mediaPlayerVolume", Float.valueOf(f9));
        I1.c.i(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
        this.f1220a.w().k("start", jSONObject);
    }

    public void n() {
        g.c(this.f1220a);
        this.f1220a.w().i("thirdQuartile");
    }

    public void o(float f8) {
        f(f8);
        g.c(this.f1220a);
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, "mediaPlayerVolume", Float.valueOf(f8));
        I1.c.i(jSONObject, "deviceVolume", Float.valueOf(h.d().c()));
        this.f1220a.w().k("volumeChange", jSONObject);
    }
}
