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
public class l extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f132d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static int f133e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f134f = "usnatv1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f135c = new C4201e();

    public l() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f100a = hashMap;
        hashMap.put(z1.g.f41416a, new C4147f(6, Integer.valueOf(f133e)));
        this.f100a.put(z1.g.f41417b, new C4147f(2, 0));
        this.f100a.put(z1.g.f41418c, new C4147f(2, 0));
        this.f100a.put(z1.g.f41419d, new C4147f(2, 0));
        this.f100a.put(z1.g.f41420e, new C4147f(2, 0));
        this.f100a.put(z1.g.f41421f, new C4147f(2, 0));
        this.f100a.put(z1.g.f41422g, new C4147f(2, 0));
        this.f100a.put(z1.g.f41423h, new C4147f(2, 0));
        this.f100a.put(z1.g.f41424i, new C4147f(2, 0));
        this.f100a.put(z1.g.f41425j, new C4147f(2, 0));
        this.f100a.put(z1.g.f41426k, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f100a.put(z1.g.f41427l, new C4148g(2, Arrays.asList(0, 0)));
        this.f100a.put(z1.g.f41428m, new C4147f(2, 0));
        this.f100a.put(z1.g.f41429n, new C4147f(2, 0));
        this.f100a.put(z1.g.f41430o, new C4147f(2, 0));
        this.f100a.put(z1.g.f41431p, new C4147f(2, 0));
        this.f100a.put(z1.g.f41432q, new C4147f(2, 1));
        this.f100a.put(z1.g.f41433r, new C4143b(Boolean.TRUE));
        this.f100a.put(z1.g.f41434s, new C4143b(Boolean.FALSE));
        this.f101b = new String[][]{new String[]{z1.g.f41416a, z1.g.f41417b, z1.g.f41418c, z1.g.f41419d, z1.g.f41420e, z1.g.f41421f, z1.g.f41422g, z1.g.f41423h, z1.g.f41424i, z1.g.f41425j, z1.g.f41426k, z1.g.f41427l, z1.g.f41428m, z1.g.f41429n, z1.g.f41430o, z1.g.f41431p}, new String[]{z1.g.f41432q, z1.g.f41434s}};
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f135c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4142a) this.f100a.get(z1.g.f41433r)).c()).booleanValue()) {
                arrayList.add(this.f135c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f135c.c(split[i8]);
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
        return f132d;
    }

    public l(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
