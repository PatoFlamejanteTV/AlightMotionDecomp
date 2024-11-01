package K6;

import K6.q;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.List;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    final r f5160a;

    /* renamed from: b, reason: collision with root package name */
    final String f5161b;

    /* renamed from: c, reason: collision with root package name */
    final q f5162c;

    /* renamed from: d, reason: collision with root package name */
    final y f5163d;

    /* renamed from: e, reason: collision with root package name */
    final Object f5164e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f5165f;

    x(a aVar) {
        this.f5160a = aVar.f5166a;
        this.f5161b = aVar.f5167b;
        this.f5162c = aVar.f5168c.d();
        this.f5163d = aVar.f5169d;
        Object obj = aVar.f5170e;
        this.f5164e = obj == null ? this : obj;
    }

    public y a() {
        return this.f5163d;
    }

    public d b() {
        d dVar = this.f5165f;
        if (dVar == null) {
            d l8 = d.l(this.f5162c);
            this.f5165f = l8;
            return l8;
        }
        return dVar;
    }

    public String c(String str) {
        return this.f5162c.a(str);
    }

    public q d() {
        return this.f5162c;
    }

    public List e(String str) {
        return this.f5162c.g(str);
    }

    public boolean f() {
        return this.f5160a.l();
    }

    public String g() {
        return this.f5161b;
    }

    public a h() {
        return new a(this);
    }

    public r i() {
        return this.f5160a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f5161b);
        sb.append(", url=");
        sb.append(this.f5160a);
        sb.append(", tag=");
        Object obj = this.f5164e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        r f5166a;

        /* renamed from: b, reason: collision with root package name */
        String f5167b;

        /* renamed from: c, reason: collision with root package name */
        q.a f5168c;

        /* renamed from: d, reason: collision with root package name */
        y f5169d;

        /* renamed from: e, reason: collision with root package name */
        Object f5170e;

        public a() {
            this.f5167b = ShareTarget.METHOD_GET;
            this.f5168c = new q.a();
        }

        public x a() {
            if (this.f5166a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return f("Cache-Control");
            }
            return c("Cache-Control", dVar2);
        }

        public a c(String str, String str2) {
            this.f5168c.h(str, str2);
            return this;
        }

        public a d(q qVar) {
            this.f5168c = qVar.d();
            return this;
        }

        public a e(String str, y yVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (yVar != null && !O6.f.b(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (yVar == null && O6.f.e(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f5167b = str;
                    this.f5169d = yVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public a f(String str) {
            this.f5168c.g(str);
            return this;
        }

        public a g(r rVar) {
            if (rVar != null) {
                this.f5166a = rVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a h(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                r p8 = r.p(str);
                if (p8 != null) {
                    return g(p8);
                }
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            throw new NullPointerException("url == null");
        }

        a(x xVar) {
            this.f5166a = xVar.f5160a;
            this.f5167b = xVar.f5161b;
            this.f5169d = xVar.f5163d;
            this.f5170e = xVar.f5164e;
            this.f5168c = xVar.f5162c.d();
        }
    }
}
