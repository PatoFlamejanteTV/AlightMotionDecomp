package e1;

import e1.C2783a;
import e1.C2785c;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2786d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC2786d f31549a = a().a();

    /* renamed from: e1.d$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC2786d a();

        public abstract a b(String str);

        public abstract a c(long j8);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C2785c.a aVar);

        public abstract a h(long j8);
    }

    public static a a() {
        return new C2783a.b().h(0L).g(C2785c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C2785c.a g();

    public abstract long h();

    public boolean i() {
        if (g() == C2785c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != C2785c.a.NOT_GENERATED && g() != C2785c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == C2785c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == C2785c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == C2785c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public abstract a n();

    public AbstractC2786d o(String str, long j8, long j9) {
        return n().b(str).c(j8).h(j9).a();
    }

    public AbstractC2786d p() {
        return n().b(null).a();
    }

    public AbstractC2786d q(String str) {
        return n().e(str).g(C2785c.a.REGISTER_ERROR).a();
    }

    public AbstractC2786d r() {
        return n().g(C2785c.a.NOT_GENERATED).a();
    }

    public AbstractC2786d s(String str, String str2, long j8, String str3, long j9) {
        return n().d(str).g(C2785c.a.REGISTERED).b(str3).f(str2).c(j9).h(j8).a();
    }

    public AbstractC2786d t(String str) {
        return n().d(str).g(C2785c.a.UNREGISTERED).a();
    }
}
