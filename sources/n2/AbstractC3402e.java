package n2;

import com.stripe.android.model.b;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import g3.InterfaceC2910i;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3402e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35322a = new a(null);

    /* renamed from: n2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3402e a(String clientSecret, b.d dVar) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            if (n.c.f25592c.a(clientSecret)) {
                return new C3400c(clientSecret, dVar);
            }
            if (u.b.f25937c.a(clientSecret)) {
                return new C3401d(clientSecret);
            }
            throw new IllegalStateException(("Encountered an invalid client secret \"" + clientSecret + "\"").toString());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ AbstractC3402e(AbstractC3284p abstractC3284p) {
        this();
    }

    public final InterfaceC2910i a(com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
        AbstractC3292y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f25631a;
        if (str == null) {
            str = "";
        }
        return c(str, paymentMethod.f25635e, rVar);
    }

    public abstract InterfaceC2910i b(com.stripe.android.model.p pVar, com.stripe.android.model.r rVar);

    public abstract InterfaceC2910i c(String str, o.p pVar, com.stripe.android.model.r rVar);

    private AbstractC3402e() {
    }
}
