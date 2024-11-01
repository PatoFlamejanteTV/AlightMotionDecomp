package M7;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0115a f6237b = new C0115a(null);

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f6238a;

    /* renamed from: M7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0115a {
        private C0115a() {
        }

        public /* synthetic */ C0115a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public a(b matomo) {
        AbstractC3292y.i(matomo, "matomo");
        this.f6238a = matomo.g();
    }

    public final void a(e tracker) {
        AbstractC3292y.i(tracker, "tracker");
        SharedPreferences g8 = tracker.g();
        if (this.f6238a.getBoolean("matomo.optout", false)) {
            g8.edit().putBoolean("tracker.optout", true).apply();
            this.f6238a.edit().remove("matomo.optout").apply();
        }
        if (this.f6238a.contains("tracker.userid")) {
            g8.edit().putString("tracker.userid", this.f6238a.getString("tracker.userid", UUID.randomUUID().toString())).apply();
            this.f6238a.edit().remove("tracker.userid").apply();
        }
        if (this.f6238a.contains("tracker.firstvisit")) {
            g8.edit().putLong("tracker.firstvisit", this.f6238a.getLong("tracker.firstvisit", -1L)).apply();
            this.f6238a.edit().remove("tracker.firstvisit").apply();
        }
        if (this.f6238a.contains("tracker.visitcount")) {
            g8.edit().putLong("tracker.visitcount", this.f6238a.getInt("tracker.visitcount", 0)).apply();
            this.f6238a.edit().remove("tracker.visitcount").apply();
        }
        if (this.f6238a.contains("tracker.previousvisit")) {
            g8.edit().putLong("tracker.previousvisit", this.f6238a.getLong("tracker.previousvisit", -1L)).apply();
            this.f6238a.edit().remove("tracker.previousvisit").apply();
        }
        Map<String, ?> all = this.f6238a.getAll();
        AbstractC3292y.h(all, "getAll(...)");
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            AbstractC3292y.f(key);
            if (n.B(key, "downloaded:", false, 2, null)) {
                g8.edit().putBoolean(key, true).apply();
                this.f6238a.edit().remove(key).apply();
            }
        }
    }
}
