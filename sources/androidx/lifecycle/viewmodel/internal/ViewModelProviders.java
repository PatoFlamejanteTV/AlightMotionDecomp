package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import j6.InterfaceC3214c;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewModelProviders {
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();
    private static final String VIEW_MODEL_PROVIDER_DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* loaded from: classes3.dex */
    public static final class ViewModelKey implements CreationExtras.Key<String> {
        public static final ViewModelKey INSTANCE = new ViewModelKey();

        private ViewModelKey() {
        }
    }

    private ViewModelProviders() {
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(Collection<? extends ViewModelInitializer<?>> initializers) {
        AbstractC3292y.i(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(InterfaceC3214c modelClass, CreationExtras extras, ViewModelInitializer<?>... initializers) {
        VM vm;
        ViewModelInitializer<?> viewModelInitializer;
        Function1 initializer$lifecycle_viewmodel_release;
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(extras, "extras");
        AbstractC3292y.i(initializers, "initializers");
        int length = initializers.length;
        int i8 = 0;
        while (true) {
            vm = null;
            if (i8 < length) {
                viewModelInitializer = initializers[i8];
                if (AbstractC3292y.d(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                    break;
                }
                i8++;
            } else {
                viewModelInitializer = null;
                break;
            }
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) != null) {
            vm = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(modelClass)).toString());
    }

    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        AbstractC3292y.i(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        }
        return CreationExtras.Empty.INSTANCE;
    }

    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
        AbstractC3292y.i(owner, "owner");
        if (owner instanceof HasDefaultViewModelProviderFactory) {
            return ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory();
        }
        return DefaultViewModelProviderFactory.INSTANCE;
    }

    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(InterfaceC3214c modelClass) {
        AbstractC3292y.i(modelClass, "modelClass");
        String canonicalName = ViewModelProviders_jvmKt.getCanonicalName(modelClass);
        if (canonicalName != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(ViewModelInitializer<?>... initializers) {
        AbstractC3292y.i(initializers, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
    }
}
