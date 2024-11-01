package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$2 extends AbstractC3293z implements Function1 {
    public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();

    SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SaveableStateHolderImpl invoke(Map<Object, Map<String, List<Object>>> map) {
        return new SaveableStateHolderImpl(map);
    }
}
