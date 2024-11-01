package d5;

import J4.j;
import Q5.I;
import Q5.t;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c5.Q;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
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
import q5.C3791p;
import q5.C3794s;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2759b extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31474b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static String f31475c;

    /* renamed from: d, reason: collision with root package name */
    private static long f31476d;

    /* renamed from: a, reason: collision with root package name */
    private Context f31477a;

    /* renamed from: d5.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0726b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31478a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31480c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31481d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d5.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31482a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver.PendingResult f31483b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
                super(2, dVar);
                this.f31483b = pendingResult;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31483b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31482a == 0) {
                    t.b(obj);
                    this.f31483b.finish();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0726b(String str, BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
            super(2, dVar);
            this.f31480c = str;
            this.f31481d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0726b(this.f31480c, this.f31481d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f31478a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3 && i8 != 4) {
                    if (i8 == 5) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3791p.a aVar = C3791p.f37286s;
                Context context = C2759b.this.f31477a;
                AbstractC3292y.f(context);
                C3791p a9 = aVar.a(context);
                a9.a();
                Q s02 = a9.s0(this.f31480c);
                if (s02 != null) {
                    str = s02.l();
                } else {
                    str = null;
                }
                if (str != null) {
                    C3794s c3794s = new C3794s();
                    Context context2 = C2759b.this.f31477a;
                    AbstractC3292y.f(context2);
                    File g8 = c3794s.g(context2);
                    String l8 = s02.l();
                    AbstractC3292y.f(l8);
                    new File(g8, l8).delete();
                }
                a9.M(this.f31480c);
                a9.t(this.f31480c);
                a9.i();
                Thread.sleep(200L);
                if (UptodownApp.f29249C.Q()) {
                    j.a aVar2 = j.f4395g;
                    if (aVar2.f() != null) {
                        Activity f8 = aVar2.f();
                        if (f8 instanceof OldVersionsActivity) {
                            if (((OldVersionsActivity) f8).n2()) {
                                ((OldVersionsActivity) f8).w3(this.f31480c);
                            }
                        } else if (f8 instanceof AppDetailActivity) {
                            if (((AppDetailActivity) f8).n2()) {
                                String str2 = this.f31480c;
                                this.f31478a = 1;
                                if (((AppDetailActivity) f8).x3(str2, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (f8 instanceof MyApps) {
                            if (((MyApps) f8).n2()) {
                                String str3 = this.f31480c;
                                this.f31478a = 2;
                                if (((MyApps) f8).L4("app_uninstalled", str3, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (f8 instanceof Updates) {
                            if (((Updates) f8).n2()) {
                                String str4 = this.f31480c;
                                this.f31478a = 3;
                                if (((Updates) f8).U4("app_uninstalled", str4, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (f8 instanceof FreeUpSpaceActivity) {
                            if (((FreeUpSpaceActivity) f8).n2()) {
                                String str5 = this.f31480c;
                                this.f31478a = 4;
                                if (((FreeUpSpaceActivity) f8).j3("app_uninstalled", str5, this) == e8) {
                                    return e8;
                                }
                            }
                        } else if ((f8 instanceof SecurityActivity) && ((SecurityActivity) f8).n2()) {
                            ((SecurityActivity) f8).Y4();
                        }
                    }
                }
            }
            j.f4395g.K(null);
            J0 c8 = C3445b0.c();
            a aVar3 = new a(this.f31481d, null);
            this.f31478a = 5;
            if (AbstractC3458i.g(c8, aVar3, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0726b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* renamed from: d5.b$c */
    /* loaded from: classes5.dex */
    static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31484a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31486c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f31487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
            super(2, dVar);
            this.f31486c = str;
            this.f31487d = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f31486c, this.f31487d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31484a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C2759b c2759b = C2759b.this;
                String str = this.f31486c;
                BroadcastReceiver.PendingResult pendingResult = this.f31487d;
                AbstractC3292y.f(pendingResult);
                this.f31484a = 1;
                if (c2759b.c(str, pendingResult, this) == e8) {
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
    public final Object c(String str, BroadcastReceiver.PendingResult pendingResult, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new C0726b(str, pendingResult, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Uri data;
        String schemeSpecificPart;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(intent, "intent");
        this.f31477a = j.f4395g.a(context);
        try {
            String action = intent.getAction();
            if (action != null) {
                boolean z8 = true;
                if (n.s(action, "android.intent.action.PACKAGE_REMOVED", true) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
                    String str = action + schemeSpecificPart;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (n.s(str, f31475c, true) && currentTimeMillis - f31476d <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                        z8 = false;
                    }
                    f31476d = currentTimeMillis;
                    f31475c = str;
                    if (z8) {
                        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new c(schemeSpecificPart, goAsync(), null), 3, null);
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
