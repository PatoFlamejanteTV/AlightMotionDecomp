package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, InterfaceC3214c modelClass, CreationExtras extras) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        return factory.create(AbstractC1989a.a(modelClass), extras);
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class modelClass) {
        AbstractC3292y.i(modelClass, "modelClass");
        return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    public static ViewModel c(ViewModelProvider.Factory factory, Class modelClass, CreationExtras extras) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        return factory.create(modelClass);
    }

    public static ViewModelProvider.Factory d(ViewModelInitializer... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}
