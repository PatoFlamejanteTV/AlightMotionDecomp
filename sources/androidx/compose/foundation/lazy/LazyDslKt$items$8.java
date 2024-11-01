package androidx.compose.foundation.lazy;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class LazyDslKt$items$8 extends AbstractC3293z implements InterfaceC2074p {
    final /* synthetic */ InterfaceC2074p $itemContent;
    final /* synthetic */ T[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$items$8(InterfaceC2074p interfaceC2074p, T[] tArr) {
        super(4);
        this.$itemContent = interfaceC2074p;
        this.$items = tArr;
    }

    @Override // c6.InterfaceC2074p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(LazyItemScope items, int i8, Composer composer, int i9) {
        int i10;
        AbstractC3292y.i(items, "$this$items");
        if ((i9 & 14) == 0) {
            i10 = (composer.changed(items) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            i10 |= composer.changed(i8) ? 32 : 16;
        }
        if ((i10 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1043393750, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
        }
        this.$itemContent.invoke(items, this.$items[i8], composer, Integer.valueOf(i10 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
