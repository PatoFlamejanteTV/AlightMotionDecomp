package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3098r0 extends AbstractC3118v0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC3122w0 f33570c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f33571d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3098r0(EnumC3122w0 enumC3122w0, Predicate predicate) {
        super(enumC3122w0);
        this.f33570c = enumC3122w0;
        this.f33571d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z8;
        boolean z9;
        if (this.f33593a) {
            return;
        }
        boolean test = this.f33571d.test(obj);
        EnumC3122w0 enumC3122w0 = this.f33570c;
        z8 = enumC3122w0.f33602a;
        if (test == z8) {
            this.f33593a = true;
            z9 = enumC3122w0.f33603b;
            this.f33594b = z9;
        }
    }
}
