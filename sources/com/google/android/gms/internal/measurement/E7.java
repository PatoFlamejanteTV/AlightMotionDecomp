package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* loaded from: classes3.dex */
public final class E7 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private final I7 f16291c;

    public E7(I7 i72) {
        super("internal.logger");
        this.f16291c = i72;
        this.f16888b.put("log", new H7(this, false, true));
        this.f16888b.put(NotificationCompat.GROUP_KEY_SILENT, new w7(this, NotificationCompat.GROUP_KEY_SILENT));
        ((AbstractC2204n) this.f16888b.get(NotificationCompat.GROUP_KEY_SILENT)).j("log", new H7(this, true, true));
        this.f16888b.put("unmonitored", new G7(this, "unmonitored"));
        ((AbstractC2204n) this.f16888b.get("unmonitored")).j("log", new H7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        return InterfaceC2243s.f16971b0;
    }
}
