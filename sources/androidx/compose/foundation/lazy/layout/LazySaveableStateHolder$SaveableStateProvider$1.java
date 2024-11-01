package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazySaveableStateHolder$SaveableStateProvider$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Object $key;
    final /* synthetic */ LazySaveableStateHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$SaveableStateProvider$1(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        super(1);
        this.this$0 = lazySaveableStateHolder;
        this.$key = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        Set set;
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        set = this.this$0.previouslyComposedKeys;
        set.remove(this.$key);
        final LazySaveableStateHolder lazySaveableStateHolder = this.this$0;
        final Object obj = this.$key;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Set set2;
                set2 = LazySaveableStateHolder.this.previouslyComposedKeys;
                set2.add(obj);
            }
        };
    }
}
