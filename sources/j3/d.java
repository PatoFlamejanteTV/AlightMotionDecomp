package J3;

import com.stripe.android.model.o;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4094c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f4095a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2906e f4096b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(o.g gVar) {
            if (gVar != null) {
                return new d(gVar.f25705h, gVar.f25698a);
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public d(String str, EnumC2906e brand) {
        AbstractC3292y.i(brand, "brand");
        this.f4095a = str;
        this.f4096b = brand;
    }

    public final EnumC2906e a() {
        return this.f4096b;
    }

    public final String b() {
        return this.f4095a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f4095a, dVar.f4095a) && this.f4096b == dVar.f4096b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4095a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f4096b.hashCode();
    }

    public String toString() {
        return "CvcRecollectionData(lastFour=" + this.f4095a + ", brand=" + this.f4096b + ")";
    }
}
