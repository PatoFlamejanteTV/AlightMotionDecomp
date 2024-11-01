package P4;

import android.os.Build;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private File f8087a;

    /* renamed from: b, reason: collision with root package name */
    private String f8088b;

    /* renamed from: c, reason: collision with root package name */
    private String f8089c;

    /* renamed from: d, reason: collision with root package name */
    private String f8090d;

    /* renamed from: e, reason: collision with root package name */
    private long f8091e;

    /* renamed from: f, reason: collision with root package name */
    private String f8092f;

    private final void b(JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("name")) {
                this.f8088b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("sha256")) {
                this.f8089c = jSONObject.getString("sha256");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f8090d = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("size")) {
                this.f8091e = jSONObject.getLong("size");
            }
            if (!jSONObject.isNull("senderDeviceName")) {
                this.f8092f = jSONObject.getString("senderDeviceName");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public final void a(File f8) {
        AbstractC3292y.i(f8, "f");
        this.f8087a = f8;
        this.f8088b = f8.getName();
        this.f8089c = S4.d.f9430a.e(f8.getAbsolutePath());
        this.f8091e = f8.length();
        this.f8092f = Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    public final void c(String json) {
        AbstractC3292y.i(json, "json");
        b(new JSONObject(json));
    }

    public final File d() {
        return this.f8087a;
    }

    public final String e() {
        return this.f8088b;
    }

    public final String f() {
        return this.f8092f;
    }

    public final String g() {
        return this.f8089c;
    }

    public final long h() {
        return this.f8091e;
    }

    public final String i() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f8088b;
            if (str != null) {
                jSONObject.put("name", str);
            }
            String str2 = this.f8089c;
            if (str2 != null) {
                jSONObject.put("sha256", str2);
            }
            String str3 = this.f8090d;
            if (str3 != null) {
                jSONObject.put(RewardPlus.ICON, str3);
            }
            long j8 = this.f8091e;
            if (j8 > 0) {
                jSONObject.put("size", j8);
            }
            String str4 = this.f8092f;
            if (str4 != null) {
                jSONObject.put("senderDeviceName", str4);
            }
            return jSONObject.toString(2);
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
