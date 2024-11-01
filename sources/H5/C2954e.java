package h5;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: h5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2954e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32652b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f32653a;

    /* renamed from: h5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public a(AbstractC3284p abstractC3284p) {
        }
    }

    public C2954e(Context context) {
        AbstractC3292y.i(context, "context");
        this.f32653a = context;
    }

    public final long a() {
        try {
            return this.f32653a.getSharedPreferences("sp_uptodown_services", 0).getLong("versioncode_registered", -1L);
        } catch (ClassCastException unused) {
            return -1L;
        }
    }

    public final void b(long j8) {
        try {
            SharedPreferences.Editor edit = this.f32653a.getSharedPreferences("sp_uptodown_services", 0).edit();
            edit.putLong("versioncode_registered", j8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
