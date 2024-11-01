package y3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v2.f;
import x2.k;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4244b extends Throwable {

    /* renamed from: y3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4244b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41166a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final String f41167b = null;

        private a() {
            super(null);
        }

        @Override // y3.AbstractC4244b
        public String a() {
            return "externalPaymentMethodError";
        }

        @Override // y3.AbstractC4244b
        public String b() {
            return f41167b;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* renamed from: y3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0942b extends AbstractC4244b {

        /* renamed from: a, reason: collision with root package name */
        private final int f41168a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41169b;

        public C0942b(int i8) {
            super(null);
            this.f41168a = i8;
            this.f41169b = String.valueOf(i8);
        }

        @Override // y3.AbstractC4244b
        public String a() {
            return "googlePay_" + b();
        }

        @Override // y3.AbstractC4244b
        public String b() {
            return this.f41169b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0942b) && this.f41168a == ((C0942b) obj).f41168a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f41168a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.f41168a + ")";
        }
    }

    /* renamed from: y3.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4244b {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f41170a;

        /* renamed from: b, reason: collision with root package name */
        private final k f41171b;

        /* renamed from: c, reason: collision with root package name */
        private final String f41172c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable cause) {
            super(0 == true ? 1 : 0);
            AbstractC3292y.i(cause, "cause");
            this.f41170a = cause;
            k b9 = k.f40948e.b(getCause());
            this.f41171b = b9;
            f d8 = b9.d();
            this.f41172c = d8 != null ? d8.o() : null;
        }

        @Override // y3.AbstractC4244b
        public String a() {
            return this.f41171b.a();
        }

        @Override // y3.AbstractC4244b
        public String b() {
            return this.f41172c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f41170a, ((c) obj).f41170a)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f41170a;
        }

        public int hashCode() {
            return this.f41170a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.f41170a + ")";
        }
    }

    public /* synthetic */ AbstractC4244b(AbstractC3284p abstractC3284p) {
        this();
    }

    public abstract String a();

    public abstract String b();

    private AbstractC4244b() {
    }
}
