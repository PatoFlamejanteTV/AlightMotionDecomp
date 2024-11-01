package j4;

import R5.AbstractC1435t;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* loaded from: classes4.dex */
public final class M0 implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33892a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33893b;

    /* renamed from: c, reason: collision with root package name */
    private final r4.H f33894c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33895d;

    /* renamed from: e, reason: collision with root package name */
    private final C2.c f33896e;

    public M0(r4.G identifier, int i8, r4.H h8) {
        AbstractC3292y.i(identifier, "identifier");
        this.f33892a = identifier;
        this.f33893b = i8;
        this.f33894c = h8;
    }

    @Override // r4.D
    public r4.G a() {
        return this.f33892a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f33896e;
    }

    @Override // r4.D
    public boolean c() {
        return this.f33895d;
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
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (AbstractC3292y.d(this.f33892a, m02.f33892a) && this.f33893b == m02.f33893b && AbstractC3292y.d(this.f33894c, m02.f33894c)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f33893b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f33892a.hashCode() * 31) + this.f33893b) * 31;
        r4.H h8 = this.f33894c;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "StaticTextElement(identifier=" + this.f33892a + ", stringResId=" + this.f33893b + ", controller=" + this.f33894c + ")";
    }

    public /* synthetic */ M0(r4.G g8, int i8, r4.H h8, int i9, AbstractC3284p abstractC3284p) {
        this(g8, i8, (i9 & 4) != 0 ? null : h8);
    }
}
