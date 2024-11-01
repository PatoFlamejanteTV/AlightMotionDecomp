package d4;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31449c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f31450d = new g("Text", 0, "01", true);

    /* renamed from: e, reason: collision with root package name */
    public static final g f31451e = new g("SingleSelect", 1, "02", true);

    /* renamed from: f, reason: collision with root package name */
    public static final g f31452f = new g("MultiSelect", 2, "03", true);

    /* renamed from: g, reason: collision with root package name */
    public static final g f31453g = new g("OutOfBand", 3, "04", false);

    /* renamed from: h, reason: collision with root package name */
    public static final g f31454h = new g("Html", 4, "05", false);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ g[] f31455i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ W5.a f31456j;

    /* renamed from: a, reason: collision with root package name */
    private final String f31457a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31458b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final g a(String str) {
            Object obj;
            Iterator<E> it = g.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3292y.d(str, ((g) obj).b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (g) obj;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        g[] a9 = a();
        f31455i = a9;
        f31456j = W5.b.a(a9);
        f31449c = new a(null);
    }

    private g(String str, int i8, String str2, boolean z8) {
        this.f31457a = str2;
        this.f31458b = z8;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f31450d, f31451e, f31452f, f31453g, f31454h};
    }

    public static W5.a c() {
        return f31456j;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f31455i.clone();
    }

    public final String b() {
        return this.f31457a;
    }

    public final boolean d() {
        return this.f31458b;
    }
}
