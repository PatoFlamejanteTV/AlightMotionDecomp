package B2;

import kotlin.jvm.internal.AbstractC3284p;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;

/* loaded from: classes4.dex */
public final class r implements B {

    /* renamed from: b, reason: collision with root package name */
    private static final a f503b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f504a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ r(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
    }

    @Override // B2.B
    public long a(int i8, int i9) {
        return this.f504a;
    }

    @Override // B2.B
    public long b(int i8) {
        return C3374a.J(this.f504a, i8);
    }

    private r(long j8) {
        this.f504a = j8;
    }

    public r() {
        this(AbstractC3376c.t(3L, EnumC3377d.f35046e), null);
    }
}
