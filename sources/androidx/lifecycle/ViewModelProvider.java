package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class ViewModelProvider {
    public static final Companion Companion = new Companion(null);
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;
    private final ViewModelProviderImpl impl;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                factory = ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            if ((i8 & 4) != 0) {
                creationExtras = ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        public final ViewModelProvider create(ViewModelStoreOwner owner, Factory factory, CreationExtras extras) {
            AbstractC3292y.i(owner, "owner");
            AbstractC3292y.i(factory, "factory");
            AbstractC3292y.i(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final ViewModelProvider create(ViewModelStore store, Factory factory, CreationExtras extras) {
            AbstractC3292y.i(store, "store");
            AbstractC3292y.i(factory, "factory");
            AbstractC3292y.i(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i8 & 4) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }
    }

    /* loaded from: classes3.dex */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... initializers) {
                AbstractC3292y.i(initializers, "initializers");
                return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release((ViewModelInitializer<?>[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        <T extends ViewModel> T create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras);

        <T extends ViewModel> T create(Class<T> cls);

        <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras);
    }

    /* loaded from: classes3.dex */
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = ViewModelProviders.ViewModelKey.INSTANCE;
        private static NewInstanceFactory _instance;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory._instance;
                AbstractC3292y.f(newInstanceFactory);
                return newInstanceFactory;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(InterfaceC3214c modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            return (T) create(AbstractC1989a.a(modelClass), extras);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            AbstractC3292y.i(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, null);
        AbstractC3292y.i(store, "store");
        AbstractC3292y.i(factory, "factory");
    }

    public static final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStore, factory, creationExtras);
    }

    @MainThread
    public final <T extends ViewModel> T get(InterfaceC3214c modelClass) {
        AbstractC3292y.i(modelClass, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.impl, modelClass, null, 2, null);
    }

    /* loaded from: classes3.dex */
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        private static AndroidViewModelFactory _instance;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                AbstractC3292y.i(application, "application");
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory._instance;
                AbstractC3292y.f(androidViewModelFactory);
                return androidViewModelFactory;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private AndroidViewModelFactory(Application application, int i8) {
            this.application = application;
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            AbstractC3292y.i(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    AbstractC3292y.h(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (InstantiationException e9) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e9);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                }
            }
            return (T) super.create(cls);
        }
    }

    private ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.impl = viewModelProviderImpl;
    }

    public static final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
        return Companion.create(viewModelStoreOwner, factory, creationExtras);
    }

    @MainThread
    public <T extends ViewModel> T get(Class<T> modelClass) {
        AbstractC3292y.i(modelClass, "modelClass");
        return (T) get(AbstractC1989a.c(modelClass));
    }

    @MainThread
    public final <T extends ViewModel> T get(String key, InterfaceC3214c modelClass) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i8, AbstractC3284p abstractC3284p) {
        this(viewModelStore, factory, (i8 & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    @MainThread
    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(modelClass, "modelClass");
        return (T) this.impl.getViewModel$lifecycle_viewmodel_release(AbstractC1989a.c(modelClass), key);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        this(new ViewModelProviderImpl(store, factory, defaultCreationExtras));
        AbstractC3292y.i(store, "store");
        AbstractC3292y.i(factory, "factory");
        AbstractC3292y.i(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r4.getViewModelStore()
            androidx.lifecycle.viewmodel.internal.ViewModelProviders r1 = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE
            androidx.lifecycle.ViewModelProvider$Factory r2 = r1.getDefaultFactory$lifecycle_viewmodel_release(r4)
            androidx.lifecycle.viewmodel.CreationExtras r4 = r1.getDefaultCreationExtras$lifecycle_viewmodel_release(r4)
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner, Factory factory) {
        this(owner.getViewModelStore(), factory, ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        AbstractC3292y.i(owner, "owner");
        AbstractC3292y.i(factory, "factory");
    }
}
