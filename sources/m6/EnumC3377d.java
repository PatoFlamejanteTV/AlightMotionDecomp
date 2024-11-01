package m6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3377d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3377d f35043b = new EnumC3377d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3377d f35044c = new EnumC3377d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3377d f35045d = new EnumC3377d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3377d f35046e = new EnumC3377d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3377d f35047f = new EnumC3377d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3377d f35048g = new EnumC3377d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3377d f35049h = new EnumC3377d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC3377d[] f35050i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ W5.a f35051j;

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f35052a;

    static {
        EnumC3377d[] a9 = a();
        f35050i = a9;
        f35051j = W5.b.a(a9);
    }

    private EnumC3377d(String str, int i8, TimeUnit timeUnit) {
        this.f35052a = timeUnit;
    }

    private static final /* synthetic */ EnumC3377d[] a() {
        return new EnumC3377d[]{f35043b, f35044c, f35045d, f35046e, f35047f, f35048g, f35049h};
    }

    public static EnumC3377d valueOf(String str) {
        return (EnumC3377d) Enum.valueOf(EnumC3377d.class, str);
    }

    public static EnumC3377d[] values() {
        return (EnumC3377d[]) f35050i.clone();
    }

    public final TimeUnit b() {
        return this.f35052a;
    }
}
