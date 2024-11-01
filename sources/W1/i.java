package W1;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class i extends ClassLoader {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10736a = d.class.getName();

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f10737b;

    static {
        Class cls = Integer.TYPE;
        f10737b = new Class[]{String.class, byte[].class, cls, cls};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(ClassLoader classLoader) {
        super(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class a(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", f10737b);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.ClassLoader
    protected synchronized Class loadClass(String str, boolean z8) {
        if (str.equals(f10736a)) {
            return d.class;
        }
        return super.loadClass(str, z8);
    }
}
