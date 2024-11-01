package com.stripe.android.payments.bankaccount.ui;

import Q5.C1413h;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.p;
import Q5.t;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.a;
import com.stripe.android.payments.bankaccount.ui.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import kotlin.jvm.internal.U;
import l3.InterfaceC3322a;
import n6.M;
import q6.InterfaceC3802A;
import q6.InterfaceC3822g;
import t3.c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    private t3.c f26342b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f26341a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f26343c = new ViewModelLazy(U.b(com.stripe.android.payments.bankaccount.ui.b.class), new d(this), new g(), new e(null, this));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3289v implements Function1 {
        a(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetInstantDebitsResult p02) {
            AbstractC3292y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).u(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetInstantDebitsResult) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3289v implements Function1 {
        b(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetResult p02) {
            AbstractC3292y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).t(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetResult) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26344a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f26346a;

            a(CollectBankAccountActivity collectBankAccountActivity) {
                this.f26346a = collectBankAccountActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.ui.a aVar, U5.d dVar) {
                if (aVar instanceof a.b) {
                    this.f26346a.s((a.b) aVar);
                } else if (aVar instanceof a.C0544a) {
                    this.f26346a.r((a.C0544a) aVar);
                }
                return I.f8786a;
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f26344a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3802A s8 = CollectBankAccountActivity.this.p().s();
                a aVar = new a(CollectBankAccountActivity.this);
                this.f26344a = 1;
                if (s8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f26347a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26347a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26348a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26348a = function0;
            this.f26349b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26348a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26349b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3293z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountContract.a invoke() {
            CollectBankAccountContract.a.C0533a c0533a = CollectBankAccountContract.a.f26284g;
            Intent intent = CollectBankAccountActivity.this.getIntent();
            AbstractC3292y.h(intent, "getIntent(...)");
            return c0533a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3293z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f26352a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CollectBankAccountActivity collectBankAccountActivity) {
                super(0);
                this.f26352a = collectBankAccountActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CollectBankAccountContract.a invoke() {
                CollectBankAccountContract.a o8 = this.f26352a.o();
                if (o8 != null) {
                    return o8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.c(new a(CollectBankAccountActivity.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.a o() {
        return (CollectBankAccountContract.a) this.f26341a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.payments.bankaccount.ui.b p() {
        return (com.stripe.android.payments.bankaccount.ui.b) this.f26343c.getValue();
    }

    private final void q(InterfaceC3322a interfaceC3322a) {
        t3.c b9;
        if (interfaceC3322a instanceof InterfaceC3322a.C0793a) {
            b9 = c.a.d(t3.c.f39468a, this, new a(p()), null, null, 12, null);
        } else if (interfaceC3322a instanceof InterfaceC3322a.b) {
            b9 = c.a.b(t3.c.f39468a, this, new b(p()), null, null, 12, null);
        } else {
            throw new p();
        }
        this.f26342b = b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(a.C0544a c0544a) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.c(c0544a.a()).b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(a.b bVar) {
        t3.c cVar = this.f26342b;
        if (cVar == null) {
            AbstractC3292y.y("financialConnectionsPaymentsProxy");
            cVar = null;
        }
        cVar.a(bVar.a(), bVar.b(), bVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC3322a interfaceC3322a;
        super.onCreate(bundle);
        CollectBankAccountContract.a o8 = o();
        if (o8 != null) {
            interfaceC3322a = o8.b();
        } else {
            interfaceC3322a = null;
        }
        if (interfaceC3322a == null) {
            r(new a.C0544a(new d.c(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.a o9 = o();
        if (o9 != null) {
            q(o9.b());
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new c(null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
