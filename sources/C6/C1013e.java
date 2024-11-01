package C6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1013e extends AbstractC1027q {

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1013e(y6.b element) {
        super(element);
        AbstractC3292y.i(element, "element");
        this.f1043b = new C1011d(element.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List q(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<this>");
        return arrayList;
    }

    @Override // C6.AbstractC1026p, y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1043b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList f() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(ArrayList arrayList) {
        AbstractC3292y.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ArrayList arrayList, int i8) {
        AbstractC3292y.i(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1026p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(ArrayList arrayList, int i8, Object obj) {
        AbstractC3292y.i(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C6.AbstractC1005a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList p(List list) {
        ArrayList arrayList;
        AbstractC3292y.i(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList(list);
        }
        return arrayList;
    }
}
