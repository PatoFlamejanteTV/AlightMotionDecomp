package R3;

import A4.g;
import R5.AbstractC1435t;
import c6.InterfaceC2074p;
import com.stripe.android.paymentsheet.t;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f9242a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f9243b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3813L f9244c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f9245d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f9246e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9247f;

    /* renamed from: g, reason: collision with root package name */
    private final Function0 f9248g;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements InterfaceC2074p {
        a() {
            super(4);
        }

        public final List a(N3.a aVar, Boolean bool, boolean z8, boolean z9) {
            List m8;
            b bVar = b.this;
            if (aVar == null || (m8 = aVar.h()) == null) {
                m8 = AbstractC1435t.m();
            }
            List b9 = bVar.b(m8, bool, z8, z9);
            if (b9 == null) {
                return AbstractC1435t.m();
            }
            return b9;
        }

        @Override // c6.InterfaceC2074p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((N3.a) obj, (Boolean) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        }
    }

    public b(InterfaceC3813L customerState, InterfaceC3813L isGooglePayReady, InterfaceC3813L isLinkEnabled, InterfaceC3813L canRemovePaymentMethods, Function1 nameProvider, boolean z8, Function0 isCbcEligible) {
        AbstractC3292y.i(customerState, "customerState");
        AbstractC3292y.i(isGooglePayReady, "isGooglePayReady");
        AbstractC3292y.i(isLinkEnabled, "isLinkEnabled");
        AbstractC3292y.i(canRemovePaymentMethods, "canRemovePaymentMethods");
        AbstractC3292y.i(nameProvider, "nameProvider");
        AbstractC3292y.i(isCbcEligible, "isCbcEligible");
        this.f9242a = customerState;
        this.f9243b = isGooglePayReady;
        this.f9244c = isLinkEnabled;
        this.f9245d = canRemovePaymentMethods;
        this.f9246e = nameProvider;
        this.f9247f = z8;
        this.f9248g = isCbcEligible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(List list, Boolean bool, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        if (bool == null) {
            return null;
        }
        t tVar = t.f27676a;
        if (z8 && this.f9247f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bool.booleanValue() && this.f9247f) {
            z11 = true;
        } else {
            z11 = false;
        }
        return tVar.b(list, z10, z11, this.f9246e, z9, ((Boolean) this.f9248g.invoke()).booleanValue());
    }

    public final InterfaceC3813L c() {
        return g.f(this.f9242a, this.f9244c, this.f9243b, this.f9245d, new a());
    }
}
