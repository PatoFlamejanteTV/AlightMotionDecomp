package n2;

import com.stripe.android.model.b;
import com.stripe.android.model.m;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3400c extends AbstractC3402e {

    /* renamed from: b, reason: collision with root package name */
    private final String f35319b;

    /* renamed from: c, reason: collision with root package name */
    private final b.d f35320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3400c(String clientSecret, b.d dVar) {
        super(null);
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f35319b = clientSecret;
        this.f35320c = dVar;
    }

    @Override // n2.AbstractC3402e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b b(com.stripe.android.model.p createParams, com.stripe.android.model.r rVar) {
        AbstractC3292y.i(createParams, "createParams");
        return b.a.c(com.stripe.android.model.b.f25433o, createParams, this.f35319b, null, null, null, null, this.f35320c, rVar, 60, null);
    }

    @Override // n2.AbstractC3402e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.b c(String paymentMethodId, o.p pVar, com.stripe.android.model.r rVar) {
        com.stripe.android.model.m mVar;
        AbstractC3292y.i(paymentMethodId, "paymentMethodId");
        b.a aVar = com.stripe.android.model.b.f25433o;
        String str = this.f35319b;
        com.stripe.android.model.m mVar2 = new com.stripe.android.model.m(m.c.a.f25543e.a());
        if (pVar != null && pVar.f25776d) {
            mVar = mVar2;
        } else {
            mVar = null;
        }
        return b.a.e(aVar, paymentMethodId, str, null, rVar, null, mVar, null, this.f35320c, 84, null);
    }
}
