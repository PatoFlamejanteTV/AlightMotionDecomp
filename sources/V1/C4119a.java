package v1;

import A1.c;
import A1.d;
import A1.f;
import A1.g;
import A1.h;
import A1.i;
import A1.j;
import A1.k;
import A1.l;
import A1.m;
import A1.n;
import A1.o;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y1.b;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4119a {

    /* renamed from: a, reason: collision with root package name */
    private Map f40422a = new HashMap();

    public C4119a() {
    }

    public void a(String str) {
        this.f40422a.clear();
        String[] split = str.split("~");
        d dVar = new d(split[0]);
        this.f40422a.put(d.f104f, dVar);
        List list = (List) dVar.c("SectionIds");
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (((Integer) list.get(i8)).equals(Integer.valueOf(h.f114d))) {
                this.f40422a.put(h.f116f, new h(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(g.f108d))) {
                this.f40422a.put(g.f110f, new g(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(o.f144b))) {
                this.f40422a.put(o.f146d, new o(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(i.f120d))) {
                this.f40422a.put(i.f122f, new i(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(l.f132d))) {
                this.f40422a.put(l.f134f, new l(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(n.f140d))) {
                this.f40422a.put(n.f142f, new n(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(j.f124d))) {
                this.f40422a.put(j.f126f, new j(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(m.f136d))) {
                this.f40422a.put(m.f138f, new m(split[i8 + 1]));
            } else if (((Integer) list.get(i8)).equals(Integer.valueOf(k.f128d))) {
                this.f40422a.put(k.f130f, new k(split[i8 + 1]));
            }
        }
    }

    public void b(int i8) {
        c((String) f.f107b.get(Integer.valueOf(i8)));
    }

    public void c(String str) {
        if (this.f40422a.containsKey(str)) {
            this.f40422a.remove(str);
        }
    }

    public String d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < f.f106a.size(); i8++) {
            String str = (String) f.f106a.get(i8);
            if (this.f40422a.containsKey(str)) {
                c cVar = (c) this.f40422a.get(str);
                arrayList.add(cVar.b());
                arrayList2.add(Integer.valueOf(cVar.getId()));
            }
        }
        d dVar = new d();
        try {
            dVar.a("SectionIds", h());
            arrayList.add(0, dVar.b());
            return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("~"));
        } catch (y1.c e8) {
            throw new b(e8);
        }
    }

    public d e() {
        d dVar = new d();
        try {
            dVar.a("SectionIds", h());
        } catch (y1.c unused) {
        }
        return dVar;
    }

    public c f(int i8) {
        return g((String) f.f107b.get(Integer.valueOf(i8)));
    }

    public c g(String str) {
        if (this.f40422a.containsKey(str)) {
            return (c) this.f40422a.get(str);
        }
        return null;
    }

    public List h() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < f.f106a.size(); i8++) {
            String str = (String) f.f106a.get(i8);
            if (this.f40422a.containsKey(str)) {
                arrayList.add(Integer.valueOf(((c) this.f40422a.get(str)).getId()));
            }
        }
        return arrayList;
    }

    public boolean i(int i8) {
        return j((String) f.f107b.get(Integer.valueOf(i8)));
    }

    public boolean j(String str) {
        return this.f40422a.containsKey(str);
    }

    public void k(String str, String str2, Object obj) {
        c cVar;
        if (!this.f40422a.containsKey(str)) {
            if (str.equals(g.f110f)) {
                cVar = new g();
                this.f40422a.put(g.f110f, cVar);
            } else if (str.equals(h.f116f)) {
                cVar = new h();
                this.f40422a.put(h.f116f, cVar);
            } else if (str.equals(o.f146d)) {
                cVar = new o();
                this.f40422a.put(o.f146d, cVar);
            } else if (str.equals(l.f134f)) {
                cVar = new l();
                this.f40422a.put(l.f134f, cVar);
            } else if (str.equals(i.f122f)) {
                cVar = new i();
                this.f40422a.put(i.f122f, cVar);
            } else if (str.equals(n.f142f)) {
                cVar = new n();
                this.f40422a.put(n.f142f, cVar);
            } else if (str.equals(j.f126f)) {
                cVar = new j();
                this.f40422a.put(j.f126f, cVar);
            } else if (str.equals(m.f138f)) {
                cVar = new m();
                this.f40422a.put(m.f138f, cVar);
            } else if (str.equals(k.f130f)) {
                cVar = new k();
                this.f40422a.put(k.f130f, cVar);
            } else {
                cVar = null;
            }
        } else {
            cVar = (c) this.f40422a.get(str);
        }
        if (cVar != null) {
            cVar.a(str2, obj);
            return;
        }
        throw new y1.c(str + "." + str2 + " not found");
    }

    public C4119a(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        a(str);
    }
}
