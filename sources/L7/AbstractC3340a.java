package l7;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3340a {

    /* renamed from: l7.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0797a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34807a;

        C0797a(String str) {
            this.f34807a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f34807a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                return classLoader.loadClass(str);
            }
            return (Class) AccessController.doPrivileged(new C0797a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
