package d5;

import J4.j;
import Q5.I;
import Q5.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c5.C2031A;
import c5.C2037b;
import c5.C2041f;
import c5.C2047l;
import c5.Q;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3462k;
import n6.C3445b0;
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

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2760c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31488a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static String f31489b;

    /* renamed from: c, reason: collision with root package name */
    private static long f31490c;

    /* renamed from: d5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d5.c$b */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31491a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31492b;

        /* renamed from: d, reason: collision with root package name */
        int f31494d;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31492b = obj;
            this.f31494d |= Integer.MIN_VALUE;
            return C2760c.this.c(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0727c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31495a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f31496b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31497c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2760c f31498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0727c(Context context, String str, C2760c c2760c, U5.d dVar) {
            super(2, dVar);
            this.f31496b = context;
            this.f31497c = str;
            this.f31498d = c2760c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0727c(this.f31496b, this.f31497c, this.f31498d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            long j8;
            boolean z8;
            String str2;
            Object e8 = V5.b.e();
            int i8 = this.f31495a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(this.f31496b);
                a9.a();
                Q s02 = a9.s0(this.f31497c);
                if (s02 != null) {
                    str = s02.l();
                } else {
                    str = null;
                }
                if (str != null) {
                    j8 = new C3776a().d(this.f31496b, s02.l());
                    if (SettingsPreferences.f30529b.Q(this.f31496b)) {
                        new C3776a().a(this.f31496b, s02.l());
                        new C3776a().b(this.f31496b, s02.l());
                    }
                    a9.M(this.f31497c);
                    String l8 = s02.l();
                    AbstractC3292y.f(l8);
                    a9.B(l8);
                } else {
                    j8 = 0;
                }
                long j9 = j8;
                a9.i();
                String i9 = new C3784i().i(this.f31496b, this.f31497c);
                boolean s8 = n.s(this.f31496b.getPackageName(), i9, true);
                if (!s8 && i9 == null) {
                    P4.a h8 = j.f4395g.h();
                    if (h8 != null) {
                        str2 = h8.b();
                    } else {
                        str2 = null;
                    }
                    z8 = n.s(str2, this.f31497c, true);
                } else {
                    z8 = s8;
                }
                this.f31498d.e(z8, new C3784i().B(this.f31496b, this.f31497c), this.f31497c, this.f31496b, j9);
                UptodownApp.a aVar = UptodownApp.f29249C;
                String str3 = this.f31497c;
                this.f31495a = 1;
                if (aVar.N0(str3, true, this) == e8) {
                    return e8;
                }
            }
            UptodownApp.a.M0(UptodownApp.f29249C, this.f31496b, false, 2, null);
            C3800y.f37330a.e(this.f31496b);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0727c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d5.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
            super(2, dVar);
            this.f31500b = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f31500b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f31499a == 0) {
                t.b(obj);
                this.f31500b.finish();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: d5.c$e */
    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31501a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31503c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31504d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f31505e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, BroadcastReceiver.PendingResult pendingResult, Context context, U5.d dVar) {
            super(2, dVar);
            this.f31503c = str;
            this.f31504d = pendingResult;
            this.f31505e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f31503c, this.f31504d, this.f31505e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31501a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C2760c c2760c = C2760c.this;
                String str = this.f31503c;
                BroadcastReceiver.PendingResult pendingResult = this.f31504d;
                AbstractC3292y.f(pendingResult);
                Context context = this.f31505e;
                this.f31501a = 1;
                if (c2760c.c(str, pendingResult, context, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, android.content.BroadcastReceiver.PendingResult r8, android.content.Context r9, U5.d r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof d5.C2760c.b
            if (r0 == 0) goto L13
            r0 = r10
            d5.c$b r0 = (d5.C2760c.b) r0
            int r1 = r0.f31494d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31494d = r1
            goto L18
        L13:
            d5.c$b r0 = new d5.c$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f31492b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f31494d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r10)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f31491a
            r8 = r7
            android.content.BroadcastReceiver$PendingResult r8 = (android.content.BroadcastReceiver.PendingResult) r8
            Q5.t.b(r10)
            goto L55
        L3e:
            Q5.t.b(r10)
            n6.I r10 = n6.C3445b0.b()
            d5.c$c r2 = new d5.c$c
            r2.<init>(r9, r7, r6, r5)
            r0.f31491a = r8
            r0.f31494d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r10, r2, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            d5.c$d r9 = new d5.c$d
            r9.<init>(r8, r5)
            r0.f31491a = r5
            r0.f31494d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r9, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.C2760c.c(java.lang.String, android.content.BroadcastReceiver$PendingResult, android.content.Context, U5.d):java.lang.Object");
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
    public final void e(boolean z8, C2041f c2041f, String str, Context context, long j8) {
        if (z8) {
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str);
            d(context, str, bundle);
            bundle.putString("type", "success");
            bundle.putInt("update", 1);
            if (j8 > 0) {
                bundle.putString("size", C3796u.f37312a.d(j8));
            }
            new C3795t(context).e("install", bundle);
            f(context, c2041f);
        }
    }

    private final void f(Context context, C2041f c2041f) {
        if (!UptodownApp.f29249C.Q() && c2041f != null) {
            C2037b c2037b = new C2037b();
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            c2037b.k(c2041f, a9);
            a9.i();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(intent, "intent");
        Context a9 = j.f4395g.a(context);
        String action = intent.getAction();
        if (action != null) {
            boolean z8 = true;
            if (n.s(action, "android.intent.action.PACKAGE_REPLACED", true) && (data = intent.getData()) != null) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (schemeSpecificPart != null && booleanExtra) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (n.s(str, f31489b, true) && currentTimeMillis - f31490c <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f31490c = currentTimeMillis;
                    f31489b = str;
                    if (z8) {
                        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new e(schemeSpecificPart, goAsync(), a9, null), 3, null);
                    }
                }
            }
        }
    }
}
