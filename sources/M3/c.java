package M3;

import com.stripe.android.model.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6143a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6144b;

        public a(String id, String ephemeralKeySecret) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(ephemeralKeySecret, "ephemeralKeySecret");
            this.f6143a = id;
            this.f6144b = ephemeralKeySecret;
        }

        public final String a() {
            return this.f6144b;
        }

        public final String b() {
            return this.f6143a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f6143a, aVar.f6143a) && AbstractC3292y.d(this.f6144b, aVar.f6144b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6143a.hashCode() * 31) + this.f6144b.hashCode();
        }

        public String toString() {
            return "CustomerInfo(id=" + this.f6143a + ", ephemeralKeySecret=" + this.f6144b + ")";
        }
    }

    Object a(a aVar, U5.d dVar);

    Object b(a aVar, String str, t tVar, U5.d dVar);

    Object c(a aVar, List list, boolean z8, U5.d dVar);

    Object d(a aVar, String str, boolean z8, U5.d dVar);
}
