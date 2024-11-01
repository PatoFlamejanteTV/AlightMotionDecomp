package d5;

import J4.j;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.Updates;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: d5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ResultReceiverC2765h extends ResultReceiver {
    public ResultReceiverC2765h(Handler handler) {
        super(handler);
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i8, Bundle resultData) {
        AbstractC3292y.i(resultData, "resultData");
        String string = resultData.getString("packageName");
        if (UptodownApp.f29249C.Q()) {
            j.a aVar = j.f4395g;
            if (aVar.f() != null) {
                Activity f8 = aVar.f();
                if (f8 instanceof Updates) {
                    if (string != null) {
                        ((Updates) f8).t5(i8, string);
                        return;
                    }
                    return;
                }
                if (f8 instanceof MyApps) {
                    if (string != null) {
                        ((MyApps) f8).b5(i8, string);
                        return;
                    }
                    return;
                }
                if (f8 instanceof AppDetailActivity) {
                    if (string != null) {
                        AppDetailActivity appDetailActivity = (AppDetailActivity) f8;
                        appDetailActivity.runOnUiThread(new AppDetailActivity.c(appDetailActivity, string, i8));
                        return;
                    }
                    return;
                }
                if (f8 instanceof MyDownloads) {
                    MyDownloads myDownloads = (MyDownloads) f8;
                    myDownloads.runOnUiThread(new MyDownloads.a(i8));
                    return;
                }
                if (f8 instanceof OldVersionsActivity) {
                    OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) f8;
                    oldVersionsActivity.runOnUiThread(new OldVersionsActivity.d(string, i8));
                    return;
                }
                if (f8 instanceof InstallerActivity) {
                    if (i8 == 351) {
                        ((InstallerActivity) f8).c2();
                        return;
                    } else {
                        ((InstallerActivity) f8).finish();
                        return;
                    }
                }
                if (f8 instanceof TvAppDetailActivity) {
                    if (string != null) {
                        TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) f8;
                        tvAppDetailActivity.runOnUiThread(new TvAppDetailActivity.b(tvAppDetailActivity, string, i8));
                        return;
                    }
                    return;
                }
                if ((f8 instanceof MainActivity) && string != null) {
                    MainActivity mainActivity = (MainActivity) f8;
                    mainActivity.runOnUiThread(new MainActivity.RunnableC2685d(mainActivity, i8, string));
                }
            }
        }
    }
}
