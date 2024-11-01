package f1;

import f1.C2842b;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2846f {

    /* renamed from: f1.f$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC2846f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j8);
    }

    /* renamed from: f1.f$b */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C2842b.C0732b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
