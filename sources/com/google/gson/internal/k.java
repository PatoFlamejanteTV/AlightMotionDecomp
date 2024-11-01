package com.google.gson.internal;

import com.google.gson.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class k {

    /* loaded from: classes4.dex */
    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19007a;

        /* loaded from: classes4.dex */
        class a extends b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f19008b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f19008b = method;
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f19008b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e8) {
                    throw new RuntimeException("Failed invoking canAccess", e8);
                }
            }
        }

        /* renamed from: com.google.gson.internal.k$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0387b extends b {
            C0387b() {
                super();
            }

            @Override // com.google.gson.internal.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
        static {
            /*
                boolean r0 = com.google.gson.internal.d.d()
                if (r0 == 0) goto L1c
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
                com.google.gson.internal.k$b$a r1 = new com.google.gson.internal.k$b$a     // Catch: java.lang.NoSuchMethodException -> L1c
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
                goto L1d
            L1c:
                r1 = 0
            L1d:
                if (r1 != 0) goto L24
                com.google.gson.internal.k$b$b r1 = new com.google.gson.internal.k$b$b
                r1.<init>()
            L24:
                com.google.gson.internal.k.b.f19007a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.k.b.<clinit>():void");
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f19007a.a(accessibleObject, obj);
    }

    public static o b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return o.ALLOW;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }
}
