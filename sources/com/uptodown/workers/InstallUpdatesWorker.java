package com.uptodown.workers;

import J4.j;
import R5.AbstractC1435t;
import S4.h;
import S4.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c5.C2041f;
import c5.C2057w;
import c5.Q;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.workers.InstallUpdatesWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class InstallUpdatesWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31231b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31232a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final boolean a(Context context) {
            boolean z8;
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            boolean X8 = aVar.X(context);
            boolean z9 = new C3784i().z(context);
            if (aVar.N(context) && !z9) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (j.f4395g.h() != null) {
                return false;
            }
            if ((!X8 && !z8) || UptodownApp.f29249C.W("InstallUpdatesWorker", context)) {
                return false;
            }
            return true;
        }

        public final void b(Context context) {
            AbstractC3292y.i(context, "context");
            if (a(context)) {
                AbstractC3292y.f(WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(InstallUpdatesWorker.class).addTag("InstallUpdatesWorker").build()));
            } else {
                C3800y.f37330a.y(context);
                UploadFileWorker.f31267c.a(context);
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallUpdatesWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31232a = context;
        this.f31232a = j.f4395g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Q update1, Q update2) {
        AbstractC3292y.i(update1, "update1");
        AbstractC3292y.i(update2, "update2");
        if (update1.i() == null) {
            return -1;
        }
        if (update2.i() == null) {
            return 1;
        }
        C2057w i8 = update1.i();
        AbstractC3292y.f(i8);
        int a9 = i8.a();
        C2057w i9 = update2.i();
        AbstractC3292y.f(i9);
        if (a9 < i9.a()) {
            return -1;
        }
        C2057w i10 = update1.i();
        AbstractC3292y.f(i10);
        int a10 = i10.a();
        C2057w i11 = update2.i();
        AbstractC3292y.f(i11);
        if (a10 > i11.a()) {
            return 1;
        }
        return 0;
    }

    private final boolean c(Context context, C2041f c2041f) {
        if (n.s(context.getPackageName(), c2041f.Q(), true)) {
            return true;
        }
        if (c2041f.i() == 0 && c2041f.i0(context)) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        int i8;
        int i9;
        boolean z8;
        C2041f S8;
        PackageInfo packageInfo;
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        boolean X8 = aVar.X(this.f31232a);
        if (aVar.N(this.f31232a) || X8) {
            C2057w.f15957e.a(this.f31232a);
            File g8 = new C3794s().g(this.f31232a);
            C3791p.a aVar2 = C3791p.f37286s;
            Context applicationContext = getApplicationContext();
            AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
            C3791p a9 = aVar2.a(applicationContext);
            a9.a();
            ArrayList t02 = a9.t0();
            ArrayList arrayList = new ArrayList();
            Iterator it = t02.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (true) {
                i8 = 3;
                i9 = 100;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                Q q8 = (Q) next;
                if (q8.h() == 0 && q8.l() != null && q8.u() == 100) {
                    String l8 = q8.l();
                    AbstractC3292y.f(l8);
                    File file = new File(g8, l8);
                    if (file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                        q8.Q(a9.f0(absolutePath));
                        if (q8.i() != null) {
                            C2057w i10 = q8.i();
                            AbstractC3292y.f(i10);
                            if (i10.a() < 3) {
                            }
                        }
                        arrayList.add(q8);
                    }
                }
            }
            AbstractC1435t.B(arrayList, new Comparator() { // from class: v5.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b9;
                    b9 = InstallUpdatesWorker.b((Q) obj, (Q) obj2);
                    return b9;
                }
            });
            boolean z9 = new C3784i().z(this.f31232a);
            Iterator it2 = arrayList.iterator();
            AbstractC3292y.h(it2, "iterator(...)");
            while (true) {
                z8 = false;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                AbstractC3292y.h(next2, "next(...)");
                Q q9 = (Q) next2;
                if (q9.h() == 0 && q9.l() != null && q9.u() == i9 && (S8 = a9.S(q9.s())) != null && c(this.f31232a, S8)) {
                    String l9 = q9.l();
                    AbstractC3292y.f(l9);
                    File file2 = new File(g8, l9);
                    if (file2.exists()) {
                        if (q9.i() != null) {
                            C2057w i11 = q9.i();
                            AbstractC3292y.f(i11);
                            if (i11.a() >= i8) {
                                continue;
                            }
                        }
                        if (q9.i() == null) {
                            q9.Q(new C2057w());
                            C2057w i12 = q9.i();
                            AbstractC3292y.f(i12);
                            i12.e(1);
                            C2057w i13 = q9.i();
                            AbstractC3292y.f(i13);
                            i13.h(String.valueOf(System.currentTimeMillis()));
                            C2057w i14 = q9.i();
                            AbstractC3292y.f(i14);
                            i14.f(file2.getAbsolutePath());
                            C2057w i15 = q9.i();
                            AbstractC3292y.f(i15);
                            a9.G0(i15);
                        } else {
                            C2057w i16 = q9.i();
                            AbstractC3292y.f(i16);
                            i16.e(i16.a() + 1);
                            C2057w i17 = q9.i();
                            AbstractC3292y.f(i17);
                            i17.h(String.valueOf(System.currentTimeMillis()));
                            C2057w i18 = q9.i();
                            AbstractC3292y.f(i18);
                            a9.r1(i18);
                        }
                        if (X8) {
                            String l10 = q9.l();
                            AbstractC3292y.f(l10);
                            if (n.q(l10, ".apk", true)) {
                                UptodownApp.a.Z(UptodownApp.f29249C, file2, this.f31232a, null, 4, null);
                                break;
                            }
                        } else if (z9) {
                            continue;
                        } else {
                            try {
                                PackageManager packageManager = this.f31232a.getPackageManager();
                                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                                packageInfo = r.d(packageManager, q9.s(), 128);
                            } catch (PackageManager.NameNotFoundException unused) {
                                packageInfo = null;
                            }
                            if (packageInfo != null) {
                                h hVar = new h(this.f31232a, null);
                                if (hVar.y(packageInfo.applicationInfo.targetSdkVersion)) {
                                    if (AbstractC3292y.d(this.f31232a.getPackageName(), new C3784i().i(this.f31232a, q9.s()))) {
                                        h.u(hVar, file2, false, 2, null);
                                        break;
                                    }
                                    i8 = 3;
                                    i9 = 100;
                                }
                            }
                            i8 = 3;
                        }
                    } else {
                        continue;
                    }
                }
            }
            z8 = true;
            a9.i();
            if (!z8) {
                C3800y.f37330a.y(this.f31232a);
                UploadFileWorker.f31267c.a(this.f31232a);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }
}
