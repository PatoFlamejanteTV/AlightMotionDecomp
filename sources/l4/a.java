package L4;

import S4.f;
import S4.s;
import S4.w;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0090a f5397b = new C0090a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f5398a;

    /* renamed from: L4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0090a {
        private C0090a() {
        }

        public /* synthetic */ C0090a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public a(Context context) {
        AbstractC3292y.i(context, "context");
        this.f5398a = context;
    }

    private final void K(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f5398a.getSharedPreferences("CoreSettings", 0).edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private final boolean d(String str, boolean z8) {
        try {
            SharedPreferences sharedPreferences = this.f5398a.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getBoolean(str, z8);
            }
            return z8;
        } catch (Exception unused) {
            return z8;
        }
    }

    private final String f(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f5398a.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getString(str, str2);
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    static /* synthetic */ String g(a aVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        return aVar.f(str, str2);
    }

    private final void z(String str, boolean z8) {
        try {
            SharedPreferences.Editor edit = this.f5398a.getSharedPreferences("CoreSettings", 0).edit();
            edit.putBoolean(str, z8);
            edit.apply();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void A(boolean z8) {
        z("device_rooted", z8);
        if (!z8) {
            M(false);
            B(false);
        }
    }

    public final void B(boolean z8) {
        z("install_apk_as_root_system", z8);
    }

    public final void C(String str) {
        K("language", str);
    }

    public final void D(boolean z8) {
        z("notification_permission_request", z8);
    }

    public final void E(boolean z8) {
        z("sdcard_as_backup_storage", z8);
    }

    public final void F(boolean z8) {
        z("storage_sdcard", z8);
    }

    public final void G(boolean z8) {
        z("search_apk_worker_active", z8);
    }

    public final void H(boolean z8) {
        z("show_hidden_files", z8);
    }

    public final void I(boolean z8) {
        z("show_installation_details", z8);
    }

    public final void J(boolean z8) {
        z("warn_installed", z8);
    }

    public final void L(boolean z8) {
        z("system_app", z8);
    }

    public final void M(boolean z8) {
        z("user_asked_for_show_permissions", z8);
    }

    public final boolean N() {
        return d("warn_installed", true);
    }

    public final String a() {
        String f8 = f("xapk_extension", ".xapk");
        if (f8 != null && !n.B(f8, ".", false, 2, null)) {
            return '.' + f8;
        }
        return f8;
    }

    public final Object b() {
        String g8 = g(this, "outputdir", null, 2, null);
        if (g8 != null) {
            if (n()) {
                Uri n8 = new f().n(this.f5398a);
                if (n8 != null) {
                    DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this.f5398a, n8);
                    if (fromTreeUri != null) {
                        for (String str : n.s0(g8, new String[]{"/"}, false, 0, 6, null)) {
                            DocumentFile findFile = fromTreeUri.findFile(str);
                            if (findFile == null) {
                                fromTreeUri = fromTreeUri.createDirectory(str);
                                if (fromTreeUri == null) {
                                    break;
                                }
                            } else {
                                fromTreeUri = findFile;
                            }
                        }
                    }
                    if (fromTreeUri != null && fromTreeUri.exists()) {
                        return fromTreeUri;
                    }
                }
                E(false);
            }
            File file = new File(g8);
            if (file.exists()) {
                return file;
            }
            if (file.mkdirs()) {
                return file;
            }
        }
        File c8 = new f().c(this.f5398a);
        if (c8 == null) {
            return null;
        }
        y(c8.getAbsolutePath());
        return c8;
    }

    public final String c() {
        String g8 = g(this, "outputdir", null, 2, null);
        if (g8 != null) {
            return g8;
        }
        File c8 = new f().c(this.f5398a);
        if (c8 == null) {
            return null;
        }
        String absolutePath = c8.getAbsolutePath();
        y(absolutePath);
        return absolutePath;
    }

    public final String e() {
        return g(this, "language", null, 2, null);
    }

    public final void h() {
        boolean z8;
        boolean e8 = new w(this.f5398a, null).e();
        if (!e8 && Build.VERSION.SDK_INT <= 29) {
            z8 = s.f9466a.d();
        } else {
            z8 = false;
        }
        A(z8);
        L(e8);
    }

    public final boolean i() {
        return d("app_name_included", true);
    }

    public final boolean j() {
        return d("packagename_included", false);
    }

    public final boolean k() {
        return d("versioncode_included", true);
    }

    public final boolean l() {
        return d("device_rooted", false);
    }

    public final boolean m() {
        return d("install_apk_as_root_system", false);
    }

    public final boolean n() {
        return d("sdcard_as_backup_storage", false);
    }

    public final boolean o() {
        return d("storage_sdcard", false);
    }

    public final boolean p() {
        return d("search_apk_worker_active", true);
    }

    public final boolean q() {
        return d("show_hidden_files", false);
    }

    public final boolean r() {
        return d("show_installation_details", false);
    }

    public final boolean s() {
        return d("system_app", false);
    }

    public final boolean t() {
        return d("user_asked_for_show_permissions", false);
    }

    public final void u(boolean z8) {
        z("app_name_included", z8);
    }

    public final void v(boolean z8) {
        z("packagename_included", z8);
    }

    public final void w(boolean z8) {
        z("versioncode_included", z8);
    }

    public final void x(String value) {
        AbstractC3292y.i(value, "value");
        K("xapk_extension", value);
    }

    public final void y(String str) {
        K("outputdir", str);
    }
}
