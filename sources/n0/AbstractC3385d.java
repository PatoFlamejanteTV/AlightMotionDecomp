package n0;

import O.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3385d {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f35063a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.g f35064b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0132a f35065c;

    /* renamed from: d, reason: collision with root package name */
    static final a.AbstractC0132a f35066d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f35067e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f35068f;

    /* renamed from: g, reason: collision with root package name */
    public static final O.a f35069g;

    /* renamed from: h, reason: collision with root package name */
    public static final O.a f35070h;

    static {
        a.g gVar = new a.g();
        f35063a = gVar;
        a.g gVar2 = new a.g();
        f35064b = gVar2;
        C3383b c3383b = new C3383b();
        f35065c = c3383b;
        C3384c c3384c = new C3384c();
        f35066d = c3384c;
        f35067e = new Scope("profile");
        f35068f = new Scope(NotificationCompat.CATEGORY_EMAIL);
        f35069g = new O.a("SignIn.API", c3383b, gVar);
        f35070h = new O.a("SignIn.INTERNAL_API", c3384c, gVar2);
    }
}
