package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class n implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
        return androidx.lifecycle.n.a(this, interfaceC3214c, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return androidx.lifecycle.n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class modelClass) {
        AbstractC3292y.i(modelClass, "modelClass");
        Y7.d dVar = Y7.d.f13152a;
        return new C3507m(dVar.n(), dVar.j(), dVar.j().f4498c, dVar.p(), dVar.j().f4497b.b(), dVar.j().f4497b.f4464j, dVar.j().f4497b.f4466l, dVar.j().f4497b.f4463i, dVar.j().f4497b.f4465k);
    }
}
