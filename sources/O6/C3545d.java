package o6;

import Q5.I;
import U5.g;
import android.os.Handler;
import android.os.Looper;
import i6.m;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.B0;
import n6.C3445b0;
import n6.InterfaceC3449d0;
import n6.InterfaceC3470o;
import n6.M0;
import n6.W;

/* renamed from: o6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3545d extends AbstractC3546e implements W {
    private volatile C3545d _immediate;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36053a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36054b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36055c;

    /* renamed from: d, reason: collision with root package name */
    private final C3545d f36056d;

    /* renamed from: o6.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3470o f36057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3545d f36058b;

        public a(InterfaceC3470o interfaceC3470o, C3545d c3545d) {
            this.f36057a = interfaceC3470o;
            this.f36058b = c3545d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f36057a.e(this.f36058b, I.f8786a);
        }
    }

    /* renamed from: o6.d$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f36060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f36060b = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8786a;
        }

        public final void invoke(Throwable th) {
            C3545d.this.f36053a.removeCallbacks(this.f36060b);
        }
    }

    private C3545d(Handler handler, String str, boolean z8) {
        super(null);
        this.f36053a = handler;
        this.f36054b = str;
        this.f36055c = z8;
        this._immediate = z8 ? this : null;
        C3545d c3545d = this._immediate;
        if (c3545d == null) {
            c3545d = new C3545d(handler, str, true);
            this._immediate = c3545d;
        }
        this.f36056d = c3545d;
    }

    private final void J(g gVar, Runnable runnable) {
        B0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C3445b0.b().dispatch(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(C3545d c3545d, Runnable runnable) {
        c3545d.f36053a.removeCallbacks(runnable);
    }

    @Override // o6.AbstractC3546e
    /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C3545d G() {
        return this.f36056d;
    }

    @Override // n6.I
    public void dispatch(g gVar, Runnable runnable) {
        if (!this.f36053a.post(runnable)) {
            J(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3545d) && ((C3545d) obj).f36053a == this.f36053a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f36053a);
    }

    @Override // n6.W
    public void i(long j8, InterfaceC3470o interfaceC3470o) {
        a aVar = new a(interfaceC3470o, this);
        if (this.f36053a.postDelayed(aVar, m.h(j8, 4611686018427387903L))) {
            interfaceC3470o.f(new b(aVar));
        } else {
            J(interfaceC3470o.getContext(), aVar);
        }
    }

    @Override // n6.I
    public boolean isDispatchNeeded(g gVar) {
        if (this.f36055c && AbstractC3292y.d(Looper.myLooper(), this.f36053a.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // n6.W
    public InterfaceC3449d0 t(long j8, final Runnable runnable, g gVar) {
        if (this.f36053a.postDelayed(runnable, m.h(j8, 4611686018427387903L))) {
            return new InterfaceC3449d0() { // from class: o6.c
                @Override // n6.InterfaceC3449d0
                public final void dispose() {
                    C3545d.L(C3545d.this, runnable);
                }
            };
        }
        J(gVar, runnable);
        return M0.f35666a;
    }

    @Override // n6.I
    public String toString() {
        String F8 = F();
        if (F8 == null) {
            String str = this.f36054b;
            if (str == null) {
                str = this.f36053a.toString();
            }
            if (this.f36055c) {
                return str + ".immediate";
            }
            return str;
        }
        return F8;
    }

    public /* synthetic */ C3545d(Handler handler, String str, int i8, AbstractC3284p abstractC3284p) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public C3545d(Handler handler, String str) {
        this(handler, str, false);
    }
}
