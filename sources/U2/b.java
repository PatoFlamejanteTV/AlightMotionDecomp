package U2;

import U5.g;
import j3.m;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import p3.i;
import z5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f10070a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f10071b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f10072c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f10073d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f10074e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f10075f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f10076g;

    public b(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        this.f10070a = aVar;
        this.f10071b = aVar2;
        this.f10072c = aVar3;
        this.f10073d = aVar4;
        this.f10074e = aVar5;
        this.f10075f = aVar6;
        this.f10076g = aVar7;
    }

    public static b a(N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static a c(Function0 function0, Function0 function02, m mVar, T3.a aVar, g gVar, Locale locale, i iVar) {
        return new a(function0, function02, mVar, aVar, gVar, locale, iVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Function0) this.f10070a.get(), (Function0) this.f10071b.get(), (m) this.f10072c.get(), (T3.a) this.f10073d.get(), (g) this.f10074e.get(), (Locale) this.f10075f.get(), (i) this.f10076g.get());
    }
}
