package M;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class z extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(int i8, int i9, Bundle bundle) {
        super(i8, i9, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M.A
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new B(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M.A
    public final boolean b() {
        return true;
    }
}
