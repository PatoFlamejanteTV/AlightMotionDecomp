package A1;

import java.util.Arrays;
import java.util.HashMap;
import w1.C4147f;
import w1.C4148g;
import x1.AbstractC4199c;
import x1.C4201e;

/* loaded from: classes4.dex */
public class m extends a {

    /* renamed from: d, reason: collision with root package name */
    public static int f136d = 11;

    /* renamed from: e, reason: collision with root package name */
    public static int f137e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f138f = "usutv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f139c = new C4201e();

    public m() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f98a = hashMap;
        hashMap.put(z1.h.f41435a, new C4147f(6, Integer.valueOf(f137e)));
        this.f98a.put(z1.h.f41436b, new C4147f(2, 0));
        this.f98a.put(z1.h.f41437c, new C4147f(2, 0));
        this.f98a.put(z1.h.f41438d, new C4147f(2, 0));
        this.f98a.put(z1.h.f41439e, new C4147f(2, 0));
        this.f98a.put(z1.h.f41440f, new C4147f(2, 0));
        this.f98a.put(z1.h.f41441g, new C4147f(2, 0));
        this.f98a.put(z1.h.f41442h, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f98a.put(z1.h.f41443i, new C4147f(2, 0));
        this.f98a.put(z1.h.f41444j, new C4147f(2, 0));
        this.f98a.put(z1.h.f41445k, new C4147f(2, 0));
        this.f98a.put(z1.h.f41446l, new C4147f(2, 0));
        this.f99b = new String[]{z1.h.f41435a, z1.h.f41436b, z1.h.f41437c, z1.h.f41438d, z1.h.f41439e, z1.h.f41440f, z1.h.f41441g, z1.h.f41442h, z1.h.f41443i, z1.h.f41444j, z1.h.f41445k, z1.h.f41446l};
    }

    @Override // A1.c
    public String b() {
        return this.f139c.d(e());
    }

    public void f(String str) {
        d(this.f139c.c(str));
    }

    @Override // A1.c
    public int getId() {
        return f136d;
    }

    public m(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
