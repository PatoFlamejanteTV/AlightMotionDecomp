package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ViewModel get(String key) {
        AbstractC3292y.i(key, "key");
        return this.map.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(String key, ViewModel viewModel) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(viewModel, "viewModel");
        ViewModel put = this.map.put(key, viewModel);
        if (put != null) {
            put.clear$lifecycle_viewmodel_release();
        }
    }
}
