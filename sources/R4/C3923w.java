package r4;

/* renamed from: r4.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3923w implements I {
    @Override // r4.I
    public boolean invoke() {
        try {
            Class.forName("com.google.android.libraries.places.api.Places");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
