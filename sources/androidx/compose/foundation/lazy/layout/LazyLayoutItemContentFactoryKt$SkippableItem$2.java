package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt$SkippableItem$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ LazyLayoutItemProvider $itemProvider;
    final /* synthetic */ Object $key;
    final /* synthetic */ Object $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactoryKt$SkippableItem$2(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i8, Object obj2, int i9) {
        super(2);
        this.$itemProvider = lazyLayoutItemProvider;
        this.$saveableStateHolder = obj;
        this.$index = i8;
        this.$key = obj2;
        this.$$changed = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        LazyLayoutItemContentFactoryKt.m730SkippableItemJVlU9Rs(this.$itemProvider, this.$saveableStateHolder, this.$index, this.$key, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
