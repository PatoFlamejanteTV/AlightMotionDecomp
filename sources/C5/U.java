package c5;

import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private int f15700a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f15701b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15702c;

    /* renamed from: d, reason: collision with root package name */
    private int f15703d;

    public final void a(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("id")) {
            this.f15700a = jsonObject.getInt("id");
        }
        if (!jsonObject.isNull("name")) {
            this.f15701b = jsonObject.getString("name");
        }
        if (!jsonObject.isNull("isChecked")) {
            this.f15702c = jsonObject.getBoolean("isChecked");
        }
        if (!jsonObject.isNull("isTurbo")) {
            this.f15703d = jsonObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f15700a;
    }

    public final String c() {
        return this.f15701b;
    }

    public final boolean d() {
        return this.f15702c;
    }

    public final boolean e() {
        if (this.f15703d == 1) {
            return true;
        }
        return false;
    }
}
