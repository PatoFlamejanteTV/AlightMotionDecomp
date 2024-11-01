package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, SemanticsPropertiesAndroid$TestTagsAsResourceId$1.INSTANCE);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }

    @ExperimentalComposeUiApi
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
