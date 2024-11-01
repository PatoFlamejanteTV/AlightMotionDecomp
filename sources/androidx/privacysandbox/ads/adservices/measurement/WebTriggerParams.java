package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(33)
/* loaded from: classes3.dex */
public final class WebTriggerParams {
    private final boolean debugKeyAllowed;
    private final Uri registrationUri;

    public WebTriggerParams(Uri registrationUri, boolean z8) {
        AbstractC3292y.i(registrationUri, "registrationUri");
        this.registrationUri = registrationUri;
        this.debugKeyAllowed = z8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerParams)) {
            return false;
        }
        WebTriggerParams webTriggerParams = (WebTriggerParams) obj;
        if (AbstractC3292y.d(this.registrationUri, webTriggerParams.registrationUri) && this.debugKeyAllowed == webTriggerParams.debugKeyAllowed) {
            return true;
        }
        return false;
    }

    public final boolean getDebugKeyAllowed() {
        return this.debugKeyAllowed;
    }

    public final Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public int hashCode() {
        return (this.registrationUri.hashCode() * 31) + androidx.compose.foundation.a.a(this.debugKeyAllowed);
    }

    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.registrationUri + ", DebugKeyAllowed=" + this.debugKeyAllowed + " }";
    }
}
