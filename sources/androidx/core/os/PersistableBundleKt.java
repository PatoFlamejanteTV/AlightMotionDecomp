package androidx.core.os;

import Q5.r;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(r... rVarArr) {
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(rVarArr.length);
        for (r rVar : rVarArr) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, (String) rVar.a(), rVar.b());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, entry.getKey(), entry.getValue());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
