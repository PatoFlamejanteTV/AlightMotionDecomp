package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$4$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(T t8) {
        return Boolean.valueOf(!AbstractC3292y.d(t8, this.$this_Crossfade.getTargetState()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((CrossfadeKt$Crossfade$4$1) obj);
    }
}
