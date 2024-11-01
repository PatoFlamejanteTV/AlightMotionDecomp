package c5;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private String f15625a;

    /* renamed from: b, reason: collision with root package name */
    private int f15626b;

    /* renamed from: c, reason: collision with root package name */
    private String f15627c;

    public final void a(Context context) {
        AbstractC3292y.i(context, "context");
        if (this.f15626b == 526) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            aVar.Z0(context, true);
            aVar.g1(context, 633);
            String str = this.f15625a;
            if (str != null && str.length() != 0) {
                String str2 = this.f15625a;
                AbstractC3292y.f(str2);
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.isNull("url_update")) {
                    aVar.e1(context, jSONObject.getString("url_update"));
                }
            }
        }
    }

    public final boolean b() {
        int i8 = this.f15626b;
        if (i8 >= 200 && i8 < 300) {
            return false;
        }
        return true;
    }

    public final String c() {
        return this.f15627c;
    }

    public final String d() {
        return this.f15625a;
    }

    public final int e() {
        return this.f15626b;
    }

    public final boolean f() {
        String str;
        if (!b() && (str = this.f15625a) != null) {
            AbstractC3292y.f(str);
            if (str.length() > 0) {
                String str2 = this.f15625a;
                AbstractC3292y.f(str2);
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final String g(JSONObject jsonObject) {
        AbstractC3292y.i(jsonObject, "jsonObject");
        String str = null;
        try {
            if (jsonObject.isNull("errorMsg")) {
                return null;
            }
            Object obj = jsonObject.get("errorMsg");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = jsonObject.getJSONArray("errorMsg");
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    if (str != null && !AbstractC3292y.d(str, "")) {
                        Y y8 = Y.f34578a;
                        String format = String.format("%s\n%s", Arrays.copyOf(new Object[]{str, jSONArray.getString(i8)}, 2));
                        AbstractC3292y.h(format, "format(...)");
                        str = format;
                    } else {
                        str = jSONArray.getString(i8);
                    }
                }
                return str;
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void h(String str) {
        this.f15627c = str;
    }

    public final void i(String str) {
        this.f15625a = str;
    }

    public final void j(int i8) {
        this.f15626b = i8;
    }
}
