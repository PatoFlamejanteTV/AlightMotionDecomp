package n2;

import com.stripe.android.model.c;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3401d extends AbstractC3402e {

    /* renamed from: b, reason: collision with root package name */
    private final String f35321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3401d(String clientSecret) {
        super(null);
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f35321b = clientSecret;
    }

    @Override // n2.AbstractC3402e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3292y.i(createParams, "createParams");
        return c.a.c(com.stripe.android.model.c.f25461h, createParams, this.f35321b, null, null, 12, null);
    }

    @Override // n2.AbstractC3402e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.c c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3292y.i(paymentMethodId, "paymentMethodId");
        c.a aVar = com.stripe.android.model.c.f25461h;
        String str = this.f35321b;
        if (pVar != null) {
            mVar = new com.stripe.android.model.m(m.c.a.f25543e.a());
        } else {
            mVar = null;
        }
        return c.a.d(aVar, paymentMethodId, str, mVar, null, 8, null);
    }
}
