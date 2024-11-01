package androidx.lifecycle;

import R5.AbstractC1435t;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter newInstance = constructor.newInstance(obj);
            AbstractC3292y.h(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        String fullPackage;
        try {
            Package r12 = cls.getPackage();
            String name = cls.getCanonicalName();
            if (r12 != null) {
                fullPackage = r12.getName();
            } else {
                fullPackage = "";
            }
            AbstractC3292y.h(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                AbstractC3292y.h(name, "name");
                name = name.substring(fullPackage.length() + 1);
                AbstractC3292y.h(name, "this as java.lang.String).substring(startIndex)");
            }
            AbstractC3292y.h(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(name);
            if (fullPackage.length() != 0) {
                adapterName = fullPackage + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            AbstractC3292y.g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static final String getAdapterName(String className) {
        AbstractC3292y.i(className, "className");
        return l6.n.z(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        if (cls != null && LifecycleObserver.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        AbstractC3292y.i(object, "object");
        boolean z8 = object instanceof LifecycleEventObserver;
        boolean z9 = object instanceof DefaultLifecycleObserver;
        if (z8 && z9) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z9) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z8) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
            AbstractC3292y.f(list);
            List<Constructor<? extends GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
            }
            int size = list2.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i8 = 0; i8 < size; i8++) {
                generatedAdapterArr[i8] = INSTANCE.createGeneratedAdapter(list2.get(i8), object);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            classToAdapters.put(cls, AbstractC1435t.e(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            AbstractC3292y.h(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            AbstractC3292y.f(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC3292y.h(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (isLifecycleParent(intrface)) {
                AbstractC3292y.h(intrface, "intrface");
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(intrface);
                AbstractC3292y.f(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }
}
