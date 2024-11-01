package com.stripe.android.paymentsheet.addresselement;

import Q5.I;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.stripe.android.paymentsheet.addresselement.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0586a f26878c = new C0586a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f26879d = 8;

    /* renamed from: a, reason: collision with root package name */
    private NavHostController f26880a;

    /* renamed from: b, reason: collision with root package name */
    private Function1 f26881b;

    /* renamed from: com.stripe.android.paymentsheet.addresselement.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0586a {
        private C0586a() {
        }

        public /* synthetic */ C0586a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static /* synthetic */ void b(a aVar, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            dVar = d.a.f26891a;
        }
        aVar.a(dVar);
    }

    public final void a(d result) {
        AbstractC3292y.i(result, "result");
        Function1 function1 = this.f26881b;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    public final InterfaceC3821f c(String key) {
        NavBackStackEntry currentBackStackEntry;
        AbstractC3292y.i(key, "key");
        NavHostController navHostController = this.f26880a;
        if (navHostController == null || (currentBackStackEntry = navHostController.getCurrentBackStackEntry()) == null) {
            return null;
        }
        return AbstractC3823h.v(currentBackStackEntry.getSavedStateHandle().getStateFlow(key, null));
    }

    public final I d(b target) {
        AbstractC3292y.i(target, "target");
        NavHostController navHostController = this.f26880a;
        if (navHostController != null) {
            NavController.navigate$default(navHostController, target.a(), null, null, 6, null);
            return I.f8786a;
        }
        return null;
    }

    public final void e() {
        NavHostController navHostController = this.f26880a;
        if (navHostController != null && !navHostController.popBackStack()) {
            b(this, null, 1, null);
        }
    }

    public final void f(NavHostController navHostController) {
        this.f26880a = navHostController;
    }

    public final void g(Function1 function1) {
        this.f26881b = function1;
    }

    public final I h(String key, Object obj) {
        NavBackStackEntry previousBackStackEntry;
        SavedStateHandle savedStateHandle;
        AbstractC3292y.i(key, "key");
        NavHostController navHostController = this.f26880a;
        if (navHostController != null && (previousBackStackEntry = navHostController.getPreviousBackStackEntry()) != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set(key, obj);
            return I.f8786a;
        }
        return null;
    }
}
