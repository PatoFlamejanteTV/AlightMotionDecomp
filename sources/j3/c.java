package J3;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f4092a;

        public a(String cvc) {
            AbstractC3292y.i(cvc, "cvc");
            this.f4092a = cvc;
        }

        public final String a() {
            return this.f4092a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3292y.d(this.f4092a, ((a) obj).f4092a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f4092a.hashCode();
        }

        public String toString() {
            return "Completed(cvc=" + this.f4092a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4093a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -481114568;
        }

        public String toString() {
            return "Incomplete";
        }
    }
}
