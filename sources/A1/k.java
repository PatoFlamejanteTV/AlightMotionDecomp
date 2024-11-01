package A1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import w1.AbstractC4142a;
import w1.C4143b;
import w1.C4147f;
import w1.C4148g;
import x1.AbstractC4199c;
import x1.C4201e;
import y1.C4236a;
import z1.AbstractC4264d;

/* loaded from: classes4.dex */
public class k extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f128d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static int f129e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f130f = "usctv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f131c = new C4201e();

    public k() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f100a = hashMap;
        hashMap.put(z1.f.f41402a, new C4147f(6, Integer.valueOf(f129e)));
        this.f100a.put(z1.f.f41403b, new C4147f(2, 0));
        this.f100a.put(z1.f.f41404c, new C4147f(2, 0));
        this.f100a.put(z1.f.f41405d, new C4147f(2, 0));
        this.f100a.put(z1.f.f41406e, new C4147f(2, 0));
        this.f100a.put(z1.f.f41407f, new C4147f(2, 0));
        this.f100a.put(z1.f.f41408g, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)));
        this.f100a.put(z1.f.f41409h, new C4148g(2, Arrays.asList(0, 0, 0)));
        this.f100a.put(z1.f.f41410i, new C4147f(2, 0));
        this.f100a.put(z1.f.f41411j, new C4147f(2, 0));
        this.f100a.put(z1.f.f41412k, new C4147f(2, 0));
        this.f100a.put(z1.f.f41413l, new C4147f(2, 1));
        this.f100a.put(z1.f.f41414m, new C4143b(Boolean.TRUE));
        this.f100a.put(z1.f.f41415n, new C4143b(Boolean.FALSE));
        this.f101b = new String[][]{new String[]{z1.f.f41402a, z1.f.f41403b, z1.f.f41404c, z1.f.f41405d, z1.f.f41406e, z1.f.f41407f, z1.f.f41408g, z1.f.f41409h, z1.f.f41410i, z1.f.f41411j, z1.f.f41412k}, new String[]{z1.f.f41413l, z1.f.f41415n}};
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f131c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4142a) this.f100a.get(z1.f.f41414m)).c()).booleanValue()) {
                arrayList.add(this.f131c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f131c.c(split[i8]);
            String substring = c8.substring(0, 2);
            substring.hashCode();
            if (!substring.equals("00")) {
                if (substring.equals("01")) {
                    strArr[1] = c8;
                    z8 = true;
                } else {
                    throw new C4236a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
        ((AbstractC4142a) this.f100a.get(AbstractC4264d.f41386n)).d(Boolean.valueOf(z8));
    }

    @Override // A1.c
    public int getId() {
        return f128d;
    }

    public k(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
