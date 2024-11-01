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
public class i extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f120d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static int f121e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f122f = "uscav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f123c = new C4201e();

    public i() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f100a = hashMap;
        hashMap.put(AbstractC4264d.f41373a, new C4147f(6, Integer.valueOf(f121e)));
        this.f100a.put(AbstractC4264d.f41374b, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41375c, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41376d, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41377e, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41378f, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41379g, new C4148g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0)));
        this.f100a.put(AbstractC4264d.f41380h, new C4148g(2, Arrays.asList(0, 0)));
        this.f100a.put(AbstractC4264d.f41381i, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41382j, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41383k, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41384l, new C4147f(2, 0));
        this.f100a.put(AbstractC4264d.f41385m, new C4147f(2, 1));
        this.f100a.put(AbstractC4264d.f41386n, new C4143b(Boolean.TRUE));
        this.f100a.put(AbstractC4264d.f41387o, new C4143b(Boolean.FALSE));
        this.f101b = new String[][]{new String[]{AbstractC4264d.f41373a, AbstractC4264d.f41374b, AbstractC4264d.f41375c, AbstractC4264d.f41376d, AbstractC4264d.f41377e, AbstractC4264d.f41378f, AbstractC4264d.f41379g, AbstractC4264d.f41380h, AbstractC4264d.f41381i, AbstractC4264d.f41382j, AbstractC4264d.f41383k, AbstractC4264d.f41384l}, new String[]{AbstractC4264d.f41385m, AbstractC4264d.f41387o}};
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f123c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC4142a) this.f100a.get(AbstractC4264d.f41386n)).c()).booleanValue()) {
                arrayList.add(this.f123c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f123c.c(split[i8]);
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
        return f120d;
    }

    public i(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
