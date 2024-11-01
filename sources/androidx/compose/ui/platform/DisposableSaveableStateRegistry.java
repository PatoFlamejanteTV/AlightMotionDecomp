package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private final Function0 onDispose;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, Function0 function0) {
        this.onDispose = function0;
        this.$$delegate_0 = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, Function0 function0) {
        return this.$$delegate_0.registerProvider(str, function0);
    }
}
