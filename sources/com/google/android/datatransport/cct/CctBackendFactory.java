package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import v.AbstractC4112h;
import v.InterfaceC4108d;
import v.InterfaceC4117m;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory implements InterfaceC4108d {
    @Override // v.InterfaceC4108d
    public InterfaceC4117m create(AbstractC4112h abstractC4112h) {
        return new d(abstractC4112h.b(), abstractC4112h.e(), abstractC4112h.d());
    }
}
