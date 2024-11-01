package J3;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4097a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4098b;

    /* renamed from: c, reason: collision with root package name */
    private final g f4099c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4100d;

    public f(String lastFour, boolean z8, g cvcState, boolean z9) {
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cvcState, "cvcState");
        this.f4097a = lastFour;
        this.f4098b = z8;
        this.f4099c = cvcState;
        this.f4100d = z9;
    }

    public static /* synthetic */ f b(f fVar, String str, boolean z8, g gVar, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = fVar.f4097a;
        }
        if ((i8 & 2) != 0) {
            z8 = fVar.f4098b;
        }
        if ((i8 & 4) != 0) {
            gVar = fVar.f4099c;
        }
        if ((i8 & 8) != 0) {
            z9 = fVar.f4100d;
        }
        return fVar.a(str, z8, gVar, z9);
    }

    public final f a(String lastFour, boolean z8, g cvcState, boolean z9) {
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cvcState, "cvcState");
        return new f(lastFour, z8, cvcState, z9);
    }

    public final g c() {
        return this.f4099c;
    }

    public final String d() {
        return this.f4097a;
    }

    public final boolean e() {
        return this.f4100d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f4097a, fVar.f4097a) && this.f4098b == fVar.f4098b && AbstractC3292y.d(this.f4099c, fVar.f4099c) && this.f4100d == fVar.f4100d) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f4098b;
    }

    public int hashCode() {
        return (((((this.f4097a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f4098b)) * 31) + this.f4099c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f4100d);
    }

    public String toString() {
        return "CvcRecollectionViewState(lastFour=" + this.f4097a + ", isTestMode=" + this.f4098b + ", cvcState=" + this.f4099c + ", isEnabled=" + this.f4100d + ")";
    }
}
