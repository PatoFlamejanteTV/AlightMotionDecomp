package y3;

import E3.c;
import Q5.I;
import Q5.t;
import U5.d;
import androidx.lifecycle.SavedStateHandle;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4243a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f41155d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f41156e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f41157a;

    /* renamed from: b, reason: collision with root package name */
    private final EventReporter f41158b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f41159c;

    /* renamed from: y3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0940a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f41160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f41161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4243a f41162c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0941a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f41163a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f41164b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4243a f41165c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0941a(C4243a c4243a, d dVar) {
                super(2, dVar);
                this.f41165c = c4243a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                C0941a c0941a = new C0941a(this.f41165c, dVar);
                c0941a.f41164b = obj;
                return c0941a;
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E3.c cVar, d dVar) {
                return ((C0941a) create(cVar, dVar)).invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f41163a == 0) {
                    t.b(obj);
                    this.f41165c.i((E3.c) this.f41164b);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0940a(InterfaceC3821f interfaceC3821f, C4243a c4243a, d dVar) {
            super(2, dVar);
            this.f41161b = interfaceC3821f;
            this.f41162c = c4243a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C0940a(this.f41161b, this.f41162c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f41160a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                InterfaceC3821f interfaceC3821f = this.f41161b;
                C0941a c0941a = new C0941a(this.f41162c, null);
                this.f41160a = 1;
                if (AbstractC3823h.j(interfaceC3821f, c0941a, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((C0940a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: y3.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C4243a(SavedStateHandle savedStateHandle, EventReporter eventReporter, InterfaceC3821f currentScreen, M coroutineScope, Function0 currentPaymentMethodTypeProvider) {
        AbstractC3292y.i(savedStateHandle, "savedStateHandle");
        AbstractC3292y.i(eventReporter, "eventReporter");
        AbstractC3292y.i(currentScreen, "currentScreen");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(currentPaymentMethodTypeProvider, "currentPaymentMethodTypeProvider");
        this.f41157a = savedStateHandle;
        this.f41158b = eventReporter;
        this.f41159c = currentPaymentMethodTypeProvider;
        AbstractC3462k.d(coroutineScope, null, null, new C0940a(currentScreen, this, null), 3, null);
    }

    private final String c() {
        return (String) this.f41157a.get("previously_interacted_payment_form");
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f41157a.get("previously_sent_deep_link_event");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final String e() {
        return (String) this.f41157a.get("previously_shown_payment_form");
    }

    private final void g(String str) {
        if (!AbstractC3292y.d(e(), str)) {
            this.f41158b.n(str);
            l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(E3.c cVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (cVar instanceof c.g) {
            z8 = true;
        } else {
            z8 = cVar instanceof c.l;
        }
        if (z8) {
            z9 = true;
        } else {
            z9 = cVar instanceof c.h;
        }
        if (z9) {
            z10 = true;
        } else {
            z10 = cVar instanceof c.i;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = cVar instanceof c.d;
        }
        if (!z11) {
            if (cVar instanceof c.f) {
                this.f41158b.g();
                return;
            }
            if (cVar instanceof c.j) {
                this.f41158b.d();
                l(null);
                j(null);
            } else {
                if (cVar instanceof c.k) {
                    this.f41158b.t();
                    return;
                }
                if (!(cVar instanceof c.b)) {
                    z12 = cVar instanceof c.a;
                }
                if (z12) {
                    g((String) this.f41159c.invoke());
                    this.f41158b.t();
                }
            }
        }
    }

    private final void j(String str) {
        this.f41157a.set("previously_interacted_payment_form", str);
    }

    private final void k(boolean z8) {
        this.f41157a.set("previously_sent_deep_link_event", Boolean.valueOf(z8));
    }

    private final void l(String str) {
        this.f41157a.set("previously_shown_payment_form", str);
    }

    public final void b() {
        if (!d()) {
            this.f41158b.v();
            k(true);
        }
    }

    public final void f(String code) {
        AbstractC3292y.i(code, "code");
        if (!AbstractC3292y.d(c(), code)) {
            this.f41158b.x(code);
            j(code);
        }
    }

    public final void h(E3.c hiddenScreen) {
        AbstractC3292y.i(hiddenScreen, "hiddenScreen");
        if (hiddenScreen instanceof c.f) {
            this.f41158b.w();
        }
    }
}
