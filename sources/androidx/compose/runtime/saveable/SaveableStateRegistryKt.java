package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.INSTANCE);

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, Function1 function1) {
        return new SaveableStateRegistryImpl(map, function1);
    }

    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }
}
