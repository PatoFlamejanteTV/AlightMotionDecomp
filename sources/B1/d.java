package B1;

import F1.f;
import F1.h;
import I1.g;
import android.content.Context;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f375a;

    private void c(Context context) {
        g.d(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        c(context);
        if (!d()) {
            b(true);
            h.d().b(context);
            F1.b.k().b(context);
            I1.a.b(context);
            I1.c.d(context);
            I1.e.c(context);
            f.c().b(context);
            F1.a.a().b(context);
        }
    }

    void b(boolean z8) {
        this.f375a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f375a;
    }
}
