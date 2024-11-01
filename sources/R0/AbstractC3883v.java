package r0;

import O.a;
import Q.AbstractC1394n;
import android.accounts.Account;
import android.content.Context;
import i0.C2963b;
import java.util.Locale;

/* renamed from: r0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3883v {

    /* renamed from: a, reason: collision with root package name */
    public static final O.a f37773a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.g f37774b;

    /* renamed from: c, reason: collision with root package name */
    private static final a.AbstractC0132a f37775c;

    /* renamed from: d, reason: collision with root package name */
    public static final u0.i f37776d;

    /* renamed from: e, reason: collision with root package name */
    public static final i0.r f37777e;

    /* renamed from: f, reason: collision with root package name */
    public static final i0.w f37778f;

    /* renamed from: r0.v$a */
    /* loaded from: classes3.dex */
    public static final class a implements a.d.InterfaceC0133a {

        /* renamed from: a, reason: collision with root package name */
        public final int f37779a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37780b;

        /* renamed from: c, reason: collision with root package name */
        public final Account f37781c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f37782d;

        /* renamed from: r0.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0841a {

            /* renamed from: a, reason: collision with root package name */
            private int f37783a = 3;

            /* renamed from: b, reason: collision with root package name */
            private int f37784b = 1;

            /* renamed from: c, reason: collision with root package name */
            private boolean f37785c = true;

            public a a() {
                return new a(this);
            }

            public C0841a b(int i8) {
                if (i8 != 0) {
                    if (i8 != 0) {
                        if (i8 != 2 && i8 != 1 && i8 != 23 && i8 != 3) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i8)));
                        }
                    } else {
                        i8 = 0;
                    }
                }
                this.f37783a = i8;
                return this;
            }
        }

        private a(C0841a c0841a) {
            this.f37779a = c0841a.f37783a;
            this.f37780b = c0841a.f37784b;
            this.f37782d = c0841a.f37785c;
            this.f37781c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC1394n.a(Integer.valueOf(this.f37779a), Integer.valueOf(aVar.f37779a)) && AbstractC1394n.a(Integer.valueOf(this.f37780b), Integer.valueOf(aVar.f37780b)) && AbstractC1394n.a(null, null) && AbstractC1394n.a(Boolean.valueOf(this.f37782d), Boolean.valueOf(aVar.f37782d))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1394n.b(Integer.valueOf(this.f37779a), Integer.valueOf(this.f37780b), null, Boolean.valueOf(this.f37782d));
        }

        @Override // O.a.d.InterfaceC0133a
        public Account l() {
            return null;
        }
    }

    static {
        a.g gVar = new a.g();
        f37774b = gVar;
        C3858I c3858i = new C3858I();
        f37775c = c3858i;
        f37773a = new O.a("Wallet.API", c3858i, gVar);
        f37777e = new i0.r();
        f37776d = new C2963b();
        f37778f = new i0.w();
    }

    public static C3875m a(Context context, a aVar) {
        return new C3875m(context, aVar);
    }
}
