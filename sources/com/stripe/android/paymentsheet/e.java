package com.stripe.android.paymentsheet;

import Q5.InterfaceC1412g;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.a;
import com.stripe.android.paymentsheet.m;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.p;
import g3.InterfaceC2910i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.InterfaceC3286s;
import t2.AbstractC4004a;
import u3.InterfaceC4077a;
import v3.EnumC4126f;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final g f27208a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f27209b;

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: com.stripe.android.paymentsheet.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0606a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC2910i f27210a;

            public C0606a(InterfaceC2910i confirmNextParams) {
                AbstractC3292y.i(confirmNextParams, "confirmNextParams");
                this.f27210a = confirmNextParams;
            }

            public final InterfaceC2910i a() {
                return this.f27210a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0606a) && AbstractC3292y.d(this.f27210a, ((C0606a) obj).f27210a);
            }

            public int hashCode() {
                return this.f27210a.hashCode();
            }

            public String toString() {
                return "Confirm(confirmNextParams=" + this.f27210a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final String f27211a;

            public b(String clientSecret) {
                AbstractC3292y.i(clientSecret, "clientSecret");
                this.f27211a = clientSecret;
            }

            public final String a() {
                return this.f27211a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3292y.d(this.f27211a, ((b) obj).f27211a);
            }

            public int hashCode() {
                return this.f27211a.hashCode();
            }

            public String toString() {
                return "NextAction(clientSecret=" + this.f27211a + ")";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27212a;

        /* renamed from: b, reason: collision with root package name */
        Object f27213b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27214c;

        /* renamed from: e, reason: collision with root package name */
        int f27216e;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27214c = obj;
            this.f27216e |= Integer.MIN_VALUE;
            return e.this.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c implements ActivityResultCallback, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f27217a;

        c(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f27217a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof InterfaceC3286s)) {
                return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f27217a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f27217a.invoke(obj);
        }
    }

    public e(g intentConfirmationInterceptor, Function1 paymentLauncherFactory) {
        AbstractC3292y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        AbstractC3292y.i(paymentLauncherFactory, "paymentLauncherFactory");
        this.f27208a = intentConfirmationInterceptor;
        this.f27209b = paymentLauncherFactory;
    }

    private final void d(InterfaceC4077a interfaceC4077a, InterfaceC2910i interfaceC2910i) {
        if (interfaceC2910i instanceof com.stripe.android.model.b) {
            interfaceC4077a.a((com.stripe.android.model.b) interfaceC2910i);
        } else if (interfaceC2910i instanceof com.stripe.android.model.c) {
            interfaceC4077a.c((com.stripe.android.model.c) interfaceC2910i);
        }
    }

    private final void e(InterfaceC4077a interfaceC4077a, String str, StripeIntent stripeIntent) {
        if (stripeIntent instanceof com.stripe.android.model.n) {
            interfaceC4077a.b(str);
        } else if (stripeIntent instanceof com.stripe.android.model.u) {
            interfaceC4077a.d(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.stripe.android.paymentsheet.n.d r5, com.stripe.android.model.StripeIntent r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.e.b
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.e$b r0 = (com.stripe.android.paymentsheet.e.b) r0
            int r1 = r0.f27216e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27216e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.e$b r0 = new com.stripe.android.paymentsheet.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27214c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f27216e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f27213b
            r6 = r5
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            java.lang.Object r5 = r0.f27212a
            com.stripe.android.paymentsheet.n$d r5 = (com.stripe.android.paymentsheet.n.d) r5
            Q5.t.b(r7)
            goto L4c
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            Q5.t.b(r7)
            com.stripe.android.paymentsheet.g r7 = r4.f27208a
            r0.f27212a = r5
            r0.f27213b = r6
            r0.f27216e = r3
            java.lang.Object r7 = com.stripe.android.paymentsheet.h.a(r7, r5, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.stripe.android.paymentsheet.g$b r7 = (com.stripe.android.paymentsheet.g.b) r7
            v3.f r0 = r7.a()
            boolean r1 = r7 instanceof com.stripe.android.paymentsheet.g.b.d
            if (r1 == 0) goto L67
            com.stripe.android.paymentsheet.l$c r5 = new com.stripe.android.paymentsheet.l$c
            com.stripe.android.paymentsheet.e$a$b r6 = new com.stripe.android.paymentsheet.e$a$b
            com.stripe.android.paymentsheet.g$b$d r7 = (com.stripe.android.paymentsheet.g.b.d) r7
            java.lang.String r7 = r7.b()
            r6.<init>(r7)
            r5.<init>(r6, r0)
            goto L9c
        L67:
            boolean r1 = r7 instanceof com.stripe.android.paymentsheet.g.b.C0609b
            if (r1 == 0) goto L7c
            com.stripe.android.paymentsheet.l$c r5 = new com.stripe.android.paymentsheet.l$c
            com.stripe.android.paymentsheet.e$a$a r6 = new com.stripe.android.paymentsheet.e$a$a
            com.stripe.android.paymentsheet.g$b$b r7 = (com.stripe.android.paymentsheet.g.b.C0609b) r7
            g3.i r7 = r7.b()
            r6.<init>(r7)
            r5.<init>(r6, r0)
            goto L9c
        L7c:
            boolean r1 = r7 instanceof com.stripe.android.paymentsheet.g.b.c
            if (r1 == 0) goto L92
            com.stripe.android.paymentsheet.l$b r5 = new com.stripe.android.paymentsheet.l$b
            com.stripe.android.paymentsheet.g$b$c r7 = (com.stripe.android.paymentsheet.g.b.c) r7
            java.lang.Throwable r6 = r7.b()
            C2.c r7 = r7.c()
            com.stripe.android.paymentsheet.m$d r0 = com.stripe.android.paymentsheet.m.d.f27361a
            r5.<init>(r6, r7, r0)
            goto L9c
        L92:
            boolean r7 = r7 instanceof com.stripe.android.paymentsheet.g.b.a
            if (r7 == 0) goto L9d
            com.stripe.android.paymentsheet.l$a r7 = new com.stripe.android.paymentsheet.l$a
            r7.<init>(r6, r5, r0)
            r5 = r7
        L9c:
            return r5
        L9d:
            Q5.p r5 = new Q5.p
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.e.a(com.stripe.android.paymentsheet.n$d, com.stripe.android.model.StripeIntent, U5.d):java.lang.Object");
    }

    public InterfaceC4077a b(ActivityResultCaller activityResultCaller, Function1 onResult) {
        AbstractC3292y.i(activityResultCaller, "activityResultCaller");
        AbstractC3292y.i(onResult, "onResult");
        Function1 function1 = this.f27209b;
        ActivityResultLauncher registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new c(onResult));
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        return (InterfaceC4077a) function1.invoke(registerForActivityResult);
    }

    public void c(InterfaceC4077a launcher, a arguments, n.d confirmationOption, StripeIntent intent) {
        AbstractC3292y.i(launcher, "launcher");
        AbstractC3292y.i(arguments, "arguments");
        AbstractC3292y.i(confirmationOption, "confirmationOption");
        AbstractC3292y.i(intent, "intent");
        if (arguments instanceof a.C0606a) {
            d(launcher, ((a.C0606a) arguments).a());
        } else if (arguments instanceof a.b) {
            e(launcher, ((a.b) arguments).a(), intent);
        }
    }

    public p f(n.d confirmationOption, EnumC4126f enumC4126f, StripeIntent intent, com.stripe.android.payments.paymentlauncher.a result) {
        AbstractC3292y.i(confirmationOption, "confirmationOption");
        AbstractC3292y.i(intent, "intent");
        AbstractC3292y.i(result, "result");
        if (result instanceof a.c) {
            return new p.c(((a.c) result).b(), enumC4126f);
        }
        if (result instanceof a.d) {
            a.d dVar = (a.d) result;
            return new p.b(dVar.b(), AbstractC4004a.a(dVar.b()), m.f.f27363a);
        }
        if (result instanceof a.C0553a) {
            return new p.a(v3.n.f40526a);
        }
        throw new Q5.p();
    }
}
