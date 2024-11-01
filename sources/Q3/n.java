package Q3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import v3.C4127g;

/* loaded from: classes4.dex */
public interface n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8639a = new a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f8640b = new a("EDIT_CARD_BRAND", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f8641c = new a("MANAGE_ONE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f8642d = new a("MANAGE_ALL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f8643e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f8644f;

        static {
            a[] a9 = a();
            f8643e = a9;
            f8644f = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f8639a, f8640b, f8641c, f8642d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f8643e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f8645a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8646b;

        /* renamed from: c, reason: collision with root package name */
        private final D3.f f8647c;

        /* renamed from: d, reason: collision with root package name */
        private final C4127g f8648d;

        /* renamed from: e, reason: collision with root package name */
        private final a f8649e;

        public b(List displayablePaymentMethods, boolean z8, D3.f fVar, C4127g c4127g, a availableSavedPaymentMethodAction) {
            AbstractC3292y.i(displayablePaymentMethods, "displayablePaymentMethods");
            AbstractC3292y.i(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
            this.f8645a = displayablePaymentMethods;
            this.f8646b = z8;
            this.f8647c = fVar;
            this.f8648d = c4127g;
            this.f8649e = availableSavedPaymentMethodAction;
        }

        public final a a() {
            return this.f8649e;
        }

        public final List b() {
            return this.f8645a;
        }

        public final C4127g c() {
            return this.f8648d;
        }

        public final D3.f d() {
            return this.f8647c;
        }

        public final boolean e() {
            return this.f8646b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f8645a, bVar.f8645a) && this.f8646b == bVar.f8646b && AbstractC3292y.d(this.f8647c, bVar.f8647c) && AbstractC3292y.d(this.f8648d, bVar.f8648d) && this.f8649e == bVar.f8649e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f8645a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8646b)) * 31;
            D3.f fVar = this.f8647c;
            int i8 = 0;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            C4127g c4127g = this.f8648d;
            if (c4127g != null) {
                i8 = c4127g.hashCode();
            }
            return ((i9 + i8) * 31) + this.f8649e.hashCode();
        }

        public String toString() {
            return "State(displayablePaymentMethods=" + this.f8645a + ", isProcessing=" + this.f8646b + ", selection=" + this.f8647c + ", displayedSavedPaymentMethod=" + this.f8648d + ", availableSavedPaymentMethodAction=" + this.f8649e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface c {

        /* loaded from: classes4.dex */
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            private final C4127g f8650a;

            public a(C4127g savedPaymentMethod) {
                AbstractC3292y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f8650a = savedPaymentMethod;
            }

            public final C4127g a() {
                return this.f8650a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3292y.d(this.f8650a, ((a) obj).f8650a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8650a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(savedPaymentMethod=" + this.f8650a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f8651a;

            public b(String selectedPaymentMethodCode) {
                AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f8651a = selectedPaymentMethodCode;
            }

            public final String a() {
                return this.f8651a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3292y.d(this.f8651a, ((b) obj).f8651a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8651a.hashCode();
            }

            public String toString() {
                return "PaymentMethodSelected(selectedPaymentMethodCode=" + this.f8651a + ")";
            }
        }

        /* renamed from: Q3.n$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0180c implements c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f8652b = com.stripe.android.model.o.f25630u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f8653a;

            public C0180c(com.stripe.android.model.o savedPaymentMethod) {
                AbstractC3292y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f8653a = savedPaymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f8653a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0180c) && AbstractC3292y.d(this.f8653a, ((C0180c) obj).f8653a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8653a.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.f8653a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8654a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1370197407;
            }

            public String toString() {
                return "TransitionToManageOneSavedPaymentMethod";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f8655a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1332425524;
            }

            public String toString() {
                return "TransitionToManageSavedPaymentMethods";
            }
        }
    }

    void a(c cVar);

    InterfaceC3813L b();

    boolean c();

    InterfaceC3813L getState();
}
