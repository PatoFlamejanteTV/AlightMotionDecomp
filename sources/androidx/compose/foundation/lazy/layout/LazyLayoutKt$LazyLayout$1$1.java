package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$1(LazyLayoutItemProvider lazyLayoutItemProvider) {
        super(0);
        this.$itemProvider = lazyLayoutItemProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LazyLayoutItemProvider invoke() {
        return this.$itemProvider;
    }
}
