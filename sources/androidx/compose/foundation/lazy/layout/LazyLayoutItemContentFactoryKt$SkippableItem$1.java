package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutItemContentFactoryKt$SkippableItem$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $index;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ Object $key;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$1(LazyLayoutItemProvider lazyLayoutItemProvider, int i8, Object obj, int i9) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$index = i8;
        this.$key = obj;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(980966366, i8, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:133)");
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = this.$itemProvider;
        int i9 = this.$index;
        Object obj = this.$key;
        int i10 = this.$$dirty;
        lazyLayoutItemProvider.Item(i9, obj, composer, ((i10 << 6) & 896) | ((i10 >> 6) & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
