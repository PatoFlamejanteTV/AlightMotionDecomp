package Q3;

import D3.f;
import E3.c;
import R5.AbstractC1435t;
import androidx.lifecycle.ViewModelKt;
import d3.C2752d;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import v3.C4122b;
import v3.C4131k;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f8728a = new u();

    private u() {
    }

    public final List a(R3.a viewModel, C2752d paymentMethodMetadata, C4122b customerStateHolder) {
        f.e eVar;
        AbstractC3292y.i(viewModel, "viewModel");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(customerStateHolder, "customerStateHolder");
        List h02 = paymentMethodMetadata.h0();
        if (h02.size() == 1 && ((List) customerStateHolder.c().getValue()).isEmpty()) {
            return AbstractC1435t.e(new c.l(d.f8504l.a((String) AbstractC1435t.m0(h02), viewModel, paymentMethodMetadata, customerStateHolder), true));
        }
        List c8 = AbstractC1435t.c();
        c8.add(new c.k(c.f8449A.a(viewModel, paymentMethodMetadata, customerStateHolder)));
        Object value = viewModel.y().getValue();
        if (value instanceof f.e) {
            eVar = (f.e) value;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            String u8 = eVar.h().u();
            if (C4131k.f40492g.a(viewModel, v3.m.f40502h.a(viewModel, ViewModelKt.getViewModelScope(viewModel)), paymentMethodMetadata).d(u8)) {
                c8.add(new c.l(d.f8504l.a(u8, viewModel, paymentMethodMetadata, customerStateHolder), false, 2, null));
            }
        }
        return AbstractC1435t.a(c8);
    }
}
