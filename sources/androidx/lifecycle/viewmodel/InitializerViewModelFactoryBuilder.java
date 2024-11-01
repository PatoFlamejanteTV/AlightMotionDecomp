package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt;
import j6.InterfaceC3214c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@ViewModelFactoryDsl
/* loaded from: classes3.dex */
public final class InitializerViewModelFactoryBuilder {
    private final Map<InterfaceC3214c, ViewModelInitializer<?>> initializers = new LinkedHashMap();

    public final <T extends ViewModel> void addInitializer(InterfaceC3214c clazz, Function1 initializer) {
        AbstractC3292y.i(clazz, "clazz");
        AbstractC3292y.i(initializer, "initializer");
        if (!this.initializers.containsKey(clazz)) {
            this.initializers.put(clazz, new ViewModelInitializer<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + ViewModelProviders_jvmKt.getCanonicalName(clazz) + '.').toString());
    }

    public final ViewModelProvider.Factory build() {
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(this.initializers.values());
    }
}
