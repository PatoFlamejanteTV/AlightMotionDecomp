package com.mbridge.msdk.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f20154b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f20155a;

    private m(String str, Context context, w wVar) {
        k kVar = new k(str, this);
        this.f20155a = kVar;
        kVar.a(context);
        kVar.a(wVar);
    }

    public static m[] d() {
        ConcurrentHashMap<String, m> concurrentHashMap = f20154b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                mVarArr[i8] = it.next().getValue();
                i8++;
            }
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "getAllTrackManager error", e8);
            }
        }
        return mVarArr;
    }

    public final String b() {
        return this.f20155a.b();
    }

    public final String c() {
        return this.f20155a.c();
    }

    public final void e() {
        try {
            this.f20155a.i().a(new Runnable() { // from class: com.mbridge.msdk.e.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        t.a().c();
                        m.this.f20155a.o().b();
                    } catch (Exception e8) {
                        if (a.f19988a) {
                            Log.e("TrackManager", "flush error", e8);
                        }
                    }
                }
            });
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "flush error", e8);
            }
        }
    }

    public final JSONObject f() {
        return this.f20155a.f();
    }

    public final long[] g() {
        return this.f20155a.h().a();
    }

    private boolean b(e eVar) {
        try {
            return c(eVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(e eVar) {
        if (y.a(eVar) || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        return this.f20155a.a(eVar);
    }

    public static m a(String str, Context context, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f20154b;
        m mVar = concurrentHashMap.get(str);
        if (!y.a(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, wVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public final void a(JSONObject jSONObject) {
        this.f20155a.a(jSONObject);
    }

    public final boolean a(String str) {
        return b(new e(str));
    }

    public final void a(final e eVar) {
        if (this.f20155a.r()) {
            if (a.f19988a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        try {
            this.f20155a.i().a(new Runnable() { // from class: com.mbridge.msdk.e.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!m.this.c(eVar)) {
                        return;
                    }
                    m.this.f20155a.h().a(eVar);
                    eVar.c(m.this.f20155a.d().f20210f);
                    JSONObject d8 = eVar.d();
                    if (d8 != null) {
                        try {
                            d8.put("session_id", m.this.b());
                            long[] g8 = m.this.g();
                            d8.put("track_time", g8[0]);
                            d8.put("track_count", g8[1]);
                        } catch (JSONException e8) {
                            e8.printStackTrace();
                        }
                        eVar.a(d8);
                    }
                    m.this.f20155a.h().b(eVar);
                }
            });
        } catch (Exception e8) {
            if (a.f19988a) {
                Log.e("TrackManager", "trackEvent error", e8);
            }
        }
    }

    public final String a() {
        if (!this.f20155a.r()) {
            if (a.f19988a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return this.f20155a.b();
        }
        return this.f20155a.a();
    }
}
