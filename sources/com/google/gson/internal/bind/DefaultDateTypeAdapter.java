package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.m;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import r1.AbstractC3885a;
import t1.C4002a;
import t1.EnumC4003b;
import t1.c;

/* loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final a f18829a;

    /* renamed from: b, reason: collision with root package name */
    private final List f18830b;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18831b = new C0384a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f18832a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0384a extends a {
            C0384a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected Date a(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Class cls) {
            this.f18832a = cls;
        }

        protected abstract Date a(Date date);
    }

    private Date e(C4002a c4002a) {
        String L8 = c4002a.L();
        synchronized (this.f18830b) {
            try {
                Iterator it = this.f18830b.iterator();
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
        return this.f18829a.a(e(c4002a));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.z();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f18830b.get(0);
        synchronized (this.f18830b) {
            format = dateFormat.format(date);
        }
        cVar.Q(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f18830b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
