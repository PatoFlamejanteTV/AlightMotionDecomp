package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", f = "AdSelectionManager.kt", l = {92}, m = "selectAds")
/* loaded from: classes3.dex */
public final class AdSelectionManager$Api33Ext4Impl$selectAds$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManager.Api33Ext4Impl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManager$Api33Ext4Impl$selectAds$1(AdSelectionManager.Api33Ext4Impl api33Ext4Impl, U5.d dVar) {
        super(dVar);
        this.this$0 = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.selectAds(null, this);
    }
}
