package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* loaded from: classes3.dex */
final class a extends PathClassLoader {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z8) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z8);
    }
}
