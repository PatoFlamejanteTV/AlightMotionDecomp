package Q;

import com.google.android.gms.tasks.Task;
import q0.C3626l;

/* renamed from: Q.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1395o {

    /* renamed from: a, reason: collision with root package name */
    private static final L f8295a = new I();

    /* renamed from: Q.o$a */
    /* loaded from: classes3.dex */
    public interface a {
        Object a(O.j jVar);
    }

    public static Task a(O.g gVar, a aVar) {
        L l8 = f8295a;
        C3626l c3626l = new C3626l();
        gVar.a(new J(gVar, c3626l, aVar, l8));
        return c3626l.a();
    }

    public static Task b(O.g gVar) {
        return a(gVar, new K());
    }
}
