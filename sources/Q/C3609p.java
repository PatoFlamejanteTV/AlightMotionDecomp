package q;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.inmobi.cmp.ChoiceCmp;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3609p implements ViewModelProvider.Factory {
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
        return new C3606m(dVar.h(), dVar.f(), ChoiceCmp.INSTANCE.getCallback());
    }
}
