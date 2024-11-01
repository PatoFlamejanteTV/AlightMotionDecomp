package A1;

import java.util.Map;
import w1.AbstractC4142a;
import y1.C4236a;

/* loaded from: classes4.dex */
public abstract class a implements c {

    /* renamed from: a, reason: collision with root package name */
    protected Map f98a;

    /* renamed from: b, reason: collision with root package name */
    protected String[] f99b;

    @Override // A1.c
    public void a(String str, Object obj) {
        if (this.f98a.containsKey(str)) {
            ((AbstractC4142a) this.f98a.get(str)).d(obj);
            return;
        }
        throw new y1.c(str + " not found");
    }

    @Override // A1.c
    public Object c(String str) {
        if (this.f98a.containsKey(str)) {
            return ((AbstractC4142a) this.f98a.get(str)).c();
        }
        return null;
    }

    public void d(String str) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = this.f99b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f98a.containsKey(str2)) {
                    AbstractC4142a abstractC4142a = (AbstractC4142a) this.f98a.get(str2);
                    String e8 = abstractC4142a.e(str, i9);
                    abstractC4142a.a(e8);
                    i9 += e8.length();
                    i8++;
                } else {
                    throw new C4236a("Field not found: '" + str2 + "'");
                }
            } else {
                return;
            }
        }
    }

    public String e() {
        String str = "";
        int i8 = 0;
        while (true) {
            String[] strArr = this.f99b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f98a.containsKey(str2)) {
                    str = str + ((AbstractC4142a) this.f98a.get(str2)).b();
                    i8++;
                } else {
                    throw new y1.b("Field not found: '" + str2 + "'");
                }
            } else {
                return str;
            }
        }
    }
}
