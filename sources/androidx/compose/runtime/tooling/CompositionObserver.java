package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import java.util.Map;
import java.util.Set;

@ExperimentalComposeRuntimeApi
/* loaded from: classes.dex */
public interface CompositionObserver {
    void onBeginComposition(Composition composition, Map<RecomposeScope, ? extends Set<? extends Object>> map);

    void onEndComposition(Composition composition);
}
