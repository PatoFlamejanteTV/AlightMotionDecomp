package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.l;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import t1.C4002a;
import t1.c;

/* loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    final Gson f18874a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeToken f18875b;

    /* renamed from: c, reason: collision with root package name */
    private final r f18876c;

    /* renamed from: d, reason: collision with root package name */
    private final b f18877d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18878e;

    /* renamed from: f, reason: collision with root package name */
    private volatile TypeAdapter f18879f;

    /* loaded from: classes4.dex */
    private static final class SingleTypeFactory implements r {

        /* renamed from: a, reason: collision with root package name */
        private final TypeToken f18880a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f18881b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f18882c;

        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            boolean isAssignableFrom;
            TypeToken typeToken2 = this.f18880a;
            if (typeToken2 != null) {
                if (!typeToken2.equals(typeToken) && (!this.f18881b || this.f18880a.d() != typeToken.c())) {
                    isAssignableFrom = false;
                } else {
                    isAssignableFrom = true;
                }
            } else {
                isAssignableFrom = this.f18882c.isAssignableFrom(typeToken.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(null, null, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    private final class b {
        private b() {
        }
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar, boolean z8) {
        this.f18877d = new b();
        this.f18874a = gson;
        this.f18875b = typeToken;
        this.f18876c = rVar;
        this.f18878e = z8;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f18879f;
        if (typeAdapter == null) {
            TypeAdapter m8 = this.f18874a.m(this.f18876c, this.f18875b);
            this.f18879f = m8;
            return m8;
        }
        return typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C4002a c4002a) {
        return f().b(c4002a);
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        f().d(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter e() {
        return f();
    }

    public TreeTypeAdapter(l lVar, e eVar, Gson gson, TypeToken typeToken, r rVar) {
        this(lVar, eVar, gson, typeToken, rVar, true);
    }
}
