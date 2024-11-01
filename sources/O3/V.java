package O3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public interface V {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f7494a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.r f7495b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f7496c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f7497d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f7498e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f7499f;

        public a(List paymentOptionsItems, com.stripe.android.paymentsheet.r rVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3292y.i(paymentOptionsItems, "paymentOptionsItems");
            this.f7494a = paymentOptionsItems;
            this.f7495b = rVar;
            this.f7496c = z8;
            this.f7497d = z9;
            this.f7498e = z10;
            this.f7499f = z11;
        }

        public static /* synthetic */ a b(a aVar, List list, com.stripe.android.paymentsheet.r rVar, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = aVar.f7494a;
            }
            if ((i8 & 2) != 0) {
                rVar = aVar.f7495b;
            }
            com.stripe.android.paymentsheet.r rVar2 = rVar;
            if ((i8 & 4) != 0) {
                z8 = aVar.f7496c;
            }
            boolean z12 = z8;
            if ((i8 & 8) != 0) {
                z9 = aVar.f7497d;
            }
            boolean z13 = z9;
            if ((i8 & 16) != 0) {
                z10 = aVar.f7498e;
            }
            boolean z14 = z10;
            if ((i8 & 32) != 0) {
                z11 = aVar.f7499f;
            }
            return aVar.a(list, rVar2, z12, z13, z14, z11);
        }

        public final a a(List paymentOptionsItems, com.stripe.android.paymentsheet.r rVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3292y.i(paymentOptionsItems, "paymentOptionsItems");
            return new a(paymentOptionsItems, rVar, z8, z9, z10, z11);
        }

        public final boolean c() {
            return this.f7498e;
        }

        public final List d() {
            return this.f7494a;
        }

        public final com.stripe.android.paymentsheet.r e() {
            return this.f7495b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f7494a, aVar.f7494a) && AbstractC3292y.d(this.f7495b, aVar.f7495b) && this.f7496c == aVar.f7496c && this.f7497d == aVar.f7497d && this.f7498e == aVar.f7498e && this.f7499f == aVar.f7499f) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f7496c;
        }

        public final boolean g() {
            return this.f7497d;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f7494a.hashCode() * 31;
            com.stripe.android.paymentsheet.r rVar = this.f7495b;
            if (rVar == null) {
                hashCode = 0;
            } else {
                hashCode = rVar.hashCode();
            }
            return ((((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f7496c)) * 31) + androidx.compose.foundation.a.a(this.f7497d)) * 31) + androidx.compose.foundation.a.a(this.f7498e)) * 31) + androidx.compose.foundation.a.a(this.f7499f);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.f7494a + ", selectedPaymentOptionsItem=" + this.f7495b + ", isEditing=" + this.f7496c + ", isProcessing=" + this.f7497d + ", canEdit=" + this.f7498e + ", canRemove=" + this.f7499f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f7500a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 792087598;
            }

            public String toString() {
                return "AddCardPressed";
            }
        }

        /* renamed from: O3.V$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0138b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f7501b = com.stripe.android.model.o.f25630u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f7502a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0138b(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f7502a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f7502a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0138b) && AbstractC3292y.d(this.f7502a, ((C0138b) obj).f7502a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7502a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f7502a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f7503b = com.stripe.android.model.o.f25630u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f7504a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f7504a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f7504a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3292y.d(this.f7504a, ((c) obj).f7504a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7504a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f7504a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            private final D3.f f7505a;

            public d(D3.f fVar) {
                super(null);
                this.f7505a = fVar;
            }

            public final D3.f a() {
                return this.f7505a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof d) && AbstractC3292y.d(this.f7505a, ((d) obj).f7505a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                D3.f fVar = this.f7505a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.f7505a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f7506a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2007142043;
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
