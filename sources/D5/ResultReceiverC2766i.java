package d5;

import J4.j;
import Q5.I;
import Q5.t;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import c6.InterfaceC2072n;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import kotlin.coroutines.jvm.internal.l;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import q5.AbstractC3773F;

/* renamed from: d5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC2766i extends ResultReceiver {

    /* renamed from: d5.i$a */
    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f31518b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, U5.d dVar) {
            super(2, dVar);
            this.f31518b = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f31518b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f31517a == 0) {
                t.b(obj);
                ((MyApps) this.f31518b).U4(false);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public ResultReceiverC2766i(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        if (i8 == 602) {
            AbstractC3773F.f37267a.b();
            return;
        }
        if (UptodownApp.f29249C.Q()) {
            j.a aVar = j.f4395g;
            if (aVar.f() != null) {
                Activity f8 = aVar.f();
                if (f8 instanceof Updates) {
                    if (i8 != 600) {
                        if (i8 == 601) {
                            ((Updates) f8).q5();
                            return;
                        }
                        return;
                    }
                    ((Updates) f8).r5();
                    return;
                }
                if (f8 instanceof MyApps) {
                    if (i8 == 601) {
                        AbstractC3462k.d(N.a(C3445b0.c()), null, null, new a(f8, null), 3, null);
                        return;
                    }
                    return;
                }
                if (f8 instanceof SecurityActivity) {
                    if (i8 == 601) {
                        ((SecurityActivity) f8).a5();
                        return;
                    }
                    return;
                }
                if (f8 instanceof TvMyAppsActivity) {
                    if (i8 == 601) {
                        TvMyAppsActivity tvMyAppsActivity = (TvMyAppsActivity) f8;
                        tvMyAppsActivity.runOnUiThread(new TvMyAppsActivity.a());
                        return;
                    }
                    return;
                }
                if (f8 instanceof MainActivity) {
                    if (i8 != 601) {
                        if (i8 != 603) {
                            if (i8 == 604) {
                                MainActivity mainActivity = (MainActivity) f8;
                                mainActivity.runOnUiThread(new MainActivity.RunnableC2682a());
                                return;
                            }
                            return;
                        }
                        ((MainActivity) f8).c7();
                        return;
                    }
                    ((MainActivity) f8).k8();
                    return;
                }
                if (f8 instanceof AppDetailActivity) {
                    if (i8 == 603) {
                        ((AppDetailActivity) f8).r3();
                        return;
                    }
                    return;
                }
                if (f8 instanceof WishlistActivity) {
                    if (i8 == 601) {
                        ((WishlistActivity) f8).a5(null);
                    }
                } else {
                    if (f8 instanceof RollbackActivity) {
                        if (i8 == 601) {
                            RollbackActivity rollbackActivity = (RollbackActivity) f8;
                            rollbackActivity.runOnUiThread(new RollbackActivity.a());
                            return;
                        }
                        return;
                    }
                    if ((f8 instanceof TvAppDetailActivity) && i8 == 603) {
                        TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) f8;
                        tvAppDetailActivity.runOnUiThread(new TvAppDetailActivity.a());
                    }
                }
            }
        }
    }
}
