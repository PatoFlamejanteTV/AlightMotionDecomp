package androidx.compose.foundation.layout;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $propagateMinConstraints;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxWithConstraintsKt$BoxWithConstraints$2(Modifier modifier, Alignment alignment, boolean z8, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$propagateMinConstraints = z8;
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
        BoxWithConstraintsKt.BoxWithConstraints(this.$modifier, this.$contentAlignment, this.$propagateMinConstraints, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
