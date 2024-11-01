package I1;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return "Android";
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.i(jSONObject, "deviceType", a());
        c.i(jSONObject, "osVersion", c());
        c.i(jSONObject, "os", b());
        return jSONObject;
    }
}
