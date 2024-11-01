package com.google.firebase.sessions;

import A0.n;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import m1.I;
import m1.y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final b f18747f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final I f18748a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f18749b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18750c;

    /* renamed from: d, reason: collision with root package name */
    private int f18751d;

    /* renamed from: e, reason: collision with root package name */
    private y f18752e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3289v implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18753a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final c a() {
            Object j8 = n.a(A0.c.f72a).j(c.class);
            AbstractC3292y.h(j8, "Firebase.app[SessionGenerator::class.java]");
            return (c) j8;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public c(I timeProvider, Function0 uuidGenerator) {
        AbstractC3292y.i(timeProvider, "timeProvider");
        AbstractC3292y.i(uuidGenerator, "uuidGenerator");
        this.f18748a = timeProvider;
        this.f18749b = uuidGenerator;
        this.f18750c = b();
        this.f18751d = -1;
    }

    private final String b() {
        String uuid = ((UUID) this.f18749b.invoke()).toString();
        AbstractC3292y.h(uuid, "uuidGenerator().toString()");
        String lowerCase = l6.n.z(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        String b9;
        int i8 = this.f18751d + 1;
        this.f18751d = i8;
        if (i8 == 0) {
            b9 = this.f18750c;
        } else {
            b9 = b();
        }
        this.f18752e = new y(b9, this.f18750c, this.f18751d, this.f18748a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f18752e;
        if (yVar != null) {
            return yVar;
        }
        AbstractC3292y.y("currentSession");
        return null;
    }

    public /* synthetic */ c(I i8, Function0 function0, int i9, AbstractC3284p abstractC3284p) {
        this(i8, (i9 & 2) != 0 ? a.f18753a : function0);
    }
}
