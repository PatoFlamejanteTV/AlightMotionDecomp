package C1;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final k f702a;

    /* renamed from: b, reason: collision with root package name */
    private final k f703b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f704c;

    /* renamed from: d, reason: collision with root package name */
    private final f f705d;

    /* renamed from: e, reason: collision with root package name */
    private final i f706e;

    private c(f fVar, i iVar, k kVar, k kVar2, boolean z8) {
        this.f705d = fVar;
        this.f706e = iVar;
        this.f702a = kVar;
        if (kVar2 == null) {
            this.f703b = k.NONE;
        } else {
            this.f703b = kVar2;
        }
        this.f704c = z8;
    }

    public static c a(f fVar, i iVar, k kVar, k kVar2, boolean z8) {
        I1.g.d(fVar, "CreativeType is null");
        I1.g.d(iVar, "ImpressionType is null");
        I1.g.d(kVar, "Impression owner is null");
        I1.g.b(kVar, fVar, iVar);
        return new c(fVar, iVar, kVar, kVar2, z8);
    }

    public boolean b() {
        if (k.NATIVE == this.f702a) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (k.NATIVE == this.f703b) {
            return true;
        }
        return false;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, "impressionOwner", this.f702a);
        I1.c.i(jSONObject, "mediaEventsOwner", this.f703b);
        I1.c.i(jSONObject, "creativeType", this.f705d);
        I1.c.i(jSONObject, "impressionType", this.f706e);
        I1.c.i(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f704c));
        return jSONObject;
    }
}
