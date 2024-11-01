package androidx.compose.ui;

import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class ZIndexModifierKt {
    @Stable
    public static final Modifier zIndex(Modifier modifier, float f8) {
        return modifier.then(new ZIndexElement(f8));
    }
}
