package H;

import O.a;
import Q.AbstractC1394n;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g implements a.d {

    /* renamed from: d, reason: collision with root package name */
    public static final g f3167d = new g(new f());

    /* renamed from: a, reason: collision with root package name */
    private final String f3168a = null;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3169b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3170c;

    public g(f fVar) {
        this.f3169b = fVar.f3165a.booleanValue();
        this.f3170c = fVar.f3166b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f3168a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f3169b);
        bundle.putString("log_session_id", this.f3170c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f3168a;
        if (AbstractC1394n.a(null, null) && this.f3169b == gVar.f3169b && AbstractC1394n.a(this.f3170c, gVar.f3170c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1394n.b(null, Boolean.valueOf(this.f3169b), this.f3170c);
    }
}
