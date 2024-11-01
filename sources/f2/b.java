package F2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2132a;

    public b(boolean z8) {
        this.f2132a = z8;
    }

    public final boolean a() {
        return this.f2132a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f2132a == ((b) obj).f2132a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return androidx.compose.foundation.a.a(this.f2132a);
    }

    public String toString() {
        return "CustomerPermissions(canRemovePaymentMethods=" + this.f2132a + ")";
    }
}
