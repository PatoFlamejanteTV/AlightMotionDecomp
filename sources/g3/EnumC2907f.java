package g3;

import androidx.core.os.EnvironmentCompat;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2907f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32140b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2907f f32141c = new EnumC2907f("Credit", 0, "credit");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2907f f32142d = new EnumC2907f("Debit", 1, "debit");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2907f f32143e = new EnumC2907f("Prepaid", 2, "prepaid");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2907f f32144f = new EnumC2907f("Unknown", 3, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC2907f[] f32145g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32146h;

    /* renamed from: a, reason: collision with root package name */
    private final String f32147a;

    /* renamed from: g3.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC2907f a(String str) {
            Object obj;
            Iterator<E> it = EnumC2907f.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3292y.d(((EnumC2907f) obj).b(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (EnumC2907f) obj;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        EnumC2907f[] a9 = a();
        f32145g = a9;
        f32146h = W5.b.a(a9);
        f32140b = new a(null);
    }

    private EnumC2907f(String str, int i8, String str2) {
        this.f32147a = str2;
    }

    private static final /* synthetic */ EnumC2907f[] a() {
        return new EnumC2907f[]{f32141c, f32142d, f32143e, f32144f};
    }

    public static W5.a c() {
        return f32146h;
    }

    public static EnumC2907f valueOf(String str) {
        return (EnumC2907f) Enum.valueOf(EnumC2907f.class, str);
    }

    public static EnumC2907f[] values() {
        return (EnumC2907f[]) f32145g.clone();
    }

    public final String b() {
        return this.f32147a;
    }
}
