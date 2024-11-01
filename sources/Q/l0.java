package Q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f8271f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f8272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8273b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f8274c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8275d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8276e;

    public l0(String str, String str2, int i8, boolean z8) {
        AbstractC1396p.f(str);
        this.f8272a = str;
        AbstractC1396p.f(str2);
        this.f8273b = str2;
        this.f8274c = null;
        this.f8275d = 4225;
        this.f8276e = z8;
    }

    public final ComponentName a() {
        return this.f8274c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f8272a != null) {
            Intent intent = null;
            if (this.f8276e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f8272a);
                try {
                    bundle = context.getContentResolver().call(f8271f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e8) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f8272a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f8272a).setPackage(this.f8273b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f8274c);
    }

    public final String c() {
        return this.f8273b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (AbstractC1394n.a(this.f8272a, l0Var.f8272a) && AbstractC1394n.a(this.f8273b, l0Var.f8273b) && AbstractC1394n.a(this.f8274c, l0Var.f8274c) && this.f8276e == l0Var.f8276e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1394n.b(this.f8272a, this.f8273b, this.f8274c, 4225, Boolean.valueOf(this.f8276e));
    }

    public final String toString() {
        String str = this.f8272a;
        if (str == null) {
            AbstractC1396p.l(this.f8274c);
            return this.f8274c.flattenToString();
        }
        return str;
    }
}
