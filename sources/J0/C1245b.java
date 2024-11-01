package J0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: J0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1245b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3886b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3887c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3888d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3889e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3890f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3891g;

    /* renamed from: h, reason: collision with root package name */
    public final G0.f f3892h;

    public C1245b(String str, String str2, List list, String str3, String str4, String str5, String str6, G0.f fVar) {
        this.f3885a = str;
        this.f3886b = str2;
        this.f3887c = list;
        this.f3888d = str3;
        this.f3889e = str4;
        this.f3890f = str5;
        this.f3891g = str6;
        this.f3892h = fVar;
    }

    public static C1245b a(Context context, I i8, String str, String str2, List list, G0.f fVar) {
        String packageName = context.getPackageName();
        String g8 = i8.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b9 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1245b(str, str2, list, g8, packageName, b9, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
