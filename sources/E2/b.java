package E2;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Application a(CreationExtras creationExtras) {
        AbstractC3292y.i(creationExtras, "<this>");
        Object obj = creationExtras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        if (obj != null) {
            return (Application) obj;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
