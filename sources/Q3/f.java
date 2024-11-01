package Q3;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4127g;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C4127g f8527a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8528b;

        public a(C4127g paymentMethod, boolean z8) {
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            this.f8527a = paymentMethod;
            this.f8528b = z8;
        }

        public final C4127g a() {
            return this.f8527a;
        }

        public final boolean b() {
            return this.f8528b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f8527a, aVar.f8527a) && this.f8528b == aVar.f8528b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f8527a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8528b);
        }

        public String toString() {
            return "State(paymentMethod=" + this.f8527a + ", isLiveMode=" + this.f8528b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8529a = new a();

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
                return -1323407824;
            }

            public String toString() {
                return "DeletePaymentMethod";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    void a(b bVar);

    a getState();
}
