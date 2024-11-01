package K6;

import K6.q;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final x f5174a;

    /* renamed from: b, reason: collision with root package name */
    final v f5175b;

    /* renamed from: c, reason: collision with root package name */
    final int f5176c;

    /* renamed from: d, reason: collision with root package name */
    final String f5177d;

    /* renamed from: e, reason: collision with root package name */
    final p f5178e;

    /* renamed from: f, reason: collision with root package name */
    final q f5179f;

    /* renamed from: g, reason: collision with root package name */
    final A f5180g;

    /* renamed from: h, reason: collision with root package name */
    final z f5181h;

    /* renamed from: i, reason: collision with root package name */
    final z f5182i;

    /* renamed from: j, reason: collision with root package name */
    final z f5183j;

    /* renamed from: k, reason: collision with root package name */
    final long f5184k;

    /* renamed from: l, reason: collision with root package name */
    final long f5185l;

    /* renamed from: m, reason: collision with root package name */
    private volatile d f5186m;

    z(a aVar) {
        this.f5174a = aVar.f5187a;
        this.f5175b = aVar.f5188b;
        this.f5176c = aVar.f5189c;
        this.f5177d = aVar.f5190d;
        this.f5178e = aVar.f5191e;
        this.f5179f = aVar.f5192f.d();
        this.f5180g = aVar.f5193g;
        this.f5181h = aVar.f5194h;
        this.f5182i = aVar.f5195i;
        this.f5183j = aVar.f5196j;
        this.f5184k = aVar.f5197k;
        this.f5185l = aVar.f5198l;
    }

    public long B() {
        return this.f5185l;
    }

    public x E() {
        return this.f5174a;
    }

    public long F() {
        return this.f5184k;
    }

    public A a() {
        return this.f5180g;
    }

    public d b() {
        d dVar = this.f5186m;
        if (dVar == null) {
            d l8 = d.l(this.f5179f);
            this.f5186m = l8;
            return l8;
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A a9 = this.f5180g;
        if (a9 != null) {
            a9.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public z g() {
        return this.f5182i;
    }

    public int h() {
        return this.f5176c;
    }

    public p i() {
        return this.f5178e;
    }

    public String j(String str) {
        return k(str, null);
    }

    public String k(String str, String str2) {
        String a9 = this.f5179f.a(str);
        if (a9 != null) {
            return a9;
        }
        return str2;
    }

    public q p() {
        return this.f5179f;
    }

    public boolean q() {
        int i8 = this.f5176c;
        if (i8 >= 200 && i8 < 300) {
            return true;
        }
        return false;
    }

    public String r() {
        return this.f5177d;
    }

    public z t() {
        return this.f5181h;
    }

    public String toString() {
        return "Response{protocol=" + this.f5175b + ", code=" + this.f5176c + ", message=" + this.f5177d + ", url=" + this.f5174a.i() + '}';
    }

    public a u() {
        return new a(this);
    }

    public z v() {
        return this.f5183j;
    }

    public v z() {
        return this.f5175b;
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        x f5187a;

        /* renamed from: b, reason: collision with root package name */
        v f5188b;

        /* renamed from: c, reason: collision with root package name */
        int f5189c;

        /* renamed from: d, reason: collision with root package name */
        String f5190d;

        /* renamed from: e, reason: collision with root package name */
        p f5191e;

        /* renamed from: f, reason: collision with root package name */
        q.a f5192f;

        /* renamed from: g, reason: collision with root package name */
        A f5193g;

        /* renamed from: h, reason: collision with root package name */
        z f5194h;

        /* renamed from: i, reason: collision with root package name */
        z f5195i;

        /* renamed from: j, reason: collision with root package name */
        z f5196j;

        /* renamed from: k, reason: collision with root package name */
        long f5197k;

        /* renamed from: l, reason: collision with root package name */
        long f5198l;

        public a() {
            this.f5189c = -1;
            this.f5192f = new q.a();
        }

        private void e(z zVar) {
            if (zVar.f5180g == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, z zVar) {
            if (zVar.f5180g == null) {
                if (zVar.f5181h == null) {
                    if (zVar.f5182i == null) {
                        if (zVar.f5183j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(String str, String str2) {
            this.f5192f.a(str, str2);
            return this;
        }

        public a b(A a9) {
            this.f5193g = a9;
            return this;
        }

        public z c() {
            if (this.f5187a != null) {
                if (this.f5188b != null) {
                    if (this.f5189c >= 0) {
                        if (this.f5190d != null) {
                            return new z(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f5189c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public a d(z zVar) {
            if (zVar != null) {
                f("cacheResponse", zVar);
            }
            this.f5195i = zVar;
            return this;
        }

        public a g(int i8) {
            this.f5189c = i8;
            return this;
        }

        public a h(p pVar) {
            this.f5191e = pVar;
            return this;
        }

        public a i(q qVar) {
            this.f5192f = qVar.d();
            return this;
        }

        public a j(String str) {
            this.f5190d = str;
            return this;
        }

        public a k(z zVar) {
            if (zVar != null) {
                f("networkResponse", zVar);
            }
            this.f5194h = zVar;
            return this;
        }

        public a l(z zVar) {
            if (zVar != null) {
                e(zVar);
            }
            this.f5196j = zVar;
            return this;
        }

        public a m(v vVar) {
            this.f5188b = vVar;
            return this;
        }

        public a n(long j8) {
            this.f5198l = j8;
            return this;
        }

        public a o(x xVar) {
            this.f5187a = xVar;
            return this;
        }

        public a p(long j8) {
            this.f5197k = j8;
            return this;
        }

        a(z zVar) {
            this.f5189c = -1;
            this.f5187a = zVar.f5174a;
            this.f5188b = zVar.f5175b;
            this.f5189c = zVar.f5176c;
            this.f5190d = zVar.f5177d;
            this.f5191e = zVar.f5178e;
            this.f5192f = zVar.f5179f.d();
            this.f5193g = zVar.f5180g;
            this.f5194h = zVar.f5181h;
            this.f5195i = zVar.f5182i;
            this.f5196j = zVar.f5183j;
            this.f5197k = zVar.f5184k;
            this.f5198l = zVar.f5185l;
        }
    }
}
