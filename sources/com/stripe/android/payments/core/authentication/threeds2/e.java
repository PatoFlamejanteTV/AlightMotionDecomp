package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import s3.AbstractC3958j;
import v0.AbstractC4118a;

/* loaded from: classes4.dex */
public final class e implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f26477a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2TransactionContract.a f26478a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Stripe3ds2TransactionContract.a aVar) {
            super(0);
            this.f26478a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f26478a.l();
        }
    }

    public e(Function0 argsSupplier) {
        AbstractC3292y.i(argsSupplier, "argsSupplier");
        this.f26477a = argsSupplier;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
        return n.a(this, interfaceC3214c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return n.b(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass, CreationExtras extras) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        Stripe3ds2TransactionContract.a aVar = (Stripe3ds2TransactionContract.a) this.f26477a.invoke();
        Application a9 = E2.b.a(extras);
        d a10 = AbstractC3958j.a().a(a9).d(aVar.b()).c(new a(aVar)).b(aVar.i()).e(AbstractC4118a.c(a9)).build().a().c(aVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(a9).build().a();
        AbstractC3292y.g(a10, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return a10;
    }
}
