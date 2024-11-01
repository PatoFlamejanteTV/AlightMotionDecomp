package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TwoLine$ListItem$1$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $overlineText;
    final /* synthetic */ InterfaceC2072n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoLine$ListItem$1$2(InterfaceC2072n interfaceC2072n, int i8, InterfaceC2072n interfaceC2072n2) {
        super(2);
        this.$overlineText = interfaceC2072n;
        this.$$dirty = i8;
        this.$text = interfaceC2072n2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1675021441, i8, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:229)");
        }
        this.$overlineText.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
