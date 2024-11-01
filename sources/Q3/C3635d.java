package q3;

import B2.j;
import Q5.I;
import com.stripe.android.a;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3635d extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36677a;

    public C3635d(Function1 paymentRelayStarterFactory) {
        AbstractC3292y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f36677a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.AbstractC3637f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, j.c cVar, U5.d dVar) {
        ((com.stripe.android.a) this.f36677a.invoke(interfaceC2668p)).a(a.AbstractC0445a.f24675a.a(stripeIntent, cVar.l()));
        return I.f8786a;
    }
}
