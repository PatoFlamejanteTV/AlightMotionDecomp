package com.google.android.gms.common.api.internal;

import N.C1341d;
import P.C1378b;
import Q.AbstractC1394n;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final C1378b f16153a;

    /* renamed from: b, reason: collision with root package name */
    private final C1341d f16154b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(C1378b c1378b, C1341d c1341d, P.p pVar) {
        this.f16153a = c1378b;
        this.f16154b = c1341d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (AbstractC1394n.a(this.f16153a, oVar.f16153a) && AbstractC1394n.a(this.f16154b, oVar.f16154b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1394n.b(this.f16153a, this.f16154b);
    }

    public final String toString() {
        return AbstractC1394n.c(this).a(LeanbackPreferenceDialogFragment.ARG_KEY, this.f16153a).a("feature", this.f16154b).toString();
    }
}
