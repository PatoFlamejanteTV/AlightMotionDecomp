package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import x1.AbstractC4204h;
import x1.AbstractC4206j;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4145d extends AbstractC4142a {
    public C4145d(List list) {
        d(list);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = AbstractC4204h.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return AbstractC4204h.b((List) this.f40668a);
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        int indexOf;
        int i9 = i8 + 12;
        int a9 = AbstractC4206j.a(str.substring(i8, i9));
        for (int i10 = 0; i10 < a9; i10++) {
            if (str.charAt(i9) == '1') {
                indexOf = str.indexOf("11", str.indexOf("11", i9 + 1) + 2);
            } else {
                indexOf = str.indexOf("11", i9 + 1);
            }
            i9 = indexOf + 2;
        }
        return str.substring(i8, i9);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
