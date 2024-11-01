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
import w1.C4149h;
import w1.C4150i;
import w1.C4151j;
import x1.AbstractC4199c;
import z1.AbstractC4263c;

/* loaded from: classes4.dex */
public class h extends b {

    /* renamed from: d, reason: collision with root package name */
    public static int f114d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f115e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static String f116f = "tcfeuv2";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4199c f117c = new x1.o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4147f f118a;

        a(C4147f c4147f) {
            this.f118a = c4147f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f118a.c()).intValue();
        }
    }

    public h() {
        g();
    }

    private void g() {
        this.f100a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f100a.put(AbstractC4263c.f41347a, new C4147f(6, Integer.valueOf(f115e)));
        this.f100a.put(AbstractC4263c.f41348b, new C4144c(now));
        this.f100a.put(AbstractC4263c.f41349c, new C4144c(now));
        this.f100a.put(AbstractC4263c.f41350d, new C4147f(12, 0));
        this.f100a.put(AbstractC4263c.f41351e, new C4147f(12, 0));
        this.f100a.put(AbstractC4263c.f41352f, new C4147f(6, 0));
        this.f100a.put(AbstractC4263c.f41353g, new C4150i(2, "EN"));
        this.f100a.put(AbstractC4263c.f41354h, new C4147f(12, 0));
        this.f100a.put(AbstractC4263c.f41355i, new C4147f(6, 2));
        Map map = this.f100a;
        String str = AbstractC4263c.f41356j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C4143b(bool));
        this.f100a.put(AbstractC4263c.f41357k, new C4143b(bool));
        this.f100a.put(AbstractC4263c.f41358l, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4263c.f41359m, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4263c.f41360n, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4263c.f41361o, new C4143b(bool));
        this.f100a.put(AbstractC4263c.f41362p, new C4150i(2, "AA"));
        this.f100a.put(AbstractC4263c.f41363q, new w1.k(new ArrayList()));
        this.f100a.put(AbstractC4263c.f41364r, new w1.k(new ArrayList()));
        this.f100a.put(AbstractC4263c.f41365s, new C4149h(new ArrayList()));
        this.f100a.put(AbstractC4263c.f41366t, new C4147f(3, 3));
        this.f100a.put(AbstractC4263c.f41367u, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f100a.put(AbstractC4263c.f41368v, new C4146e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C4147f c4147f = new C4147f(6, 0);
        this.f100a.put(AbstractC4263c.f41369w, c4147f);
        a aVar = new a(c4147f);
        this.f100a.put(AbstractC4263c.f41370x, new C4151j(aVar, new ArrayList()));
        this.f100a.put(AbstractC4263c.f41371y, new C4151j(aVar, new ArrayList()));
        this.f100a.put(AbstractC4263c.f41372z, new C4147f(3, 2));
        this.f100a.put(AbstractC4263c.f41344A, new w1.k(new ArrayList()));
        this.f100a.put(AbstractC4263c.f41345B, new C4147f(3, 1));
        this.f100a.put(AbstractC4263c.f41346C, new w1.k(new ArrayList()));
        this.f101b = new String[][]{new String[]{AbstractC4263c.f41347a, AbstractC4263c.f41348b, AbstractC4263c.f41349c, AbstractC4263c.f41350d, AbstractC4263c.f41351e, AbstractC4263c.f41352f, AbstractC4263c.f41353g, AbstractC4263c.f41354h, AbstractC4263c.f41355i, AbstractC4263c.f41356j, AbstractC4263c.f41357k, AbstractC4263c.f41358l, AbstractC4263c.f41359m, AbstractC4263c.f41360n, AbstractC4263c.f41361o, AbstractC4263c.f41362p, AbstractC4263c.f41363q, AbstractC4263c.f41364r, AbstractC4263c.f41365s}, new String[]{AbstractC4263c.f41366t, AbstractC4263c.f41367u, AbstractC4263c.f41368v, AbstractC4263c.f41369w, AbstractC4263c.f41370x, AbstractC4263c.f41371y}, new String[]{AbstractC4263c.f41372z, AbstractC4263c.f41344A}, new String[]{AbstractC4263c.f41345B, AbstractC4263c.f41346C}};
    }

    @Override // A1.b, A1.c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC4263c.f41348b) && !str.equals(AbstractC4263c.f41349c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC4263c.f41348b, now);
            super.a(AbstractC4263c.f41349c, now);
        }
    }

    @Override // A1.c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f117c.d((String) e8.get(0)));
            if (((Boolean) c(AbstractC4263c.f41356j)).booleanValue()) {
                if (e8.size() >= 2) {
                    arrayList.add(this.f117c.d((String) e8.get(1)));
                }
            } else if (e8.size() >= 2) {
                arrayList.add(this.f117c.d((String) e8.get(2)));
                if (e8.size() >= 3) {
                    arrayList.add(this.f117c.d((String) e8.get(3)));
                }
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            java.lang.String r3 = "\\."
            java.lang.String[] r11 = r11.split(r3)
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r5 = 0
        Le:
            int r6 = r11.length
            if (r5 >= r6) goto L82
            x1.c r6 = r10.f117c
            r7 = r11[r5]
            java.lang.String r6 = r6.c(r7)
            java.lang.String r7 = r6.substring(r4, r1)
            r7.hashCode()
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case 47664: goto L4a;
                case 47665: goto L3f;
                case 47695: goto L34;
                case 47696: goto L29;
                default: goto L28;
            }
        L28:
            goto L54
        L29:
            java.lang.String r9 = "011"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L32
            goto L54
        L32:
            r8 = 3
            goto L54
        L34:
            java.lang.String r9 = "010"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L3d
            goto L54
        L3d:
            r8 = 2
            goto L54
        L3f:
            java.lang.String r9 = "001"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L48
            goto L54
        L48:
            r8 = 1
            goto L54
        L4a:
            java.lang.String r9 = "000"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r8 = 0
        L54:
            switch(r8) {
                case 0: goto L7e;
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L75;
                default: goto L57;
            }
        L57:
            y1.a r0 = new y1.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to decode segment '"
            r1.append(r2)
            r11 = r11[r5]
            r1.append(r11)
            java.lang.String r11 = "'"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L75:
            r3[r2] = r6
            goto L80
        L78:
            r3[r0] = r6
            goto L80
        L7b:
            r3[r1] = r6
            goto L80
        L7e:
            r3[r4] = r6
        L80:
            int r5 = r5 + r2
            goto Le
        L82:
            java.util.List r11 = java.util.Arrays.asList(r3)
            r10.d(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.h.f(java.lang.String):void");
    }

    @Override // A1.c
    public int getId() {
        return f114d;
    }

    public h(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
