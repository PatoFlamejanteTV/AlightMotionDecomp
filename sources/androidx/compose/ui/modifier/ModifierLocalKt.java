package androidx.compose.ui.modifier;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ModifierLocalKt {
    public static final <T> ProvidableModifierLocal<T> modifierLocalOf(Function0 function0) {
        return new ProvidableModifierLocal<>(function0);
    }
}
