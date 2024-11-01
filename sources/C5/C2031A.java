package c5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: c5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2031A {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15554f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private String f15556b;

    /* renamed from: d, reason: collision with root package name */
    private long f15558d;

    /* renamed from: e, reason: collision with root package name */
    private long f15559e;

    /* renamed from: a, reason: collision with root package name */
    private long f15555a = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f15557c = -1;

    /* renamed from: c5.A$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            SettingsPreferences.f30529b.c(context);
        }

        public final C2031A b(Context context) {
            AbstractC3292y.i(context, "context");
            C2031A z8 = SettingsPreferences.f30529b.z(context);
            if (z8 != null) {
                if (z8.h()) {
                    return z8;
                }
                a(context);
                return null;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.f15555a > -1 && this.f15556b != null) {
            long j8 = this.f15558d;
            if (j8 > 0 && j8 + 86400000 > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public final long b() {
        return this.f15555a;
    }

    public final int c() {
        return this.f15557c;
    }

    public final String d() {
        return this.f15556b;
    }

    public final long e() {
        return this.f15558d;
    }

    public final long f() {
        return this.f15559e;
    }

    public final boolean g() {
        if (this.f15559e > 0) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        AbstractC3292y.i(context, "context");
        SettingsPreferences.f30529b.q0(context, this);
    }

    public final void j(long j8) {
        this.f15555a = j8;
    }

    public final void k(int i8) {
        this.f15557c = i8;
    }

    public final void l(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        this.f15557c = i8;
        i(context);
    }

    public final void m(String str) {
        this.f15556b = str;
    }

    public final void n(Context context) {
        AbstractC3292y.i(context, "context");
        this.f15558d = System.currentTimeMillis();
        i(context);
    }

    public final void o(long j8) {
        this.f15558d = j8;
    }

    public final void p(Context context) {
        AbstractC3292y.i(context, "context");
        this.f15559e = System.currentTimeMillis();
        i(context);
    }

    public final void q(long j8) {
        this.f15559e = j8;
    }

    public String toString() {
        return "NotificationFCM(appId=" + this.f15555a + ", packageName=" + this.f15556b + ", downloadId=" + this.f15557c + ')';
    }
}
