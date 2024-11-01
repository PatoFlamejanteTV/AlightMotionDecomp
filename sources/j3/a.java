package J3;

import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f4082a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2906e f4083b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4084c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4085d;

    public a(String lastFour, EnumC2906e cardBrand, String cvc, boolean z8) {
        AbstractC3292y.i(lastFour, "lastFour");
        AbstractC3292y.i(cardBrand, "cardBrand");
        AbstractC3292y.i(cvc, "cvc");
        this.f4082a = lastFour;
        this.f4083b = cardBrand;
        this.f4084c = cvc;
        this.f4085d = z8;
    }

    public final EnumC2906e a() {
        return this.f4083b;
    }

    public final String b() {
        return this.f4084c;
    }

    public final String c() {
        return this.f4082a;
    }

    public final boolean d() {
        return this.f4085d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f4082a, aVar.f4082a) && this.f4083b == aVar.f4083b && AbstractC3292y.d(this.f4084c, aVar.f4084c) && this.f4085d == aVar.f4085d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f4082a.hashCode() * 31) + this.f4083b.hashCode()) * 31) + this.f4084c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f4085d);
    }

    public String toString() {
        return "Args(lastFour=" + this.f4082a + ", cardBrand=" + this.f4083b + ", cvc=" + this.f4084c + ", isTestMode=" + this.f4085d + ")";
    }
}
