package Q;

import N.C1339b;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8259g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC1383c abstractC1383c, int i8, Bundle bundle) {
        super(abstractC1383c, i8, null);
        this.f8259g = abstractC1383c;
    }

    @Override // Q.Q
    protected final void f(C1339b c1339b) {
        if (this.f8259g.t() && AbstractC1383c.h0(this.f8259g)) {
            AbstractC1383c.d0(this.f8259g, 16);
        } else {
            this.f8259g.f8198p.b(c1339b);
            this.f8259g.L(c1339b);
        }
    }

    @Override // Q.Q
    protected final boolean g() {
        this.f8259g.f8198p.b(C1339b.f6350e);
        return true;
    }
}
