package K;

import O.a;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k extends n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(O.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2084b
    protected final /* bridge */ /* synthetic */ void k(a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.D()).s0(new j(this), iVar.m0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ O.j c(Status status) {
        return status;
    }
}
