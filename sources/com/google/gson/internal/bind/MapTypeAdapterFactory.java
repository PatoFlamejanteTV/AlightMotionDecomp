package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.l;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import t1.C4002a;
import t1.EnumC4003b;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18834a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f18835b;

    /* loaded from: classes4.dex */
    private final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f18836a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter f18837b;

        /* renamed from: c, reason: collision with root package name */
        private final h f18838c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, h hVar) {
            this.f18836a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f18837b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f18838c = hVar;
        }

        private String e(f fVar) {
            if (fVar.l()) {
                k e8 = fVar.e();
                if (e8.s()) {
                    return String.valueOf(e8.n());
                }
                if (e8.q()) {
                    return Boolean.toString(e8.m());
                }
                if (e8.t()) {
                    return e8.o();
                }
                throw new AssertionError();
            }
            if (fVar.j()) {
                return "null";
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(C4002a c4002a) {
            EnumC4003b N8 = c4002a.N();
            if (N8 == EnumC4003b.NULL) {
                c4002a.J();
                return null;
            }
            Map map = (Map) this.f18838c.a();
            if (N8 == EnumC4003b.BEGIN_ARRAY) {
                c4002a.a();
                while (c4002a.t()) {
                    c4002a.a();
                    Object b9 = this.f18836a.b(c4002a);
                    if (map.put(b9, this.f18837b.b(c4002a)) == null) {
                        c4002a.j();
                    } else {
                        throw new m("duplicate key: " + b9);
                    }
                }
                c4002a.j();
            } else {
                c4002a.b();
                while (c4002a.t()) {
                    e.f18979a.a(c4002a);
                    Object b10 = this.f18836a.b(c4002a);
                    if (map.put(b10, this.f18837b.b(c4002a)) != null) {
                        throw new m("duplicate key: " + b10);
                    }
                }
                c4002a.k();
            }
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(t1.c cVar, Map map) {
            boolean z8;
            if (map == null) {
                cVar.z();
                return;
            }
            if (!MapTypeAdapterFactory.this.f18835b) {
                cVar.h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.u(String.valueOf(entry.getKey()));
                    this.f18837b.d(cVar, entry.getValue());
                }
                cVar.k();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z9 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                f c8 = this.f18836a.c(entry2.getKey());
                arrayList.add(c8);
                arrayList2.add(entry2.getValue());
                if (!c8.g() && !c8.k()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z9 |= z8;
            }
            if (z9) {
                cVar.g();
                int size = arrayList.size();
                while (i8 < size) {
                    cVar.g();
                    l.a((f) arrayList.get(i8), cVar);
                    this.f18837b.d(cVar, arrayList2.get(i8));
                    cVar.j();
                    i8++;
                }
                cVar.j();
                return;
            }
            cVar.h();
            int size2 = arrayList.size();
            while (i8 < size2) {
                cVar.u(e((f) arrayList.get(i8)));
                this.f18837b.d(cVar, arrayList2.get(i8));
                i8++;
            }
            cVar.k();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z8) {
        this.f18834a = cVar;
        this.f18835b = z8;
    }

    private TypeAdapter b(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.k(TypeToken.b(type));
        }
        return TypeAdapters.f18916f;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Map.class.isAssignableFrom(c8)) {
            return null;
        }
        Type[] j8 = b.j(d8, c8);
        return new Adapter(gson, j8[0], b(gson, j8[0]), j8[1], gson.k(TypeToken.b(j8[1])), this.f18834a.b(typeToken));
    }
}
