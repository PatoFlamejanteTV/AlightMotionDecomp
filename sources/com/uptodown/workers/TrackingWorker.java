package com.uptodown.workers;

import J4.j;
import Q5.I;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c5.C2032B;
import c5.C2037b;
import c5.C2041f;
import c5.K;
import c5.Q;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.C3445b0;
import n6.N;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3771D;
import q5.C3788m;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class TrackingWorker extends Worker {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31261f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31262a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31263b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31264c;

    /* renamed from: d, reason: collision with root package name */
    private String f31265d;

    /* renamed from: e, reason: collision with root package name */
    private final C3795t f31266e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31262a = context;
        this.f31263b = params.getInputData().getBoolean("isCompressed", true);
        this.f31266e = new C3795t(this.f31262a);
        this.f31262a = j.f4395g.a(this.f31262a);
        for (String str : getTags()) {
            if (str.equals("TrackingWorkerPeriodic") || str.equals("TrackingWorkerSingle")) {
                this.f31265d = str;
            }
        }
    }

    private final void a(Q q8, C2041f c2041f, Context context) {
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        if (c2041f.Q() != null && n.s(c2041f.Q(), q8.s(), true)) {
            Q s02 = a9.s0(q8.s());
            if (s02 != null) {
                if (!AbstractC3292y.d(s02.b(), q8.b())) {
                    a9.p1(q8);
                    new C2037b().l(c2041f, q8, a9);
                }
            } else {
                a9.I0(q8);
                new C2037b().l(c2041f, q8, a9);
            }
        }
        a9.i();
    }

    private final void b(K k8) {
        if (k8.e() == 401) {
            this.f31264c = true;
        } else if (k8.e() == 0) {
            this.f31264c = true;
        }
    }

    private final void c() {
        if (!UptodownApp.f29249C.W("GenerateQueueWorker", this.f31262a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).putBoolean("downloadAnyway", true).putBoolean("downloadUptodown", true).putString("packagename", this.f31262a.getPackageName()).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(this.f31262a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final void d() {
        if (!UptodownApp.f29249C.W("GenerateQueueWorker", this.f31262a)) {
            Data build = new Data.Builder().putInt("downloadAutostartedInBackground", 1).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(this.f31262a).enqueue(new OneTimeWorkRequest.Builder(GenerateQueueWorker.class).addTag("GenerateQueueWorker").setInputData(build).build());
        }
    }

    private final String e(String str) {
        if (n.s(str, "TrackingWorkerPeriodic", true)) {
            return "periodic";
        }
        return "oneTime";
    }

    private final void f(JSONArray jSONArray) {
        String str;
        String str2;
        C3791p a9 = C3791p.f37286s.a(this.f31262a);
        a9.a();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        boolean z8 = false;
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i8);
            if (!jSONObject.isNull("packagename")) {
                String string = jSONObject.getString("packagename");
                AbstractC3292y.f(string);
                Q q8 = new Q(string);
                if (!jSONObject.isNull("versionName")) {
                    q8.a0(jSONObject.getString("versionName"));
                }
                if (!jSONObject.isNull("versionCode")) {
                    q8.Z(jSONObject.getLong("versionCode"));
                }
                if (!jSONObject.isNull("size")) {
                    q8.Y(jSONObject.getLong("size"));
                }
                if (!jSONObject.isNull("fileID")) {
                    q8.y(jSONObject.getString("fileID"));
                }
                C2041f S8 = a9.S(q8.s());
                if (S8 != null) {
                    S8.J0(C2041f.c.f15790a);
                    if (n.s(this.f31262a.getPackageName(), q8.s(), true)) {
                        z8 = true;
                    }
                    a(q8, S8, this.f31262a);
                }
                arrayList.add(q8);
            }
        }
        Iterator it = a9.t0().iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            Q q9 = (Q) next;
            Iterator it2 = arrayList.iterator();
            AbstractC3292y.h(it2, "iterator(...)");
            while (true) {
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    AbstractC3292y.h(next2, "next(...)");
                    if (n.s(q9.s(), ((Q) next2).s(), true)) {
                        break;
                    }
                } else {
                    a9.M(q9.s());
                    break;
                }
            }
        }
        a9.i();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (aVar.i0(this.f31262a)) {
            if (z8) {
                c();
            }
            I i9 = I.f8786a;
            return;
        }
        if (!aVar.X(this.f31262a) && n.s(aVar.m(this.f31262a), MBridgeConstans.ENDCARD_URL_TYPE_PL, true)) {
            C3800y.f37330a.y(this.f31262a);
            UploadFileWorker.f31267c.a(this.f31262a);
        } else {
            d();
        }
        if (z8) {
            a9.a();
            String packageName = this.f31262a.getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            Q s02 = a9.s0(packageName);
            a9.i();
            if (s02 != null) {
                str = s02.l();
            } else {
                str = null;
            }
            if (str != null && s02.u() == 100) {
                C2032B a10 = C2032B.f15560g.a(this.f31262a);
                if (a10 != null) {
                    str2 = a10.e();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    File g8 = new C3794s().g(this.f31262a);
                    String l8 = s02.l();
                    AbstractC3292y.f(l8);
                    File file = new File(g8, l8);
                    if (file.exists()) {
                        String e8 = a10.e();
                        AbstractC3292y.f(e8);
                        if (System.currentTimeMillis() - Long.parseLong(e8) > 604800000) {
                            C3800y.f37330a.v(this.f31262a, new C3788m().t(file, this.f31262a));
                        }
                    }
                }
            } else {
                UptodownApp.f29249C.E().send(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, null);
            }
        }
        new X4.a(this.f31262a, null, N.a(C3445b0.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.TrackingWorker.g():void");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        if (getRunAttemptCount() > 3) {
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            AbstractC3292y.h(failure, "failure(...)");
            return failure;
        }
        String str = this.f31265d;
        if (str == null) {
            AbstractC3292y.y("currentTag");
            str = null;
        }
        if (n.s(str, "TrackingWorkerPeriodic", true)) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            if (aVar.V("TrackingWorkerSingle", this.f31262a) || aVar.V("GenerateQueueWorker", this.f31262a) || aVar.V("DownloadUpdatesWorker", this.f31262a)) {
                ListenableWorker.Result success = ListenableWorker.Result.success();
                AbstractC3292y.h(success, "success(...)");
                return success;
            }
        } else {
            String str2 = this.f31265d;
            if (str2 == null) {
                AbstractC3292y.y("currentTag");
                str2 = null;
            }
            if (n.s(str2, "TrackingWorkerSingle", true)) {
                UptodownApp.a aVar2 = UptodownApp.f29249C;
                if (aVar2.V("TrackingWorkerPeriodic", this.f31262a) || aVar2.V("GenerateQueueWorker", this.f31262a) || aVar2.V("DownloadUpdatesWorker", this.f31262a)) {
                    ListenableWorker.Result success2 = ListenableWorker.Result.success();
                    AbstractC3292y.h(success2, "success(...)");
                    return success2;
                }
            }
        }
        if (new C3771D(this.f31262a).b()) {
            UptodownApp.a aVar3 = UptodownApp.f29249C;
            aVar3.E().send(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, null);
            if (!aVar3.M()) {
                ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                AbstractC3292y.h(failure2, "failure(...)");
                return failure2;
            }
        }
        j.f4395g.b();
        SettingsPreferences.a aVar4 = SettingsPreferences.f30529b;
        if (!aVar4.k0(this.f31262a) && aVar4.j0(this.f31262a)) {
            g();
            if (this.f31264c) {
                ListenableWorker.Result retry = ListenableWorker.Result.retry();
                AbstractC3292y.h(retry, "retry(...)");
                return retry;
            }
        }
        ListenableWorker.Result success3 = ListenableWorker.Result.success();
        AbstractC3292y.h(success3, "success(...)");
        return success3;
    }
}
