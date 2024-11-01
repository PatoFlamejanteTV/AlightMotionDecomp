package O;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes3.dex */
final class m extends BasePendingResult {

    /* renamed from: n, reason: collision with root package name */
    private final j f6925n;

    public m(f fVar, j jVar) {
        super(fVar);
        this.f6925n = jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final j c(Status status) {
        return this.f6925n;
    }
}
