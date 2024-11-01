package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.r f32915a;

    /* renamed from: b, reason: collision with root package name */
    private final v f32916b;

    /* renamed from: c, reason: collision with root package name */
    private final b f32917c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f32918d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j$.time.temporal.r rVar, v vVar, b bVar) {
        this.f32915a = rVar;
        this.f32916b = vVar;
        this.f32917c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(this.f32915a);
        if (e8 == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.d().u(j$.time.temporal.n.e());
        String c8 = (mVar == null || mVar == j$.time.chrono.t.f32869d) ? this.f32917c.c(this.f32915a, e8.longValue(), this.f32916b, pVar.c()) : this.f32917c.b(mVar, this.f32915a, e8.longValue(), this.f32916b, pVar.c());
        if (c8 != null) {
            sb.append(c8);
            return true;
        }
        if (this.f32918d == null) {
            this.f32918d = new i(this.f32915a, 1, 19, u.NORMAL);
        }
        return this.f32918d.j(pVar, sb);
    }

    public final String toString() {
        StringBuilder sb;
        v vVar = v.FULL;
        j$.time.temporal.r rVar = this.f32915a;
        v vVar2 = this.f32916b;
        if (vVar2 == vVar) {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
            sb.append(",");
            sb.append(vVar2);
        }
        sb.append(")");
        return sb.toString();
    }
}
