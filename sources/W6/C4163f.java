package w6;

import U5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s6.AbstractC3977C;
import s6.C3980F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4163f extends AbstractC3977C {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f40780e;

    public C4163f(long j8, C4163f c4163f, int i8) {
        super(j8, c4163f, i8);
        int i9;
        i9 = AbstractC4162e.f40779f;
        this.f40780e = new AtomicReferenceArray(i9);
    }

    @Override // s6.AbstractC3977C
    public int n() {
        int i8;
        i8 = AbstractC4162e.f40779f;
        return i8;
    }

    @Override // s6.AbstractC3977C
    public void o(int i8, Throwable th, g gVar) {
        C3980F c3980f;
        c3980f = AbstractC4162e.f40778e;
        r().set(i8, c3980f);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f40780e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f39163c + ", hashCode=" + hashCode() + ']';
    }
}
