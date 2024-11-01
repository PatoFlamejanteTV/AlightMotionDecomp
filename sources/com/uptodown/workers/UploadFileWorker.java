package com.uptodown.workers;

import J4.j;
import S4.d;
import S4.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c5.C2041f;
import c5.C2052q;
import c5.C2055u;
import c5.K;
import c5.S;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import d5.ResultReceiverC2761d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;
import q5.C3793r;
import q5.C3795t;
import q5.C3796u;
import q5.C3797v;
import r5.C3930d;

/* loaded from: classes5.dex */
public final class UploadFileWorker extends Worker {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31267c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f31268a;

    /* renamed from: b, reason: collision with root package name */
    private final C3795t f31269b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(Context context) {
            AbstractC3292y.i(context, "context");
            UptodownApp.a aVar = UptodownApp.f29249C;
            boolean W8 = aVar.W("UploadFileWorker", context);
            boolean V8 = aVar.V("DownloadUpdatesWorker", context);
            boolean V9 = aVar.V("downloadApkWorker", context);
            if (!W8 && !V8 && !V9) {
                WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(UploadFileWorker.class).addTag("UploadFileWorker").build());
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(params, "params");
        this.f31268a = context;
        this.f31269b = new C3795t(context);
        this.f31268a = j.f4395g.a(this.f31268a);
    }

    private final String a(String str, ArrayList arrayList) {
        PackageManager packageManager = this.f31268a.getPackageManager();
        Iterator it = arrayList.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            C2041f c2041f = (C2041f) next;
            Iterator it2 = it;
            if (c2041f.w() != null && n.s(c2041f.w(), str, true)) {
                AbstractC3292y.f(packageManager);
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                ApplicationInfo a9 = r.a(packageManager, Q8, 128);
                d dVar = d.f9430a;
                String sourceDir = a9.sourceDir;
                AbstractC3292y.h(sourceDir, "sourceDir");
                String h8 = dVar.h(sourceDir);
                if (n.s(str, h8, true)) {
                    return a9.sourceDir;
                }
                Bundle bundle = new Bundle();
                bundle.putString("type", "ignored");
                bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotMatch");
                bundle.putString("filehash", str);
                bundle.putString("packagename", a9.packageName);
                bundle.putString("filehashCalculated", h8);
                this.f31269b.e("upload", C3796u.f37312a.a(bundle));
                C3791p a10 = C3791p.f37286s.a(this.f31268a);
                a10.a();
                c2041f.A0(h8);
                a10.k1(c2041f);
                a10.i();
                return null;
            }
            C3791p a11 = C3791p.f37286s.a(this.f31268a);
            a11.a();
            ArrayList U8 = a11.U(c2041f);
            a11.i();
            if (U8 != null) {
                Iterator it3 = U8.iterator();
                AbstractC3292y.h(it3, "iterator(...)");
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    AbstractC3292y.h(next2, "next(...)");
                    C2055u c2055u = (C2055u) next2;
                    PackageManager packageManager2 = packageManager;
                    Iterator it4 = it3;
                    if (n.s(str, c2055u.b(), true) && c2055u.a() != null) {
                        d dVar2 = d.f9430a;
                        String a12 = c2055u.a();
                        AbstractC3292y.f(a12);
                        String h9 = dVar2.h(a12);
                        if (n.s(str, h9, true)) {
                            return c2055u.a();
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", "ignored");
                        bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotMatch");
                        bundle2.putString("filehash", str);
                        bundle2.putString("packagename", c2041f.Q());
                        bundle2.putString("filehashCalculated", h9);
                        this.f31269b.e("upload", C3796u.f37312a.a(bundle2));
                        return null;
                    }
                    packageManager = packageManager2;
                    it3 = it4;
                }
            }
            it = it2;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("type", "ignored");
        bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "hashNotFound");
        bundle3.putString("filehash", str);
        this.f31269b.e("upload", C3796u.f37312a.a(bundle3));
        return null;
    }

    private final String b() {
        ResultReceiverC2761d a9 = ResultReceiverC2761d.f31506a.a();
        if (new C3793r().c(this.f31268a) && c()) {
            C2052q c2052q = new C2052q();
            c2052q.h(this.f31268a);
            C3775H c3775h = new C3775H(this.f31268a, a9);
            String d8 = c2052q.d();
            AbstractC3292y.f(d8);
            K u8 = c3775h.u(d8);
            this.f31269b.h("getFileToUpload", null, u8, null);
            if (c3775h.g(u8) && u8.d() != null) {
                String d9 = u8.d();
                AbstractC3292y.f(d9);
                JSONObject jSONObject = new JSONObject(d9);
                if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (!jSONObject2.isNull("md5")) {
                        return jSONObject2.getString("md5");
                    }
                }
            } else if (u8.e() == 404 && a9 != null) {
                Bundle bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "getFileToUpload 404: No file to upload available");
                a9.send(137, bundle);
            }
        }
        return null;
    }

    private final boolean c() {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.V("DownloadUpdatesWorker", this.f31268a) && !aVar.V("downloadApkWorker", this.f31268a)) {
            return true;
        }
        return false;
    }

    private final boolean d(String str, String str2, ResultReceiverC2761d resultReceiverC2761d) {
        boolean c8 = new C3793r().c(this.f31268a);
        if (c8 && c()) {
            File file = new File(str);
            if (file.exists()) {
                long length = file.length();
                C3797v c3797v = C3797v.f37313a;
                if (c3797v.f()) {
                    return C3930d.b(new C3930d(), this.f31268a, file, str2, resultReceiverC2761d, false, 16, null);
                }
                if (c3797v.e()) {
                    S a9 = S.f15686c.a(this.f31268a);
                    if (length > 0 && length < a9.a(this.f31268a)) {
                        return new C3930d().a(this.f31268a, file, str2, resultReceiverC2761d, true);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "ignored");
                    bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "size");
                    C3796u c3796u = C3796u.f37312a;
                    bundle.putString("size", c3796u.d(length));
                    this.f31269b.e("upload", c3796u.a(bundle));
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("type", "ignored");
                    bundle2.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "connection");
                    C3796u c3796u2 = C3796u.f37312a;
                    bundle2.putString("size", c3796u2.d(length));
                    this.f31269b.e("upload", c3796u2.a(bundle2));
                }
            } else {
                Bundle bundle3 = new Bundle();
                bundle3.putString("type", "ignored");
                bundle3.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "fileNotFound");
                this.f31269b.e("upload", C3796u.f37312a.a(bundle3));
            }
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("type", "ignored");
            if (!c8) {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "battery");
            } else {
                bundle4.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, "notIdle");
            }
            this.f31269b.e("upload", C3796u.f37312a.a(bundle4));
        }
        return false;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        String b9 = b();
        if (b9 != null) {
            C3791p a9 = C3791p.f37286s.a(this.f31268a);
            a9.a();
            ArrayList V8 = a9.V();
            a9.i();
            String a10 = a(b9, V8);
            if (a10 != null && d(a10, b9, ResultReceiverC2761d.f31506a.a())) {
                UptodownApp.a.M0(UptodownApp.f29249C, this.f31268a, false, 2, null);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        AbstractC3292y.h(success, "success(...)");
        return success;
    }
}
