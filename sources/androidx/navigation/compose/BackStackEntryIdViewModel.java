package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";
    private final UUID id;
    public WeakReference<SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(SavedStateHandle savedStateHandle) {
        UUID uuid = (UUID) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.id = uuid;
    }

    public final UUID getId() {
        return this.id;
    }

    public final WeakReference<SaveableStateHolder> getSaveableStateHolderRef() {
        WeakReference<SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        AbstractC3292y.y("saveableStateHolderRef");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }

    public final void setSaveableStateHolderRef(WeakReference<SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }
}
