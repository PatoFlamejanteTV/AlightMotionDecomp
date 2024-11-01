package androidx.collection;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ObjectList$toString$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ObjectList<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectList$toString$1(ObjectList<E> objectList) {
        super(1);
        this.this$0 = objectList;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ObjectList$toString$1) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(E e8) {
        if (e8 == this.this$0) {
            return "(this)";
        }
        return String.valueOf(e8);
    }
}
