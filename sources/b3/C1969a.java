package b3;

import C2.c;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1969a {

    /* renamed from: a, reason: collision with root package name */
    private final c f14914a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14915b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14916c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14917d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14918e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14919f;

    public C1969a(c displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3292y.i(displayName, "displayName");
        this.f14914a = displayName;
        this.f14915b = z8;
        this.f14916c = i8;
        this.f14917d = str;
        this.f14918e = str2;
        this.f14919f = z9;
    }

    public static /* synthetic */ C1969a b(C1969a c1969a, c cVar, boolean z8, int i8, String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            cVar = c1969a.f14914a;
        }
        if ((i9 & 2) != 0) {
            z8 = c1969a.f14915b;
        }
        boolean z10 = z8;
        if ((i9 & 4) != 0) {
            i8 = c1969a.f14916c;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            str = c1969a.f14917d;
        }
        String str3 = str;
        if ((i9 & 16) != 0) {
            str2 = c1969a.f14918e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            z9 = c1969a.f14919f;
        }
        return c1969a.a(cVar, z10, i10, str3, str4, z9);
    }

    public final C1969a a(c displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3292y.i(displayName, "displayName");
        return new C1969a(displayName, z8, i8, str, str2, z9);
    }

    public final String c() {
        return this.f14918e;
    }

    public final c d() {
        return this.f14914a;
    }

    public final boolean e() {
        return this.f14919f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1969a)) {
            return false;
        }
        C1969a c1969a = (C1969a) obj;
        if (AbstractC3292y.d(this.f14914a, c1969a.f14914a) && this.f14915b == c1969a.f14915b && this.f14916c == c1969a.f14916c && AbstractC3292y.d(this.f14917d, c1969a.f14917d) && AbstractC3292y.d(this.f14918e, c1969a.f14918e) && this.f14919f == c1969a.f14919f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f14916c;
    }

    public final String g() {
        return this.f14917d;
    }

    public final boolean h() {
        return this.f14915b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f14914a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f14915b)) * 31) + this.f14916c) * 31;
        String str = this.f14917d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        String str2 = this.f14918e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f14919f);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.f14914a + ", shouldShowIcon=" + this.f14915b + ", iconResource=" + this.f14916c + ", lightThemeIconUrl=" + this.f14917d + ", darkThemeIconUrl=" + this.f14918e + ", iconRequiresTinting=" + this.f14919f + ")";
    }
}
