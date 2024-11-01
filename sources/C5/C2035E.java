package c5;

import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: c5.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2035E {

    /* renamed from: a, reason: collision with root package name */
    private String f15589a;

    /* renamed from: b, reason: collision with root package name */
    private String f15590b;

    public final void a(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("permission")) {
            this.f15589a = jsonObject.getString("permission");
        }
        if (!jsonObject.isNull("description")) {
            this.f15590b = jsonObject.getString("description");
        }
    }

    public final String b() {
        return this.f15589a;
    }

    public final void c(String str) {
        this.f15590b = str;
    }

    public final void d(String str) {
        this.f15589a = str;
    }
}
