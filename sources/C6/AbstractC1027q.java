package C6;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1027q extends AbstractC1026p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1027q(y6.b element) {
        super(element, null);
        AbstractC3292y.i(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator i(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int j(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        return collection.size();
    }
}
