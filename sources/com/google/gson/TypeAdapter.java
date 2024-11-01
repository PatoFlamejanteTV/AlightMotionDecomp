package com.google.gson;

import java.io.IOException;
import t1.C4002a;
import t1.EnumC4003b;

/* loaded from: classes4.dex */
public abstract class TypeAdapter {
    public final TypeAdapter a() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public Object b(C4002a c4002a) {
                if (c4002a.N() == EnumC4003b.NULL) {
                    c4002a.J();
                    return null;
                }
                return TypeAdapter.this.b(c4002a);
            }

            @Override // com.google.gson.TypeAdapter
            public void d(t1.c cVar, Object obj) {
                if (obj == null) {
                    cVar.z();
                } else {
                    TypeAdapter.this.d(cVar, obj);
                }
            }
        };
    }

    public abstract Object b(C4002a c4002a);

    public final f c(Object obj) {
        try {
            com.google.gson.internal.bind.a aVar = new com.google.gson.internal.bind.a();
            d(aVar, obj);
            return aVar.T();
        } catch (IOException e8) {
            throw new g(e8);
        }
    }

    public abstract void d(t1.c cVar, Object obj);
}
