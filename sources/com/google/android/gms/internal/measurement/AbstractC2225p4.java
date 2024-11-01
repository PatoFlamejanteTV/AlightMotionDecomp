package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2225p4 {

    /* renamed from: a, reason: collision with root package name */
    private static String f16932a = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2128e4 a(Class cls) {
        String str;
        ClassLoader classLoader = AbstractC2225p4.class.getClassLoader();
        if (!cls.equals(C2128e4.class)) {
            if (!cls.getPackage().equals(AbstractC2225p4.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = f16932a;
        }
        try {
            try {
                try {
                    try {
                        android.support.v4.media.a.a(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (NoSuchMethodException e8) {
                        throw new IllegalStateException(e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalStateException(e9);
                    }
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC2225p4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e12) {
                    Logger.getLogger(AbstractC2092a4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + cls.getSimpleName(), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (C2128e4) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2128e4) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }
}
