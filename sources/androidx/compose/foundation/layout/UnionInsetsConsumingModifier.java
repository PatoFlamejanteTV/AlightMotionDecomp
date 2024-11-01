package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    private final WindowInsets insets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionInsetsConsumingModifier(WindowInsets insets, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        AbstractC3292y.i(insets, "insets");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.insets = insets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public WindowInsets calculateInsets(WindowInsets modifierLocalInsets) {
        AbstractC3292y.i(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.union(this.insets, modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsetsConsumingModifier)) {
            return false;
        }
        return AbstractC3292y.d(((UnionInsetsConsumingModifier) obj).insets, this.insets);
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}
