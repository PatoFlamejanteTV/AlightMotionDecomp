package C6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class M extends AbstractC1027q {

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(y6.b eSerializer) {
        super(eSerializer);
        AbstractC3292y.i(eSerializer, "eSerializer");
        this.f1013b = new L(eSerializer.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Set q(LinkedHashSet linkedHashSet) {
        AbstractC3292y.i(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // C6.AbstractC1026p, y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1013b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet f() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashSet linkedHashSet) {
        AbstractC3292y.i(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashSet linkedHashSet, int i8) {
        AbstractC3292y.i(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(LinkedHashSet linkedHashSet, int i8, Object obj) {
        AbstractC3292y.i(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet p(Set set) {
        LinkedHashSet linkedHashSet;
        AbstractC3292y.i(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet(set);
        }
        return linkedHashSet;
    }
}
