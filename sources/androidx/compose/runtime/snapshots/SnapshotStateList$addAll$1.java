package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnapshotStateList$addAll$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Collection<T> $elements;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateList$addAll$1(int i8, Collection<? extends T> collection) {
        super(1);
        this.$index = i8;
        this.$elements = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<T> list) {
        return Boolean.valueOf(list.addAll(this.$index, this.$elements));
    }
}
