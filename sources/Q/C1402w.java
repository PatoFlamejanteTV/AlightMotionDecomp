package Q;

import O.a;
import android.os.Bundle;

/* renamed from: Q.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1402w implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1402w f8320b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f8321a;

    /* renamed from: Q.w$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f8322a;

        /* synthetic */ a(AbstractC1404y abstractC1404y) {
        }

        public C1402w a() {
            return new C1402w(this.f8322a, null);
        }

        public a b(String str) {
            this.f8322a = str;
            return this;
        }
    }

    /* synthetic */ C1402w(String str, AbstractC1405z abstractC1405z) {
        this.f8321a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f8321a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1402w)) {
            return false;
        }
        return AbstractC1394n.a(this.f8321a, ((C1402w) obj).f8321a);
    }

    public final int hashCode() {
        return AbstractC1394n.b(this.f8321a);
    }
}
