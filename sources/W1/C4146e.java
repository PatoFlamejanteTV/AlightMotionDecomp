package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import x1.AbstractC4205i;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4146e extends AbstractC4142a {

    /* renamed from: b, reason: collision with root package name */
    private int f40669b;

    public C4146e(List list) {
        this.f40669b = list.size();
        d(list);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = AbstractC4205i.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4205i.b((List) this.f40668a, this.f40669b);
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f40669b; size++) {
            arrayList.add(Boolean.FALSE);
        }
        int size2 = arrayList.size();
        int i8 = this.f40669b;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, this.f40669b + i8);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
