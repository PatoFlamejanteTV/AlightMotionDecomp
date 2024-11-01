package E5;

import D5.s;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h implements ViewModelProvider.Factory {
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
        Y7.d dVar = Y7.d.f13152a;
        s n8 = dVar.n();
        if (Y7.d.f13176y == null) {
            Y7.d.f13176y = new U7.h(dVar.i(), dVar.l(), new W7.e());
        }
        U7.g gVar = Y7.d.f13176y;
        if (gVar == null) {
            AbstractC3292y.y("disclosureRepository_");
            gVar = null;
        }
        return new g(n8, gVar, dVar.p());
    }
}
