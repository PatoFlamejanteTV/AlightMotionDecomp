package c4;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15542b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f15543c = new u("VerificationSuccessful", 0, "Y");

    /* renamed from: d, reason: collision with root package name */
    public static final u f15544d = new u("VerificationDenied", 1, "N");

    /* renamed from: e, reason: collision with root package name */
    public static final u f15545e = new u("VerificationNotPerformed", 2, "U");

    /* renamed from: f, reason: collision with root package name */
    public static final u f15546f = new u("VerificationAttempted", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

    /* renamed from: g, reason: collision with root package name */
    public static final u f15547g = new u("ChallengeAdditionalAuth", 4, "C");

    /* renamed from: h, reason: collision with root package name */
    public static final u f15548h = new u("ChallengeDecoupledAuth", 5, "D");

    /* renamed from: i, reason: collision with root package name */
    public static final u f15549i = new u("VerificationRejected", 6, "R");

    /* renamed from: j, reason: collision with root package name */
    public static final u f15550j = new u("InformationOnly", 7, "I");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ u[] f15551k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ W5.a f15552l;

    /* renamed from: a, reason: collision with root package name */
    private final String f15553a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final u a(String str) {
            Object obj = null;
            if (str == null) {
                return null;
            }
            Iterator<E> it = u.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3292y.d(((u) next).b(), str)) {
                    obj = next;
                    break;
                }
            }
            return (u) obj;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        u[] a9 = a();
        f15551k = a9;
        f15552l = W5.b.a(a9);
        f15542b = new a(null);
    }

    private u(String str, int i8, String str2) {
        this.f15553a = str2;
    }

    private static final /* synthetic */ u[] a() {
        return new u[]{f15543c, f15544d, f15545e, f15546f, f15547g, f15548h, f15549i, f15550j};
    }

    public static W5.a c() {
        return f15552l;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f15551k.clone();
    }

    public final String b() {
        return this.f15553a;
    }
}
