package t3;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4005a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4005a f39466a = new C4005a();

    private C4005a() {
    }

    @Override // t3.d
    public boolean invoke() {
        try {
            Class.forName("com.stripe.android.financialconnections.FinancialConnectionsSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
