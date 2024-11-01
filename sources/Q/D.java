package Q;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class D implements DialogInterface.OnClickListener {
    public static D b(Activity activity, Intent intent, int i8) {
        return new B(intent, activity, i8);
    }

    public static D c(P.e eVar, Intent intent, int i8) {
        return new C(intent, eVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e8) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e8);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
