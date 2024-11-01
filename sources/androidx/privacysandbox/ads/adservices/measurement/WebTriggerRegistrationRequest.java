package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(33)
/* loaded from: classes3.dex */
public final class WebTriggerRegistrationRequest {
    private final Uri destination;
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(List<WebTriggerParams> webTriggerParams, Uri destination) {
        AbstractC3292y.i(webTriggerParams, "webTriggerParams");
        AbstractC3292y.i(destination, "destination");
        this.webTriggerParams = webTriggerParams;
        this.destination = destination;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        if (AbstractC3292y.d(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && AbstractC3292y.d(this.destination, webTriggerRegistrationRequest.destination)) {
            return true;
        }
        return false;
    }

    public final Uri getDestination() {
        return this.destination;
    }

    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return (this.webTriggerParams.hashCode() * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
