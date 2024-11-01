package q3;

import B2.j;
import Q5.I;
import Q5.x;
import R5.Q;
import android.content.Context;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.InterfaceC2668p;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;

/* renamed from: q3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3647p extends AbstractC3637f {

    /* renamed from: a, reason: collision with root package name */
    private final C3650s f36723a;

    /* renamed from: b, reason: collision with root package name */
    private final C3635d f36724b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f36725c;

    public C3647p(C3650s webIntentAuthenticator, C3635d noOpIntentAuthenticator, Context context) {
        AbstractC3292y.i(webIntentAuthenticator, "webIntentAuthenticator");
        AbstractC3292y.i(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        AbstractC3292y.i(context, "context");
        this.f36723a = webIntentAuthenticator;
        this.f36724b = noOpIntentAuthenticator;
        this.f36725c = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q3.AbstractC3637f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(InterfaceC2668p interfaceC2668p, StripeIntent stripeIntent, j.c cVar, U5.d dVar) {
        String str;
        Parcelable j8 = stripeIntent.j();
        AbstractC3292y.g(j8, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((StripeIntent.a.h) j8).a() == null) {
            p3.i b9 = i.a.b(p3.i.f36196a, this.f36725c, null, 2, null);
            i.f fVar = i.f.f36233d;
            StripeIntent.NextActionType k8 = stripeIntent.k();
            if (k8 == null || (str = k8.b()) == null) {
                str = "";
            }
            i.b.a(b9, fVar, null, Q.e(x.a("next_action_type", str)), 2, null);
            Object d8 = this.f36724b.d(interfaceC2668p, stripeIntent, cVar, dVar);
            if (d8 == V5.b.e()) {
                return d8;
            }
            return I.f8786a;
        }
        Object d9 = this.f36723a.d(interfaceC2668p, stripeIntent, cVar, dVar);
        if (d9 == V5.b.e()) {
            return d9;
        }
        return I.f8786a;
    }
}
