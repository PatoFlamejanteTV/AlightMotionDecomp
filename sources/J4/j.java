package J4;

import K4.a1;
import K4.r;
import Q4.h;
import Q5.I;
import Q5.t;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.provider.Settings;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.documentfile.provider.DocumentFile;
import androidx.multidex.MultiDexApplication;
import androidx.work.PeriodicWorkRequest;
import c6.InterfaceC2072n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public abstract class j extends MultiDexApplication {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4395g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static Activity f4396h;

    /* renamed from: i, reason: collision with root package name */
    private static P4.d f4397i;

    /* renamed from: j, reason: collision with root package name */
    private static int f4398j;

    /* renamed from: k, reason: collision with root package name */
    public static Context f4399k;

    /* renamed from: l, reason: collision with root package name */
    private static int f4400l;

    /* renamed from: m, reason: collision with root package name */
    public static String f4401m;

    /* renamed from: n, reason: collision with root package name */
    private static ResultReceiver f4402n;

    /* renamed from: o, reason: collision with root package name */
    private static String f4403o;

    /* renamed from: p, reason: collision with root package name */
    private static P4.a f4404p;

    /* renamed from: q, reason: collision with root package name */
    private static Typeface f4405q;

    /* renamed from: r, reason: collision with root package name */
    private static Typeface f4406r;

    /* renamed from: s, reason: collision with root package name */
    private static Q4.h f4407s;

    /* renamed from: t, reason: collision with root package name */
    private static Q4.c f4408t;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f4409u;

    /* renamed from: v, reason: collision with root package name */
    private static String f4410v;

    /* renamed from: w, reason: collision with root package name */
    private static String f4411w;

    /* renamed from: x, reason: collision with root package name */
    private static String f4412x;

    /* renamed from: y, reason: collision with root package name */
    private static String f4413y;

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f4414a = new R4.a(null);

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f4415b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private AtomicBoolean f4416c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f4417d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private Q4.i f4418e = M();

    /* renamed from: f, reason: collision with root package name */
    private NsdManager.RegistrationListener f4419f = new c();

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void A(String str) {
            j.f4411w = str;
        }

        public final void B(P4.d dVar) {
            j.f4397i = dVar;
        }

        public final void C(int i8) {
            j.f4398j = i8;
        }

        public final void D(Q4.h hVar) {
            j.f4407s = hVar;
        }

        public final void E(String str) {
            AbstractC3292y.i(str, "<set-?>");
            j.f4401m = str;
        }

        public final void F(int i8) {
            j.f4400l = i8;
        }

        public final void G(Q4.c cVar) {
            j.f4408t = cVar;
        }

        public final void H(boolean z8) {
            j.f4409u = z8;
        }

        public final void I(String str) {
            j.f4413y = str;
        }

        public final void J(String str) {
            j.f4412x = str;
        }

        public final void K(String str) {
            j.f4403o = str;
        }

        public final void L(ResultReceiver resultReceiver) {
            j.f4402n = resultReceiver;
        }

        public final Context a(Context context) {
            AbstractC3292y.i(context, "context");
            String e8 = new L4.a(context).e();
            if (e8 != null) {
                return S4.c.f9429a.a(context, new Locale(e8));
            }
            return context;
        }

        public final void b() {
            c(null);
        }

        public final void c(String str) {
            File[] listFiles = new S4.f().g(g()).listFiles();
            if (listFiles != null) {
                for (File child : listFiles) {
                    if (!n.s(child.getAbsolutePath(), str, true) && child.lastModified() < System.currentTimeMillis() - 3600000) {
                        S4.g gVar = new S4.g();
                        AbstractC3292y.h(child, "child");
                        gVar.a(child);
                    }
                }
            }
        }

        public final void d(Context context, EditText editText) {
            IBinder iBinder;
            AbstractC3292y.i(context, "<this>");
            Object systemService = context.getSystemService("input_method");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (editText != null) {
                iBinder = editText.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }

        public final void e() {
            j.f4404p = null;
        }

        public final Activity f() {
            return j.f4396h;
        }

        public final Context g() {
            Context context = j.f4399k;
            if (context != null) {
                return context;
            }
            AbstractC3292y.y("appContext");
            return null;
        }

        public final P4.a h() {
            if (j.f4404p == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            P4.a aVar = j.f4404p;
            AbstractC3292y.f(aVar);
            if (currentTimeMillis - aVar.d() > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                j.f4404p = null;
            }
            return j.f4404p;
        }

        public final String i() {
            return j.f4410v;
        }

        public final String j() {
            return j.f4411w;
        }

        public final P4.d k() {
            return j.f4397i;
        }

        public final int l() {
            return j.f4398j;
        }

        public final Q4.h m() {
            return j.f4407s;
        }

        public final String n() {
            String str = j.f4401m;
            if (str != null) {
                return str;
            }
            AbstractC3292y.y("myNsdServiceName");
            return null;
        }

        public final int o() {
            return j.f4400l;
        }

        public final Q4.c p() {
            return j.f4408t;
        }

        public final boolean q() {
            return j.f4409u;
        }

        public final String r() {
            return j.f4413y;
        }

        public final String s() {
            return j.f4412x;
        }

        public final ResultReceiver t() {
            return j.f4402n;
        }

        public final Typeface u() {
            return j.f4405q;
        }

        public final Typeface v() {
            return j.f4406r;
        }

        public final void w(String packageName, long j8, String name, long j9) {
            AbstractC3292y.i(packageName, "packageName");
            AbstractC3292y.i(name, "name");
            j.f4404p = new P4.a();
            P4.a aVar = j.f4404p;
            if (aVar != null) {
                aVar.f(packageName, j8, name, j9);
            }
        }

        public final void x(Activity activity) {
            j.f4396h = activity;
        }

        public final void y(Context context) {
            AbstractC3292y.i(context, "<set-?>");
            j.f4399k = context;
        }

        public final void z(String str) {
            j.f4410v = str;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements NsdManager.RegistrationListener {
        c() {
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.O("onRegistrationFailed");
            j.this.R();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f4395g;
            String serviceName = nsdServiceInfo.getServiceName();
            AbstractC3292y.h(serviceName, "nsdServiceInfo.serviceName");
            aVar.E(serviceName);
            j.this.f4417d.set(true);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
            j.this.U();
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i8) {
            AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f4422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f4423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f4424c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f4425a;

            a(U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f4425a == 0) {
                    t.b(obj);
                    a aVar = j.f4395g;
                    if (aVar.f() != null && (aVar.f() instanceof a1)) {
                        Activity f8 = aVar.f();
                        AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                        ((a1) f8).p1(true);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f4426a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f4427b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j f4428c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(T t8, j jVar, U5.d dVar) {
                super(2, dVar);
                this.f4427b = t8;
                this.f4428c = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f4427b, this.f4428c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f4426a == 0) {
                    t.b(obj);
                    Object obj2 = this.f4427b.f34573a;
                    if (obj2 != null) {
                        this.f4428c.T((File) obj2);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DocumentFile documentFile, j jVar, U5.d dVar) {
            super(2, dVar);
            this.f4423b = documentFile;
            this.f4424c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f4423b, this.f4424c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InputStream inputStream;
            Object e8 = V5.b.e();
            int i8 = this.f4422a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                J0 c8 = C3445b0.c();
                a aVar = new a(null);
                this.f4422a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            a aVar2 = j.f4395g;
            ContentResolver contentResolver = aVar2.g().getContentResolver();
            if (contentResolver != null) {
                inputStream = contentResolver.openInputStream(this.f4423b.getUri());
            } else {
                inputStream = null;
            }
            T t8 = new T();
            if (inputStream != null) {
                byte[] bArr = new byte[8192];
                Q q8 = new Q();
                File g8 = new S4.f().g(aVar2.g());
                if (this.f4423b.getName() != null) {
                    String name = this.f4423b.getName();
                    AbstractC3292y.f(name);
                    t8.f34573a = new File(g8, name);
                    FileOutputStream fileOutputStream = new FileOutputStream((File) t8.f34573a);
                    while (true) {
                        int read = inputStream.read(bArr, 0, 8192);
                        q8.f34571a = read;
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                }
                inputStream.close();
            }
            J0 c9 = C3445b0.c();
            b bVar = new b(t8, this.f4424c, null);
            this.f4422a = 2;
            if (AbstractC3458i.g(c9, bVar, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f4429a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f4431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DocumentFile documentFile, U5.d dVar) {
            super(2, dVar);
            this.f4431c = documentFile;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f4431c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f4429a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                j jVar = j.this;
                DocumentFile documentFile = this.f4431c;
                this.f4429a = 1;
                if (jVar.P(documentFile, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements Application.ActivityLifecycleCallbacks {
        f() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC3292y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f4395g;
                aVar.F(aVar.o() + 1);
                if (aVar.o() == 1) {
                    j.this.N(activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            if (activity instanceof a1) {
                a aVar = j.f4395g;
                if (aVar.o() > 0) {
                    aVar.F(aVar.o() - 1);
                }
                if (aVar.o() == 0) {
                    j.this.Q();
                    aVar.D(null);
                    aVar.G(null);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            j.f4395g.x(null);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            j.f4395g.x(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC3292y.i(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC3292y.i(activity, "activity");
        }
    }

    private final Q4.i M() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P(DocumentFile documentFile, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(documentFile, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void W() {
        AssetManager assetManager;
        try {
            assetManager = getAssets();
        } catch (Exception e8) {
            e8.printStackTrace();
            assetManager = null;
        }
        if (assetManager != null) {
            f4405q = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Medium.ttf");
            f4406r = Typeface.createFromAsset(assetManager, "fonts/Geomanist-Regular.ttf");
        } else {
            Typeface typeface = Typeface.DEFAULT;
            f4405q = typeface;
            f4406r = typeface;
        }
    }

    private final void X() {
        registerActivityLifecycleCallbacks(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        NsdManager f8;
        try {
            Q4.h hVar = f4407s;
            if (hVar != null && (f8 = hVar.f()) != null) {
                f8.unregisterService(this.f4419f);
            }
        } catch (Exception unused) {
        }
    }

    public void H(Uri uri, O4.f listener, r coreBaseActivity) {
        AbstractC3292y.i(uri, "uri");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(coreBaseActivity, "coreBaseActivity");
        listener.a();
    }

    public abstract void I(File file, O4.f fVar, r rVar);

    public final void J() {
        if (!this.f4417d.get() && this.f4415b.compareAndSet(true, false)) {
            N(f4395g.g());
        }
    }

    public final AtomicBoolean K() {
        return this.f4416c;
    }

    public final ResultReceiver L() {
        return this.f4414a;
    }

    public final void N(Context context) {
        AbstractC3292y.i(context, "context");
        String deviceId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        a aVar = f4395g;
        h.a aVar2 = Q4.h.f8759h;
        AbstractC3292y.h(deviceId, "deviceId");
        aVar.E(aVar2.b(deviceId));
        if (f4407s == null) {
            f4407s = new Q4.h(context, this.f4418e);
        }
        f4408t = new Q4.c(this.f4418e, context);
    }

    public abstract void O(String str);

    public final void Q() {
        Y();
        Q4.c cVar = f4408t;
        if (cVar != null) {
            cVar.r();
        }
        Q4.h hVar = f4407s;
        if (hVar != null) {
            hVar.k();
        }
    }

    public final void R() {
        if (this.f4415b.compareAndSet(false, true)) {
            Q();
        }
    }

    public final void S(DocumentFile docfile) {
        AbstractC3292y.i(docfile, "docfile");
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new e(docfile, null), 3, null);
    }

    public final void T(File file) {
        AbstractC3292y.i(file, "file");
        P4.c cVar = new P4.c();
        cVar.a(file);
        Q4.c cVar2 = f4408t;
        AbstractC3292y.f(cVar2);
        cVar2.q(cVar);
    }

    public final void U() {
        if (this.f4415b.get()) {
            this.f4417d.set(false);
        }
        if (!this.f4416c.get() && this.f4415b.compareAndSet(true, false)) {
            N(f4395g.g());
        }
    }

    public final void V(ResultReceiver resultReceiver) {
        AbstractC3292y.i(resultReceiver, "<set-?>");
        this.f4414a = resultReceiver;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        X();
        a aVar = f4395g;
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "applicationContext");
        aVar.y(aVar.a(applicationContext));
        W();
    }

    /* loaded from: classes5.dex */
    public static final class b implements Q4.i {
        b() {
        }

        @Override // Q4.i
        public void a() {
            Q4.c p8 = j.f4395g.p();
            if (p8 != null) {
                p8.c();
            }
        }

        @Override // Q4.i
        public void b() {
            j.this.O("onReadResponseFailed");
            j.this.R();
        }

        @Override // Q4.i
        public void c() {
            j.this.O("onConnectionToServerFailed");
            j.this.R();
        }

        @Override // Q4.i
        public void d(String remoteSocketAddress) {
            Q4.c p8;
            Q4.d i8;
            AbstractC3292y.i(remoteSocketAddress, "remoteSocketAddress");
            a aVar = j.f4395g;
            Q4.c p9 = aVar.p();
            AbstractC3292y.f(p9);
            if (p9.k()) {
                if (aVar.f() != null && (aVar.f() instanceof a1)) {
                    Activity f8 = aVar.f();
                    AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    ((a1) f8).W0();
                    return;
                }
                return;
            }
            if (aVar.m() != null && (p8 = aVar.p()) != null && (i8 = p8.i()) != null) {
                i8.l();
            }
        }

        @Override // Q4.i
        public void e() {
            j.this.O("onDiscoveryServicesFailed");
        }

        @Override // Q4.i
        public void f(int i8) {
            j.this.Y();
            a aVar = j.f4395g;
            Q4.h m8 = aVar.m();
            if (m8 != null) {
                m8.j(i8, j.this.f4419f);
            }
            Q4.h m9 = aVar.m();
            if (m9 != null) {
                m9.d();
            }
        }

        @Override // Q4.i
        public void g() {
            j.this.K().set(false);
            j.this.J();
        }

        @Override // Q4.i
        public void h(P4.c fti) {
            AbstractC3292y.i(fti, "fti");
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).K0(fti);
            }
        }

        @Override // Q4.i
        public void j() {
            j.this.O("onRegistrationFailed");
            j.this.R();
        }

        @Override // Q4.i
        public void k() {
            j.this.O("onReadResponseClosed");
            j.this.R();
        }

        @Override // Q4.i
        public void l(P4.c fti) {
            Q4.c p8;
            Q4.a h8;
            AbstractC3292y.i(fti, "fti");
            if (fti.d() != null && (p8 = j.f4395g.p()) != null && (h8 = p8.h()) != null) {
                File d8 = fti.d();
                AbstractC3292y.f(d8);
                h8.f(d8);
            }
        }

        @Override // Q4.i
        public void m() {
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).S0();
            } else {
                aVar.H(true);
            }
            Q4.c p8 = aVar.p();
            AbstractC3292y.f(p8);
            p8.i().l();
        }

        @Override // Q4.i
        public void n(P4.c fti) {
            AbstractC3292y.i(fti, "fti");
            Q4.c p8 = j.f4395g.p();
            AbstractC3292y.f(p8);
            p8.i().m(fti);
        }

        @Override // Q4.i
        public void o(String msg) {
            AbstractC3292y.i(msg, "msg");
            j.this.O("onReceivingFileError: " + msg);
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).X0(msg);
            } else {
                aVar.I(msg);
            }
            j.this.R();
        }

        @Override // Q4.i
        public void p(int i8) {
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).t1(i8);
            }
        }

        @Override // Q4.i
        public void q(int i8) {
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).t1(i8);
            }
        }

        @Override // Q4.i
        public void r(String msg) {
            AbstractC3292y.i(msg, "msg");
            j.this.O(msg);
            j.this.R();
        }

        @Override // Q4.i
        public void t(String serviceName) {
            NsdServiceInfo nsdServiceInfo;
            AbstractC3292y.i(serviceName, "serviceName");
            a aVar = j.f4395g;
            Q4.c p8 = aVar.p();
            AbstractC3292y.f(p8);
            if (!p8.k()) {
                Q4.h m8 = aVar.m();
                AbstractC3292y.f(m8);
                Iterator it = m8.g().iterator();
                while (true) {
                    if (it.hasNext()) {
                        nsdServiceInfo = (NsdServiceInfo) it.next();
                        if (n.s(serviceName, nsdServiceInfo.getServiceName(), true)) {
                            break;
                        }
                    } else {
                        nsdServiceInfo = null;
                        break;
                    }
                }
                if (nsdServiceInfo != null) {
                    Q4.h m9 = j.f4395g.m();
                    AbstractC3292y.f(m9);
                    m9.l(nsdServiceInfo);
                    return;
                }
                j.this.R();
                a aVar2 = j.f4395g;
                if (aVar2.f() != null && (aVar2.f() instanceof a1)) {
                    Activity f8 = aVar2.f();
                    AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                    String string = aVar2.g().getString(h.f4331I, Q4.h.f8759h.c(serviceName));
                    AbstractC3292y.h(string, "appContext.getString(\n  …                        )");
                    ((a1) f8).X0(string);
                }
            }
        }

        @Override // Q4.i
        public void u() {
            j.this.K().set(true);
        }

        @Override // Q4.i
        public void v(File file) {
            AbstractC3292y.i(file, "file");
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).r1();
            }
        }

        @Override // Q4.i
        public void w() {
            Q4.c p8 = j.f4395g.p();
            AbstractC3292y.f(p8);
            p8.i().l();
        }

        @Override // Q4.i
        public void x(String msg) {
            AbstractC3292y.i(msg, "msg");
            j.this.O("onSendFileFailed: " + msg);
            j.this.R();
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).c1(msg);
                return;
            }
            aVar.J(msg);
        }

        @Override // Q4.i
        public void y(String filename, String result) {
            Q4.a h8;
            AbstractC3292y.i(filename, "filename");
            AbstractC3292y.i(result, "result");
            a aVar = j.f4395g;
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).Q0(filename, result);
            } else {
                aVar.z(filename);
                aVar.A(result);
            }
            Q4.c p8 = aVar.p();
            if (p8 != null && (h8 = p8.h()) != null) {
                h8.e();
            }
        }

        @Override // Q4.i
        public void z(NsdServiceInfo nsdServiceInfo) {
            AbstractC3292y.i(nsdServiceInfo, "nsdServiceInfo");
            a aVar = j.f4395g;
            Q4.c p8 = aVar.p();
            if (p8 != null) {
                p8.p();
            }
            if (aVar.f() != null && (aVar.f() instanceof a1)) {
                Activity f8 = aVar.f();
                AbstractC3292y.g(f8, "null cannot be cast to non-null type com.uptodown.core.activities.NsdActivity");
                ((a1) f8).a1(nsdServiceInfo);
            }
        }

        @Override // Q4.i
        public void i() {
        }

        @Override // Q4.i
        public void s() {
        }
    }
}
