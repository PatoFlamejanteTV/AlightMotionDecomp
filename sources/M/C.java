package M;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* loaded from: classes3.dex */
final class C extends A {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C(int i8, int i9, Bundle bundle) {
        super(i8, i9, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M.A
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(DataSchemeDataSource.SCHEME_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M.A
    public final boolean b() {
        return false;
    }
}
