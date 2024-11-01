package m1;

import android.util.Base64;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f34956a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final String f34957b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f34958c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f34959d;

    static {
        String encodeToString = Base64.encodeToString(l6.n.p(v.f34955a.e()), 10);
        f34957b = encodeToString;
        f34958c = "firebase_session_" + encodeToString + "_data";
        f34959d = "firebase_session_" + encodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f34958c;
    }

    public final String b() {
        return f34959d;
    }
}
