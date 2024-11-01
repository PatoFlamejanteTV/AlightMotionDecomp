package F1;

import C1.n;
import F1.d;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class h implements d.a, E1.c {

    /* renamed from: f, reason: collision with root package name */
    private static h f2122f;

    /* renamed from: a, reason: collision with root package name */
    private float f2123a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final E1.e f2124b;

    /* renamed from: c, reason: collision with root package name */
    private final E1.b f2125c;

    /* renamed from: d, reason: collision with root package name */
    private E1.d f2126d;

    /* renamed from: e, reason: collision with root package name */
    private c f2127e;

    public h(E1.e eVar, E1.b bVar) {
        this.f2124b = eVar;
        this.f2125c = bVar;
    }

    private c a() {
        if (this.f2127e == null) {
            this.f2127e = c.e();
        }
        return this.f2127e;
    }

    public static h d() {
        if (f2122f == null) {
            f2122f = new h(new E1.e(), new E1.b());
        }
        return f2122f;
    }

    public void b(Context context) {
        this.f2126d = this.f2124b.a(new Handler(), context, this.f2125c.a(), this);
    }

    public float c() {
        return this.f2123a;
    }

    public void e() {
        b.k().a(this);
        b.k().i();
        J1.a.p().q();
        this.f2126d.d();
    }

    public void f() {
        J1.a.p().s();
        b.k().j();
        this.f2126d.e();
    }

    @Override // E1.c
    public void a(float f8) {
        this.f2123a = f8;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((n) it.next()).w().b(f8);
        }
    }

    @Override // F1.d.a
    public void a(boolean z8) {
        if (z8) {
            J1.a.p().q();
        } else {
            J1.a.p().o();
        }
    }
}
