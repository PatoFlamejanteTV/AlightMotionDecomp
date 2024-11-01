package androidx.compose.runtime.saveable;

import c6.InterfaceC2072n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();

    SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
        Map<Object, Map<String, List<Object>>> saveAll;
        saveAll = saveableStateHolderImpl.saveAll();
        return saveAll;
    }
}
