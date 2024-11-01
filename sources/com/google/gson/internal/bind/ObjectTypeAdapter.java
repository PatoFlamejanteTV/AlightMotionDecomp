package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c, reason: collision with root package name */
    private static final r f18844c = f(p.f19040a);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f18845a;

    /* renamed from: b, reason: collision with root package name */
    private final q f18846b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18848a;

        static {
            int[] iArr = new int[EnumC4003b.values().length];
            f18848a = iArr;
            try {
                iArr[EnumC4003b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18848a[EnumC4003b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18848a[EnumC4003b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18848a[EnumC4003b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18848a[EnumC4003b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18848a[EnumC4003b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static r e(q qVar) {
        if (qVar == p.f19040a) {
            return f18844c;
        }
        return f(qVar);
    }

    private static r f(final q qVar) {
        return new r() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.r
            public TypeAdapter a(Gson gson, TypeToken typeToken) {
                if (typeToken.c() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(gson, q.this);
            }
        };
    }

    private Object g(C4002a c4002a, EnumC4003b enumC4003b) {
        int i8 = a.f18848a[enumC4003b.ordinal()];
        if (i8 != 3) {
            if (i8 != 4) {
                if (i8 != 5) {
                    if (i8 == 6) {
                        c4002a.J();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + enumC4003b);
                }
                return Boolean.valueOf(c4002a.B());
            }
            return this.f18846b.a(c4002a);
        }
        return c4002a.L();
    }

    private Object h(C4002a c4002a, EnumC4003b enumC4003b) {
        int i8 = a.f18848a[enumC4003b.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return null;
            }
            c4002a.b();
            return new g();
        }
        c4002a.a();
        return new ArrayList();
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(C4002a c4002a) {
        String str;
        boolean z8;
        EnumC4003b N8 = c4002a.N();
        Object h8 = h(c4002a, N8);
        if (h8 == null) {
            return g(c4002a, N8);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c4002a.t()) {
                if (h8 instanceof Map) {
                    str = c4002a.H();
                } else {
                    str = null;
                }
                EnumC4003b N9 = c4002a.N();
                Object h9 = h(c4002a, N9);
                if (h9 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (h9 == null) {
                    h9 = g(c4002a, N9);
                }
                if (h8 instanceof List) {
                    ((List) h8).add(h9);
                } else {
                    ((Map) h8).put(str, h9);
                }
                if (z8) {
                    arrayDeque.addLast(h8);
                    h8 = h9;
                }
            } else {
                if (h8 instanceof List) {
                    c4002a.j();
                } else {
                    c4002a.k();
                }
                if (arrayDeque.isEmpty()) {
                    return h8;
                }
                h8 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.z();
            return;
        }
        TypeAdapter l8 = this.f18845a.l(obj.getClass());
        if (l8 instanceof ObjectTypeAdapter) {
            cVar.h();
            cVar.k();
        } else {
            l8.d(cVar, obj);
        }
    }

    private ObjectTypeAdapter(Gson gson, q qVar) {
        this.f18845a = gson;
        this.f18846b = qVar;
    }
}
