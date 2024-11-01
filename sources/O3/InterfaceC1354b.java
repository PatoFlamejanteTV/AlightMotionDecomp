package O3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

/* renamed from: O3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1354b {

    /* renamed from: O3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7519a;

        /* renamed from: b, reason: collision with root package name */
        private final List f7520b;

        /* renamed from: c, reason: collision with root package name */
        private final F3.a f7521c;

        /* renamed from: d, reason: collision with root package name */
        private final List f7522d;

        /* renamed from: e, reason: collision with root package name */
        private final D3.f f7523e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f7524f;

        /* renamed from: g, reason: collision with root package name */
        private final G3.d f7525g;

        public a(String selectedPaymentMethodCode, List supportedPaymentMethods, F3.a arguments, List formElements, D3.f fVar, boolean z8, G3.d usBankAccountFormArguments) {
            AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3292y.i(arguments, "arguments");
            AbstractC3292y.i(formElements, "formElements");
            AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            this.f7519a = selectedPaymentMethodCode;
            this.f7520b = supportedPaymentMethods;
            this.f7521c = arguments;
            this.f7522d = formElements;
            this.f7523e = fVar;
            this.f7524f = z8;
            this.f7525g = usBankAccountFormArguments;
        }

        public static /* synthetic */ a b(a aVar, String str, List list, F3.a aVar2, List list2, D3.f fVar, boolean z8, G3.d dVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = aVar.f7519a;
            }
            if ((i8 & 2) != 0) {
                list = aVar.f7520b;
            }
            List list3 = list;
            if ((i8 & 4) != 0) {
                aVar2 = aVar.f7521c;
            }
            F3.a aVar3 = aVar2;
            if ((i8 & 8) != 0) {
                list2 = aVar.f7522d;
            }
            List list4 = list2;
            if ((i8 & 16) != 0) {
                fVar = aVar.f7523e;
            }
            D3.f fVar2 = fVar;
            if ((i8 & 32) != 0) {
                z8 = aVar.f7524f;
            }
            boolean z9 = z8;
            if ((i8 & 64) != 0) {
                dVar = aVar.f7525g;
            }
            return aVar.a(str, list3, aVar3, list4, fVar2, z9, dVar);
        }

        public final a a(String selectedPaymentMethodCode, List supportedPaymentMethods, F3.a arguments, List formElements, D3.f fVar, boolean z8, G3.d usBankAccountFormArguments) {
            AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3292y.i(arguments, "arguments");
            AbstractC3292y.i(formElements, "formElements");
            AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            return new a(selectedPaymentMethodCode, supportedPaymentMethods, arguments, formElements, fVar, z8, usBankAccountFormArguments);
        }

        public final F3.a c() {
            return this.f7521c;
        }

        public final List d() {
            return this.f7522d;
        }

        public final boolean e() {
            return this.f7524f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f7519a, aVar.f7519a) && AbstractC3292y.d(this.f7520b, aVar.f7520b) && AbstractC3292y.d(this.f7521c, aVar.f7521c) && AbstractC3292y.d(this.f7522d, aVar.f7522d) && AbstractC3292y.d(this.f7523e, aVar.f7523e) && this.f7524f == aVar.f7524f && AbstractC3292y.d(this.f7525g, aVar.f7525g)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f7519a;
        }

        public final List g() {
            return this.f7520b;
        }

        public final G3.d h() {
            return this.f7525g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((this.f7519a.hashCode() * 31) + this.f7520b.hashCode()) * 31) + this.f7521c.hashCode()) * 31) + this.f7522d.hashCode()) * 31;
            D3.f fVar = this.f7523e;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            return ((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f7524f)) * 31) + this.f7525g.hashCode();
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f7519a + ", supportedPaymentMethods=" + this.f7520b + ", arguments=" + this.f7521c + ", formElements=" + this.f7522d + ", paymentSelection=" + this.f7523e + ", processing=" + this.f7524f + ", usBankAccountFormArguments=" + this.f7525g + ")";
        }
    }

    /* renamed from: O3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0139b {

        /* renamed from: O3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0139b {

            /* renamed from: a, reason: collision with root package name */
            private final B3.c f7526a;

            /* renamed from: b, reason: collision with root package name */
            private final String f7527b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B3.c cVar, String selectedPaymentMethodCode) {
                super(null);
                AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f7526a = cVar;
                this.f7527b = selectedPaymentMethodCode;
            }

            public final B3.c a() {
                return this.f7526a;
            }

            public final String b() {
                return this.f7527b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (AbstractC3292y.d(this.f7526a, aVar.f7526a) && AbstractC3292y.d(this.f7527b, aVar.f7527b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                B3.c cVar = this.f7526a;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                return (hashCode * 31) + this.f7527b.hashCode();
            }

            public String toString() {
                return "OnFormFieldValuesChanged(formValues=" + this.f7526a + ", selectedPaymentMethodCode=" + this.f7527b + ")";
            }
        }

        /* renamed from: O3.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0140b extends AbstractC0139b {

            /* renamed from: a, reason: collision with root package name */
            private final String f7528a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0140b(String code) {
                super(null);
                AbstractC3292y.i(code, "code");
                this.f7528a = code;
            }

            public final String a() {
                return this.f7528a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0140b) && AbstractC3292y.d(this.f7528a, ((C0140b) obj).f7528a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7528a.hashCode();
            }

            public String toString() {
                return "OnPaymentMethodSelected(code=" + this.f7528a + ")";
            }
        }

        /* renamed from: O3.b$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0139b {

            /* renamed from: a, reason: collision with root package name */
            private final String f7529a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String code) {
                super(null);
                AbstractC3292y.i(code, "code");
                this.f7529a = code;
            }

            public final String a() {
                return this.f7529a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3292y.d(this.f7529a, ((c) obj).f7529a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7529a.hashCode();
            }

            public String toString() {
                return "ReportFieldInteraction(code=" + this.f7529a + ")";
            }
        }

        private AbstractC0139b() {
        }

        public /* synthetic */ AbstractC0139b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    boolean c();

    void close();

    void d(AbstractC0139b abstractC0139b);

    InterfaceC3813L getState();
}
