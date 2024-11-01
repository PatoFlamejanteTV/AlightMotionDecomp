package B2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f507a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f508b = new a("WiFi", 0, "Wi-Fi");

        /* renamed from: c, reason: collision with root package name */
        public static final a f509c = new a("Mobile2G", 1, "2G");

        /* renamed from: d, reason: collision with root package name */
        public static final a f510d = new a("Mobile3G", 2, "3G");

        /* renamed from: e, reason: collision with root package name */
        public static final a f511e = new a("Mobile4G", 3, "4G");

        /* renamed from: f, reason: collision with root package name */
        public static final a f512f = new a("Mobile5G", 4, "5G");

        /* renamed from: g, reason: collision with root package name */
        public static final a f513g = new a("Unknown", 5, EnvironmentCompat.MEDIA_UNKNOWN);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ a[] f514h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ W5.a f515i;

        /* renamed from: a, reason: collision with root package name */
        private final String f516a;

        static {
            a[] a9 = a();
            f514h = a9;
            f515i = W5.b.a(a9);
        }

        private a(String str, int i8, String str2) {
            this.f516a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f508b, f509c, f510d, f511e, f512f, f513g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f514h.clone();
        }

        public final String b() {
            return this.f516a;
        }
    }

    private u(ConnectivityManager connectivityManager) {
        this.f507a = connectivityManager;
    }

    private final a a(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return a.f509c;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return a.f510d;
            case 13:
            case 18:
            case 19:
                return a.f511e;
            case 20:
                return a.f512f;
            default:
                return a.f513g;
        }
    }

    public final String b() {
        a a9;
        NetworkInfo activeNetworkInfo = this.f507a.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    a9 = a.f513g;
                } else {
                    a9 = a.f508b;
                }
            } else {
                a9 = a(activeNetworkInfo.getSubtype());
            }
            return a9.b();
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3292y.i(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.AbstractC3292y.g(r2, r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.u.<init>(android.content.Context):void");
    }
}
