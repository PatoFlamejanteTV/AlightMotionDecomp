package R0;

import J0.AbstractC1253j;
import J0.C;
import J0.D;
import J0.E;
import J0.I;
import J0.a0;
import R0.g;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import q0.AbstractC3628n;
import q0.C3626l;
import q0.InterfaceC3625k;

/* loaded from: classes3.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9130a;

    /* renamed from: b, reason: collision with root package name */
    private final k f9131b;

    /* renamed from: c, reason: collision with root package name */
    private final h f9132c;

    /* renamed from: d, reason: collision with root package name */
    private final C f9133d;

    /* renamed from: e, reason: collision with root package name */
    private final R0.a f9134e;

    /* renamed from: f, reason: collision with root package name */
    private final l f9135f;

    /* renamed from: g, reason: collision with root package name */
    private final D f9136g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f9137h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f9138i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC3625k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K0.g f9139a;

        a(K0.g gVar) {
            this.f9139a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ JSONObject c() {
            return g.this.f9135f.a(g.this.f9131b, true);
        }

        @Override // q0.InterfaceC3625k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Task a(Void r52) {
            JSONObject jSONObject = (JSONObject) this.f9139a.f4557d.c().submit(new Callable() { // from class: R0.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONObject c8;
                    c8 = g.a.this.c();
                    return c8;
                }
            }).get();
            if (jSONObject != null) {
                d b9 = g.this.f9132c.b(jSONObject);
                g.this.f9134e.c(b9.f9114c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f9131b.f9147f);
                g.this.f9137h.set(b9);
                ((C3626l) g.this.f9138i.get()).e(b9);
            }
            return AbstractC3628n.e(null);
        }
    }

    g(Context context, k kVar, C c8, h hVar, R0.a aVar, l lVar, D d8) {
        AtomicReference atomicReference = new AtomicReference();
        this.f9137h = atomicReference;
        this.f9138i = new AtomicReference(new C3626l());
        this.f9130a = context;
        this.f9131b = kVar;
        this.f9133d = c8;
        this.f9132c = hVar;
        this.f9134e = aVar;
        this.f9135f = lVar;
        this.f9136g = d8;
        atomicReference.set(b.b(c8));
    }

    public static g l(Context context, String str, I i8, O0.b bVar, String str2, String str3, P0.g gVar, D d8) {
        String g8 = i8.g();
        a0 a0Var = new a0();
        return new g(context, new k(str, i8.h(), i8.i(), i8.j(), i8, AbstractC1253j.h(AbstractC1253j.m(context), str, str3, str2), str3, str2, E.b(g8).c()), a0Var, new h(a0Var), new R0.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), d8);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b9 = this.f9134e.b();
                if (b9 != null) {
                    d b10 = this.f9132c.b(b9);
                    if (b10 != null) {
                        q(b9, "Loaded cached settings: ");
                        long a9 = this.f9133d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b10.a(a9)) {
                            G0.g.f().i("Cached settings have expired.");
                        }
                        try {
                            G0.g.f().i("Returning cached settings.");
                            dVar = b10;
                        } catch (Exception e8) {
                            e = e8;
                            dVar = b10;
                            G0.g.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        G0.g.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    G0.g.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
        return dVar;
    }

    private String n() {
        return AbstractC1253j.q(this.f9130a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        G0.g.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = AbstractC1253j.q(this.f9130a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // R0.j
    public Task a() {
        return ((C3626l) this.f9138i.get()).a();
    }

    @Override // R0.j
    public d b() {
        return (d) this.f9137h.get();
    }

    boolean k() {
        return !n().equals(this.f9131b.f9147f);
    }

    public Task o(K0.g gVar) {
        return p(e.USE_CACHE, gVar);
    }

    public Task p(e eVar, K0.g gVar) {
        d m8;
        if (!k() && (m8 = m(eVar)) != null) {
            this.f9137h.set(m8);
            ((C3626l) this.f9138i.get()).e(m8);
            return AbstractC3628n.e(null);
        }
        d m9 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m9 != null) {
            this.f9137h.set(m9);
            ((C3626l) this.f9138i.get()).e(m9);
        }
        return this.f9136g.k().o(gVar.f4554a, new a(gVar));
    }
}
