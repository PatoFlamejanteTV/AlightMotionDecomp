package b0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1958a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f14889a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14890b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1958a(IBinder iBinder, String str) {
        this.f14889a = iBinder;
        this.f14890b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14889a;
    }
}
