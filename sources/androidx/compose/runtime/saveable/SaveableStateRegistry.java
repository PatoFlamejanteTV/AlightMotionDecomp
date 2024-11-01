package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface SaveableStateRegistry {

    /* loaded from: classes.dex */
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    Entry registerProvider(String str, Function0 function0);
}
