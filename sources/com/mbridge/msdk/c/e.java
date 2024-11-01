package com.mbridge.msdk.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f19249a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f19250b;

    /* loaded from: classes4.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f19251a = new e();
    }

    public static e a() {
        return a.f19251a;
    }

    public final String b(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f19250b) == null || !hashMap.containsKey(str) || (fVar = this.f19250b.get(str)) == null || fVar.a() >= this.f19249a) {
            return "";
        }
        String b9 = fVar.b();
        if (!TextUtils.isEmpty(b9)) {
            fVar.a(true);
        }
        return b9;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f19250b == null) {
                this.f19250b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f19250b.put(next, fVar);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void d(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (!TextUtils.isEmpty(str) && (hashMap = this.f19250b) != null && hashMap.containsKey(str) && (fVar = this.f19250b.get(str)) != null && fVar.a() < this.f19249a) {
            fVar.a(fVar.a() + 1);
        }
    }

    public final void e(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (!TextUtils.isEmpty(str) && (hashMap = this.f19250b) != null && hashMap.containsKey(str) && (fVar = this.f19250b.get(str)) != null && fVar.a() < this.f19249a) {
            fVar.a(0);
        }
    }

    private e() {
        this.f19249a = 6;
        this.f19250b = new HashMap<>();
    }

    public final int a(String str) {
        HashMap<String, f> hashMap;
        f fVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.f19250b) == null || !hashMap.containsKey(str) || (fVar = this.f19250b.get(str)) == null) {
            return 0;
        }
        int i8 = fVar.c() ? 1 : fVar.a() >= this.f19249a ? 2 : 0;
        fVar.a(false);
        return i8;
    }
}
