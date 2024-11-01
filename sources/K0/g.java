package K0;

import android.os.Build;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import l6.n;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4552e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f4553f;

    /* renamed from: a, reason: collision with root package name */
    public final e f4554a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4555b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4556c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4557d;

    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K0.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0079a extends C3289v implements Function0 {
            C0079a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).k());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4558a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must be called on a background thread, was called on " + g.f4552e.j() + '.';
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public /* synthetic */ class c extends C3289v implements Function0 {
            c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).l());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class d extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f4559a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + g.f4552e.j() + '.';
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public /* synthetic */ class e extends C3289v implements Function0 {
            e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).m());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class f extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final f f4560a = new f();

            f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + g.f4552e.j() + '.';
            }
        }

        private a() {
        }

        private final void h(Function0 function0, Function0 function02) {
            if (!((Boolean) function0.invoke()).booleanValue()) {
                G0.g.f().b((String) function02.invoke());
                i();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            String threadName = j();
            AbstractC3292y.h(threadName, "threadName");
            return n.G(threadName, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String threadName = j();
            AbstractC3292y.h(threadName, "threadName");
            return n.G(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            boolean isCurrentThread;
            if (Build.VERSION.SDK_INT >= 23) {
                isCurrentThread = Looper.getMainLooper().isCurrentThread();
                if (isCurrentThread) {
                    return false;
                }
            } else if (AbstractC3292y.d(Looper.getMainLooper(), Looper.myLooper())) {
                return false;
            }
            return true;
        }

        public final void e() {
            h(new C0079a(this), b.f4558a);
        }

        public final void f() {
            h(new c(this), d.f4559a);
        }

        public final void g() {
            h(new e(this), f.f4560a);
        }

        public final boolean i() {
            return g.f4553f;
        }

        public final void n(boolean z8) {
            g.f4553f = z8;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public g(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC3292y.i(backgroundExecutorService, "backgroundExecutorService");
        AbstractC3292y.i(blockingExecutorService, "blockingExecutorService");
        this.f4554a = new e(backgroundExecutorService);
        this.f4555b = new e(backgroundExecutorService);
        this.f4556c = new e(backgroundExecutorService);
        this.f4557d = new e(blockingExecutorService);
    }

    public static final void c() {
        f4552e.e();
    }

    public static final void d() {
        f4552e.f();
    }

    public static final void e() {
        f4552e.g();
    }

    public static final void f(boolean z8) {
        f4552e.n(z8);
    }
}
