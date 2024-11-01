package X1;

import X1.j;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final g f10933h = new g(0);

    /* renamed from: i, reason: collision with root package name */
    public static final g f10934i = new g(-1);

    /* renamed from: j, reason: collision with root package name */
    public static final g f10935j = new g(2);

    /* renamed from: a, reason: collision with root package name */
    private boolean f10936a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10937b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10938c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10939d;

    /* renamed from: e, reason: collision with root package name */
    private j.g f10940e;

    /* renamed from: f, reason: collision with root package name */
    private j.g f10941f;

    /* renamed from: g, reason: collision with root package name */
    private j.h f10942g;

    public g(int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        j.g gVar;
        if ((i8 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10936a = z8;
        if ((i8 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f10938c = z9;
        if ((i8 & 2) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10937b = z10;
        this.f10939d = (i8 & 16) > 0;
        if ((i8 & 8) > 0) {
            gVar = j.f10949c;
        } else {
            gVar = j.f10947a;
        }
        if (z9) {
            this.f10941f = j.f10948b;
        } else {
            this.f10941f = gVar;
        }
        if (z8) {
            this.f10940e = j.f10948b;
        } else {
            this.f10940e = gVar;
        }
        if (z10) {
            this.f10942g = j.f10951e;
        } else {
            this.f10942g = j.f10950d;
        }
    }

    public void a(Appendable appendable) {
        appendable.append(',');
    }

    public void c(Appendable appendable) {
        appendable.append('[');
    }

    public void d(Appendable appendable) {
        appendable.append(']');
    }

    public void f(String str, Appendable appendable) {
        this.f10942g.a(str, appendable);
    }

    public boolean g() {
        return this.f10939d;
    }

    public boolean h(String str) {
        return this.f10940e.a(str);
    }

    public boolean i(String str) {
        return this.f10941f.a(str);
    }

    public void k(Appendable appendable) {
        appendable.append(':');
    }

    public void m(Appendable appendable) {
        appendable.append(',');
    }

    public void n(Appendable appendable) {
        appendable.append('{');
    }

    public void o(Appendable appendable) {
        appendable.append('}');
    }

    public void p(Appendable appendable, String str) {
        if (!i(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        i.a(str, appendable, this);
        appendable.append('\"');
    }

    public void b(Appendable appendable) {
    }

    public void e(Appendable appendable) {
    }

    public void j(Appendable appendable) {
    }

    public void l(Appendable appendable) {
    }
}
