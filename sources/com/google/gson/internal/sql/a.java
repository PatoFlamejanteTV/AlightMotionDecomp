package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.r;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f19025a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f19026b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f19027c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f19028d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f19029e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f19030f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0388a extends DefaultDateTypeAdapter.a {
        C0388a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* loaded from: classes4.dex */
    class b extends DefaultDateTypeAdapter.a {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f19025a = z8;
        if (z8) {
            f19026b = new C0388a(Date.class);
            f19027c = new b(Timestamp.class);
            f19028d = SqlDateTypeAdapter.f19019b;
            f19029e = SqlTimeTypeAdapter.f19021b;
            f19030f = SqlTimestampTypeAdapter.f19023b;
            return;
        }
        f19026b = null;
        f19027c = null;
        f19028d = null;
        f19029e = null;
        f19030f = null;
    }
}
