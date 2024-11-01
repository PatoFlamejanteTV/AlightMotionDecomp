package C1;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class b {
    public static b b(c cVar, d dVar) {
        I1.g.a();
        I1.g.d(cVar, "AdSessionConfiguration is null");
        I1.g.d(dVar, "AdSessionContext is null");
        return new n(cVar, dVar);
    }

    public abstract void a(View view, h hVar, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public abstract void f(View view);

    public abstract void g();
}
