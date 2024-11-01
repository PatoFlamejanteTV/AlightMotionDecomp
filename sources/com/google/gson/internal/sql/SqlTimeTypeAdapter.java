package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    static final r f19021b = new r() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() != Time.class) {
                return null;
            }
            return new SqlTimeTypeAdapter();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f19022a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(C4002a c4002a) {
        Time time;
        if (c4002a.N() == EnumC4003b.NULL) {
            c4002a.J();
            return null;
        }
        String L8 = c4002a.L();
        try {
            synchronized (this) {
                time = new Time(this.f19022a.parse(L8).getTime());
            }
            return time;
        } catch (ParseException e8) {
            throw new m("Failed parsing '" + L8 + "' as SQL Time; at path " + c4002a.r(), e8);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.z();
            return;
        }
        synchronized (this) {
            format = this.f19022a.format((Date) time);
        }
        cVar.Q(format);
    }

    private SqlTimeTypeAdapter() {
        this.f19022a = new SimpleDateFormat("hh:mm:ss a");
    }
}
