package w1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import x1.AbstractC4205i;
import x1.AbstractC4206j;
import x1.l;

/* loaded from: classes4.dex */
public class k extends AbstractC4142a {
    public k(List list) {
        d(list);
    }

    @Override // w1.AbstractC4142a
    public void a(String str) {
        if (str.charAt(16) == '1') {
            this.f40668a = l.a(str.substring(17));
            return;
        }
        ArrayList arrayList = new ArrayList();
        List a9 = AbstractC4205i.a(str.substring(17));
        for (int i8 = 0; i8 < a9.size(); i8++) {
            if (((Boolean) a9.get(i8)).booleanValue()) {
                arrayList.add(Integer.valueOf(i8 + 1));
            }
        }
        this.f40668a = arrayList;
    }

    @Override // w1.AbstractC4142a
    public String b() {
        int i8;
        if (((List) this.f40668a).size() > 0) {
            i8 = ((Integer) ((List) this.f40668a).get(((List) r0).size() - 1)).intValue();
        } else {
            i8 = 0;
        }
        String b9 = l.b((List) this.f40668a);
        if (b9.length() <= i8) {
            return AbstractC4206j.b(i8, 16) + "1" + b9;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == ((Integer) ((List) this.f40668a).get(i9)).intValue() - 1) {
                arrayList.add(Boolean.TRUE);
                i9++;
            } else {
                arrayList.add(Boolean.FALSE);
            }
        }
        return AbstractC4206j.b(i8, 16) + MBridgeConstans.ENDCARD_URL_TYPE_PL + AbstractC4205i.b(arrayList, i8);
    }

    @Override // w1.AbstractC4142a
    public void d(Object obj) {
        super.d(new ArrayList(new TreeSet((List) obj)));
    }

    @Override // w1.AbstractC4142a
    public String e(String str, int i8) {
        int i9 = i8 + 16;
        int a9 = AbstractC4206j.a(str.substring(i8, i9));
        if (str.charAt(i9) == '1') {
            StringBuilder sb = new StringBuilder();
            int i10 = i8 + 17;
            sb.append(str.substring(i8, i10));
            sb.append(new C4149h().e(str, i10));
            return sb.toString();
        }
        return str.substring(i8, i8 + 17 + a9);
    }

    @Override // w1.AbstractC4142a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List c() {
        return new ArrayList((Collection) super.c());
    }
}
