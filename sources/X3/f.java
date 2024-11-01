package X3;

import Q5.r;
import Q5.x;
import R5.Q;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.os.LocaleListCompat;
import e4.InterfaceC2820d;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2820d f11023a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f11024b;

    public f(Context context, InterfaceC2820d hardwareIdSupplier) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(hardwareIdSupplier, "hardwareIdSupplier");
        this.f11023a = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC3292y.h(displayMetrics, "getDisplayMetrics(...)");
        this.f11024b = displayMetrics;
    }

    @Override // X3.e
    public Map a() {
        Map h8;
        String a9 = ((j) this.f11023a.get()).a();
        r a10 = x.a(g.f11105b.toString(), "Android");
        r a11 = x.a(g.f11108c.toString(), Build.MODEL);
        r a12 = x.a(g.f11111d.toString(), Build.VERSION.CODENAME);
        r a13 = x.a(g.f11114e.toString(), Build.VERSION.RELEASE);
        r a14 = x.a(g.f11117f.toString(), LocaleListCompat.create(Locale.getDefault()).toLanguageTags());
        r a15 = x.a(g.f11120g.toString(), TimeZone.getDefault().getDisplayName());
        String gVar = g.f11126i.toString();
        Y y8 = Y.f34578a;
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f11024b.heightPixels), Integer.valueOf(this.f11024b.widthPixels)}, 2));
        AbstractC3292y.h(format, "format(locale, format, *args)");
        Map k8 = Q.k(a10, a11, a12, a13, a14, a15, x.a(gVar, format));
        if (a9.length() > 0) {
            h8 = Q.e(x.a(g.f11123h.toString(), a9));
        } else {
            h8 = Q.h();
        }
        return Q.q(k8, h8);
    }
}
