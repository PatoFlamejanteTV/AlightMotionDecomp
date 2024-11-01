package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ int $index;
    final /* synthetic */ Object $key;
    final /* synthetic */ LazyLayoutPinnedItemList $pinnedItemList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(Object obj, int i8, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, InterfaceC2072n interfaceC2072n, int i9) {
        super(2);
        this.$key = obj;
        this.$index = i8;
        this.$pinnedItemList = lazyLayoutPinnedItemList;
        this.$content = interfaceC2072n;
        this.$$changed = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(this.$key, this.$index, this.$pinnedItemList, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
