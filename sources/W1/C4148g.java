package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: w1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4148g extends AbstractC4142a {

    /* renamed from: b, reason: collision with root package name */
    private int f40671b;

    /* renamed from: c, reason: collision with root package name */
    private int f40672c;

    public C4148g(int i8, List list) {
        this.f40671b = i8;
        this.f40672c = list.size();
        d(list);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = x1.k.a(str, this.f40671b, this.f40672c);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return x1.k.b((List) this.f40668a, this.f40671b, this.f40672c);
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        List arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < this.f40672c; size++) {
            arrayList.add(0);
        }
        int size2 = arrayList.size();
        int i8 = this.f40672c;
        if (size2 > i8) {
            arrayList = arrayList.subList(0, i8);
        }
        super.d(arrayList);
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        return str.substring(i8, (this.f40671b * this.f40672c) + i8);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
