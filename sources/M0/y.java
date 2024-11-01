package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class y extends F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List f5904a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List f5905a;

        @Override // M0.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f5905a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // M0.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list != null) {
                this.f5905a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    @Override // M0.F.e.d.f
    public List b() {
        return this.f5904a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f5904a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5904a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f5904a + "}";
    }

    private y(List list) {
        this.f5904a = list;
    }
}
