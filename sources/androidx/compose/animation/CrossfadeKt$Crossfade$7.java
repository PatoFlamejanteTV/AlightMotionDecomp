package androidx.compose.animation;

import Q5.I;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CrossfadeKt$Crossfade$7 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ Function1 $contentKey;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$7(Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1 function1, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$this_Crossfade = transition;
        this.$modifier = modifier;
        this.$animationSpec = finiteAnimationSpec;
        this.$contentKey = function1;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        CrossfadeKt.Crossfade(this.$this_Crossfade, this.$modifier, this.$animationSpec, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
