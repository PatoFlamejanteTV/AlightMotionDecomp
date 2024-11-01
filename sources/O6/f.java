package O6;

import androidx.browser.trusted.sharing.ShareTarget;

/* loaded from: classes5.dex */
public abstract class f {
    public static boolean a(String str) {
        if (!str.equals(ShareTarget.METHOD_POST) && !str.equals("PATCH") && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        if (!str.equals(ShareTarget.METHOD_GET) && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean e(String str) {
        if (!str.equals(ShareTarget.METHOD_POST) && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
            return false;
        }
        return true;
    }
}
