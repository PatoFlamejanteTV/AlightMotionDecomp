package C1;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class n extends b {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f760k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final d f761a;

    /* renamed from: b, reason: collision with root package name */
    private final c f762b;

    /* renamed from: d, reason: collision with root package name */
    private L1.a f764d;

    /* renamed from: e, reason: collision with root package name */
    private H1.a f765e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f769i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f770j;

    /* renamed from: c, reason: collision with root package name */
    private final List f763c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f766f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f767g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f768h = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(c cVar, d dVar) {
        H1.a bVar;
        this.f762b = cVar;
        this.f761a = dVar;
        r(null);
        if (dVar.c() != e.HTML && dVar.c() != e.JAVASCRIPT) {
            bVar = new H1.c(dVar.f(), dVar.g());
        } else {
            bVar = new H1.b(dVar.j());
        }
        this.f765e = bVar;
        this.f765e.w();
        F1.c.e().b(this);
        this.f765e.d(cVar);
    }

    private void h() {
        if (!this.f769i) {
        } else {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void i(View view) {
        if (view != null) {
        } else {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void j(String str) {
        if (str != null) {
            if (str.length() <= 50) {
                if (!f760k.matcher(str).matches()) {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        }
    }

    private F1.e m(View view) {
        for (F1.e eVar : this.f763c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void n() {
        if (!this.f770j) {
        } else {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void p(View view) {
        Collection<n> c8 = F1.c.e().c();
        if (c8 != null && !c8.isEmpty()) {
            for (n nVar : c8) {
                if (nVar != this && nVar.o() == view) {
                    nVar.f764d.clear();
                }
            }
        }
    }

    private void r(View view) {
        this.f764d = new L1.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        h();
        w().u();
        this.f769i = true;
    }

    @Override // C1.b
    public void a(View view, h hVar, String str) {
        if (this.f767g) {
            return;
        }
        i(view);
        j(str);
        if (m(view) == null) {
            this.f763c.add(new F1.e(view, hVar, str));
        }
    }

    @Override // C1.b
    public void c() {
        if (this.f767g) {
            return;
        }
        this.f764d.clear();
        e();
        this.f767g = true;
        w().t();
        F1.c.e().d(this);
        w().o();
        this.f765e = null;
    }

    @Override // C1.b
    public void d(View view) {
        if (this.f767g) {
            return;
        }
        I1.g.d(view, "AdView is null");
        if (o() == view) {
            return;
        }
        r(view);
        w().a();
        p(view);
    }

    @Override // C1.b
    public void e() {
        if (this.f767g) {
            return;
        }
        this.f763c.clear();
    }

    @Override // C1.b
    public void f(View view) {
        if (this.f767g) {
            return;
        }
        i(view);
        F1.e m8 = m(view);
        if (m8 != null) {
            this.f763c.remove(m8);
        }
    }

    @Override // C1.b
    public void g() {
        if (this.f766f) {
            return;
        }
        this.f766f = true;
        F1.c.e().f(this);
        this.f765e.b(F1.h.d().c());
        this.f765e.l(F1.a.a().c());
        this.f765e.e(this, this.f761a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(List list) {
        if (s()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((L1.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(JSONObject jSONObject) {
        n();
        w().m(jSONObject);
        this.f770j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o() {
        return (View) this.f764d.get();
    }

    public List q() {
        return this.f763c;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        if (this.f766f && !this.f767g) {
            return true;
        }
        return false;
    }

    public boolean u() {
        return this.f767g;
    }

    public String v() {
        return this.f768h;
    }

    public H1.a w() {
        return this.f765e;
    }

    public boolean x() {
        return this.f762b.b();
    }

    public boolean y() {
        return this.f762b.c();
    }

    public boolean z() {
        return this.f766f;
    }
}
