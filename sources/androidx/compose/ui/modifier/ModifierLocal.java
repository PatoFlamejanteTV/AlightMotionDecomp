package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;

@Stable
/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final Function0 defaultFactory;

    public /* synthetic */ ModifierLocal(Function0 function0, AbstractC3284p abstractC3284p) {
        this(function0);
    }

    public final Function0 getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    private ModifierLocal(Function0 function0) {
        this.defaultFactory = function0;
    }
}
