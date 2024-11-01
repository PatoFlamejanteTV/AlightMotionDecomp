package J7;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f4517a = new ThreadLocal();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4518a;

        a(String str) {
            this.f4518a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.f4518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4519a;

        b(String str) {
            this.f4519a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.f4519a);
        }
    }

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f4517a.get();
        if (map != null && (str2 = (String) map.get(str)) != null) {
            return str2;
        }
        return (String) AccessController.doPrivileged(new b(str));
    }

    public static boolean b(String str) {
        try {
            return c(a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean c(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) != 'u' && str.charAt(2) != 'U') {
            return false;
        }
        if (str.charAt(3) != 'e' && str.charAt(3) != 'E') {
            return false;
        }
        return true;
    }
}
