package g3;

import R5.AbstractC1435t;
import R5.a0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class M {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32049b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f32050c = new M("ApplePay", 0, a0.d("apple_pay"));

    /* renamed from: d, reason: collision with root package name */
    public static final M f32051d = new M("GooglePay", 1, a0.i("android_pay", "google"));

    /* renamed from: e, reason: collision with root package name */
    public static final M f32052e = new M("Masterpass", 2, a0.d("masterpass"));

    /* renamed from: f, reason: collision with root package name */
    public static final M f32053f = new M("VisaCheckout", 3, a0.d("visa_checkout"));

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ M[] f32054g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32055h;

    /* renamed from: a, reason: collision with root package name */
    private final Set f32056a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final M a(String str) {
            Object obj;
            Iterator<E> it = M.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC1435t.d0(((M) obj).f32056a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (M) obj;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        M[] a9 = a();
        f32054g = a9;
        f32055h = W5.b.a(a9);
        f32049b = new a(null);
    }

    private M(String str, int i8, Set set) {
        this.f32056a = set;
    }

    private static final /* synthetic */ M[] a() {
        return new M[]{f32050c, f32051d, f32052e, f32053f};
    }

    public static W5.a c() {
        return f32055h;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f32054g.clone();
    }
}
