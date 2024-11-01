package O;

import N.C1341d;
import O.f;
import P.InterfaceC1379c;
import Q.AbstractC1383c;
import Q.AbstractC1396p;
import Q.C1384d;
import Q.InterfaceC1390j;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0132a f6904a;

    /* renamed from: b, reason: collision with root package name */
    private final g f6905b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6906c;

    /* renamed from: O.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0132a extends e {
        public f a(Context context, Looper looper, C1384d c1384d, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c1384d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C1384d c1384d, Object obj, InterfaceC1379c interfaceC1379c, P.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public static class c {
    }

    /* loaded from: classes3.dex */
    public interface d {

        /* renamed from: O.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0133a extends d {
            Account l();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e {
    }

    /* loaded from: classes3.dex */
    public interface f extends b {
        void b();

        Set c();

        void d(String str);

        void e(AbstractC1383c.e eVar);

        boolean f();

        String g();

        boolean h();

        boolean i();

        void j(AbstractC1383c.InterfaceC0162c interfaceC0162c);

        int k();

        C1341d[] l();

        void m(InterfaceC1390j interfaceC1390j, Set set);

        String n();

        boolean o();
    }

    /* loaded from: classes3.dex */
    public static final class g extends c {
    }

    public a(String str, AbstractC0132a abstractC0132a, g gVar) {
        AbstractC1396p.m(abstractC0132a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC1396p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f6906c = str;
        this.f6904a = abstractC0132a;
        this.f6905b = gVar;
    }

    public final AbstractC0132a a() {
        return this.f6904a;
    }

    public final c b() {
        return this.f6905b;
    }

    public final String c() {
        return this.f6906c;
    }
}
