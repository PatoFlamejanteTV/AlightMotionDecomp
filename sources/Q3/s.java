package Q3;

import b3.C1969a;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public interface s {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f8712a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8713b;

        /* renamed from: c, reason: collision with root package name */
        private final G3.d f8714c;

        /* renamed from: d, reason: collision with root package name */
        private final F3.a f8715d;

        /* renamed from: e, reason: collision with root package name */
        private final List f8716e;

        /* renamed from: f, reason: collision with root package name */
        private final C1969a f8717f;

        public a(String selectedPaymentMethodCode, boolean z8, G3.d usBankAccountFormArguments, F3.a formArguments, List formElements, C1969a c1969a) {
            AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3292y.i(formArguments, "formArguments");
            AbstractC3292y.i(formElements, "formElements");
            this.f8712a = selectedPaymentMethodCode;
            this.f8713b = z8;
            this.f8714c = usBankAccountFormArguments;
            this.f8715d = formArguments;
            this.f8716e = formElements;
            this.f8717f = c1969a;
        }

        public final F3.a a() {
            return this.f8715d;
        }

        public final List b() {
            return this.f8716e;
        }

        public final C1969a c() {
            return this.f8717f;
        }

        public final String d() {
            return this.f8712a;
        }

        public final G3.d e() {
            return this.f8714c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f8712a, aVar.f8712a) && this.f8713b == aVar.f8713b && AbstractC3292y.d(this.f8714c, aVar.f8714c) && AbstractC3292y.d(this.f8715d, aVar.f8715d) && AbstractC3292y.d(this.f8716e, aVar.f8716e) && AbstractC3292y.d(this.f8717f, aVar.f8717f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f8713b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.f8712a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8713b)) * 31) + this.f8714c.hashCode()) * 31) + this.f8715d.hashCode()) * 31) + this.f8716e.hashCode()) * 31;
            C1969a c1969a = this.f8717f;
            if (c1969a == null) {
                hashCode = 0;
            } else {
                hashCode = c1969a.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f8712a + ", isProcessing=" + this.f8713b + ", usBankAccountFormArguments=" + this.f8714c + ", formArguments=" + this.f8715d + ", formElements=" + this.f8716e + ", headerInformation=" + this.f8717f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8718a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1206182106;
            }

            public String toString() {
                return "FieldInteraction";
            }
        }

        /* renamed from: Q3.s$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0181b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final B3.c f8719a;

            public C0181b(B3.c cVar) {
                this.f8719a = cVar;
            }

            public final B3.c a() {
                return this.f8719a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0181b) && AbstractC3292y.d(this.f8719a, ((C0181b) obj).f8719a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                B3.c cVar = this.f8719a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "FormFieldValuesChanged(formValues=" + this.f8719a + ")";
            }
        }
    }

    boolean a();

    void b(b bVar);

    boolean c();

    void close();

    InterfaceC3813L getState();
}
