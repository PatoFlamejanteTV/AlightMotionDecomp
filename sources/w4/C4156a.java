package w4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4156a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40748a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40749b;

    public C4156a(String str, boolean z8) {
        this.f40748a = str;
        this.f40749b = z8;
    }

    public static /* synthetic */ C4156a b(C4156a c4156a, String str, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c4156a.f40748a;
        }
        if ((i8 & 2) != 0) {
            z8 = c4156a.f40749b;
        }
        return c4156a.a(str, z8);
    }

    public final C4156a a(String str, boolean z8) {
        return new C4156a(str, z8);
    }

    public final String c() {
        return this.f40748a;
    }

    public final boolean d() {
        return this.f40749b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4156a)) {
            return false;
        }
        C4156a c4156a = (C4156a) obj;
        if (AbstractC3292y.d(this.f40748a, c4156a.f40748a) && this.f40749b == c4156a.f40749b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f40748a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f40749b);
    }

    public String toString() {
        return "FormFieldEntry(value=" + this.f40748a + ", isComplete=" + this.f40749b + ")";
    }
}
