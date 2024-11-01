package D6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1454a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1455b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1456c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1457d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1458e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1459f;

    /* renamed from: g, reason: collision with root package name */
    private String f1460g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1461h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1462i;

    /* renamed from: j, reason: collision with root package name */
    private String f1463j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1464k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1465l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1466m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1467n;

    /* renamed from: o, reason: collision with root package name */
    private F6.b f1468o;

    public d(a json) {
        AbstractC3292y.i(json, "json");
        this.f1454a = json.d().g();
        this.f1455b = json.d().h();
        this.f1456c = json.d().i();
        this.f1457d = json.d().o();
        this.f1458e = json.d().b();
        this.f1459f = json.d().k();
        this.f1460g = json.d().l();
        this.f1461h = json.d().e();
        this.f1462i = json.d().n();
        this.f1463j = json.d().d();
        this.f1464k = json.d().a();
        this.f1465l = json.d().m();
        json.d().j();
        this.f1466m = json.d().f();
        this.f1467n = json.d().c();
        this.f1468o = json.e();
    }

    public final f a() {
        if (this.f1462i && !AbstractC3292y.d(this.f1463j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f1459f) {
            if (!AbstractC3292y.d(this.f1460g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!AbstractC3292y.d(this.f1460g, "    ")) {
            String str = this.f1460g;
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f1460g).toString());
                }
            }
        }
        return new f(this.f1454a, this.f1456c, this.f1457d, this.f1458e, this.f1459f, this.f1455b, this.f1460g, this.f1461h, this.f1462i, this.f1463j, this.f1464k, this.f1465l, null, this.f1466m, this.f1467n);
    }

    public final F6.b b() {
        return this.f1468o;
    }

    public final void c(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.f1463j = str;
    }

    public final void d(boolean z8) {
        this.f1461h = z8;
    }

    public final void e(boolean z8) {
        this.f1454a = z8;
    }

    public final void f(boolean z8) {
        this.f1456c = z8;
    }
}
