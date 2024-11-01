package v2;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40434a = a.f40435a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40435a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final b f40436b = new b();

        /* renamed from: c, reason: collision with root package name */
        private static final C0909a f40437c = new C0909a();

        /* renamed from: v2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0909a implements d {
            C0909a() {
            }

            @Override // v2.d
            public void a(String msg, Throwable th) {
                AbstractC3292y.i(msg, "msg");
            }

            @Override // v2.d
            public void b(String msg) {
                AbstractC3292y.i(msg, "msg");
            }

            @Override // v2.d
            public void c(String msg) {
                AbstractC3292y.i(msg, "msg");
            }

            @Override // v2.d
            public void d(String msg) {
                AbstractC3292y.i(msg, "msg");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d {
            b() {
            }

            @Override // v2.d
            public void a(String msg, Throwable th) {
                AbstractC3292y.i(msg, "msg");
                Log.e("StripeSdk", msg, th);
            }

            @Override // v2.d
            public void b(String msg) {
                AbstractC3292y.i(msg, "msg");
                Log.d("StripeSdk", msg);
            }

            @Override // v2.d
            public void c(String msg) {
                AbstractC3292y.i(msg, "msg");
                Log.w("StripeSdk", msg);
            }

            @Override // v2.d
            public void d(String msg) {
                AbstractC3292y.i(msg, "msg");
                Log.i("StripeSdk", msg);
            }
        }

        private a() {
        }

        public final d a(boolean z8) {
            if (z8) {
                return c();
            }
            return b();
        }

        public final d b() {
            return f40437c;
        }

        public final d c() {
            return f40436b;
        }
    }

    void a(String str, Throwable th);

    void b(String str);

    void c(String str);

    void d(String str);
}
