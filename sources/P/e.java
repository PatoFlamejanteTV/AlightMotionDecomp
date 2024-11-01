package P;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
public interface e {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback c(String str, Class cls);

    Activity d();

    void startActivityForResult(Intent intent, int i8);
}
