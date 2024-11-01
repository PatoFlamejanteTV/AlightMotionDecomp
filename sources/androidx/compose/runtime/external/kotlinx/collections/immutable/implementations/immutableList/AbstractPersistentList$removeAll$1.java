package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AbstractPersistentList$removeAll$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Collection<E> $elements;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPersistentList$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.$elements = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(E e8) {
        return Boolean.valueOf(this.$elements.contains(e8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AbstractPersistentList$removeAll$1) obj);
    }
}
