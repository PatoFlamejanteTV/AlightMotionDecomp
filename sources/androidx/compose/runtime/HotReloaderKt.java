package androidx.compose.runtime;

import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class HotReloaderKt {
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    public static final List<r> currentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(x.a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    public static final void invalidateGroupsWithKey(int i8) {
        HotReloader.Companion.invalidateGroupsWithKey$runtime_release(i8);
    }

    public static final void simulateHotReload(Object obj) {
        HotReloader.Companion.simulateHotReload$runtime_release(obj);
    }
}
