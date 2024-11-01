package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$2(long j8, boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9, Modifier modifier, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$position = j8;
        this.$isStartHandle = z8;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z9;
        this.$modifier = modifier;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AndroidSelectionHandles_androidKt.m983SelectionHandle8fL75g(this.$position, this.$isStartHandle, this.$direction, this.$handlesCrossed, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
