package c5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15686c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f15687a;

    /* renamed from: b, reason: collision with root package name */
    private long f15688b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final S a(Context context) {
            AbstractC3292y.i(context, "context");
            return SettingsPreferences.f30529b.F(context);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public S(long j8, long j9) {
        this.f15687a = j8;
        this.f15688b = j9;
    }

    public final long a(Context context) {
        AbstractC3292y.i(context, "context");
        if (System.currentTimeMillis() - this.f15688b > 2592000000L) {
            this.f15687a = 0L;
            this.f15688b = System.currentTimeMillis();
            SettingsPreferences.f30529b.r0(context, this);
        }
        return 209715200 - this.f15687a;
    }

    public final long b() {
        return this.f15687a;
    }

    public final long c() {
        return this.f15688b;
    }

    public final void d(Context context) {
        AbstractC3292y.i(context, "context");
        SettingsPreferences.f30529b.r0(context, this);
    }

    public final void e(long j8) {
        this.f15687a = j8;
    }
}
