package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import x1.AbstractC4206j;
import x1.l;

/* renamed from: w1.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4149h extends AbstractC4142a {
    /* JADX INFO: Access modifiers changed from: protected */
    public C4149h() {
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        this.f40668a = l.a(str);
    }

    @Override // w1.AbstractC4142a
    public String b() {
        return l.b((List) this.f40668a);
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        int i9 = i8 + 12;
        int a9 = AbstractC4206j.a(str.substring(i8, i9));
        for (int i10 = 0; i10 < a9; i10++) {
            if (str.charAt(i9) == '1') {
                i9 += 33;
            } else {
                i9 += 17;
            }
        }
        return str.substring(i8, i9);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }

    public C4149h(List list) {
        d(list);
    }
}
