package u;

import s.AbstractC3937d;
import s.C3936c;
import u.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class o {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(C3936c c3936c);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(AbstractC3937d abstractC3937d);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(s.h hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C3936c b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3937d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract s.h e();

    public abstract p f();

    public abstract String g();
}
