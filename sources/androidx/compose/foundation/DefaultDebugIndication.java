package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class DefaultDebugIndication implements Indication {
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    /* loaded from: classes.dex */
    private static final class DefaultDebugIndicationInstance implements IndicationInstance {
        private final State<Boolean> isFocused;
        private final State<Boolean> isHovered;
        private final State<Boolean> isPressed;

        public DefaultDebugIndicationInstance(State<Boolean> isPressed, State<Boolean> isHovered, State<Boolean> isFocused) {
            AbstractC3292y.i(isPressed, "isPressed");
            AbstractC3292y.i(isHovered, "isHovered");
            AbstractC3292y.i(isFocused, "isFocused");
            this.isPressed = isPressed;
            this.isHovered = isHovered;
            this.isFocused = isFocused;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(ContentDrawScope contentDrawScope) {
            AbstractC3292y.i(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.c.K(contentDrawScope, Color.m2947copywmQWz5c$default(Color.Companion.m2974getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo3391getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                androidx.compose.ui.graphics.drawscope.c.K(contentDrawScope, Color.m2947copywmQWz5c$default(Color.Companion.m2974getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo3391getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1683566979);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683566979, i8, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i9 = i8 & 14;
        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i9);
        State<Boolean> collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i9);
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i9);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultDebugIndicationInstance(collectIsPressedAsState, collectIsHoveredAsState, collectIsFocusedAsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDebugIndicationInstance;
    }
}
