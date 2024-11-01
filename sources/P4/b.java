package P4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f8084a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8085b;

    /* renamed from: c, reason: collision with root package name */
    private String f8086c;

    public b(String packageName, String name) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(name, "name");
        this.f8084a = packageName;
        this.f8085b = name;
    }

    public final String a() {
        return this.f8086c;
    }

    public final String b() {
        return this.f8085b;
    }

    public final String c() {
        return this.f8084a;
    }

    public final void d(String str) {
        this.f8086c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f8084a, bVar.f8084a) && AbstractC3292y.d(this.f8085b, bVar.f8085b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8084a.hashCode() * 31) + this.f8085b.hashCode();
    }

    public String toString() {
        return "AppToBackup(packageName=" + this.f8084a + ", name=" + this.f8085b + ')';
    }
}
