package j4;

import R5.AbstractC1435t;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.D;

/* loaded from: classes4.dex */
public final class t0 implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34267a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34268b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34269c;

    /* renamed from: d, reason: collision with root package name */
    private final float f34270d;

    /* renamed from: e, reason: collision with root package name */
    private final r4.H f34271e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34272f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.c f34273g;

    public /* synthetic */ t0(r4.G g8, int i8, List list, float f8, r4.H h8, AbstractC3284p abstractC3284p) {
        this(g8, i8, list, f8, h8);
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34267a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34273g;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34272f;
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
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (AbstractC3292y.d(this.f34267a, t0Var.f34267a) && this.f34268b == t0Var.f34268b && AbstractC3292y.d(this.f34269c, t0Var.f34269c) && Dp.m5160equalsimpl0(this.f34270d, t0Var.f34270d) && AbstractC3292y.d(this.f34271e, t0Var.f34271e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f34269c;
    }

    public final int g() {
        return this.f34268b;
    }

    public final float h() {
        return this.f34270d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f34267a.hashCode() * 31) + this.f34268b) * 31) + this.f34269c.hashCode()) * 31) + Dp.m5161hashCodeimpl(this.f34270d)) * 31;
        r4.H h8 = this.f34271e;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.f34267a + ", stringResId=" + this.f34268b + ", args=" + this.f34269c + ", topPadding=" + Dp.m5166toStringimpl(this.f34270d) + ", controller=" + this.f34271e + ")";
    }

    private t0(r4.G identifier, int i8, List args, float f8, r4.H h8) {
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(args, "args");
        this.f34267a = identifier;
        this.f34268b = i8;
        this.f34269c = args;
        this.f34270d = f8;
        this.f34271e = h8;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.f34273g = C2.d.g(i8, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    public /* synthetic */ t0(r4.G g8, int i8, List list, float f8, r4.H h8, int i9, AbstractC3284p abstractC3284p) {
        this(g8, i8, list, (i9 & 8) != 0 ? Dp.m5155constructorimpl(8) : f8, (i9 & 16) != 0 ? null : h8, null);
    }
}
