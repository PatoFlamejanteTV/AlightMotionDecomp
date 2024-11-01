package com.google.firebase.messaging;

import M.C1323a;
import M.C1325c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class FirebaseMessagingService extends AbstractServiceC2577i {

    /* renamed from: g, reason: collision with root package name */
    private static final Queue f18549g = new ArrayDeque(10);

    /* renamed from: f, reason: collision with root package name */
    private C1325c f18550f;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f18549g;
        if (queue.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J.t(extras)) {
            J j8 = new J(extras);
            ExecutorService e8 = AbstractC2583o.e();
            try {
                if (new C2574f(this, j8, e8).a()) {
                    return;
                }
                e8.shutdown();
                if (H.D(intent)) {
                    H.w(intent);
                }
            } finally {
                e8.shutdown();
            }
        }
        r(new S(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private C1325c o(Context context) {
        if (this.f18550f == null) {
            this.f18550f = new C1325c(context.getApplicationContext());
        }
        return this.f18550f;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new C1323a(intent));
    }

    private void v(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c8 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c8 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c8 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c8 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c8 = 3;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                q();
                return;
            case 1:
                H.y(intent);
                m(intent);
                return;
            case 2:
                u(n(intent), new W(intent.getStringExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR)));
                return;
            case 3:
                s(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2577i
    protected Intent e(Intent intent) {
        return X.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC2577i
    public void f(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                t(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        p(intent);
    }

    public void q() {
    }

    public void r(S s8) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }
}
