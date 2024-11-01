package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Object $key;
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder;
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
        this.$key = obj;
        this.$registryHolder = registryHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        Map map;
        Map map2;
        map = this.this$0.registryHolders;
        boolean z8 = !map.containsKey(this.$key);
        Object obj = this.$key;
        if (z8) {
            this.this$0.savedStates.remove(this.$key);
            map2 = this.this$0.registryHolders;
            map2.put(this.$key, this.$registryHolder);
            final SaveableStateHolderImpl.RegistryHolder registryHolder = this.$registryHolder;
            final SaveableStateHolderImpl saveableStateHolderImpl = this.this$0;
            final Object obj2 = this.$key;
            return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Map map3;
                    SaveableStateHolderImpl.RegistryHolder.this.saveTo(saveableStateHolderImpl.savedStates);
                    map3 = saveableStateHolderImpl.registryHolders;
                    map3.remove(obj2);
                }
            };
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }
}
