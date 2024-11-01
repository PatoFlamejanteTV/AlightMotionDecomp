package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import t1.C4002a;
import t1.c;

/* loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f19023b = new r() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Timestamp.class) {
                return null;
            }
            return new SqlTimestampTypeAdapter(gson.l(Date.class));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter f19024a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(C4002a c4002a) {
        Date date = (Date) this.f19024a.b(c4002a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Timestamp timestamp) {
        this.f19024a.d(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f19024a = typeAdapter;
    }
}
