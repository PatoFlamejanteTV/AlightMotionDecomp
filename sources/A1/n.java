package A1;

import java.util.Arrays;
import java.util.HashMap;
import w1.C4147f;
import w1.C4148g;
import x1.AbstractC4199c;
import x1.C4201e;

/* loaded from: classes4.dex */
public class n extends a {

    /* renamed from: d, reason: collision with root package name */
    public static int f140d = 9;

    /* renamed from: e, reason: collision with root package name */
    public static int f141e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f142f = "usvav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f143c = new C4201e();

    public n() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f98a = hashMap;
        hashMap.put(z1.i.f41447a, new C4147f(6, Integer.valueOf(f141e)));
        this.f98a.put(z1.i.f41448b, new C4147f(2, 0));
        this.f98a.put(z1.i.f41449c, new C4147f(2, 0));
        this.f98a.put(z1.i.f41450d, new C4147f(2, 0));
        this.f98a.put(z1.i.f41451e, new C4147f(2, 0));
        this.f98a.put(z1.i.f41452f, new C4147f(2, 0));
        this.f98a.put(z1.i.f41453g, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f98a.put(z1.i.f41454h, new C4147f(2, 0));
        this.f98a.put(z1.i.f41455i, new C4147f(2, 0));
        this.f98a.put(z1.i.f41456j, new C4147f(2, 0));
        this.f98a.put(z1.i.f41457k, new C4147f(2, 0));
        this.f99b = new String[]{z1.i.f41447a, z1.i.f41448b, z1.i.f41449c, z1.i.f41450d, z1.i.f41451e, z1.i.f41452f, z1.i.f41453g, z1.i.f41454h, z1.i.f41455i, z1.i.f41456j, z1.i.f41457k};
    }

    @Override // A1.c
    public String b() {
        return this.f143c.d(e());
    }

    public void f(String str) {
        d(this.f143c.c(str));
    }

    @Override // A1.c
    public int getId() {
        return f140d;
    }

    public n(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
