package androidx.savedstate;

import android.view.View;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        AbstractC3292y.i(view, "<this>");
        return (SavedStateRegistryOwner) AbstractC3258j.s(AbstractC3258j.z(AbstractC3258j.h(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.INSTANCE), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        AbstractC3292y.i(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
