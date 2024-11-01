package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);

    @Stable
    public static final Modifier consumeWindowInsets(Modifier modifier, WindowInsets insets) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        return modifier.then(new UnionInsetsConsumingModifier(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumedWindowInsets(Modifier modifier, WindowInsets insets) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        return consumeWindowInsets(modifier, insets);
    }

    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }

    @Stable
    public static final Modifier onConsumedWindowInsetsChanged(Modifier modifier, Function1 block) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(block, "block");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(block);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ConsumedInsetsModifier(block, noInspectorInfo));
    }

    @Stable
    public static final Modifier windowInsetsPadding(Modifier modifier, WindowInsets insets) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new InsetsPaddingModifier(insets, noInspectorInfo));
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier withConsumedWindowInsets(Modifier modifier, Function1 block) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(block, "block");
        return onConsumedWindowInsetsChanged(modifier, block);
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumedWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(paddingValues, "paddingValues");
        return consumeWindowInsets(modifier, paddingValues);
    }

    @Stable
    @ExperimentalLayoutApi
    public static final Modifier consumeWindowInsets(Modifier modifier, PaddingValues paddingValues) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesConsumingModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues) : InspectableValueKt.getNoInspectorInfo()));
    }
}
