package O1;

import d2.C2747a;
import j$.util.DesugarCollections;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class b extends e {

    /* renamed from: h, reason: collision with root package name */
    private final URI f6934h;

    /* renamed from: i, reason: collision with root package name */
    private final V1.d f6935i;

    /* renamed from: j, reason: collision with root package name */
    private final URI f6936j;

    /* renamed from: k, reason: collision with root package name */
    private final d2.c f6937k;

    /* renamed from: l, reason: collision with root package name */
    private final d2.c f6938l;

    /* renamed from: m, reason: collision with root package name */
    private final List f6939m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6940n;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar, h hVar, String str, Set set, URI uri, V1.d dVar, URI uri2, d2.c cVar, d2.c cVar2, List list, String str2, Map map, d2.c cVar3) {
        super(aVar, hVar, str, set, map, cVar3);
        this.f6934h = uri;
        this.f6935i = dVar;
        this.f6936j = uri2;
        this.f6937k = cVar;
        this.f6938l = cVar2;
        if (list != null) {
            this.f6939m = DesugarCollections.unmodifiableList(new ArrayList(list));
        } else {
            this.f6939m = null;
        }
        this.f6940n = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static V1.d r(Map map) {
        if (map == null) {
            return null;
        }
        V1.d m8 = V1.d.m(map);
        if (!m8.k()) {
            return m8;
        }
        throw new ParseException("Non-public key in jwk header parameter", 0);
    }

    @Override // O1.e
    public Map i() {
        Map i8 = super.i();
        URI uri = this.f6934h;
        if (uri != null) {
            i8.put("jku", uri.toString());
        }
        V1.d dVar = this.f6935i;
        if (dVar != null) {
            i8.put("jwk", dVar.n());
        }
        URI uri2 = this.f6936j;
        if (uri2 != null) {
            i8.put("x5u", uri2.toString());
        }
        d2.c cVar = this.f6937k;
        if (cVar != null) {
            i8.put("x5t", cVar.toString());
        }
        d2.c cVar2 = this.f6938l;
        if (cVar2 != null) {
            i8.put("x5t#S256", cVar2.toString());
        }
        List list = this.f6939m;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f6939m.size());
            Iterator it = this.f6939m.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2747a) it.next()).toString());
            }
            i8.put("x5c", arrayList);
        }
        String str = this.f6940n;
        if (str != null) {
            i8.put("kid", str);
        }
        return i8;
    }

    public V1.d j() {
        return this.f6935i;
    }

    public URI k() {
        return this.f6934h;
    }

    public String m() {
        return this.f6940n;
    }

    public List n() {
        return this.f6939m;
    }

    public d2.c o() {
        return this.f6938l;
    }

    public d2.c p() {
        return this.f6937k;
    }

    public URI q() {
        return this.f6936j;
    }
}
