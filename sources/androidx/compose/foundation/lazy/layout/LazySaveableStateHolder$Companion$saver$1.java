package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazySaveableStateHolder$Companion$saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final LazySaveableStateHolder$Companion$saver$1 INSTANCE = new LazySaveableStateHolder$Companion$saver$1();

    LazySaveableStateHolder$Companion$saver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Map<String, List<Object>> invoke(SaverScope Saver, LazySaveableStateHolder it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        Map<String, List<Object>> performSave = it.performSave();
        if (performSave.isEmpty()) {
            return null;
        }
        return performSave;
    }
}
