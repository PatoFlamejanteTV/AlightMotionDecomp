package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC3292y.i(view, "<this>");
        return (ViewModelStoreOwner) AbstractC3258j.s(AbstractC3258j.z(AbstractC3258j.h(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC3292y.i(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
