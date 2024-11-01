package androidx.compose.runtime.saveable;

import R5.AbstractC1435t;
import R5.Q;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l6.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final Function1 canBeSaved;
    private final Map<String, List<Object>> restored;
    private final Map<String, List<Function0>> valueProviders;

    public SaveableStateRegistryImpl(Map<String, ? extends List<? extends Object>> map, Function1 function1) {
        Map<String, List<Object>> B8;
        this.canBeSaved = function1;
        this.restored = (map == null || (B8 = Q.B(map)) == null) ? new LinkedHashMap<>() : B8;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return ((Boolean) this.canBeSaved.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        List<Object> remove = this.restored.remove(str);
        if (remove != null && (!remove.isEmpty())) {
            if (remove.size() > 1) {
                this.restored.put(str, remove.subList(1, remove.size()));
            }
            return remove.get(0);
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> B8 = Q.B(this.restored);
        for (Map.Entry<String, List<Function0>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<Function0> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (canBeSaved(invoke)) {
                    B8.put(key, AbstractC1435t.g(invoke));
                } else {
                    throw new IllegalStateException("item can't be saved".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    Object invoke2 = value.get(i8).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(invoke2);
                }
                B8.put(key, arrayList);
            }
        }
        return B8;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String str, final Function0 function0) {
        if (!n.T(str)) {
            Map<String, List<Function0>> map = this.valueProviders;
            List<Function0> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(function0);
            return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
                @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
                public void unregister() {
                    Map map2;
                    Map map3;
                    map2 = SaveableStateRegistryImpl.this.valueProviders;
                    List list2 = (List) map2.remove(str);
                    if (list2 != null) {
                        list2.remove(function0);
                    }
                    if (list2 != null && (!list2.isEmpty())) {
                        map3 = SaveableStateRegistryImpl.this.valueProviders;
                        map3.put(str, list2);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
