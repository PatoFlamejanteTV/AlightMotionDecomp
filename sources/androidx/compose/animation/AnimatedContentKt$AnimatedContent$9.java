package androidx.compose.animation;

import Q5.I;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$9 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2074p $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Function1 $contentKey;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1 $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$9(Transition<S> transition, Modifier modifier, Function1 function1, Alignment alignment, Function1 function12, InterfaceC2074p interfaceC2074p, int i8, int i9) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$modifier = modifier;
        this.$transitionSpec = function1;
        this.$contentAlignment = alignment;
        this.$contentKey = function12;
        this.$content = interfaceC2074p;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AnimatedContentKt.AnimatedContent(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
