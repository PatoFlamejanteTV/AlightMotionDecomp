package O1;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class e implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f6953g = DesugarCollections.unmodifiableMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final a f6954a;

    /* renamed from: b, reason: collision with root package name */
    private final h f6955b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6956c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f6957d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f6958e;

    /* renamed from: f, reason: collision with root package name */
    private final d2.c f6959f;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(a aVar, h hVar, String str, Set set, Map map, d2.c cVar) {
        if (aVar != null) {
            this.f6954a = aVar;
            this.f6955b = hVar;
            this.f6956c = str;
            if (set != null) {
                this.f6957d = DesugarCollections.unmodifiableSet(new HashSet(set));
            } else {
                this.f6957d = null;
            }
            if (map != null) {
                this.f6958e = DesugarCollections.unmodifiableMap(new HashMap(map));
            } else {
                this.f6958e = f6953g;
            }
            this.f6959f = cVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    public static a g(Map map) {
        String h8 = d2.k.h(map, "alg");
        if (h8 != null) {
            a aVar = a.f6931c;
            if (h8.equals(aVar.a())) {
                return aVar;
            }
            if (map.containsKey("enc")) {
                return i.c(h8);
            }
            return p.c(h8);
        }
        throw new ParseException("Missing \"alg\" in header JSON object", 0);
    }

    public a a() {
        return this.f6954a;
    }

    public String b() {
        return this.f6956c;
    }

    public Set c() {
        return this.f6957d;
    }

    public Object d(String str) {
        return this.f6958e.get(str);
    }

    public Map e() {
        return this.f6958e;
    }

    public h f() {
        return this.f6955b;
    }

    public d2.c h() {
        d2.c cVar = this.f6959f;
        if (cVar == null) {
            return d2.c.d(toString());
        }
        return cVar;
    }

    public Map i() {
        Map l8 = d2.k.l();
        l8.putAll(this.f6958e);
        l8.put("alg", this.f6954a.toString());
        h hVar = this.f6955b;
        if (hVar != null) {
            l8.put("typ", hVar.toString());
        }
        String str = this.f6956c;
        if (str != null) {
            l8.put("cty", str);
        }
        Set set = this.f6957d;
        if (set != null && !set.isEmpty()) {
            l8.put("crit", new ArrayList(this.f6957d));
        }
        return l8;
    }

    public String toString() {
        return d2.k.o(i());
    }
}
