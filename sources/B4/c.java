package B4;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f609a = new c();

    private c() {
    }

    public final boolean a(String url) {
        boolean z8;
        AbstractC3292y.i(url, "url");
        Uri parse = Uri.parse(url);
        if (!AbstractC3292y.d(parse.getScheme(), "https")) {
            return false;
        }
        String host = parse.getHost();
        if (!AbstractC3292y.d(host, "stripe.com")) {
            if (host != null) {
                z8 = n.r(host, ".stripe.com", false, 2, null);
            } else {
                z8 = false;
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }
}
