package q3;

import Q5.x;
import R5.Q;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3645n extends AbstractC3637f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36719b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f36720c = Q.e(x.a(StripeIntent.a.n.class, "com.stripe:stripe-wechatpay:20.51.0"));

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f36721a;

    /* renamed from: q3.n$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3645n(Function1 paymentRelayStarterFactory) {
        AbstractC3292y.i(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        this.f36721a = paymentRelayStarterFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:            if (r6 == null) goto L6;     */
    @Override // q3.AbstractC3637f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(com.stripe.android.view.InterfaceC2668p r4, com.stripe.android.model.StripeIntent r5, B2.j.c r6, U5.d r7) {
        /*
            r3 = this;
            com.stripe.android.model.StripeIntent$a r6 = r5.j()
            if (r6 == 0) goto L3a
            java.lang.Class r6 = r6.getClass()
            x2.k$a r7 = x2.k.f40948e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.getSimpleName()
            java.util.Map r2 = q3.C3645n.f36720c
            java.lang.Object r6 = r2.get(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " type is not supported, add "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = " in build.gradle to support it"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            x2.k r6 = r7.b(r0)
            if (r6 != 0) goto L47
        L3a:
            x2.k$a r6 = x2.k.f40948e
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "stripeIntent.nextActionData is null"
            r7.<init>(r0)
            x2.k r6 = r6.b(r7)
        L47:
            kotlin.jvm.functions.Function1 r7 = r3.f36721a
            java.lang.Object r4 = r7.invoke(r4)
            com.stripe.android.a r4 = (com.stripe.android.a) r4
            com.stripe.android.a$a$b r7 = new com.stripe.android.a$a$b
            int r5 = com.stripe.android.model.y.a(r5)
            r7.<init>(r6, r5)
            r4.a(r7)
            Q5.I r4 = Q5.I.f8786a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.C3645n.e(com.stripe.android.view.p, com.stripe.android.model.StripeIntent, B2.j$c, U5.d):java.lang.Object");
    }
}
