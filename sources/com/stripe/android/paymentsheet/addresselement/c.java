package com.stripe.android.paymentsheet.addresselement;

import C3.AbstractC0985f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f26886a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f26887b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f26888c;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26889a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f26890b;

        public a(Function0 applicationSupplier, Function0 starterArgsSupplier) {
            AbstractC3292y.i(applicationSupplier, "applicationSupplier");
            AbstractC3292y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f26889a = applicationSupplier;
            this.f26890b = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            c a9 = AbstractC0985f.a().a((Context) this.f26889a.invoke()).b((AddressElementActivityContract.a) this.f26890b.invoke()).build().a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return a9;
        }
    }

    public c(com.stripe.android.paymentsheet.addresselement.a navigator, N5.a inputAddressViewModelSubcomponentBuilderProvider, N5.a autoCompleteViewModelSubcomponentBuilderProvider) {
        AbstractC3292y.i(navigator, "navigator");
        AbstractC3292y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        AbstractC3292y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        this.f26886a = navigator;
        this.f26887b = inputAddressViewModelSubcomponentBuilderProvider;
        this.f26888c = autoCompleteViewModelSubcomponentBuilderProvider;
    }

    public final N5.a a() {
        return this.f26888c;
    }

    public final N5.a b() {
        return this.f26887b;
    }

    public final com.stripe.android.paymentsheet.addresselement.a c() {
        return this.f26886a;
    }
}
