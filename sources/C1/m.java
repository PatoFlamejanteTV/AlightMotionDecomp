package C1;

import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f757a;

    /* renamed from: b, reason: collision with root package name */
    private final URL f758b;

    /* renamed from: c, reason: collision with root package name */
    private final String f759c;

    private m(String str, URL url, String str2) {
        this.f757a = str;
        this.f758b = url;
        this.f759c = str2;
    }

    public static m a(String str, URL url, String str2) {
        I1.g.f(str, "VendorKey is null or empty");
        I1.g.d(url, "ResourceURL is null");
        I1.g.f(str2, "VerificationParameters is null or empty");
        return new m(str, url, str2);
    }

    public static m b(URL url) {
        I1.g.d(url, "ResourceURL is null");
        return new m(null, url, null);
    }

    public URL c() {
        return this.f758b;
    }

    public String d() {
        return this.f757a;
    }

    public String e() {
        return this.f759c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        I1.c.i(jSONObject, "vendorKey", this.f757a);
        I1.c.i(jSONObject, "resourceUrl", this.f758b.toString());
        I1.c.i(jSONObject, "verificationParameters", this.f759c);
        return jSONObject;
    }
}
