package O3;

import B3.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import c6.InterfaceC2072n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* renamed from: O3.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1375x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.x$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7832a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F3.a f7833b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7834c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f7835d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f7836e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f7837f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7838g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7839h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, F3.a aVar, boolean z8, Function1 function1, List list, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7832a = str;
            this.f7833b = aVar;
            this.f7834c = z8;
            this.f7835d = function1;
            this.f7836e = list;
            this.f7837f = modifier;
            this.f7838g = i8;
            this.f7839h = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1375x.a(this.f7832a, this.f7833b, this.f7834c, this.f7835d, this.f7836e, this.f7837f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7838g | 1), this.f7839h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.x$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f7840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f7841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7842c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O3.x$b$a */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1 f7843a;

            a(Function1 function1) {
                this.f7843a = function1;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.c cVar, U5.d dVar) {
                this.f7843a.invoke(cVar);
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3821f interfaceC3821f, Function1 function1, U5.d dVar) {
            super(2, dVar);
            this.f7841b = interfaceC3821f;
            this.f7842c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f7841b, this.f7842c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f7840a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InterfaceC3821f p8 = AbstractC3823h.p(this.f7841b);
                a aVar = new a(this.f7842c);
                this.f7840a = 1;
                if (p8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.x$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f7846c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f f7847d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f7848e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7849f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r4.G f7850g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f7851h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7852i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7853j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z8, Function1 function1, InterfaceC3821f interfaceC3821f, Set set, List list, r4.G g8, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7844a = str;
            this.f7845b = z8;
            this.f7846c = function1;
            this.f7847d = interfaceC3821f;
            this.f7848e = set;
            this.f7849f = list;
            this.f7850g = g8;
            this.f7851h = modifier;
            this.f7852i = i8;
            this.f7853j = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1375x.b(this.f7844a, this.f7845b, this.f7846c, this.f7847d, this.f7848e, this.f7849f, this.f7850g, this.f7851h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7852i | 1), this.f7853j);
        }
    }

    public static final void a(String uuid, F3.a args, boolean z8, Function1 onFormFieldValuesChanged, List formElements, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        CreationExtras creationExtras;
        AbstractC3292y.i(uuid, "uuid");
        AbstractC3292y.i(args, "args");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(formElements, "formElements");
        Composer startRestartGroup = composer.startRestartGroup(-254814677);
        if ((i9 & 32) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-254814677, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:26)");
        }
        String str = args.e() + "_" + uuid;
        d.b bVar = new d.b(formElements, args);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) B3.d.class, current, str, bVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            B3.d dVar = (B3.d) viewModel;
            List d8 = dVar.d();
            State a9 = A4.f.a(dVar.e(), startRestartGroup, 8);
            State a10 = A4.f.a(dVar.f(), startRestartGroup, 8);
            int i10 = i8 >> 3;
            b(args.e(), z8, onFormFieldValuesChanged, dVar.b(), c(a9), d8, d(a10), modifier2, startRestartGroup, (i10 & 896) | (i10 & 112) | 299008 | (r4.G.f37990d << 18) | ((i8 << 6) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(uuid, args, z8, onFormFieldValuesChanged, formElements, modifier2, i8, i9));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    public static final void b(String paymentMethodCode, boolean z8, Function1 onFormFieldValuesChanged, InterfaceC3821f completeFormValues, Set hiddenIdentifiers, List elements, r4.G g8, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
        AbstractC3292y.i(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        AbstractC3292y.i(completeFormValues, "completeFormValues");
        AbstractC3292y.i(hiddenIdentifiers, "hiddenIdentifiers");
        AbstractC3292y.i(elements, "elements");
        Composer startRestartGroup = composer.startRestartGroup(958947257);
        if ((i9 & 128) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(958947257, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:61)");
        }
        EffectsKt.LaunchedEffect(paymentMethodCode, new b(completeFormValues, onFormFieldValuesChanged, null), startRestartGroup, (i8 & 14) | 64);
        int i10 = i8 >> 9;
        Modifier modifier3 = modifier2;
        g4.i.a(hiddenIdentifiers, z8, elements, g8, modifier3, startRestartGroup, (i8 & 112) | 520 | (r4.G.f37990d << 9) | (i10 & 7168) | (i10 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(paymentMethodCode, z8, onFormFieldValuesChanged, completeFormValues, hiddenIdentifiers, elements, g8, modifier2, i8, i9));
        }
    }

    private static final Set c(State state) {
        return (Set) state.getValue();
    }

    private static final r4.G d(State state) {
        return (r4.G) state.getValue();
    }
}
