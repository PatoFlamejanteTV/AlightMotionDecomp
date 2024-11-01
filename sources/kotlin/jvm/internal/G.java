package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class G implements InterfaceC3281m {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34567a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34568b;

    public G(Class jClass, String moduleName) {
        AbstractC3292y.i(jClass, "jClass");
        AbstractC3292y.i(moduleName, "moduleName");
        this.f34567a = jClass;
        this.f34568b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3281m
    public Class d() {
        return this.f34567a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof G) && AbstractC3292y.d(d(), ((G) obj).d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
