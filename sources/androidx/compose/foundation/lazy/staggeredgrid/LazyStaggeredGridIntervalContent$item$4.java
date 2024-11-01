package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyStaggeredGridIntervalContent$item$4 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ InterfaceC2073o $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridIntervalContent$item$4(InterfaceC2073o interfaceC2073o) {
        super(4);
        this.$content = interfaceC2073o;
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(LazyStaggeredGridItemScope items, int i8, Composer composer, int i9) {
        AbstractC3292y.i(items, "$this$items");
        if ((i9 & 14) == 0) {
            i9 |= composer.changed(items) ? 4 : 2;
        }
        if ((i9 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(657818596, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)");
        }
        this.$content.invoke(items, composer, Integer.valueOf(i9 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
