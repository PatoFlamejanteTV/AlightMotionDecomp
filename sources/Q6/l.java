package Q6;

import U6.InterfaceC1451g;
import java.util.List;

/* loaded from: classes5.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f9003a = new a();

    void a(int i8, b bVar);

    boolean b(int i8, InterfaceC1451g interfaceC1451g, int i9, boolean z8);

    boolean onHeaders(int i8, List list, boolean z8);

    boolean onRequest(int i8, List list);

    /* loaded from: classes5.dex */
    final class a implements l {
        a() {
        }

        @Override // Q6.l
        public boolean b(int i8, InterfaceC1451g interfaceC1451g, int i9, boolean z8) {
            interfaceC1451g.skip(i9);
            return true;
        }

        @Override // Q6.l
        public boolean onHeaders(int i8, List list, boolean z8) {
            return true;
        }

        @Override // Q6.l
        public boolean onRequest(int i8, List list) {
            return true;
        }

        @Override // Q6.l
        public void a(int i8, b bVar) {
        }
    }
}
