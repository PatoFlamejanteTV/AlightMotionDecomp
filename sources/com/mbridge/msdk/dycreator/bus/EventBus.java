package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class EventBus {

    /* renamed from: b, reason: collision with root package name */
    private static volatile EventBus f19877b;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19889n;

    /* renamed from: a, reason: collision with root package name */
    static ExecutorService f19876a = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f19878c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f19879d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f19880e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, Object> f19881f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f19882g = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f19883h = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private String f19884i = "onEvent";

    /* renamed from: j, reason: collision with root package name */
    private final HandlerPoster f19885j = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: k, reason: collision with root package name */
    private final BackgroundPoster f19886k = new BackgroundPoster(this);

    /* renamed from: l, reason: collision with root package name */
    private final AsyncPoster f19887l = new AsyncPoster(this);

    /* renamed from: m, reason: collision with root package name */
    private final SubscriberMethodFinder f19888m = new SubscriberMethodFinder();

    /* renamed from: o, reason: collision with root package name */
    private boolean f19890o = true;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, Object> f19891p = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19894a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f19894a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19894a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19894a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19894a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class BooleanWrapper {

        /* renamed from: a, reason: collision with root package name */
        boolean f19895a;

        BooleanWrapper() {
        }
    }

    /* loaded from: classes4.dex */
    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z8) {
        Iterator<SubscriberMethod> it = this.f19888m.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z8);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f19878c.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f19877b == null) {
            synchronized (EventBus.class) {
                try {
                    if (f19877b == null) {
                        f19877b = new EventBus();
                    }
                } finally {
                }
            }
        }
        return f19877b;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public final void configureLogSubscriberExceptions(boolean z8) {
        if (!this.f19889n) {
            this.f19890o = z8;
            return;
        }
        throw new EventBusException("This method must be called before any registration");
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f19881f) {
            obj = this.f19881f.get(cls);
        }
        return obj;
    }

    public final void post(Object obj) {
        boolean z8;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        List<Object> list = this.f19882g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f19883h.get();
        if (!booleanWrapper.f19895a) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z8 = true;
            } else {
                z8 = false;
            }
            booleanWrapper.f19895a = true;
            while (!list.isEmpty()) {
                try {
                    Object remove = list.remove(0);
                    if (remove != null) {
                        try {
                            Class<?> cls = remove.getClass();
                            List<Class<?>> a9 = a(cls);
                            int size = a9.size();
                            boolean z9 = false;
                            for (int i8 = 0; i8 < size; i8++) {
                                Class<?> cls2 = a9.get(i8);
                                synchronized (this) {
                                    copyOnWriteArrayList = this.f19879d.get(cls2);
                                }
                                if (copyOnWriteArrayList != null) {
                                    Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        a(it.next(), remove, z8);
                                    }
                                    z9 = true;
                                }
                            }
                            if (!z9) {
                                Log.d(TAG, "No subscripers registered for event " + cls);
                                if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                                    post(new NoSubscriberEvent(this, remove));
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    }
                } finally {
                    booleanWrapper.f19895a = false;
                }
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f19881f) {
            this.f19881f.put(obj.getClass(), obj);
        }
    }

    public final void register(Object obj) {
        a(obj, this.f19884i, false);
    }

    public final void registerSticky(Object obj) {
        a(obj, this.f19884i, true);
    }

    public final void release() {
        if (f19877b != null) {
            f19877b = null;
            f19876a = null;
            Map<Class<?>, List<Class<?>>> map = f19878c;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f19879d;
            if (map2 != null && map2.size() > 0) {
                this.f19879d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f19880e;
            if (map3 != null && map3.size() > 0) {
                this.f19880e.clear();
            }
            Map<Class<?>, Object> map4 = this.f19881f;
            if (map4 != null && map4.size() > 0) {
                this.f19881f.clear();
            }
            Map<String, Object> map5 = this.f19891p;
            if (map5 != null && map5.size() > 0) {
                this.f19891p.clear();
            }
        }
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object remove;
        synchronized (this.f19881f) {
            remove = this.f19881f.remove(cls);
        }
        return remove;
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length != 0) {
                List<Class<?>> list = this.f19880e.get(obj);
                if (list != null) {
                    for (Class<?> cls : clsArr) {
                        a(obj, cls);
                        list.remove(cls);
                    }
                    if (list.isEmpty()) {
                        this.f19880e.remove(obj);
                    }
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
                }
            } else {
                throw new IllegalArgumentException("Provide at least one event class");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void register(String str, Object obj) {
        Map<String, Object> map = this.f19891p;
        if (map != null && map.containsKey(str)) {
            unregister(this.f19891p.get(str));
        }
        this.f19891p.put(str, obj);
        a(obj, this.f19884i, false);
    }

    public final void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f19884i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f19881f) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f19881f.get(cls))) {
                    return false;
                }
                this.f19881f.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z8, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.f19888m.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f19908c) {
                    a(obj, subscriberMethod, z8);
                } else if (clsArr != null) {
                    int length = clsArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        if (clsArr[i8] == subscriberMethod.f19908c) {
                            a(obj, subscriberMethod, z8);
                            break;
                        }
                        i8++;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void register(Object obj, String str) {
        a(obj, str, false);
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f19884i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public final synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f19880e.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f19880e.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z8) {
        Object obj2;
        this.f19889n = true;
        Class<?> cls = subscriberMethod.f19908c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f19879d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f19879d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f19906a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> list = this.f19880e.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f19880e.put(obj, list);
        }
        list.add(cls);
        if (z8) {
            synchronized (this.f19881f) {
                obj2 = this.f19881f.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public final synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f19891p;
            if (map != null && map.containsKey(str)) {
                Object remove = this.f19891p.remove(str);
                List<Class<?>> list = this.f19880e.get(remove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(remove, it.next());
                    }
                    this.f19880e.remove(remove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + remove.getClass());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f19879d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i8 = 0;
            while (i8 < size) {
                if (copyOnWriteArrayList.get(i8).f19912a == obj) {
                    copyOnWriteArrayList.remove(i8);
                    i8--;
                    size--;
                }
                i8++;
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z8) {
        int i8 = AnonymousClass3.f19894a[subscription.f19913b.f19907b.ordinal()];
        if (i8 == 1) {
            a(subscription, obj);
            return;
        }
        if (i8 == 2) {
            if (z8) {
                a(subscription, obj);
                return;
            } else {
                this.f19885j.a(subscription, obj);
                return;
            }
        }
        if (i8 == 3) {
            if (z8) {
                this.f19886k.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i8 == 4) {
            this.f19887l.enqueue(subscription, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + subscription.f19913b.f19907b);
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f19878c;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        a(list, cls2.getInterfaces());
                    }
                    f19878c.put(cls, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(PendingPost pendingPost) {
        Object obj = pendingPost.f19901a;
        Subscription subscription = pendingPost.f19902b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    private void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f19913b.f19906a.invoke(subscription.f19912a, obj);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Unexpected exception", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f19912a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f19890o) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f19912a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f19912a));
        }
    }
}
