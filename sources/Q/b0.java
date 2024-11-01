package Q;

import N.C1339b;
import Q.AbstractC1383c;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import f0.HandlerC2840e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b0 extends HandlerC2840e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC1383c abstractC1383c, Looper looper) {
        super(looper);
        this.f8177b = abstractC1383c;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        if (i8 == 2 || i8 == 1 || i8 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1383c.a aVar;
        AbstractC1383c.a aVar2;
        C1339b c1339b;
        C1339b c1339b2;
        C1339b c1339b3;
        C1339b c1339b4;
        boolean z8;
        if (this.f8177b.f8182C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 != 1 && i8 != 7 && ((i8 != 4 || this.f8177b.t()) && message.what != 5)) || this.f8177b.f()) {
            int i9 = message.what;
            PendingIntent pendingIntent = null;
            if (i9 == 4) {
                this.f8177b.f8208z = new C1339b(message.arg2);
                if (AbstractC1383c.h0(this.f8177b)) {
                    AbstractC1383c abstractC1383c = this.f8177b;
                    z8 = abstractC1383c.f8180A;
                    if (!z8) {
                        abstractC1383c.i0(3, null);
                        return;
                    }
                }
                AbstractC1383c abstractC1383c2 = this.f8177b;
                c1339b3 = abstractC1383c2.f8208z;
                if (c1339b3 != null) {
                    c1339b4 = abstractC1383c2.f8208z;
                } else {
                    c1339b4 = new C1339b(8);
                }
                this.f8177b.f8198p.b(c1339b4);
                this.f8177b.L(c1339b4);
                return;
            }
            if (i9 == 5) {
                AbstractC1383c abstractC1383c3 = this.f8177b;
                c1339b = abstractC1383c3.f8208z;
                if (c1339b != null) {
                    c1339b2 = abstractC1383c3.f8208z;
                } else {
                    c1339b2 = new C1339b(8);
                }
                this.f8177b.f8198p.b(c1339b2);
                this.f8177b.L(c1339b2);
                return;
            }
            if (i9 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C1339b c1339b5 = new C1339b(message.arg2, pendingIntent);
                this.f8177b.f8198p.b(c1339b5);
                this.f8177b.L(c1339b5);
                return;
            }
            if (i9 == 6) {
                this.f8177b.i0(5, null);
                AbstractC1383c abstractC1383c4 = this.f8177b;
                aVar = abstractC1383c4.f8203u;
                if (aVar != null) {
                    aVar2 = abstractC1383c4.f8203u;
                    aVar2.h(message.arg2);
                }
                this.f8177b.M(message.arg2);
                AbstractC1383c.g0(this.f8177b, 5, 1, null);
                return;
            }
            if (i9 == 2 && !this.f8177b.h()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((c0) message.obj).c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        a(message);
    }
}
