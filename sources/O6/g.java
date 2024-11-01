package O6;

import K6.o;
import K6.s;
import K6.x;
import K6.z;
import java.util.List;

/* loaded from: classes5.dex */
public final class g implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f7886a;

    /* renamed from: b, reason: collision with root package name */
    private final N6.g f7887b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7888c;

    /* renamed from: d, reason: collision with root package name */
    private final N6.c f7889d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7890e;

    /* renamed from: f, reason: collision with root package name */
    private final x f7891f;

    /* renamed from: g, reason: collision with root package name */
    private final K6.e f7892g;

    /* renamed from: h, reason: collision with root package name */
    private final o f7893h;

    /* renamed from: i, reason: collision with root package name */
    private final int f7894i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7895j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7896k;

    /* renamed from: l, reason: collision with root package name */
    private int f7897l;

    public g(List list, N6.g gVar, c cVar, N6.c cVar2, int i8, x xVar, K6.e eVar, o oVar, int i9, int i10, int i11) {
        this.f7886a = list;
        this.f7889d = cVar2;
        this.f7887b = gVar;
        this.f7888c = cVar;
        this.f7890e = i8;
        this.f7891f = xVar;
        this.f7892g = eVar;
        this.f7893h = oVar;
        this.f7894i = i9;
        this.f7895j = i10;
        this.f7896k = i11;
    }

    @Override // K6.s.a
    public z a(x xVar) {
        return f(xVar, this.f7887b, this.f7888c, this.f7889d);
    }

    public K6.e b() {
        return this.f7892g;
    }

    public K6.h c() {
        return this.f7889d;
    }

    @Override // K6.s.a
    public int connectTimeoutMillis() {
        return this.f7894i;
    }

    public o d() {
        return this.f7893h;
    }

    public c e() {
        return this.f7888c;
    }

    public z f(x xVar, N6.g gVar, c cVar, N6.c cVar2) {
        if (this.f7890e < this.f7886a.size()) {
            this.f7897l++;
            if (this.f7888c != null && !this.f7889d.r(xVar.i())) {
                throw new IllegalStateException("network interceptor " + this.f7886a.get(this.f7890e - 1) + " must retain the same host and port");
            }
            if (this.f7888c != null && this.f7897l > 1) {
                throw new IllegalStateException("network interceptor " + this.f7886a.get(this.f7890e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f7886a, gVar, cVar, cVar2, this.f7890e + 1, xVar, this.f7892g, this.f7893h, this.f7894i, this.f7895j, this.f7896k);
            s sVar = (s) this.f7886a.get(this.f7890e);
            z a9 = sVar.a(gVar2);
            if (cVar != null && this.f7890e + 1 < this.f7886a.size() && gVar2.f7897l != 1) {
                throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
            }
            if (a9 != null) {
                if (a9.a() != null) {
                    return a9;
                }
                throw new IllegalStateException("interceptor " + sVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new AssertionError();
    }

    public N6.g g() {
        return this.f7887b;
    }

    @Override // K6.s.a
    public int readTimeoutMillis() {
        return this.f7895j;
    }

    @Override // K6.s.a
    public x request() {
        return this.f7891f;
    }

    @Override // K6.s.a
    public int writeTimeoutMillis() {
        return this.f7896k;
    }
}
