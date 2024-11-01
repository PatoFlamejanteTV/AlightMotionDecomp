package g5;

import android.content.Context;
import android.content.pm.PackageManager;
import h5.k;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2920b {

    /* renamed from: a, reason: collision with root package name */
    public final String f32461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32463c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32464d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32465e;

    public C2920b(Context context) {
        AbstractC3292y.i(context, "context");
        String packageName = context.getPackageName();
        AbstractC3292y.h(packageName, "context.packageName");
        this.f32461a = packageName;
        k kVar = k.f32654a;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3292y.h(packageManager, "context.packageManager");
        this.f32462b = kVar.b(packageManager, packageName);
        this.f32463c = String.valueOf(kVar.d(context));
        this.f32464d = kVar.f(context);
        this.f32465e = "115";
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packagename", this.f32461a);
        String str = this.f32464d;
        if (str != null) {
            jSONObject.put("version", str);
        }
        jSONObject.put("uptodownSDKVersion", this.f32465e);
        jSONObject.put("versionCode", this.f32463c);
        String str2 = this.f32462b;
        if (str2 != null) {
            jSONObject.put("md5Signature", str2);
        }
        return jSONObject;
    }
}
