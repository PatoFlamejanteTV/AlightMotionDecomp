package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC3292y.i(view, "<this>");
        return (LifecycleOwner) AbstractC3258j.s(AbstractC3258j.z(AbstractC3258j.h(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC3292y.i(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
