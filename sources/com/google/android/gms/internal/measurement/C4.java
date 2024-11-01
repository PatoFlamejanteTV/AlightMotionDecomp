package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class C4 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4 f16248b;

    /* renamed from: c, reason: collision with root package name */
    public static final C4 f16249c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4 f16250d;

    /* renamed from: e, reason: collision with root package name */
    public static final C4 f16251e;

    /* renamed from: f, reason: collision with root package name */
    public static final C4 f16252f;

    /* renamed from: g, reason: collision with root package name */
    public static final C4 f16253g;

    /* renamed from: h, reason: collision with root package name */
    public static final C4 f16254h;

    /* renamed from: i, reason: collision with root package name */
    public static final C4 f16255i;

    /* renamed from: j, reason: collision with root package name */
    public static final C4 f16256j;

    /* renamed from: k, reason: collision with root package name */
    public static final C4 f16257k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ C4[] f16258l;

    /* renamed from: a, reason: collision with root package name */
    private final Class f16259a;

    static {
        C4 c42 = new C4("VOID", 0, Void.class, Void.class, null);
        f16248b = c42;
        Class cls = Integer.TYPE;
        C4 c43 = new C4("INT", 1, cls, Integer.class, 0);
        f16249c = c43;
        C4 c44 = new C4("LONG", 2, Long.TYPE, Long.class, 0L);
        f16250d = c44;
        C4 c45 = new C4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f16251e = c45;
        C4 c46 = new C4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f16252f = c46;
        C4 c47 = new C4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f16253g = c47;
        C4 c48 = new C4("STRING", 6, String.class, String.class, "");
        f16254h = c48;
        C4 c49 = new C4("BYTE_STRING", 7, J3.class, J3.class, J3.f16332b);
        f16255i = c49;
        C4 c410 = new C4("ENUM", 8, cls, Integer.class, null);
        f16256j = c410;
        C4 c411 = new C4("MESSAGE", 9, Object.class, Object.class, null);
        f16257k = c411;
        f16258l = new C4[]{c42, c43, c44, c45, c46, c47, c48, c49, c410, c411};
    }

    private C4(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f16259a = cls2;
    }

    public static C4[] values() {
        return (C4[]) f16258l.clone();
    }

    public final Class a() {
        return this.f16259a;
    }
}
