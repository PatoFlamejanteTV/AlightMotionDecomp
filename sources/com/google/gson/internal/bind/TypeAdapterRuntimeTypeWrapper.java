package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import t1.C4002a;
import t1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f18884a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f18885b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f18886c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f18884a = gson;
        this.f18885b = typeAdapter;
        this.f18886c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    private static boolean f(TypeAdapter typeAdapter) {
        TypeAdapter e8;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (e8 = ((SerializationDelegatingTypeAdapter) typeAdapter).e()) != typeAdapter) {
            typeAdapter = e8;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C4002a c4002a) {
        return this.f18885b.b(c4002a);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        TypeAdapter typeAdapter = this.f18885b;
        Type e8 = e(this.f18886c, obj);
        if (e8 != this.f18886c) {
            typeAdapter = this.f18884a.k(TypeToken.b(e8));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !f(this.f18885b)) {
                typeAdapter = this.f18885b;
            }
        }
        typeAdapter.d(cVar, obj);
    }
}
