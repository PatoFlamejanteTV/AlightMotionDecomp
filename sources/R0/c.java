package R0;

import J0.C1266x;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f9109a;

    /* renamed from: b, reason: collision with root package name */
    private final O0.b f9110b;

    /* renamed from: c, reason: collision with root package name */
    private final G0.g f9111c;

    public c(String str, O0.b bVar) {
        this(str, bVar, G0.g.f());
    }

    private O0.a b(O0.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f9142a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", C1266x.k());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f9143b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f9144c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f9145d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f9146e.a().c());
        return aVar;
    }

    private void c(O0.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e8) {
            this.f9111c.l("Failed to parse settings JSON from " + this.f9109a, e8);
            this.f9111c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", kVar.f9149h);
        hashMap.put("display_version", kVar.f9148g);
        hashMap.put("source", Integer.toString(kVar.f9150i));
        String str = kVar.f9147f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // R0.l
    public JSONObject a(k kVar, boolean z8) {
        K0.g.d();
        if (z8) {
            try {
                Map f8 = f(kVar);
                O0.a b9 = b(d(f8), kVar);
                this.f9111c.b("Requesting settings from " + this.f9109a);
                this.f9111c.i("Settings query params were: " + f8);
                return g(b9.c());
            } catch (IOException e8) {
                this.f9111c.e("Settings request failed.", e8);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected O0.a d(Map map) {
        return this.f9110b.a(this.f9109a, map).d(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + C1266x.k()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(O0.c cVar) {
        int b9 = cVar.b();
        this.f9111c.i("Settings response code was: " + b9);
        if (h(b9)) {
            return e(cVar.a());
        }
        this.f9111c.d("Settings request failed; (status: " + b9 + ") from " + this.f9109a);
        return null;
    }

    boolean h(int i8) {
        if (i8 != 200 && i8 != 201 && i8 != 202 && i8 != 203) {
            return false;
        }
        return true;
    }

    c(String str, O0.b bVar, G0.g gVar) {
        if (str != null) {
            this.f9111c = gVar;
            this.f9110b = bVar;
            this.f9109a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
