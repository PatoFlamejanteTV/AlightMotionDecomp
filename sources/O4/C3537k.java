package o4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3537k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3537k f35998a = new C3537k();

    /* renamed from: b, reason: collision with root package name */
    private static C3534h f35999b;

    /* renamed from: c, reason: collision with root package name */
    private static C3534h f36000c;

    /* renamed from: d, reason: collision with root package name */
    private static C3536j f36001d;

    /* renamed from: e, reason: collision with root package name */
    private static n f36002e;

    /* renamed from: f, reason: collision with root package name */
    private static C3529c f36003f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f36004g;

    static {
        C3538l c3538l = C3538l.f36005a;
        f35999b = c3538l.b();
        f36000c = c3538l.c();
        f36001d = c3538l.e();
        f36002e = c3538l.f();
        f36003f = c3538l.d();
        f36004g = 8;
    }

    private C3537k() {
    }

    public final C3534h a(boolean z8) {
        if (z8) {
            return f35999b;
        }
        return f36000c;
    }

    public final C3529c b() {
        return f36003f;
    }

    public final C3536j c() {
        return f36001d;
    }

    public final n d() {
        return f36002e;
    }

    public final void e(C3534h c3534h) {
        AbstractC3292y.i(c3534h, "<set-?>");
        f35999b = c3534h;
    }

    public final void f(C3534h c3534h) {
        AbstractC3292y.i(c3534h, "<set-?>");
        f36000c = c3534h;
    }

    public final void g(C3529c c3529c) {
        AbstractC3292y.i(c3529c, "<set-?>");
        f36003f = c3529c;
    }

    public final void h(C3536j c3536j) {
        AbstractC3292y.i(c3536j, "<set-?>");
        f36001d = c3536j;
    }

    public final void i(n nVar) {
        AbstractC3292y.i(nVar, "<set-?>");
        f36002e = nVar;
    }
}
