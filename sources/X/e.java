package X;

import android.content.Context;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f10914b = new e();

    /* renamed from: a, reason: collision with root package name */
    private d f10915a = null;

    public static d a(Context context) {
        return f10914b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f10915a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f10915a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10915a;
    }
}
