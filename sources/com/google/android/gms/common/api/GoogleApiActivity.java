package com.google.android.gms.common.api;

import N.C1339b;
import N.C1344g;
import Q.AbstractC1396p;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C2085c;

@KeepName
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected int f16056a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i8, boolean z8) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i8);
        intent.putExtra("notify_manager", z8);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f16056a = 1;
                return;
            } catch (ActivityNotFoundException e8) {
                if (extras.getBoolean("notify_manager", true)) {
                    C2085c.u(this).D(new C1339b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", str, e8);
                }
                this.f16056a = 1;
                finish();
                return;
            } catch (IntentSender.SendIntentException e9) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e9);
                finish();
                return;
            }
        }
        C1344g.n().o(this, ((Integer) AbstractC1396p.l(num)).intValue(), 2, this);
        this.f16056a = 1;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f16056a = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                C2085c u8 = C2085c.u(this);
                if (i9 != -1) {
                    if (i9 == 0) {
                        u8.D(new C1339b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    u8.E();
                }
            }
        } else if (i8 == 2) {
            this.f16056a = 0;
            setResult(i9, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16056a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16056a = bundle.getInt("resolution");
        }
        if (this.f16056a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f16056a);
        super.onSaveInstanceState(bundle);
    }
}
