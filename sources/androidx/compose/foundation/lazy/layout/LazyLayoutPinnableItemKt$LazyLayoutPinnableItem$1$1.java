package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LazyLayoutPinnableItem $pinnableItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(LazyLayoutPinnableItem lazyLayoutPinnableItem) {
        super(1);
        this.$pinnableItem = lazyLayoutPinnableItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        final LazyLayoutPinnableItem lazyLayoutPinnableItem = this.$pinnableItem;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LazyLayoutPinnableItem.this.onDisposed();
            }
        };
    }
}
