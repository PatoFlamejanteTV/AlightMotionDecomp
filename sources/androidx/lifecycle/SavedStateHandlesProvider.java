package androidx.lifecycle;

import Q5.InterfaceC1416k;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final InterfaceC1416k viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC3292y.i(savedStateRegistry, "savedStateRegistry");
        AbstractC3292y.i(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = Q5.l.b(new SavedStateHandlesProvider$viewModel$2(viewModelStoreOwner));
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Bundle bundle;
        AbstractC3292y.i(key, "key");
        performRestore();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(key);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle;
    }

    public final void performRestore() {
        if (!this.restored) {
            Bundle consumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.restoredState;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (consumeRestoredStateForKey != null) {
                bundle.putAll(consumeRestoredStateForKey);
            }
            this.restoredState = bundle;
            this.restored = true;
            getViewModel();
        }
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().savedStateProvider().saveState();
            if (!AbstractC3292y.d(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.restored = false;
        return bundle;
    }
}
