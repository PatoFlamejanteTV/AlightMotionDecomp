package E6;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
final class J extends H {

    /* renamed from: k, reason: collision with root package name */
    private final D6.v f2007k;

    /* renamed from: l, reason: collision with root package name */
    private final List f2008l;

    /* renamed from: m, reason: collision with root package name */
    private final int f2009m;

    /* renamed from: n, reason: collision with root package name */
    private int f2010n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(D6.a json, D6.v value) {
        super(json, value, null, null, 12, null);
        AbstractC3292y.i(json, "json");
        AbstractC3292y.i(value, "value");
        this.f2007k = value;
        List W02 = AbstractC1435t.W0(s0().keySet());
        this.f2008l = W02;
        this.f2009m = W02.size() * 2;
        this.f2010n = -1;
    }

    @Override // E6.H, E6.AbstractC1045c, B6.c
    public void a(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
    }

    @Override // E6.H, C6.V
    protected String a0(A6.f descriptor, int i8) {
        AbstractC3292y.i(descriptor, "descriptor");
        return (String) this.f2008l.get(i8 / 2);
    }

    @Override // E6.H, E6.AbstractC1045c
    protected D6.i e0(String tag) {
        AbstractC3292y.i(tag, "tag");
        if (this.f2010n % 2 == 0) {
            return D6.j.a(tag);
        }
        return (D6.i) R5.Q.i(s0(), tag);
    }

    @Override // E6.H, E6.AbstractC1045c
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public D6.v s0() {
        return this.f2007k;
    }

    @Override // E6.H, B6.c
    public int y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        int i8 = this.f2010n;
        if (i8 < this.f2009m - 1) {
            int i9 = i8 + 1;
            this.f2010n = i9;
            return i9;
        }
        return -1;
    }
}
