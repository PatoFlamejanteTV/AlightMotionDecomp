package v3;

import O3.AbstractC1355c;
import Q5.I;
import R5.AbstractC1435t;
import c3.C2027g;
import com.stripe.android.model.o;
import d3.C2752d;
import d3.InterfaceC2756h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import p2.InterfaceC3560b;
import r4.D;

/* renamed from: v3.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4131k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f40492g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f40493h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3560b.a f40494a;

    /* renamed from: b, reason: collision with root package name */
    private final C2752d f40495b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f40496c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f40497d;

    /* renamed from: e, reason: collision with root package name */
    private final P2.e f40498e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f40499f;

    /* renamed from: v3.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v3.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0911a extends C3289v implements Function1 {
            C0911a(Object obj) {
                super(1, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0);
            }

            public final void d(Y2.e p02) {
                AbstractC3292y.i(p02, "p0");
                ((m) this.receiver).h(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((Y2.e) obj);
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v3.k$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f40500a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(R3.a aVar) {
                super(0);
                this.f40500a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.paymentsheet.k invoke() {
                return this.f40500a.s();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v3.k$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f40501a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(R3.a aVar) {
                super(1);
                this.f40501a = aVar;
            }

            public final void a(D3.f fVar) {
                this.f40501a.M(fVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((D3.f) obj);
                return I.f8786a;
            }
        }

        private a() {
        }

        public final C4131k a(R3.a viewModel, m linkInlineHandler, C2752d paymentMethodMetadata) {
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(linkInlineHandler, "linkInlineHandler");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            return new C4131k(viewModel.e(), paymentMethodMetadata, new b(viewModel), new c(viewModel), viewModel.p().e(), new C0911a(linkInlineHandler));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C4131k(InterfaceC3560b.a cardAccountRangeRepositoryFactory, C2752d paymentMethodMetadata, Function0 newPaymentSelectionProvider, Function1 selectionUpdater, P2.e linkConfigurationCoordinator, Function1 onLinkInlineSignupStateChanged) {
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC3292y.i(newPaymentSelectionProvider, "newPaymentSelectionProvider");
        AbstractC3292y.i(selectionUpdater, "selectionUpdater");
        AbstractC3292y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3292y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
        this.f40494a = cardAccountRangeRepositoryFactory;
        this.f40495b = paymentMethodMetadata;
        this.f40496c = newPaymentSelectionProvider;
        this.f40497d = selectionUpdater;
        this.f40498e = linkConfigurationCoordinator;
        this.f40499f = onLinkInlineSignupStateChanged;
    }

    private final C2027g e(String str) {
        C2027g g02 = this.f40495b.g0(str);
        if (g02 != null) {
            return g02;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final F3.a a(String paymentMethodCode) {
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        return B3.b.f565a.b(paymentMethodCode, this.f40495b);
    }

    public final List b(String code) {
        com.stripe.android.model.p pVar;
        AbstractC3292y.i(code, "code");
        com.stripe.android.paymentsheet.k kVar = (com.stripe.android.paymentsheet.k) this.f40496c.invoke();
        com.stripe.android.model.q qVar = null;
        if (kVar == null || !AbstractC3292y.d(kVar.getType(), code)) {
            kVar = null;
        }
        C2752d c2752d = this.f40495b;
        InterfaceC3560b.a aVar = this.f40494a;
        P2.e eVar = this.f40498e;
        Function1 function1 = this.f40499f;
        if (kVar != null) {
            pVar = kVar.c();
        } else {
            pVar = null;
        }
        if (kVar != null) {
            qVar = kVar.a();
        }
        List l8 = c2752d.l(code, new InterfaceC2756h.a.InterfaceC0717a.C0718a(aVar, eVar, function1, pVar, qVar));
        if (l8 == null) {
            return AbstractC1435t.m();
        }
        return l8;
    }

    public final void c(B3.c cVar, String selectedPaymentMethodCode) {
        D3.f fVar;
        AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        if (cVar != null) {
            fVar = AbstractC1355c.g(cVar, e(selectedPaymentMethodCode), this.f40495b);
        } else {
            fVar = null;
        }
        this.f40497d.invoke(fVar);
    }

    public final boolean d(String selectedPaymentMethodCode) {
        AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        List b9 = b(selectedPaymentMethodCode);
        if (!(b9 instanceof Collection) || !b9.isEmpty()) {
            Iterator it = b9.iterator();
            while (it.hasNext()) {
                if (((D) it.next()).c()) {
                    break;
                }
            }
        }
        if (!AbstractC3292y.d(selectedPaymentMethodCode, o.p.f25745O.f25773a) && !AbstractC3292y.d(selectedPaymentMethodCode, o.p.f25754h.f25773a)) {
            return false;
        }
        return true;
    }
}
