package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NodeChainKt$fillVector$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableVector<Modifier.Element> $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(MutableVector<Modifier.Element> mutableVector) {
        super(1);
        this.$result = mutableVector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Modifier.Element element) {
        this.$result.add(element);
        return Boolean.TRUE;
    }
}
