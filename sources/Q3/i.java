package Q3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import v3.C4127g;

/* loaded from: classes4.dex */
public interface i {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f8556a;

        /* renamed from: b, reason: collision with root package name */
        private final C4127g f8557b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f8558c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8559d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f8560e;

        public a(List paymentMethods, C4127g c4127g, boolean z8, boolean z9, boolean z10) {
            AbstractC3292y.i(paymentMethods, "paymentMethods");
            this.f8556a = paymentMethods;
            this.f8557b = c4127g;
            this.f8558c = z8;
            this.f8559d = z9;
            this.f8560e = z10;
        }

        public final boolean a() {
            return this.f8560e;
        }

        public final boolean b() {
            return this.f8559d;
        }

        public final C4127g c() {
            return this.f8557b;
        }

        public final List d() {
            return this.f8556a;
        }

        public final boolean e() {
            return this.f8558c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f8556a, aVar.f8556a) && AbstractC3292y.d(this.f8557b, aVar.f8557b) && this.f8558c == aVar.f8558c && this.f8559d == aVar.f8559d && this.f8560e == aVar.f8560e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f8556a.hashCode() * 31;
            C4127g c4127g = this.f8557b;
            if (c4127g == null) {
                hashCode = 0;
            } else {
                hashCode = c4127g.hashCode();
            }
            return ((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f8558c)) * 31) + androidx.compose.foundation.a.a(this.f8559d)) * 31) + androidx.compose.foundation.a.a(this.f8560e);
        }

        public String toString() {
            return "State(paymentMethods=" + this.f8556a + ", currentSelection=" + this.f8557b + ", isEditing=" + this.f8558c + ", canRemove=" + this.f8559d + ", canEdit=" + this.f8560e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4127g f8561a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4127g paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f8561a = paymentMethod;
            }

            public final C4127g a() {
                return this.f8561a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3292y.d(this.f8561a, ((a) obj).f8561a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8561a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f8561a + ")";
            }
        }

        /* renamed from: Q3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0178b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4127g f8562a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0178b(C4127g paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f8562a = paymentMethod;
            }

            public final C4127g a() {
                return this.f8562a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0178b) && AbstractC3292y.d(this.f8562a, ((C0178b) obj).f8562a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8562a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f8562a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4127g f8563a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C4127g paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f8563a = paymentMethod;
            }

            public final C4127g a() {
                return this.f8563a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3292y.d(this.f8563a, ((c) obj).f8563a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8563a.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.f8563a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8564a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1354134144;
            }

            public String toString() {
                return "ToggleEdit";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    void a(b bVar);

    boolean c();

    void close();

    InterfaceC3813L getState();
}
