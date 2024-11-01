package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final InterfaceC2073o children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, InterfaceC2073o children) {
        AbstractC3292y.i(placeholder, "placeholder");
        AbstractC3292y.i(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    public final InterfaceC2073o getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
