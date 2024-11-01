package d5;

import J4.j;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c5.r;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import kotlin.jvm.internal.AbstractC3292y;
import m5.b;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC2762e extends ResultReceiver {
    public ResultReceiverC2762e(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle bundle) {
        r rVar;
        Long l8;
        Parcelable parcelable;
        Object parcelable2;
        String str = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("download", r.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = bundle.getParcelable("download");
            }
            rVar = (r) parcelable;
        } else {
            rVar = null;
        }
        if (UptodownApp.f29249C.Q()) {
            j.a aVar = j.f4395g;
            if (aVar.f() != null) {
                Activity f8 = aVar.f();
                if (i8 != 202) {
                    if (i8 == 209 && (f8 instanceof AbstractActivityC2691a)) {
                        AbstractActivityC2691a abstractActivityC2691a = (AbstractActivityC2691a) f8;
                        abstractActivityC2691a.runOnUiThread(new AbstractActivityC2691a.b());
                    }
                } else if (rVar != null && (f8 instanceof m5.b) && !(f8 instanceof TvAppDetailActivity)) {
                    m5.b bVar = (m5.b) f8;
                    bVar.runOnUiThread(new b.a(bVar, rVar));
                }
                if (f8 instanceof MainActivity) {
                    if (rVar != null) {
                        MainActivity mainActivity = (MainActivity) f8;
                        mainActivity.runOnUiThread(new MainActivity.RunnableC2687f(mainActivity, i8, rVar));
                        return;
                    }
                    return;
                }
                if (f8 instanceof MyDownloads) {
                    ((MyDownloads) f8).G4(i8, rVar);
                    return;
                }
                if (f8 instanceof Updates) {
                    Updates updates = (Updates) f8;
                    if (rVar != null) {
                        str = rVar.Y();
                    }
                    updates.s5(i8, str);
                    return;
                }
                if (f8 instanceof MyApps) {
                    MyApps myApps = (MyApps) f8;
                    if (rVar != null) {
                        str = rVar.Y();
                    }
                    myApps.runOnUiThread(new MyApps.a(i8, str));
                    return;
                }
                if (f8 instanceof AppDetailActivity) {
                    AppDetailActivity appDetailActivity = (AppDetailActivity) f8;
                    appDetailActivity.runOnUiThread(new AppDetailActivity.d(i8, rVar));
                    return;
                }
                if (f8 instanceof TvAppDetailActivity) {
                    TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) f8;
                    tvAppDetailActivity.runOnUiThread(new TvAppDetailActivity.c(i8, rVar));
                    return;
                }
                if (f8 instanceof TvOldVersionsActivity) {
                    TvOldVersionsActivity tvOldVersionsActivity = (TvOldVersionsActivity) f8;
                    tvOldVersionsActivity.runOnUiThread(new TvOldVersionsActivity.a(i8, rVar));
                    return;
                }
                if (f8 instanceof TvMyDownloadsActivity) {
                    TvMyDownloadsActivity tvMyDownloadsActivity = (TvMyDownloadsActivity) f8;
                    tvMyDownloadsActivity.runOnUiThread(new TvMyDownloadsActivity.a(i8, rVar));
                    return;
                }
                if (f8 instanceof WishlistActivity) {
                    WishlistActivity wishlistActivity = (WishlistActivity) f8;
                    if (rVar != null) {
                        str = rVar.Y();
                    }
                    wishlistActivity.a5(str);
                    return;
                }
                if (f8 instanceof OldVersionsActivity) {
                    if (rVar != null) {
                        l8 = Long.valueOf(rVar.e0());
                    } else {
                        l8 = null;
                    }
                    if (l8 != null) {
                        OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) f8;
                        oldVersionsActivity.runOnUiThread(new OldVersionsActivity.c(i8, rVar));
                    }
                    if (i8 == 202 && rVar != null) {
                        OldVersionsActivity oldVersionsActivity2 = (OldVersionsActivity) f8;
                        String Y8 = rVar.Y();
                        AbstractC3292y.f(Y8);
                        long e02 = rVar.e0();
                        String X8 = rVar.X();
                        AbstractC3292y.f(X8);
                        oldVersionsActivity2.runOnUiThread(new OldVersionsActivity.b(oldVersionsActivity2, Y8, e02, X8));
                    }
                    if (i8 == 208) {
                        OldVersionsActivity oldVersionsActivity3 = (OldVersionsActivity) f8;
                        oldVersionsActivity3.runOnUiThread(new OldVersionsActivity.c(i8, null));
                        return;
                    }
                    return;
                }
                if (f8 instanceof MoreInfo) {
                    MoreInfo moreInfo = (MoreInfo) f8;
                    moreInfo.runOnUiThread(new MoreInfo.a(rVar));
                } else if (f8 instanceof OrganizationActivity) {
                    ((OrganizationActivity) f8).A3(rVar);
                }
            }
        }
    }
}
