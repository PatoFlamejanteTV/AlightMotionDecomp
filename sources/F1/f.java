package F1;

import android.content.Context;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static f f2117b = new f();

    /* renamed from: a, reason: collision with root package name */
    private Context f2118a;

    private f() {
    }

    public static f c() {
        return f2117b;
    }

    public Context a() {
        return this.f2118a;
    }

    public void b(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f2118a = context2;
    }
}
