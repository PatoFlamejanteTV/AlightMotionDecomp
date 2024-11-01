package A1;

import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import w1.C4143b;
import w1.C4144c;
import w1.C4146e;
import w1.C4147f;
import w1.C4150i;
import w1.C4151j;
import x1.AbstractC4199c;
import x1.C4201e;
import y1.C4236a;
import z1.AbstractC4262b;

/* loaded from: classes4.dex */
public class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f108d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static int f109e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f110f = "tcfcav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f111c = new C4201e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4147f f112a;

        a(C4147f c4147f) {
            this.f112a = c4147f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f112a.c()).intValue();
        }
    }

    public g() {
        g();
    }

    private void g() {
        this.f100a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f100a.put(AbstractC4262b.f41323a, new C4147f(6, Integer.valueOf(f109e)));
        this.f100a.put(AbstractC4262b.f41324b, new C4144c(now));
        this.f100a.put(AbstractC4262b.f41325c, new C4144c(now));
        this.f100a.put(AbstractC4262b.f41326d, new C4147f(12, 0));
        this.f100a.put(AbstractC4262b.f41327e, new C4147f(12, 0));
        this.f100a.put(AbstractC4262b.f41328f, new C4147f(6, 0));
        this.f100a.put(AbstractC4262b.f41329g, new C4150i(2, "EN"));
        this.f100a.put(AbstractC4262b.f41330h, new C4147f(12, 0));
        this.f100a.put(AbstractC4262b.f41331i, new C4147f(6, 2));
        Map map = this.f100a;
        String str = AbstractC4262b.f41332j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C4143b(bool));
        this.f100a.put(AbstractC4262b.f41333k, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4262b.f41334l, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4262b.f41335m, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4262b.f41336n, new w1.k(new ArrayList()));
        this.f100a.put(AbstractC4262b.f41337o, new w1.k(new ArrayList()));
        this.f100a.put(AbstractC4262b.f41338p, new C4147f(3, 3));
        this.f100a.put(AbstractC4262b.f41339q, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4262b.f41340r, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C4147f c4147f = new C4147f(6, 0);
        this.f100a.put(AbstractC4262b.f41341s, c4147f);
        a aVar = new a(c4147f);
        this.f100a.put(AbstractC4262b.f41342t, new C4151j(aVar, new ArrayList()));
        this.f100a.put(AbstractC4262b.f41343u, new C4151j(aVar, new ArrayList()));
        this.f101b = new String[][]{new String[]{AbstractC4262b.f41323a, AbstractC4262b.f41324b, AbstractC4262b.f41325c, AbstractC4262b.f41326d, AbstractC4262b.f41327e, AbstractC4262b.f41328f, AbstractC4262b.f41329g, AbstractC4262b.f41330h, AbstractC4262b.f41331i, AbstractC4262b.f41332j, AbstractC4262b.f41333k, AbstractC4262b.f41334l, AbstractC4262b.f41335m, AbstractC4262b.f41336n, AbstractC4262b.f41337o}, new String[]{AbstractC4262b.f41338p, AbstractC4262b.f41339q, AbstractC4262b.f41340r, AbstractC4262b.f41341s, AbstractC4262b.f41342t, AbstractC4262b.f41343u}};
    }

    @Override // A1.b, A1.c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC4262b.f41324b) && !str.equals(AbstractC4262b.f41325c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC4262b.f41324b, now);
            super.a(AbstractC4262b.f41325c, now);
        }
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f111c.d((String) e8.get(0)));
            if (e8.size() >= 2) {
                arrayList.add(this.f111c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[4];
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f111c.c(split[i8]);
            String substring = c8.substring(0, 3);
            substring.hashCode();
            if (!substring.equals("000")) {
                if (substring.equals("011")) {
                    strArr[1] = c8;
                } else {
                    throw new C4236a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
    }

    @Override // A1.c
    public int getId() {
        return f108d;
    }

    public g(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
