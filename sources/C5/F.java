package c5;

import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private int f15591a;

    /* renamed from: b, reason: collision with root package name */
    private String f15592b;

    public final void a(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("positives")) {
            this.f15591a = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("sha256")) {
            this.f15592b = jsonObject.getString("sha256");
        }
    }

    public final int b() {
        return this.f15591a;
    }

    public final String c() {
        return this.f15592b;
    }
}
