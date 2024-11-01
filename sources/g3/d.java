package G3;

import D3.f;
import Q5.I;
import c3.AbstractC2026f;
import c6.InterfaceC2072n;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.A;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import q6.w;
import w3.C4154a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: q, reason: collision with root package name */
    public static final a f2858q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f2859r = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2861b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2862c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2863d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2864e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2865f;

    /* renamed from: g, reason: collision with root package name */
    private final String f2866g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2867h;

    /* renamed from: i, reason: collision with root package name */
    private final C4154a f2868i;

    /* renamed from: j, reason: collision with root package name */
    private final D3.f f2869j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC2072n f2870k;

    /* renamed from: l, reason: collision with root package name */
    private final Function1 f2871l;

    /* renamed from: m, reason: collision with root package name */
    private final Function1 f2872m;

    /* renamed from: n, reason: collision with root package name */
    private final Function1 f2873n;

    /* renamed from: o, reason: collision with root package name */
    private final Function1 f2874o;

    /* renamed from: p, reason: collision with root package name */
    private final Function1 f2875p;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: G3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0052a extends C3289v implements InterfaceC2072n {
            C0052a(Object obj) {
                super(2, obj, com.stripe.android.paymentsheet.j.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0);
            }

            public final void d(C2.c cVar, boolean z8) {
                ((com.stripe.android.paymentsheet.j) this.receiver).e(cVar, z8);
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                d((C2.c) obj, ((Boolean) obj2).booleanValue());
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class b extends C3289v implements Function1 {
            b(Object obj) {
                super(1, obj, R3.a.class, "handleConfirmUSBankAccount", "handleConfirmUSBankAccount(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0);
            }

            public final void d(f.e.d p02) {
                AbstractC3292y.i(p02, "p0");
                ((R3.a) this.receiver).D(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((f.e.d) obj);
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        /* synthetic */ class c extends C3289v implements Function1 {
            c(Object obj) {
                super(1, obj, R3.a.class, "updatePrimaryButtonState", "updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", 0);
            }

            public final void d(PrimaryButton.a p02) {
                AbstractC3292y.i(p02, "p0");
                ((R3.a) this.receiver).L(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((PrimaryButton.a) obj);
                return I.f8786a;
            }
        }

        /* renamed from: G3.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        /* synthetic */ class C0053d extends C3289v implements Function1 {
            C0053d(Object obj) {
                super(1, obj, R3.a.class, "onError", "onError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
            }

            public final void d(C2.c cVar) {
                ((R3.a) this.receiver).G(cVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                d((C2.c) obj);
                return I.f8786a;
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f2876a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(R3.a aVar) {
                super(1);
                this.f2876a = aVar;
            }

            public final void a(Function1 it) {
                Object value;
                AbstractC3292y.i(it, "it");
                w g8 = this.f2876a.g();
                do {
                    value = g8.getValue();
                } while (!g8.a(value, it.invoke(value)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Function1) obj);
                return I.f8786a;
            }
        }

        private a() {
        }

        public final d a(R3.a viewModel, C2752d paymentMethodMetadata, String hostedSurface, String selectedPaymentMethodCode) {
            A a9;
            w.l lVar;
            w.l.a aVar;
            String str;
            boolean z8;
            D3.f fVar;
            w.m b9;
            PaymentSheetContractV2.a l02;
            AbstractC3292y.i(viewModel, "viewModel");
            AbstractC3292y.i(paymentMethodMetadata, "paymentMethodMetadata");
            AbstractC3292y.i(hostedSurface, "hostedSurface");
            AbstractC3292y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            boolean a10 = AbstractC2026f.a(selectedPaymentMethodCode, paymentMethodMetadata.U(), paymentMethodMetadata.W(), paymentMethodMetadata.z());
            boolean d8 = AbstractC3292y.d(selectedPaymentMethodCode, o.p.f25754h.f25773a);
            if (viewModel instanceof A) {
                a9 = (A) viewModel;
            } else {
                a9 = null;
            }
            if (a9 != null && (l02 = a9.l0()) != null) {
                lVar = l02.f();
            } else {
                lVar = null;
            }
            if (lVar instanceof w.l.a) {
                aVar = (w.l.a) lVar;
            } else {
                aVar = null;
            }
            if (aVar != null && (b9 = aVar.b()) != null) {
                str = b9.b();
            } else {
                str = null;
            }
            StripeIntent W8 = paymentMethodMetadata.W();
            if (a10 && !d8) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean F8 = viewModel.F();
            boolean z9 = W8 instanceof n;
            String id = W8.getId();
            String d9 = W8.d();
            C4154a q8 = viewModel.f().q();
            com.stripe.android.paymentsheet.k s8 = viewModel.s();
            if (s8 != null) {
                fVar = s8.d();
            } else {
                fVar = null;
            }
            return new d(d8, str, z8, F8, z9, id, d9, hostedSurface, q8, fVar, new C0052a(viewModel.q()), new b(viewModel), null, new e(viewModel), new c(viewModel), new C0053d(viewModel));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public d(boolean z8, String str, boolean z9, boolean z10, boolean z11, String str2, String str3, String hostedSurface, C4154a c4154a, D3.f fVar, InterfaceC2072n onMandateTextChanged, Function1 onConfirmUSBankAccount, Function1 function1, Function1 onUpdatePrimaryButtonUIState, Function1 onUpdatePrimaryButtonState, Function1 onError) {
        AbstractC3292y.i(hostedSurface, "hostedSurface");
        AbstractC3292y.i(onMandateTextChanged, "onMandateTextChanged");
        AbstractC3292y.i(onConfirmUSBankAccount, "onConfirmUSBankAccount");
        AbstractC3292y.i(onUpdatePrimaryButtonUIState, "onUpdatePrimaryButtonUIState");
        AbstractC3292y.i(onUpdatePrimaryButtonState, "onUpdatePrimaryButtonState");
        AbstractC3292y.i(onError, "onError");
        this.f2860a = z8;
        this.f2861b = str;
        this.f2862c = z9;
        this.f2863d = z10;
        this.f2864e = z11;
        this.f2865f = str2;
        this.f2866g = str3;
        this.f2867h = hostedSurface;
        this.f2868i = c4154a;
        this.f2869j = fVar;
        this.f2870k = onMandateTextChanged;
        this.f2871l = onConfirmUSBankAccount;
        this.f2872m = function1;
        this.f2873n = onUpdatePrimaryButtonUIState;
        this.f2874o = onUpdatePrimaryButtonState;
        this.f2875p = onError;
    }

    public final String a() {
        return this.f2866g;
    }

    public final D3.f b() {
        return this.f2869j;
    }

    public final String c() {
        return this.f2867h;
    }

    public final boolean d() {
        return this.f2860a;
    }

    public final String e() {
        return this.f2861b;
    }

    public final Function1 f() {
        return this.f2872m;
    }

    public final Function1 g() {
        return this.f2871l;
    }

    public final Function1 h() {
        return this.f2875p;
    }

    public final InterfaceC2072n i() {
        return this.f2870k;
    }

    public final Function1 j() {
        return this.f2874o;
    }

    public final Function1 k() {
        return this.f2873n;
    }

    public final C4154a l() {
        return this.f2868i;
    }

    public final boolean m() {
        return this.f2862c;
    }

    public final String n() {
        return this.f2865f;
    }

    public final boolean o() {
        return this.f2863d;
    }

    public final boolean p() {
        return this.f2864e;
    }
}
