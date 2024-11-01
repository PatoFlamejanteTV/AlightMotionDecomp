package d5;

import J4.j;
import Q5.I;
import Q5.t;
import S4.r;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import c5.C2031A;
import c5.C2047l;
import c6.InterfaceC2072n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.Updates;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import q5.C3794s;
import q5.C3795t;
import q5.C3796u;
import q5.C3800y;

/* renamed from: d5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC2764g extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Context f31515a;

    /* renamed from: d5.g$a */
    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31516a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31516a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (UptodownApp.f29249C.Q()) {
                    j.a aVar = j.f4395g;
                    if (aVar.f() != null) {
                        Activity f8 = aVar.f();
                        if (f8 instanceof Updates) {
                            Updates updates = (Updates) f8;
                            if (updates.n2()) {
                                updates.j5(false);
                            }
                        } else if (f8 instanceof MyApps) {
                            MyApps myApps = (MyApps) f8;
                            if (myApps.n2()) {
                                myApps.U4(false);
                            }
                        } else if (f8 instanceof MainActivity) {
                            MainActivity mainActivity = (MainActivity) f8;
                            if (mainActivity.n2()) {
                                this.f31516a = 1;
                                if (mainActivity.b8(this) == e8) {
                                    return e8;
                                }
                            }
                        } else if (f8 instanceof AppDetailActivity) {
                            AppDetailActivity appDetailActivity = (AppDetailActivity) f8;
                            if (appDetailActivity.n2()) {
                                this.f31516a = 2;
                                if (appDetailActivity.y3(this) == e8) {
                                    return e8;
                                }
                            }
                        }
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public ResultReceiverC2764g(Handler handler) {
        super(handler);
    }

    private final void a(Context context, String str, Bundle bundle) {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.p() != null) {
            C2047l p8 = aVar.p();
            AbstractC3292y.f(p8);
            String i8 = new C3794s().i(p8.c());
            if (i8 != null && n.s(i8, str, true)) {
                bundle.putString("source", "deeplink");
                aVar.r0(null);
                return;
            }
            return;
        }
        C2031A b9 = C2031A.f15554f.b(context);
        if (b9 != null && n.s(b9.d(), str, true)) {
            bundle.putString("source", "notification_fcm");
        }
    }

    private final String b(int i8) {
        switch (i8) {
            case 1:
                return "STATUS_FAILURE";
            case 2:
                return "STATUS_FAILURE_BLOCKED";
            case 3:
                return "STATUS_FAILURE_ABORTED";
            case 4:
                return "STATUS_FAILURE_INVALID";
            case 5:
                return "STATUS_FAILURE_CONFLICT";
            case 6:
                return "STATUS_FAILURE_STORAGE";
            case 7:
                return "STATUS_FAILURE_INCOMPATIBLE";
            default:
                return String.valueOf(i8);
        }
    }

    public final void f(Context context) {
        this.f31515a = context;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        long j8;
        String str;
        int i9;
        String str2 = null;
        if (i8 != 222) {
            if (i8 != 223) {
                if (i8 == 227) {
                    Context context = this.f31515a;
                    if (context != null) {
                        C3800y c3800y = C3800y.f37330a;
                        AbstractC3292y.f(context);
                        c3800y.e(context);
                    }
                    if (bundle != null) {
                        i9 = bundle.getInt("piStatus");
                        str = bundle.getString("packagename");
                        j8 = bundle.getLong("size");
                    } else {
                        j8 = -1;
                        str = null;
                        i9 = 0;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, b(i9));
                    bundle2.putString("type", "failed");
                    if (str != null) {
                        bundle2.putString("packagename", str);
                        Context context2 = this.f31515a;
                        if (context2 != null) {
                            try {
                                AbstractC3292y.f(context2);
                                PackageManager packageManager = context2.getPackageManager();
                                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                                r.a(packageManager, str, 0);
                                bundle2.putInt("update", 1);
                            } catch (Exception unused) {
                                bundle2.putInt("update", 0);
                            }
                            Context context3 = this.f31515a;
                            AbstractC3292y.f(context3);
                            a(context3, str, bundle2);
                        }
                    }
                    if (j8 > 0) {
                        bundle2.putString("size", C3796u.f37312a.d(j8));
                    }
                    new C3795t(this.f31515a).e("install", bundle2);
                    Context context4 = this.f31515a;
                    if (context4 != null) {
                        UptodownApp.a aVar = UptodownApp.f29249C;
                        AbstractC3292y.f(context4);
                        UptodownApp.a.M0(aVar, context4, false, 2, null);
                    }
                    AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
                    return;
                }
                return;
            }
            C3800y c3800y2 = C3800y.f37330a;
            Context context5 = this.f31515a;
            AbstractC3292y.f(context5);
            c3800y2.e(context5);
            return;
        }
        if (bundle != null) {
            str2 = bundle.getString("appNameAndVersion");
        }
        if (str2 == null) {
            str2 = "";
        }
        C3800y c3800y3 = C3800y.f37330a;
        Context context6 = this.f31515a;
        AbstractC3292y.f(context6);
        c3800y3.l(context6, str2);
    }
}
