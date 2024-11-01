package G0;

import J0.AbstractC1253j;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2747a;

    /* renamed from: b, reason: collision with root package name */
    private b f2748b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2749a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2750b;

        private b() {
            int p8 = AbstractC1253j.p(f.this.f2747a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (p8 == 0) {
                if (f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f2749a = "Flutter";
                    this.f2750b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                } else {
                    this.f2749a = null;
                    this.f2750b = null;
                    return;
                }
            }
            this.f2749a = "Unity";
            String string = f.this.f2747a.getResources().getString(p8);
            this.f2750b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f2747a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f2747a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f2747a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f2748b == null) {
            this.f2748b = new b();
        }
        return this.f2748b;
    }

    public String d() {
        return f().f2749a;
    }

    public String e() {
        return f().f2750b;
    }
}
