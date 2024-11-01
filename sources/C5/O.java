package c5;

import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final String f15663a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15665c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15666d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15667e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15668f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15669g;

    /* renamed from: h, reason: collision with root package name */
    private int f15670h;

    public O(Context context) {
        AbstractC3292y.i(context, "context");
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        this.f15663a = aVar.p(context);
        this.f15664b = C3800y.f37330a.a(context);
        this.f15665c = aVar.y(context);
        this.f15666d = aVar.b0(context);
        this.f15667e = aVar.m(context);
        this.f15668f = aVar.Q(context);
        this.f15669g = aVar.X(context);
        this.f15670h = 633;
    }

    public final boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && l6.n.s(str, str2, true)) {
            return true;
        }
        return false;
    }

    public final boolean b(O o8) {
        if (o8 != null && a(o8.f15663a, this.f15663a) && o8.f15664b == this.f15664b && o8.f15666d == this.f15666d && l6.n.s(o8.f15665c, this.f15665c, true) && AbstractC3292y.d(o8.f15667e, this.f15667e) && o8.f15668f == this.f15668f && o8.f15669g == this.f15669g) {
            return true;
        }
        return false;
    }

    public final String c() {
        return this.f15665c;
    }

    public final String d() {
        return this.f15663a;
    }

    public final int e() {
        return this.f15670h;
    }

    public final boolean f() {
        return this.f15668f;
    }

    public final String g() {
        return this.f15667e;
    }

    public final boolean h() {
        return this.f15669g;
    }

    public final boolean i() {
        return this.f15664b;
    }

    public final boolean j() {
        return this.f15666d;
    }

    public final void k(Context context, C2052q device) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(device, "device");
        new X4.p(context, device, this);
    }
}
