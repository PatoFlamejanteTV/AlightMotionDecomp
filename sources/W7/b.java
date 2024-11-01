package W7;

import a6.AbstractC1677b;
import android.content.Context;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10898a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f10899b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f10900c;

    public b(Context context, Locale appLocale) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appLocale, "appLocale");
        this.f10898a = context;
        this.f10899b = appLocale;
    }

    @Override // W7.j
    public Object a(String jsonString) {
        Long valueOf;
        AbstractC3292y.i(jsonString, "jsonString");
        try {
            if (jsonString.length() == 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f10898a.getResources().openRawResource(M1.d.f6066a)));
                try {
                    jsonString = bufferedReader.readLine();
                    AbstractC1677b.a(bufferedReader, null);
                } finally {
                }
            }
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f10900c = jSONObject;
            R7.a aVar = R7.a.f9354a;
            String string = jSONObject.getString("lastUpdated");
            AbstractC3292y.h(string, "cmpListJson.getString(\"lastUpdated\")");
            Date a9 = R7.a.a(aVar, string, null, this.f10899b, 2);
            if (a9 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(a9.getTime());
            }
            return new D5.g(valueOf, b());
        } catch (JSONException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new D5.g(null, null, 3);
        }
    }

    public final Map b() {
        int length;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = this.f10900c;
        if (jSONObject == null) {
            AbstractC3292y.y("cmpListJson");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("cmps");
        JSONArray names = jSONObject2.names();
        int i8 = 0;
        if (names == null) {
            length = 0;
        } else {
            length = names.length();
        }
        while (i8 < length) {
            int i9 = i8 + 1;
            if (names == null || (str = names.getString(i8)) == null) {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
            int i10 = jSONObject3.getInt("id");
            String string = jSONObject3.getString("name");
            AbstractC3292y.h(string, "cmp.getString(\"name\")");
            linkedHashMap.put(str, new D5.a(i10, string, jSONObject3.getBoolean("isCommercial")));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
