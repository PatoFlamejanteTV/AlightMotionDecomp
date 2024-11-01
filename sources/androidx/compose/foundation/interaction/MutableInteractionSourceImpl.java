package androidx.compose.foundation.interaction;

import Q5.I;
import U5.d;
import V5.b;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3292y;
import p6.EnumC3588a;
import q6.AbstractC3804C;
import q6.v;

@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final v interactions = AbstractC3804C.b(0, 16, EnumC3588a.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, d dVar) {
        Object emit = getInteractions().emit(interaction, dVar);
        if (emit == b.e()) {
            return emit;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        AbstractC3292y.i(interaction, "interaction");
        return getInteractions().d(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public v getInteractions() {
        return this.interactions;
    }
}
