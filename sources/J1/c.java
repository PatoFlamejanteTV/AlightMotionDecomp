package J1;

import K1.b;
import K1.e;
import K1.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements b.InterfaceC0080b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f4033a;

    /* renamed from: b, reason: collision with root package name */
    private final K1.c f4034b;

    public c(K1.c cVar) {
        this.f4034b = cVar;
    }

    @Override // K1.b.InterfaceC0080b
    public JSONObject a() {
        return this.f4033a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f4034b.c(new e(this, hashSet, jSONObject, j8));
    }

    public void c() {
        this.f4034b.c(new K1.d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f4034b.c(new f(this, hashSet, jSONObject, j8));
    }

    @Override // K1.b.InterfaceC0080b
    public void a(JSONObject jSONObject) {
        this.f4033a = jSONObject;
    }
}
