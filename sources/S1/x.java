package S1;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class x extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9398d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f9399e = l.f9385a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(O1.i.f6966d);
        linkedHashSet.add(O1.i.f6967e);
        linkedHashSet.add(O1.i.f6968f);
        linkedHashSet.add(O1.i.f6969g);
        linkedHashSet.add(O1.i.f6970h);
        f9398d = DesugarCollections.unmodifiableSet(linkedHashSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x() {
        super(f9398d, l.f9385a);
    }

    @Override // S1.g, O1.o
    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    @Override // S1.g, O1.o
    public /* bridge */ /* synthetic */ Set f() {
        return super.f();
    }

    @Override // S1.g
    public /* bridge */ /* synthetic */ U1.c g() {
        return super.g();
    }
}
