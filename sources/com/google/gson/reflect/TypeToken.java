package com.google.gson.reflect;

import com.google.gson.internal.b;
import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class TypeToken<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class f19045a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f19046b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19047c;

    /* JADX INFO: Access modifiers changed from: protected */
    public TypeToken() {
        Type e8 = e();
        this.f19046b = e8;
        this.f19045a = b.k(e8);
        this.f19047c = e8.hashCode();
    }

    public static TypeToken a(Class cls) {
        return new TypeToken(cls);
    }

    public static TypeToken b(Type type) {
        return new TypeToken(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                return b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class c() {
        return this.f19045a;
    }

    public final Type d() {
        return this.f19046b;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && b.f(this.f19046b, ((TypeToken) obj).f19046b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19047c;
    }

    public final String toString() {
        return b.t(this.f19046b);
    }

    private TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type b9 = b.b(type);
        this.f19046b = b9;
        this.f19045a = b.k(b9);
        this.f19047c = b9.hashCode();
    }
}
