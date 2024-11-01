package A1;

import java.util.ArrayList;
import java.util.HashMap;
import w1.AbstractC4142a;
import w1.C4145d;
import w1.C4147f;
import x1.AbstractC4199c;
import x1.C4201e;
import z1.AbstractC4261a;

/* loaded from: classes4.dex */
public class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public static int f102d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static int f103e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f104f = "header";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f105c = new C4201e();

    public d() {
        h();
    }

    private void h() {
        HashMap hashMap = new HashMap();
        this.f98a = hashMap;
        hashMap.put(AbstractC4261a.f41320a, new C4147f(6, Integer.valueOf(f102d)));
        this.f98a.put(AbstractC4261a.f41321b, new C4147f(6, Integer.valueOf(f103e)));
        this.f98a.put(AbstractC4261a.f41322c, new C4145d(new ArrayList()));
        this.f99b = new String[]{AbstractC4261a.f41320a, AbstractC4261a.f41321b, AbstractC4261a.f41322c};
    }

    @Override // A1.c
    public String b() {
        return this.f105c.d(e());
    }

    public void f(String str) {
        d(this.f105c.c(str));
    }

    public Integer g() {
        return (Integer) ((AbstractC4142a) this.f98a.get(AbstractC4261a.f41321b)).c();
    }

    @Override // A1.c
    public int getId() {
        return f102d;
    }

    public d(String str) {
        h();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
