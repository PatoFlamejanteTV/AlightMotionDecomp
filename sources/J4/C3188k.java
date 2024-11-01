package j4;

import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;
import q6.InterfaceC3813L;
import r4.D;

/* renamed from: j4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3188k implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34163a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34164b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.H f34165c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34166d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f34167e;

    public C3188k(r4.G identifier, String str, r4.H h8) {
        AbstractC3292y.i(identifier, "identifier");
        this.f34163a = identifier;
        this.f34164b = str;
        this.f34165c = h8;
        this.f34167e = C2.d.g(AbstractC3394E.f35202L, new Object[]{str == null ? "" : str}, null, 4, null);
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34163a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34167e;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34166d;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.n(AbstractC1435t.m());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3188k)) {
            return false;
        }
        C3188k c3188k = (C3188k) obj;
        if (AbstractC3292y.d(this.f34163a, c3188k.f34163a) && AbstractC3292y.d(this.f34164b, c3188k.f34164b) && AbstractC3292y.d(this.f34165c, c3188k.f34165c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f34164b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f34163a.hashCode() * 31;
        String str = this.f34164b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        r4.H h8 = this.f34165c;
        if (h8 != null) {
            i8 = h8.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + this.f34163a + ", merchantName=" + this.f34164b + ", controller=" + this.f34165c + ")";
    }

    public /* synthetic */ C3188k(r4.G g8, String str, r4.H h8, int i8, AbstractC3284p abstractC3284p) {
        this(g8, str, (i8 & 4) != 0 ? null : h8);
    }
}
