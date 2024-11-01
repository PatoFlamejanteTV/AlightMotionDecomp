package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, InterfaceC3214c modelClass, CreationExtras extras) {
        AbstractC3292y.i(factory, "factory");
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(AbstractC1989a.a(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(AbstractC1989a.a(modelClass));
        }
    }
}
