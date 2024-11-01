package x0;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4194q extends AbstractC4182e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final transient AbstractC4193p f40917a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f40918b;

    /* renamed from: x0.q$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f40919a = H.c();

        /* renamed from: b, reason: collision with root package name */
        Comparator f40920b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f40921c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4194q(AbstractC4193p abstractC4193p, int i8) {
        this.f40917a = abstractC4193p;
        this.f40918b = i8;
    }

    @Override // x0.AbstractC4181d
    public boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // x0.AbstractC4181d, x0.InterfaceC4172A
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC4193p a() {
        return this.f40917a;
    }

    @Override // x0.AbstractC4181d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // x0.AbstractC4181d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // x0.AbstractC4181d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
