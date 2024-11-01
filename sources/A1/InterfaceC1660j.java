package a1;

/* renamed from: a1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1660j {

    /* renamed from: a1.j$a */
    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f14057a;

        a(int i8) {
            this.f14057a = i8;
        }

        public int b() {
            return this.f14057a;
        }
    }

    a b(String str);
}
