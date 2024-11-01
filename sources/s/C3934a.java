package s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3934a extends AbstractC3937d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f38895a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f38896b;

    /* renamed from: c, reason: collision with root package name */
    private final f f38897c;

    /* renamed from: d, reason: collision with root package name */
    private final g f38898d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3934a(Integer num, Object obj, f fVar, g gVar, AbstractC3938e abstractC3938e) {
        this.f38895a = num;
        if (obj != null) {
            this.f38896b = obj;
            if (fVar != null) {
                this.f38897c = fVar;
                this.f38898d = gVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // s.AbstractC3937d
    public Integer a() {
        return this.f38895a;
    }

    @Override // s.AbstractC3937d
    public AbstractC3938e b() {
        return null;
    }

    @Override // s.AbstractC3937d
    public Object c() {
        return this.f38896b;
    }

    @Override // s.AbstractC3937d
    public f d() {
        return this.f38897c;
    }

    @Override // s.AbstractC3937d
    public g e() {
        return this.f38898d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3937d)) {
            return false;
        }
        AbstractC3937d abstractC3937d = (AbstractC3937d) obj;
        Integer num = this.f38895a;
        if (num != null ? num.equals(abstractC3937d.a()) : abstractC3937d.a() == null) {
            if (this.f38896b.equals(abstractC3937d.c()) && this.f38897c.equals(abstractC3937d.d()) && ((gVar = this.f38898d) != null ? gVar.equals(abstractC3937d.e()) : abstractC3937d.e() == null)) {
                abstractC3937d.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f38895a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f38896b.hashCode()) * 1000003) ^ this.f38897c.hashCode()) * 1000003;
        g gVar = this.f38898d;
        if (gVar != null) {
            i8 = gVar.hashCode();
        }
        return (hashCode2 ^ i8) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f38895a + ", payload=" + this.f38896b + ", priority=" + this.f38897c + ", productData=" + this.f38898d + ", eventContext=" + ((Object) null) + "}";
    }
}
