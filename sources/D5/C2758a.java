package d5;

import J4.j;
import Q5.I;
import Q5.t;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c5.C2031A;
import c5.C2041f;
import c5.C2045j;
import c5.C2047l;
import c5.C2058x;
import c5.r;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;
import q5.C3776a;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3796u;
import q5.C3800y;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2758a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final C0724a f31459a = new C0724a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f31460b;

    /* renamed from: c, reason: collision with root package name */
    private static long f31461c;

    /* renamed from: d5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0724a {
        private C0724a() {
        }

        public /* synthetic */ C0724a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d5.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f31463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31464c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2758a f31465d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31466e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d5.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0725a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f31468b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0725a(BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
                super(2, dVar);
                this.f31468b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0725a(this.f31468b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31467a == 0) {
                    t.b(obj);
                    this.f31468b.finish();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0725a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, C2758a c2758a, BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
            super(2, dVar);
            this.f31463b = context;
            this.f31464c = str;
            this.f31465d = c2758a;
            this.f31466e = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f31463b, this.f31464c, this.f31465d, this.f31466e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f31462a;
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
                String i9 = new C3784i().i(this.f31463b, this.f31464c);
                boolean s8 = n.s(this.f31463b.getPackageName(), i9, true);
                if (!s8 && i9 == null) {
                    P4.a h8 = j.f4395g.h();
                    if (h8 != null) {
                        str = h8.b();
                    } else {
                        str = null;
                    }
                    s8 = n.s(str, this.f31464c, true);
                }
                this.f31465d.e(s8, new C3784i().B(this.f31463b, this.f31464c), this.f31464c, this.f31463b);
                UptodownApp.a aVar = UptodownApp.f29249C;
                String str2 = this.f31464c;
                this.f31462a = 1;
                if (aVar.N0(str2, false, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.M0(UptodownApp.f29249C, this.f31463b, false, 2, null);
            J0 c8 = C3445b0.c();
            C0725a c0725a = new C0725a(this.f31466e, null);
            this.f31462a = 2;
            if (AbstractC3458i.g(c8, c0725a, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: d5.a$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31469a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31472d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f31473e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, U5.d dVar) {
            super(2, dVar);
            this.f31471c = str;
            this.f31472d = pendingResult;
            this.f31473e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f31471c, this.f31472d, this.f31473e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31469a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C2758a c2758a = C2758a.this;
                String str = this.f31471c;
                BroadcastReceiver.PendingResult pendingResult = this.f31472d;
                AbstractC3292y.f(pendingResult);
                Context context = this.f31473e;
                this.f31469a = 1;
                if (c2758a.c(str, pendingResult, context, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(context, str, this, pendingResult, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void d(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.p() != null) {
            C2047l p8 = aVar.p();
            AbstractC3292y.f(p8);
            String i8 = new C3794s().i(p8.c());
            if (i8 != null && n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                new C3788m().j(context, str, i8);
                return;
            }
            return;
        }
        C2031A b9 = C2031A.f15554f.b(context);
        if (b9 != null && n.s(b9.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z8, C2041f c2041f, String str, Context context) {
        Long l8;
        long j8;
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            g(context, c2041f);
            if (c2041f != null) {
                l8 = Long.valueOf(c2041f.f0());
            } else {
                l8 = null;
            }
            if (l8 != null) {
                C3791p a9 = C3791p.f37286s.a(context);
                a9.a();
                r b02 = a9.b0(str, c2041f.f0());
                if (b02 != null) {
                    j8 = new C3776a().d(context, b02.X());
                    if (SettingsPreferences.f30529b.Q(context)) {
                        new C3776a().a(context, b02.X());
                        a9.z(b02);
                    }
                    f(context, str, b02, bundle);
                } else {
                    j8 = 0;
                }
                a9.i();
            } else {
                j8 = 0;
            }
            bundle.putString("type", "success");
            bundle.putInt("update", 0);
            if (j8 > 0) {
                bundle.putString("size", C3796u.f37312a.d(j8));
            }
            new C3795t(context).e("install", bundle);
            C3800y.f37330a.k(context, str);
        }
    }

    private final void f(Context context, String str, r rVar, Bundle bundle) {
        C2045j d8 = C2045j.f15879n.d(context);
        if (d8 != null && n.s(d8.r(), str, true) && d8.m() == rVar.y()) {
            d8.i(context);
            bundle.putString("source", d8.s());
            return;
        }
        C2058x d9 = C2058x.f15962n.d(context);
        if (d9 != null && n.s(d9.r(), str, true) && d9.m() == rVar.y()) {
            d9.i(context);
            bundle.putString("source", d9.s());
        }
    }

    private final void g(Context context, C2041f c2041f) {
        SettingsPreferences.a aVar;
        String d8;
        if (c2041f != null && (d8 = (aVar = SettingsPreferences.f30529b).d(context)) != null) {
            File file = new File(new C3794s().f(context), d8);
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            r Y8 = a9.Y(name);
            a9.i();
            if (Y8 != null) {
                c2041f.t0(1);
                c2041f.J0(C2041f.c.f15791b);
                a9.a();
                a9.h1(c2041f);
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                a9.M(Q8);
                a9.i();
                new C3794s().c(context);
                aVar.u0(context, null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(intent, "intent");
        j.a aVar = j.f4395g;
        Context a9 = aVar.a(context);
        String action = intent.getAction();
        if (action != null) {
            boolean z8 = true;
            if (n.s(action, "android.intent.action.PACKAGE_ADDED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && !booleanExtra && UptodownApp.f29249C.Q() && aVar.f() != null) {
                    Activity f8 = aVar.f();
                    if (f8 instanceof MainActivity) {
                        MainActivity mainActivity = (MainActivity) f8;
                        mainActivity.runOnUiThread(new MainActivity.RunnableC2688g(mainActivity, getResultCode(), schemeSpecificPart));
                        return;
                    }
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (n.s(str, f31460b, true) && currentTimeMillis - f31461c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f31461c = currentTimeMillis;
                    f31460b = str;
                    if (z8) {
                        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new c(schemeSpecificPart, goAsync(), a9, null), 3, null);
                    }
                }
            }
        }
    }
}
