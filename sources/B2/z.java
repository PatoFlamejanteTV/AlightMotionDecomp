package B2;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final a f554b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f555a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final z a(String str) {
            if (str == null || l6.n.T(str)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            return new z(str);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public z(String value) {
        AbstractC3292y.i(value, "value");
        this.f555a = value;
    }

    public final String a() {
        return this.f555a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && AbstractC3292y.d(this.f555a, ((z) obj).f555a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f555a.hashCode();
    }

    public String toString() {
        return this.f555a;
    }
}
