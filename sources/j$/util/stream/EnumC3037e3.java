package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class EnumC3037e3 {
    public static final EnumC3037e3 DISTINCT;
    public static final EnumC3037e3 ORDERED;
    public static final EnumC3037e3 SHORT_CIRCUIT;
    public static final EnumC3037e3 SIZED;
    public static final EnumC3037e3 SORTED;

    /* renamed from: f, reason: collision with root package name */
    static final int f33475f;

    /* renamed from: g, reason: collision with root package name */
    static final int f33476g;

    /* renamed from: h, reason: collision with root package name */
    static final int f33477h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f33478i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33479j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f33480k;

    /* renamed from: l, reason: collision with root package name */
    static final int f33481l;

    /* renamed from: m, reason: collision with root package name */
    static final int f33482m;

    /* renamed from: n, reason: collision with root package name */
    static final int f33483n;

    /* renamed from: o, reason: collision with root package name */
    static final int f33484o;

    /* renamed from: p, reason: collision with root package name */
    static final int f33485p;

    /* renamed from: q, reason: collision with root package name */
    static final int f33486q;

    /* renamed from: r, reason: collision with root package name */
    static final int f33487r;

    /* renamed from: s, reason: collision with root package name */
    static final int f33488s;

    /* renamed from: t, reason: collision with root package name */
    static final int f33489t;

    /* renamed from: u, reason: collision with root package name */
    static final int f33490u;

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ EnumC3037e3[] f33491v;

    /* renamed from: a, reason: collision with root package name */
    private final Map f33492a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33493b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33494c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33495d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33496e;

    static {
        EnumC3032d3 enumC3032d3 = EnumC3032d3.SPLITERATOR;
        C3027c3 v8 = v(enumC3032d3);
        EnumC3032d3 enumC3032d32 = EnumC3032d3.STREAM;
        v8.a(enumC3032d32);
        EnumC3032d3 enumC3032d33 = EnumC3032d3.OP;
        v8.f33457a.put(enumC3032d33, 3);
        EnumC3037e3 enumC3037e3 = new EnumC3037e3("DISTINCT", 0, 0, v8);
        DISTINCT = enumC3037e3;
        C3027c3 v9 = v(enumC3032d3);
        v9.a(enumC3032d32);
        v9.f33457a.put(enumC3032d33, 3);
        EnumC3037e3 enumC3037e32 = new EnumC3037e3("SORTED", 1, 1, v9);
        SORTED = enumC3037e32;
        C3027c3 v10 = v(enumC3032d3);
        v10.a(enumC3032d32);
        Map map = v10.f33457a;
        map.put(enumC3032d33, 3);
        EnumC3032d3 enumC3032d34 = EnumC3032d3.TERMINAL_OP;
        map.put(enumC3032d34, 2);
        EnumC3032d3 enumC3032d35 = EnumC3032d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC3032d35, 2);
        EnumC3037e3 enumC3037e33 = new EnumC3037e3("ORDERED", 2, 2, v10);
        ORDERED = enumC3037e33;
        C3027c3 v11 = v(enumC3032d3);
        v11.a(enumC3032d32);
        v11.f33457a.put(enumC3032d33, 2);
        EnumC3037e3 enumC3037e34 = new EnumC3037e3("SIZED", 3, 3, v11);
        SIZED = enumC3037e34;
        C3027c3 v12 = v(enumC3032d33);
        v12.a(enumC3032d34);
        EnumC3037e3 enumC3037e35 = new EnumC3037e3("SHORT_CIRCUIT", 4, 12, v12);
        SHORT_CIRCUIT = enumC3037e35;
        f33491v = new EnumC3037e3[]{enumC3037e3, enumC3037e32, enumC3037e33, enumC3037e34, enumC3037e35};
        f33475f = l(enumC3032d3);
        f33476g = l(enumC3032d32);
        f33477h = l(enumC3032d33);
        l(enumC3032d34);
        l(enumC3032d35);
        int i8 = 0;
        for (EnumC3037e3 enumC3037e36 : values()) {
            i8 |= enumC3037e36.f33496e;
        }
        f33478i = i8;
        int i9 = f33476g;
        f33479j = i9;
        int i10 = i9 << 1;
        f33480k = i10;
        f33481l = i9 | i10;
        EnumC3037e3 enumC3037e37 = DISTINCT;
        f33482m = enumC3037e37.f33494c;
        f33483n = enumC3037e37.f33495d;
        EnumC3037e3 enumC3037e38 = SORTED;
        f33484o = enumC3037e38.f33494c;
        f33485p = enumC3037e38.f33495d;
        EnumC3037e3 enumC3037e39 = ORDERED;
        f33486q = enumC3037e39.f33494c;
        f33487r = enumC3037e39.f33495d;
        EnumC3037e3 enumC3037e310 = SIZED;
        f33488s = enumC3037e310.f33494c;
        f33489t = enumC3037e310.f33495d;
        f33490u = SHORT_CIRCUIT.f33494c;
    }

    private EnumC3037e3(String str, int i8, int i9, C3027c3 c3027c3) {
        EnumC3032d3[] values = EnumC3032d3.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            Map map = c3027c3.f33457a;
            if (i10 >= length) {
                this.f33492a = map;
                int i11 = i9 * 2;
                this.f33493b = i11;
                this.f33494c = 1 << i11;
                this.f33495d = 2 << i11;
                this.f33496e = 3 << i11;
                return;
            }
            AbstractC2998d.t(map, values[i10], 0);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i8, int i9) {
        return i8 | (i9 & (i8 == 0 ? f33478i : ~(((f33479j & i8) << 1) | i8 | ((f33480k & i8) >> 1))));
    }

    private static int l(EnumC3032d3 enumC3032d3) {
        int i8 = 0;
        for (EnumC3037e3 enumC3037e3 : values()) {
            i8 |= ((Integer) enumC3037e3.f33492a.get(enumC3032d3)).intValue() << enumC3037e3.f33493b;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i8 = characteristics & 4;
        int i9 = f33475f;
        return (i8 == 0 || spliterator.getComparator() == null) ? characteristics & i9 : characteristics & i9 & (-5);
    }

    private static C3027c3 v(EnumC3032d3 enumC3032d3) {
        C3027c3 c3027c3 = new C3027c3(new EnumMap(EnumC3032d3.class));
        c3027c3.a(enumC3032d3);
        return c3027c3;
    }

    public static EnumC3037e3 valueOf(String str) {
        return (EnumC3037e3) Enum.valueOf(EnumC3037e3.class, str);
    }

    public static EnumC3037e3[] values() {
        return (EnumC3037e3[]) f33491v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i8) {
        return i8 & ((~i8) >> 1) & f33479j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i8) {
        return (i8 & this.f33496e) == this.f33494c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(int i8) {
        int i9 = this.f33496e;
        return (i8 & i9) == i9;
    }
}
