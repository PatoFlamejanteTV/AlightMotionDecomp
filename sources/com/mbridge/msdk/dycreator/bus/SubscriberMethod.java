package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f19906a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f19907b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f19908c;

    /* renamed from: d, reason: collision with root package name */
    String f19909d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f19906a = method;
        this.f19907b = threadMode;
        this.f19908c = cls;
    }

    private synchronized void a() {
        if (this.f19909d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f19906a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f19906a.getName());
            sb.append('(');
            sb.append(this.f19908c.getName());
            this.f19909d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            a();
            return this.f19909d.equals(((SubscriberMethod) obj).f19909d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19906a.hashCode();
    }
}
