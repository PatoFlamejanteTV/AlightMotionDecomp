package l6;

import kotlin.jvm.internal.AbstractC3284p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f34786c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f34787d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f34788e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f34789f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f34790g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f34791h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f34792i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ l[] f34793j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ W5.a f34794k;

    /* renamed from: a, reason: collision with root package name */
    private final int f34795a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34796b;

    static {
        int i8 = 2;
        f34786c = new l("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 2;
        AbstractC3284p abstractC3284p = null;
        int i10 = 0;
        f34787d = new l("MULTILINE", 1, 8, i10, i9, abstractC3284p);
        int i11 = 2;
        AbstractC3284p abstractC3284p2 = null;
        int i12 = 0;
        f34788e = new l("LITERAL", i8, 16, i12, i11, abstractC3284p2);
        f34789f = new l("UNIX_LINES", 3, 1, i10, i9, abstractC3284p);
        f34790g = new l("COMMENTS", 4, 4, i12, i11, abstractC3284p2);
        f34791h = new l("DOT_MATCHES_ALL", 5, 32, i10, i9, abstractC3284p);
        f34792i = new l("CANON_EQ", 6, 128, i12, i11, abstractC3284p2);
        l[] a9 = a();
        f34793j = a9;
        f34794k = W5.b.a(a9);
    }

    private l(String str, int i8, int i9, int i10) {
        this.f34795a = i9;
        this.f34796b = i10;
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f34786c, f34787d, f34788e, f34789f, f34790g, f34791h, f34792i};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f34793j.clone();
    }

    public int b() {
        return this.f34795a;
    }

    /* synthetic */ l(String str, int i8, int i9, int i10, int i11, AbstractC3284p abstractC3284p) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
