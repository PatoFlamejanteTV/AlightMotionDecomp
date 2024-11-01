package X3;

import android.content.Context;
import android.provider.Settings;
import e4.InterfaceC2820d;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class k implements InterfaceC2820d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11185a;

    public k(Context context) {
        AbstractC3292y.i(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        this.f11185a = applicationContext;
    }

    @Override // e4.InterfaceC2820d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j get() {
        String string = Settings.Secure.getString(this.f11185a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new j(string);
    }
}
