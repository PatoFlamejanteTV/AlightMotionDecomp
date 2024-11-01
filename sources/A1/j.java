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
import z1.AbstractC4265e;

/* loaded from: classes4.dex */
public class j extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f124d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static int f125e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f126f = "uscov1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f127c = new C4201e();

    public j() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f100a = hashMap;
        hashMap.put(AbstractC4265e.f41388a, new C4147f(6, Integer.valueOf(f125e)));
        this.f100a.put(AbstractC4265e.f41389b, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41390c, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41391d, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41392e, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41393f, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41394g, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0)));
        this.f100a.put(AbstractC4265e.f41395h, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41396i, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41397j, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41398k, new C4147f(2, 0));
        this.f100a.put(AbstractC4265e.f41399l, new C4147f(2, 1));
        this.f100a.put(AbstractC4265e.f41400m, new C4143b(Boolean.TRUE));
        this.f100a.put(AbstractC4265e.f41401n, new C4143b(Boolean.FALSE));
        this.f101b = new String[][]{new String[]{AbstractC4265e.f41388a, AbstractC4265e.f41389b, AbstractC4265e.f41390c, AbstractC4265e.f41391d, AbstractC4265e.f41392e, AbstractC4265e.f41393f, AbstractC4265e.f41394g, AbstractC4265e.f41395h, AbstractC4265e.f41396i, AbstractC4265e.f41397j, AbstractC4265e.f41398k}, new String[]{AbstractC4265e.f41399l, AbstractC4265e.f41401n}};
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f127c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4142a) this.f100a.get(AbstractC4265e.f41400m)).c()).booleanValue()) {
                arrayList.add(this.f127c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f127c.c(split[i8]);
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
        return f124d;
    }

    public j(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
