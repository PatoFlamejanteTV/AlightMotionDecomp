package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r1.AbstractC3885a;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
public final class DateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final r f18827b = new r() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f18828a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f18828a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private Date e(C4002a c4002a) {
        String L8 = c4002a.L();
        synchronized (this.f18828a) {
            try {
                Iterator it = this.f18828a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(L8);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return AbstractC3885a.c(L8, new ParsePosition(0));
                } catch (ParseException e8) {
                    throw new m("Failed parsing '" + L8 + "' as Date; at path " + c4002a.r(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(C4002a c4002a) {
        if (c4002a.N() == EnumC4003b.NULL) {
            c4002a.J();
            return null;
        }
        return e(c4002a);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f18828a.get(0);
        synchronized (this.f18828a) {
            format = dateFormat.format(date);
        }
        cVar.Q(format);
    }
}
