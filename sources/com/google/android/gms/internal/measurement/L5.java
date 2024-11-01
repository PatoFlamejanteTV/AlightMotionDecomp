package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class L5 {

    /* renamed from: c, reason: collision with root package name */
    public static final L5 f16362c;

    /* renamed from: d, reason: collision with root package name */
    public static final L5 f16363d;

    /* renamed from: e, reason: collision with root package name */
    public static final L5 f16364e;

    /* renamed from: f, reason: collision with root package name */
    public static final L5 f16365f;

    /* renamed from: g, reason: collision with root package name */
    public static final L5 f16366g;

    /* renamed from: h, reason: collision with root package name */
    public static final L5 f16367h;

    /* renamed from: i, reason: collision with root package name */
    public static final L5 f16368i;

    /* renamed from: j, reason: collision with root package name */
    public static final L5 f16369j;

    /* renamed from: k, reason: collision with root package name */
    public static final L5 f16370k;

    /* renamed from: l, reason: collision with root package name */
    public static final L5 f16371l;

    /* renamed from: m, reason: collision with root package name */
    public static final L5 f16372m;

    /* renamed from: n, reason: collision with root package name */
    public static final L5 f16373n;

    /* renamed from: o, reason: collision with root package name */
    public static final L5 f16374o;

    /* renamed from: p, reason: collision with root package name */
    public static final L5 f16375p;

    /* renamed from: q, reason: collision with root package name */
    public static final L5 f16376q;

    /* renamed from: r, reason: collision with root package name */
    public static final L5 f16377r;

    /* renamed from: s, reason: collision with root package name */
    public static final L5 f16378s;

    /* renamed from: t, reason: collision with root package name */
    public static final L5 f16379t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ L5[] f16380u;

    /* renamed from: a, reason: collision with root package name */
    private final S5 f16381a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16382b;

    static {
        L5 l52 = new L5("DOUBLE", 0, S5.DOUBLE, 1);
        f16362c = l52;
        L5 l53 = new L5("FLOAT", 1, S5.FLOAT, 5);
        f16363d = l53;
        S5 s52 = S5.LONG;
        L5 l54 = new L5("INT64", 2, s52, 0);
        f16364e = l54;
        L5 l55 = new L5("UINT64", 3, s52, 0);
        f16365f = l55;
        S5 s53 = S5.INT;
        L5 l56 = new L5("INT32", 4, s53, 0);
        f16366g = l56;
        L5 l57 = new L5("FIXED64", 5, s52, 1);
        f16367h = l57;
        L5 l58 = new L5("FIXED32", 6, s53, 5);
        f16368i = l58;
        L5 l59 = new L5("BOOL", 7, S5.BOOLEAN, 0);
        f16369j = l59;
        int i8 = 2;
        R5 r52 = null;
        O5 o52 = new O5("STRING", S5.STRING);
        f16370k = o52;
        S5 s54 = S5.MESSAGE;
        N5 n52 = new N5("GROUP", s54);
        f16371l = n52;
        Q5 q52 = new Q5("MESSAGE", s54);
        f16372m = q52;
        P5 p52 = new P5("BYTES", S5.BYTE_STRING);
        f16373n = p52;
        L5 l510 = new L5("UINT32", 12, s53, 0);
        f16374o = l510;
        L5 l511 = new L5("ENUM", 13, S5.ENUM, 0);
        f16375p = l511;
        L5 l512 = new L5("SFIXED32", 14, s53, 5);
        f16376q = l512;
        L5 l513 = new L5("SFIXED64", 15, s52, 1);
        f16377r = l513;
        L5 l514 = new L5("SINT32", 16, s53, 0);
        f16378s = l514;
        L5 l515 = new L5("SINT64", 17, s52, 0);
        f16379t = l515;
        f16380u = new L5[]{l52, l53, l54, l55, l56, l57, l58, l59, o52, n52, q52, p52, l510, l511, l512, l513, l514, l515};
    }

    public static L5[] values() {
        return (L5[]) f16380u.clone();
    }

    public final S5 a() {
        return this.f16381a;
    }

    private L5(String str, int i8, S5 s52, int i9) {
        this.f16381a = s52;
        this.f16382b = i9;
    }
}
