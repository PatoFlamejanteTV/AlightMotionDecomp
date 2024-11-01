package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface TopAppBarScrollBehavior {
    DecayAnimationSpec<Float> getFlingAnimationSpec();

    NestedScrollConnection getNestedScrollConnection();

    AnimationSpec<Float> getSnapAnimationSpec();

    TopAppBarState getState();

    boolean isPinned();
}
