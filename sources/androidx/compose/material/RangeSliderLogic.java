package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final State<InterfaceC2072n> onDrag;
    private final State<Float> rawOffsetEnd;
    private final State<Float> rawOffsetStart;
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(MutableInteractionSource startInteractionSource, MutableInteractionSource endInteractionSource, State<Float> rawOffsetStart, State<Float> rawOffsetEnd, State<? extends InterfaceC2072n> onDrag) {
        AbstractC3292y.i(startInteractionSource, "startInteractionSource");
        AbstractC3292y.i(endInteractionSource, "endInteractionSource");
        AbstractC3292y.i(rawOffsetStart, "rawOffsetStart");
        AbstractC3292y.i(rawOffsetEnd, "rawOffsetEnd");
        AbstractC3292y.i(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    public final MutableInteractionSource activeInteraction(boolean z8) {
        if (z8) {
            return this.startInteractionSource;
        }
        return this.endInteractionSource;
    }

    public final void captureThumb(boolean z8, float f8, Interaction interaction, M scope) {
        State<Float> state;
        AbstractC3292y.i(interaction, "interaction");
        AbstractC3292y.i(scope, "scope");
        InterfaceC2072n value = this.onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(z8);
        if (z8) {
            state = this.rawOffsetStart;
        } else {
            state = this.rawOffsetEnd;
        }
        value.invoke(valueOf, Float.valueOf(f8 - state.getValue().floatValue()));
        AbstractC3462k.d(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z8, interaction, null), 3, null);
    }

    public final int compareOffsets(float f8) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f8), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f8));
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final State<InterfaceC2072n> getOnDrag() {
        return this.onDrag;
    }

    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
