package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazySaveableStateHolder$Companion$saver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SaveableStateRegistry $parentRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$Companion$saver$2(SaveableStateRegistry saveableStateRegistry) {
        super(1);
        this.$parentRegistry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> restored) {
        AbstractC3292y.i(restored, "restored");
        return new LazySaveableStateHolder(this.$parentRegistry, restored);
    }
}
