package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f19013a = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f19014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f19015c;

        a(Method method, Object obj) {
            this.f19014b = method;
            this.f19015c = obj;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f19014b.invoke(this.f19015c, cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f19016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19017c;

        b(Method method, int i8) {
            this.f19016b = method;
            this.f19017c = i8;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f19016b.invoke(null, cls, Integer.valueOf(this.f19017c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends m {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f19018b;

        c(Method method) {
            this.f19018b = method;
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            m.b(cls);
            return this.f19018b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends m {
        d() {
        }

        @Override // com.google.gson.internal.m
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String a9 = com.google.gson.internal.c.a(cls);
        if (a9 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a9);
    }

    private static m c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            }
        } catch (Exception unused3) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new c(declaredMethod3);
        }
    }

    public abstract Object d(Class cls);
}
