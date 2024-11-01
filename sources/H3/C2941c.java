package h3;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.BankAccount;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2941c implements A2.a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32573b = new a(null);

    /* renamed from: h3.c$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // A2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BankAccount a(JSONObject json) {
        AbstractC3292y.i(json, "json");
        return new BankAccount(z2.e.l(json, "id"), z2.e.l(json, "account_holder_name"), BankAccount.Type.f25221b.a(z2.e.l(json, "account_holder_type")), z2.e.l(json, "bank_name"), z2.e.f41477a.g(json, "country"), z2.e.h(json, "currency"), z2.e.l(json, "fingerprint"), z2.e.l(json, "last4"), z2.e.l(json, "routing_number"), BankAccount.Status.f25212b.a(z2.e.l(json, NotificationCompat.CATEGORY_STATUS)));
    }
}
