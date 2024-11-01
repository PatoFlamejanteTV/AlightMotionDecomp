package S3;

import U5.d;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f9426a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9427b;

        public a(String clientSecret, int i8) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            this.f9426a = clientSecret;
            this.f9427b = i8;
        }

        public final String a() {
            return this.f9426a;
        }

        public final int b() {
            return this.f9427b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f9426a, aVar.f9426a) && this.f9427b == aVar.f9427b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f9426a.hashCode() * 31) + this.f9427b;
        }

        public String toString() {
            return "Config(clientSecret=" + this.f9426a + ", maxAttempts=" + this.f9427b + ")";
        }
    }

    void a(M m8);

    void b();

    Object c(d dVar);

    InterfaceC3813L getState();
}
