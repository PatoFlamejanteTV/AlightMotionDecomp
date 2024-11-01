package J;

import O.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Status f3827a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f3828b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f3828b = googleSignInAccount;
        this.f3827a = status;
    }

    public GoogleSignInAccount a() {
        return this.f3828b;
    }

    @Override // O.j
    public Status getStatus() {
        return this.f3827a;
    }
}
