package m1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import n1.InterfaceC3389b;
import o1.C3516f;

/* renamed from: m1.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3345A {

    /* renamed from: a, reason: collision with root package name */
    public static final C3345A f34816a = new C3345A();

    /* renamed from: b, reason: collision with root package name */
    private static final V0.a f34817b;

    static {
        V0.a i8 = new X0.d().j(C3353c.f34876a).k(true).i();
        AbstractC3292y.h(i8, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f34817b = i8;
    }

    private C3345A() {
    }

    private final EnumC3354d d(InterfaceC3389b interfaceC3389b) {
        if (interfaceC3389b == null) {
            return EnumC3354d.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (interfaceC3389b.a()) {
            return EnumC3354d.COLLECTION_ENABLED;
        }
        return EnumC3354d.COLLECTION_DISABLED;
    }

    public final z a(A0.f firebaseApp, y sessionDetails, C3516f sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC3292y.i(firebaseApp, "firebaseApp");
        AbstractC3292y.i(sessionDetails, "sessionDetails");
        AbstractC3292y.i(sessionsSettings, "sessionsSettings");
        AbstractC3292y.i(subscribers, "subscribers");
        AbstractC3292y.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC3292y.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new z(EnumC3359i.SESSION_START, new C3347C(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new C3355e(d((InterfaceC3389b) subscribers.get(InterfaceC3389b.a.PERFORMANCE)), d((InterfaceC3389b) subscribers.get(InterfaceC3389b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final C3352b b(A0.f firebaseApp) {
        String valueOf;
        String str;
        long longVersionCode;
        AbstractC3292y.i(firebaseApp, "firebaseApp");
        Context k8 = firebaseApp.k();
        AbstractC3292y.h(k8, "firebaseApp.applicationContext");
        String packageName = k8.getPackageName();
        PackageInfo packageInfo = k8.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        String c8 = firebaseApp.n().c();
        AbstractC3292y.h(c8, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        AbstractC3292y.h(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3292y.h(RELEASE, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        AbstractC3292y.h(packageName, "packageName");
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str = str2;
        } else {
            str = str3;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC3292y.h(MANUFACTURER, "MANUFACTURER");
        v vVar = v.f34955a;
        Context k9 = firebaseApp.k();
        AbstractC3292y.h(k9, "firebaseApp.applicationContext");
        u d8 = vVar.d(k9);
        Context k10 = firebaseApp.k();
        AbstractC3292y.h(k10, "firebaseApp.applicationContext");
        return new C3352b(c8, MODEL, "2.0.5", RELEASE, tVar, new C3351a(packageName, str, str2, MANUFACTURER, d8, vVar.c(k10)));
    }

    public final V0.a c() {
        return f34817b;
    }
}
