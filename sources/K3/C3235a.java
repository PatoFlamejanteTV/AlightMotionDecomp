package k3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3235a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0785a f34401b = new C0785a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f34402a;

    /* renamed from: k3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0785a {
        private C0785a() {
        }

        public final C3235a a(Context context) {
            AbstractC3292y.i(context, "context");
            String packageName = context.getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            return new C3235a(packageName);
        }

        public /* synthetic */ C0785a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3235a(String packageName) {
        AbstractC3292y.i(packageName, "packageName");
        this.f34402a = packageName;
    }

    public final String a() {
        return "stripesdk://payment_return_url/" + this.f34402a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3235a) && AbstractC3292y.d(this.f34402a, ((C3235a) obj).f34402a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34402a.hashCode();
    }

    public String toString() {
        return "DefaultReturnUrl(packageName=" + this.f34402a + ")";
    }
}
