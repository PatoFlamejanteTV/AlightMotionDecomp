package O;

import O.a;
import P.C1377a;
import P.C1378b;
import P.q;
import P.y;
import Q.AbstractC1383c;
import Q.AbstractC1396p;
import Q.C1384d;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2084b;
import com.google.android.gms.common.api.internal.AbstractC2086d;
import com.google.android.gms.common.api.internal.C2085c;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import q0.C3626l;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6909b;

    /* renamed from: c, reason: collision with root package name */
    private final O.a f6910c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f6911d;

    /* renamed from: e, reason: collision with root package name */
    private final C1378b f6912e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f6913f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6914g;

    /* renamed from: h, reason: collision with root package name */
    private final f f6915h;

    /* renamed from: i, reason: collision with root package name */
    private final P.k f6916i;

    /* renamed from: j, reason: collision with root package name */
    protected final C2085c f6917j;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f6918c = new C0134a().a();

        /* renamed from: a, reason: collision with root package name */
        public final P.k f6919a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f6920b;

        /* renamed from: O.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0134a {

            /* renamed from: a, reason: collision with root package name */
            private P.k f6921a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f6922b;

            public a a() {
                if (this.f6921a == null) {
                    this.f6921a = new C1377a();
                }
                if (this.f6922b == null) {
                    this.f6922b = Looper.getMainLooper();
                }
                return new a(this.f6921a, this.f6922b);
            }

            public C0134a b(P.k kVar) {
                AbstractC1396p.m(kVar, "StatusExceptionMapper must not be null.");
                this.f6921a = kVar;
                return this;
            }
        }

        private a(P.k kVar, Account account, Looper looper) {
            this.f6919a = kVar;
            this.f6920b = looper;
        }
    }

    private e(Context context, Activity activity, O.a aVar, a.d dVar, a aVar2) {
        String h8;
        AbstractC1396p.m(context, "Null context is not permitted.");
        AbstractC1396p.m(aVar, "Api must not be null.");
        AbstractC1396p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC1396p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f6908a = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            h8 = context.getAttributionTag();
        } else {
            h8 = h(context);
        }
        this.f6909b = h8;
        this.f6910c = aVar;
        this.f6911d = dVar;
        this.f6913f = aVar2.f6920b;
        C1378b a9 = C1378b.a(aVar, dVar, h8);
        this.f6912e = a9;
        this.f6915h = new q(this);
        C2085c u8 = C2085c.u(context2);
        this.f6917j = u8;
        this.f6914g = u8.l();
        this.f6916i = aVar2.f6919a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.h.u(activity, u8, a9);
        }
        u8.F(this);
    }

    private final AbstractC2084b q(int i8, AbstractC2084b abstractC2084b) {
        abstractC2084b.i();
        this.f6917j.A(this, i8, abstractC2084b);
        return abstractC2084b;
    }

    private final Task r(int i8, AbstractC2086d abstractC2086d) {
        C3626l c3626l = new C3626l();
        this.f6917j.B(this, i8, abstractC2086d, c3626l, this.f6916i);
        return c3626l.a();
    }

    public f b() {
        return this.f6915h;
    }

    protected C1384d.a c() {
        Account account;
        C1384d.a aVar = new C1384d.a();
        a.d dVar = this.f6911d;
        if (dVar instanceof a.d.InterfaceC0133a) {
            account = ((a.d.InterfaceC0133a) dVar).l();
        } else {
            account = null;
        }
        aVar.d(account);
        aVar.c(Collections.emptySet());
        aVar.e(this.f6908a.getClass().getName());
        aVar.b(this.f6908a.getPackageName());
        return aVar;
    }

    public Task d(AbstractC2086d abstractC2086d) {
        return r(2, abstractC2086d);
    }

    public Task e(AbstractC2086d abstractC2086d) {
        return r(0, abstractC2086d);
    }

    public AbstractC2084b f(AbstractC2084b abstractC2084b) {
        q(1, abstractC2084b);
        return abstractC2084b;
    }

    public Task g(AbstractC2086d abstractC2086d) {
        return r(1, abstractC2086d);
    }

    protected String h(Context context) {
        return null;
    }

    public final C1378b i() {
        return this.f6912e;
    }

    public a.d j() {
        return this.f6911d;
    }

    public Context k() {
        return this.f6908a;
    }

    protected String l() {
        return this.f6909b;
    }

    public Looper m() {
        return this.f6913f;
    }

    public final int n() {
        return this.f6914g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f o(Looper looper, n nVar) {
        C1384d a9 = c().a();
        a.f a10 = ((a.AbstractC0132a) AbstractC1396p.l(this.f6910c.a())).a(this.f6908a, looper, a9, this.f6911d, nVar, nVar);
        String l8 = l();
        if (l8 != null && (a10 instanceof AbstractC1383c)) {
            ((AbstractC1383c) a10).P(l8);
        }
        if (l8 != null && (a10 instanceof P.g)) {
            android.support.v4.media.a.a(a10);
            throw null;
        }
        return a10;
    }

    public final y p(Context context, Handler handler) {
        return new y(context, handler, c().a());
    }

    public e(Context context, O.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
