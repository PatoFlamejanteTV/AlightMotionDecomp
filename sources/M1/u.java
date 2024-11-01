package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f34951a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34952b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34953c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34954d;

    public u(String processName, int i8, int i9, boolean z8) {
        AbstractC3292y.i(processName, "processName");
        this.f34951a = processName;
        this.f34952b = i8;
        this.f34953c = i9;
        this.f34954d = z8;
    }

    public final int a() {
        return this.f34953c;
    }

    public final int b() {
        return this.f34952b;
    }

    public final String c() {
        return this.f34951a;
    }

    public final boolean d() {
        return this.f34954d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3292y.d(this.f34951a, uVar.f34951a) && this.f34952b == uVar.f34952b && this.f34953c == uVar.f34953c && this.f34954d == uVar.f34954d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f34951a.hashCode() * 31) + this.f34952b) * 31) + this.f34953c) * 31;
        boolean z8 = this.f34954d;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f34951a + ", pid=" + this.f34952b + ", importance=" + this.f34953c + ", isDefaultProcess=" + this.f34954d + ')';
    }
}
