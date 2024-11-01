package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import j6.InterfaceC3214c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public static final Companion Companion = new Companion(null);
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return new NavControllerViewModel();
        }
    };
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
            AbstractC3292y.i(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) new ViewModelProvider(viewModelStore, NavControllerViewModel.FACTORY, null, 4, null).get(NavControllerViewModel.class);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public static final NavControllerViewModel getInstance(ViewModelStore viewModelStore) {
        return Companion.getInstance(viewModelStore);
    }

    public final void clear(String backStackEntryId) {
        AbstractC3292y.i(backStackEntryId, "backStackEntryId");
        ViewModelStore remove = this.viewModelStores.remove(backStackEntryId);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public ViewModelStore getViewModelStore(String backStackEntryId) {
        AbstractC3292y.i(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.viewModelStores.put(backStackEntryId, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.viewModelStores.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }
}
