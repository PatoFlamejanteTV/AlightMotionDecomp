package com.mbridge.msdk.videocommon.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f24204a;

    /* renamed from: b, reason: collision with root package name */
    private int f24205b;

    /* renamed from: c, reason: collision with root package name */
    private a f24206c;

    public b(int i8, int i9, a aVar) {
        this.f24204a = i8;
        this.f24205b = i9;
        this.f24206c = aVar;
    }

    public final int a() {
        return this.f24204a;
    }

    public final int b() {
        return this.f24205b;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
