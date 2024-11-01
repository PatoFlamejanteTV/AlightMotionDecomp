package com.uptodown.workers;

import J4.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c5.C2041f;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import q5.C3770C;
import q5.C3784i;
import q5.C3797v;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class GenerateQueueWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31216f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31217a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31218b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31219c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31220d;

    /* renamed from: e, reason: collision with root package name */
    private String f31221e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateQueueWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31217a = context;
        this.f31218b = params.getInputData().getBoolean("downloadAnyway", false);
        this.f31219c = params.getInputData().getBoolean("downloadUptodown", false);
        this.f31220d = params.getInputData().getInt("downloadAutostartedInBackground", 0);
        this.f31221e = params.getInputData().getString("packagename");
        this.f31217a = j.f4395g.a(this.f31217a);
    }

    private final void b(ArrayList arrayList) {
        if (!UptodownApp.f29249C.O(this.f31217a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", this.f31220d).putBoolean("downloadAnyway", this.f31218b).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(this.f31217a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            if (arrayList.size() > 1) {
                WorkManager.getInstance(this.f31217a).enqueue(new OneTimeWorkRequest.Builder(DownloadUpdatesWorker.class).addTag("DownloadUpdatesWorker").setInputData(build).build());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.String r18, boolean r19, android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.GenerateQueueWorker.c(java.lang.String, boolean, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(C2041f app1, C2041f app2) {
        AbstractC3292y.i(app1, "app1");
        AbstractC3292y.i(app2, "app2");
        if (app1.z() == null) {
            return 1;
        }
        if (app2.z() == null) {
            return -1;
        }
        String z8 = app1.z();
        AbstractC3292y.f(z8);
        String z9 = app2.z();
        AbstractC3292y.f(z9);
        return n.m(z8, z9, true);
    }

    private final boolean e(C2041f c2041f, String str) {
        String str2;
        if (AbstractC3292y.d(str, "1")) {
            if (c2041f.Q() != null) {
                C3784i c3784i = new C3784i();
                Context context = this.f31217a;
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                str2 = c3784i.i(context, Q8);
            } else {
                str2 = null;
            }
            if (str2 != null && n.s(str2, this.f31217a.getPackageName(), true)) {
                return true;
            }
            return false;
        }
        return AbstractC3292y.d(str, "2");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.O(this.f31217a)) {
            c(this.f31221e, this.f31219c, this.f31217a);
            ArrayList<? extends Parcelable> G8 = aVar.G();
            if (G8 != null && G8.size() > 0) {
                if (SettingsPreferences.f30529b.b0(this.f31217a)) {
                    if (!C3797v.f37313a.f() && !this.f31218b) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("apps_parcelable", G8);
                        C3770C.f37260a.f().send(105, bundle);
                        C3800y.f37330a.y(this.f31217a);
                    } else {
                        b(G8);
                    }
                } else {
                    b(G8);
                }
            } else {
                InstallUpdatesWorker.f31231b.b(this.f31217a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }
}
