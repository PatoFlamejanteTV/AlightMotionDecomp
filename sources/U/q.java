package u;

import java.util.Set;
import s.C3936c;

/* loaded from: classes3.dex */
final class q implements s.j {

    /* renamed from: a, reason: collision with root package name */
    private final Set f40134a;

    /* renamed from: b, reason: collision with root package name */
    private final p f40135b;

    /* renamed from: c, reason: collision with root package name */
    private final t f40136c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Set set, p pVar, t tVar) {
        this.f40134a = set;
        this.f40135b = pVar;
        this.f40136c = tVar;
    }

    @Override // s.j
    public s.i a(String str, Class cls, C3936c c3936c, s.h hVar) {
        if (this.f40134a.contains(c3936c)) {
            return new s(this.f40135b, str, c3936c, hVar, this.f40136c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3936c, this.f40134a));
    }
}
