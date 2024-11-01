package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;

@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface RecomposeScopeObserver {
    void onBeginScopeComposition(RecomposeScope recomposeScope);

    void onEndScopeComposition(RecomposeScope recomposeScope);

    void onScopeDisposed(RecomposeScope recomposeScope);
}
