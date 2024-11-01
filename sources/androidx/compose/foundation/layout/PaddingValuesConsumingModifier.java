package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {
    private final PaddingValues paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesConsumingModifier(PaddingValues paddingValues, Function1 inspectorInfo) {
        super(inspectorInfo, null);
        AbstractC3292y.i(paddingValues, "paddingValues");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    public WindowInsets calculateInsets(WindowInsets modifierLocalInsets) {
        AbstractC3292y.i(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesConsumingModifier)) {
            return false;
        }
        return AbstractC3292y.d(((PaddingValuesConsumingModifier) obj).paddingValues, this.paddingValues);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
