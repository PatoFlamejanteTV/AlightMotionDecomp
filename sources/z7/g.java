package Z7;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.data.storage.SharedStorage;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g implements ViewModelProvider.Factory {
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
        SharedStorage m8 = dVar.m();
        ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
        return new f(m8, choiceCmp.getCallback(), dVar.p().b(), choiceCmp.getPortalConfig$app_release(), dVar.o(), dVar.e());
    }
}
