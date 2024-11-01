package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes3.dex */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    SavedStateRegistry getSavedStateRegistry();
}
