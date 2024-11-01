package androidx.savedstate;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 extends AbstractC3293z implements Function1 {
    public static final ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 INSTANCE = new ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2();

    ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SavedStateRegistryOwner invoke(View view) {
        AbstractC3292y.i(view, "view");
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
