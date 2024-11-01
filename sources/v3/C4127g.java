package v3;

import com.stripe.android.model.o;
import g3.EnumC2906e;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* renamed from: v3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4127g {

    /* renamed from: a, reason: collision with root package name */
    private final C2.c f40486a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.o f40487b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f40488c;

    /* renamed from: v3.g$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40489a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25755i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25759m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25745O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40489a = iArr;
        }
    }

    public C4127g(C2.c displayName, com.stripe.android.model.o paymentMethod, boolean z8) {
        AbstractC3292y.i(displayName, "displayName");
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        this.f40486a = displayName;
        this.f40487b = paymentMethod;
        this.f40488c = z8;
    }

    public final C2.c a() {
        int i8;
        EnumC2906e enumC2906e;
        String str;
        String str2;
        String str3;
        o.p pVar = this.f40487b.f25635e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f40489a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return C2.d.f("", new Object[0]);
                }
                int i9 = w.f40607c;
                o.r rVar = this.f40487b.f25648r;
                if (rVar != null) {
                    str3 = rVar.f25783e;
                } else {
                    str3 = null;
                }
                return C2.d.g(i9, new Object[]{str3}, null, 4, null);
            }
            int i10 = w.f40607c;
            o.n nVar = this.f40487b.f25642l;
            if (nVar != null) {
                str2 = nVar.f25729e;
            } else {
                str2 = null;
            }
            return C2.d.g(i10, new Object[]{str2}, null, 4, null);
        }
        int i11 = AbstractC3394E.f35219Z;
        o.g gVar = this.f40487b.f25638h;
        if (gVar != null) {
            enumC2906e = gVar.f25698a;
        } else {
            enumC2906e = null;
        }
        if (gVar != null) {
            str = gVar.f25705h;
        } else {
            str = null;
        }
        return C2.d.g(i11, new Object[]{enumC2906e, str}, null, 4, null);
    }

    public final C2.c b() {
        return this.f40486a;
    }

    public final C2.c c() {
        return C2.d.g(w.f40588L, new Object[]{a()}, null, 4, null);
    }

    public final com.stripe.android.model.o d() {
        return this.f40487b;
    }

    public final C2.c e() {
        return C2.d.g(w.f40601Y, new Object[]{a()}, null, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4127g)) {
            return false;
        }
        C4127g c4127g = (C4127g) obj;
        if (AbstractC3292y.d(this.f40486a, c4127g.f40486a) && AbstractC3292y.d(this.f40487b, c4127g.f40487b) && this.f40488c == c4127g.f40488c) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z8;
        o.g.c cVar;
        Set a9;
        o.g gVar = this.f40487b.f25638h;
        if (gVar != null && (cVar = gVar.f25708k) != null && (a9 = cVar.a()) != null && a9.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!this.f40488c || !z8) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f40486a.hashCode() * 31) + this.f40487b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f40488c);
    }

    public String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.f40486a + ", paymentMethod=" + this.f40487b + ", isCbcEligible=" + this.f40488c + ")";
    }
}
