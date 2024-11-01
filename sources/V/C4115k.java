package v;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4115k implements InterfaceC4109e {

    /* renamed from: a, reason: collision with root package name */
    private final a f40410a;

    /* renamed from: b, reason: collision with root package name */
    private final C4113i f40411b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f40412c;

    /* renamed from: v.k$a */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f40413a;

        /* renamed from: b, reason: collision with root package name */
        private Map f40414b = null;

        a(Context context) {
            this.f40413a = context;
        }

        private Map a(Context context) {
            Bundle d8 = d(context);
            if (d8 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d8.keySet()) {
                Object obj = d8.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map c() {
            if (this.f40414b == null) {
                this.f40414b = a(this.f40413a);
            }
            return this.f40414b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        InterfaceC4108d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC4108d) Class.forName(str2).asSubclass(InterfaceC4108d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e8) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e8);
                return null;
            } catch (IllegalAccessException e9) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e9);
                return null;
            } catch (InstantiationException e10) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e12);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4115k(Context context, C4113i c4113i) {
        this(new a(context), c4113i);
    }

    @Override // v.InterfaceC4109e
    public synchronized InterfaceC4117m get(String str) {
        if (this.f40412c.containsKey(str)) {
            return (InterfaceC4117m) this.f40412c.get(str);
        }
        InterfaceC4108d b9 = this.f40410a.b(str);
        if (b9 == null) {
            return null;
        }
        InterfaceC4117m create = b9.create(this.f40411b.a(str));
        this.f40412c.put(str, create);
        return create;
    }

    C4115k(a aVar, C4113i c4113i) {
        this.f40412c = new HashMap();
        this.f40410a = aVar;
        this.f40411b = c4113i;
    }
}
