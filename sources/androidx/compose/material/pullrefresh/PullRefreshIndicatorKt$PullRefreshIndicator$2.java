package androidx.compose.material.pullrefresh;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$PullRefreshIndicator$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$PullRefreshIndicator$2(boolean z8, PullRefreshState pullRefreshState, Modifier modifier, long j8, long j9, boolean z9, int i8, int i9) {
        super(2);
        this.$refreshing = z8;
        this.$state = pullRefreshState;
        this.$modifier = modifier;
        this.$backgroundColor = j8;
        this.$contentColor = j9;
        this.$scale = z9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        PullRefreshIndicatorKt.m1406PullRefreshIndicatorjB83MbM(this.$refreshing, this.$state, this.$modifier, this.$backgroundColor, this.$contentColor, this.$scale, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
