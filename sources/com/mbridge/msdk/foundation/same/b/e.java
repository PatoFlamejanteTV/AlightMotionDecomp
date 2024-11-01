package com.mbridge.msdk.foundation.same.b;

import android.util.Log;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f20720a;

    /* renamed from: b, reason: collision with root package name */
    private b f20721b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f20722c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f20723a;

        /* renamed from: b, reason: collision with root package name */
        public c f20724b;

        public a(c cVar, File file) {
            this.f20724b = cVar;
            this.f20723a = file;
        }
    }

    private e(b bVar) {
        this.f20721b = bVar;
    }

    public static String a(c cVar) {
        File b9 = b(cVar);
        if (b9 != null) {
            return b9.getAbsolutePath();
        }
        return null;
    }

    public static File b(c cVar) {
        try {
            if (a() == null || a().f20722c == null || a().f20722c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f20722c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f20724b.equals(cVar)) {
                    return next.f20723a;
                }
            }
            return null;
        } catch (Throwable th) {
            ad.a("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f20720a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    ag.a(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (f20720a == null) {
                    Log.e("MBridgeDirManager", "mDirectoryManager == null");
                }
                eVar = f20720a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean b() {
        return a(this.f20721b.b());
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (f20720a == null) {
                f20720a = new e(bVar);
            }
        }
    }

    private boolean a(com.mbridge.msdk.foundation.same.b.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.b.a c8 = aVar.c();
        if (c8 == null) {
            str = aVar.b();
        } else {
            File b9 = b(c8.d());
            if (b9 == null) {
                return false;
            }
            str = b9.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f20722c.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.b.a> a9 = aVar.a();
        if (a9 != null) {
            Iterator<com.mbridge.msdk.foundation.same.b.a> it = a9.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
