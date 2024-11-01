package o1;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import o1.InterfaceC3518h;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3512b implements InterfaceC3518h {

    /* renamed from: b, reason: collision with root package name */
    private static final a f35838b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f35839a;

    /* renamed from: o1.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3512b(Context context) {
        AbstractC3292y.i(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f35839a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // o1.InterfaceC3518h
    public Boolean a() {
        if (this.f35839a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f35839a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // o1.InterfaceC3518h
    public C3374a b() {
        if (this.f35839a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C3374a.e(AbstractC3376c.s(this.f35839a.getInt("firebase_sessions_sessions_restart_timeout"), EnumC3377d.f35046e));
        }
        return null;
    }

    @Override // o1.InterfaceC3518h
    public Double c() {
        if (this.f35839a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f35839a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // o1.InterfaceC3518h
    public Object d(U5.d dVar) {
        return InterfaceC3518h.a.a(this, dVar);
    }
}
