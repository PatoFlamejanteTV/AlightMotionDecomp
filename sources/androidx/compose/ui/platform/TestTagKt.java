package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;

/* loaded from: classes.dex */
public final class TestTagKt {
    @Stable
    public static final Modifier testTag(Modifier modifier, String str) {
        return SemanticsModifierKt.semantics$default(modifier, false, new TestTagKt$testTag$1(str), 1, null);
    }
}
