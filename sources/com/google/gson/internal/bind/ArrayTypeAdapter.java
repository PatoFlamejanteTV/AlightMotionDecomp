package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static final r f18821c = new r() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            Type d8 = typeToken.d();
            if (!(d8 instanceof GenericArrayType) && (!(d8 instanceof Class) || !((Class) d8).isArray())) {
                return null;
            }
            Type g8 = b.g(d8);
            return new ArrayTypeAdapter(gson, gson.k(TypeToken.b(g8)), b.k(g8));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Class f18822a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter f18823b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f18823b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f18822a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public Object b(C4002a c4002a) {
        if (c4002a.N() == EnumC4003b.NULL) {
            c4002a.J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c4002a.a();
        while (c4002a.t()) {
            arrayList.add(this.f18823b.b(c4002a));
        }
        c4002a.j();
        int size = arrayList.size();
        if (this.f18822a.isPrimitive()) {
            Object newInstance = Array.newInstance((Class<?>) this.f18822a, size);
            for (int i8 = 0; i8 < size; i8++) {
                Array.set(newInstance, i8, arrayList.get(i8));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f18822a, size));
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.z();
            return;
        }
        cVar.g();
        int length = Array.getLength(obj);
        for (int i8 = 0; i8 < length; i8++) {
            this.f18823b.d(cVar, Array.get(obj, i8));
        }
        cVar.j();
    }
}
