package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;

/* loaded from: classes.dex */
final class FocusableInteractionNode extends Modifier.Node {
    private FocusInteraction.Focus focusedInteraction;
    private MutableInteractionSource interactionSource;

    public FocusableInteractionNode(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    private final void disposeInteractionSource() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitWithFallback(MutableInteractionSource mutableInteractionSource, Interaction interaction) {
        if (isAttached()) {
            AbstractC3462k.d(getCoroutineScope(), null, null, new FocusableInteractionNode$emitWithFallback$1(mutableInteractionSource, interaction, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(interaction);
        }
    }

    public final void setFocus(boolean z8) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (z8) {
                FocusInteraction.Focus focus = this.focusedInteraction;
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                }
                FocusInteraction.Focus focus2 = new FocusInteraction.Focus();
                emitWithFallback(mutableInteractionSource, focus2);
                this.focusedInteraction = focus2;
                return;
            }
            FocusInteraction.Focus focus3 = this.focusedInteraction;
            if (focus3 != null) {
                emitWithFallback(mutableInteractionSource, new FocusInteraction.Unfocus(focus3));
                this.focusedInteraction = null;
            }
        }
    }

    public final void update(MutableInteractionSource mutableInteractionSource) {
        if (!AbstractC3292y.d(this.interactionSource, mutableInteractionSource)) {
            disposeInteractionSource();
            this.interactionSource = mutableInteractionSource;
        }
    }
}
