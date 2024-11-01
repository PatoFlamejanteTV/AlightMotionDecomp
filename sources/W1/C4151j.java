package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntSupplier;
import x1.AbstractC4205i;

/* renamed from: w1.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4151j extends AbstractC4142a {

    /* renamed from: b, reason: collision with root package name */
    private IntSupplier f40674b;

    public C4151j(IntSupplier intSupplier, List list) {
        this.f40674b = intSupplier;
        d(list);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = AbstractC4205i.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4205i.b((List) this.f40668a, this.f40674b.getAsInt());
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        int asInt = this.f40674b.getAsInt();
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < asInt; size++) {
            arrayList.add(Boolean.FALSE);
        }
        if (arrayList.size() > asInt) {
            arrayList = arrayList.subList(0, asInt);
        }
        super.d(arrayList);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40674b.getAsInt() + i8);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
