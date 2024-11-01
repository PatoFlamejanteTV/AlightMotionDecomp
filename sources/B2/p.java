package B2;

import kotlin.jvm.internal.AbstractC3284p;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;

/* loaded from: classes4.dex */
public final class p implements B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f501b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f502a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ p(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
    }

    @Override // B2.B
    public long a(int i8, int i9) {
        int k8 = (i8 - i6.m.k(i9, 1, i8)) + 1;
        long j8 = this.f502a;
        EnumC3377d enumC3377d = EnumC3377d.f35046e;
        return AbstractC3376c.r(Math.pow(C3374a.K(j8, enumC3377d), k8), enumC3377d);
    }

    @Override // B2.B
    public long b(int i8) {
        C3374a.C0804a c0804a = C3374a.f35036b;
        long s8 = AbstractC3376c.s(0, EnumC3377d.f35046e);
        for (int i9 = i8; i9 > 0; i9--) {
            s8 = C3374a.I(s8, a(i8, i9));
        }
        return s8;
    }

    private p(long j8) {
        this.f502a = j8;
    }

    public p() {
        this(AbstractC3376c.t(2L, EnumC3377d.f35046e), null);
    }
}
