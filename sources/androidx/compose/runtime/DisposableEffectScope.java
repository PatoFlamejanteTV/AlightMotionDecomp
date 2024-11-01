package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    public final DisposableEffectResult onDispose(final Function0 function0) {
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Function0.this.invoke();
            }
        };
    }
}
