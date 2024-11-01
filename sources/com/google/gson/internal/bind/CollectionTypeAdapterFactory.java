package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import t1.C4002a;
import t1.EnumC4003b;

/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18824a;

    /* loaded from: classes4.dex */
    private static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f18825a;

        /* renamed from: b, reason: collision with root package name */
        private final h f18826b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, h hVar) {
            this.f18825a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f18826b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(C4002a c4002a) {
            if (c4002a.N() == EnumC4003b.NULL) {
                c4002a.J();
                return null;
            }
            Collection collection = (Collection) this.f18826b.a();
            c4002a.a();
            while (c4002a.t()) {
                collection.add(this.f18825a.b(c4002a));
            }
            c4002a.j();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(t1.c cVar, Collection collection) {
            if (collection == null) {
                cVar.z();
                return;
            }
            cVar.g();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f18825a.d(cVar, it.next());
            }
            cVar.j();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f18824a = cVar;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Collection.class.isAssignableFrom(c8)) {
            return null;
        }
        Type h8 = b.h(d8, c8);
        return new Adapter(gson, h8, gson.k(TypeToken.b(h8)), this.f18824a.b(typeToken));
    }
}
