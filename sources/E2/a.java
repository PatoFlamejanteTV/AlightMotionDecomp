package E2;

import Q5.s;
import Q5.t;
import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1549a = new a();

    private a() {
    }

    public final /* synthetic */ PackageInfo a(Context context) {
        Object b9;
        AbstractC3292y.i(context, "<this>");
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (s.g(b9)) {
            b9 = null;
        }
        return (PackageInfo) b9;
    }
}
