package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q1.InterfaceC3630a;
import t1.C4002a;

/* loaded from: classes4.dex */
public final class Excluder implements r, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Excluder f18801g = new Excluder();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18805d;

    /* renamed from: a, reason: collision with root package name */
    private double f18802a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f18803b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18804c = true;

    /* renamed from: e, reason: collision with root package name */
    private List f18806e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List f18807f = Collections.emptyList();

    private boolean d(Class cls) {
        if (this.f18802a != -1.0d && !l((q1.d) cls.getAnnotation(q1.d.class), (q1.e) cls.getAnnotation(q1.e.class))) {
            return true;
        }
        if (!this.f18804c && h(cls)) {
            return true;
        }
        return g(cls);
    }

    private boolean e(Class cls, boolean z8) {
        List list;
        if (z8) {
            list = this.f18806e;
        } else {
            list = this.f18807f;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    private boolean g(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && !i(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean h(Class cls) {
        if (cls.isMemberClass() && !i(cls)) {
            return true;
        }
        return false;
    }

    private boolean i(Class cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean j(q1.d dVar) {
        if (dVar == null) {
            return true;
        }
        if (this.f18802a >= dVar.value()) {
            return true;
        }
        return false;
    }

    private boolean k(q1.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (this.f18802a < eVar.value()) {
            return true;
        }
        return false;
    }

    private boolean l(q1.d dVar, q1.e eVar) {
        if (j(dVar) && k(eVar)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(final Gson gson, final TypeToken typeToken) {
        final boolean z8;
        final boolean z9;
        Class c8 = typeToken.c();
        boolean d8 = d(c8);
        if (!d8 && !e(c8, true)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!d8 && !e(c8, false)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z8 && !z9) {
            return null;
        }
        return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: a, reason: collision with root package name */
            private TypeAdapter f18808a;

            private TypeAdapter e() {
                TypeAdapter typeAdapter = this.f18808a;
                if (typeAdapter == null) {
                    TypeAdapter m8 = gson.m(Excluder.this, typeToken);
                    this.f18808a = m8;
                    return m8;
                }
                return typeAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            public Object b(C4002a c4002a) {
                if (z9) {
                    c4002a.X();
                    return null;
                }
                return e().b(c4002a);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(t1.c cVar, Object obj) {
                if (z8) {
                    cVar.z();
                } else {
                    e().d(cVar, obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public boolean c(Class cls, boolean z8) {
        if (!d(cls) && !e(cls, z8)) {
            return false;
        }
        return true;
    }

    public boolean f(Field field, boolean z8) {
        List list;
        InterfaceC3630a interfaceC3630a;
        if ((this.f18803b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f18802a != -1.0d && !l((q1.d) field.getAnnotation(q1.d.class), (q1.e) field.getAnnotation(q1.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f18805d && ((interfaceC3630a = (InterfaceC3630a) field.getAnnotation(InterfaceC3630a.class)) == null || (!z8 ? !interfaceC3630a.deserialize() : !interfaceC3630a.serialize()))) {
            return true;
        }
        if ((!this.f18804c && h(field.getType())) || g(field.getType())) {
            return true;
        }
        if (z8) {
            list = this.f18806e;
        } else {
            list = this.f18807f;
        }
        if (!list.isEmpty()) {
            new com.google.gson.a(field);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(it.next());
                throw null;
            }
            return false;
        }
        return false;
    }
}
