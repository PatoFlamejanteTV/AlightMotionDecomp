package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f19019b = new r() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Date.class) {
                return null;
            }
            return new SqlDateTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f19020a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(C4002a c4002a) {
        java.util.Date parse;
        if (c4002a.N() == EnumC4003b.NULL) {
            c4002a.J();
            return null;
        }
        String L8 = c4002a.L();
        try {
            synchronized (this) {
                parse = this.f19020a.parse(L8);
            }
            return new Date(parse.getTime());
        } catch (ParseException e8) {
            throw new m("Failed parsing '" + L8 + "' as SQL Date; at path " + c4002a.r(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.z();
            return;
        }
        synchronized (this) {
            format = this.f19020a.format((java.util.Date) date);
        }
        cVar.Q(format);
    }

    private SqlDateTypeAdapter() {
        this.f19020a = new SimpleDateFormat("MMM d, yyyy");
    }
}
