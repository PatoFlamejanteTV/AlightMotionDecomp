package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(33)
/* loaded from: classes3.dex */
public final class WebSourceRegistrationRequest {
    private final Uri appDestination;
    private final InputEvent inputEvent;
    private final Uri topOriginUri;
    private final Uri verifiedDestination;
    private final Uri webDestination;
    private final List<WebSourceParams> webSourceParams;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Uri appDestination;
        private InputEvent inputEvent;
        private final Uri topOriginUri;
        private Uri verifiedDestination;
        private Uri webDestination;
        private final List<WebSourceParams> webSourceParams;

        public Builder(List<WebSourceParams> webSourceParams, Uri topOriginUri) {
            AbstractC3292y.i(webSourceParams, "webSourceParams");
            AbstractC3292y.i(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        public final WebSourceRegistrationRequest build() {
            return new WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }

        public final Builder setAppDestination(Uri uri) {
            this.appDestination = uri;
            return this;
        }

        public final Builder setInputEvent(InputEvent inputEvent) {
            AbstractC3292y.i(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        public final Builder setVerifiedDestination(Uri uri) {
            this.verifiedDestination = uri;
            return this;
        }

        public final Builder setWebDestination(Uri uri) {
            this.webDestination = uri;
            return this;
        }
    }

    public WebSourceRegistrationRequest(List<WebSourceParams> webSourceParams, Uri topOriginUri, InputEvent inputEvent, Uri uri, Uri uri2, Uri uri3) {
        AbstractC3292y.i(webSourceParams, "webSourceParams");
        AbstractC3292y.i(topOriginUri, "topOriginUri");
        this.webSourceParams = webSourceParams;
        this.topOriginUri = topOriginUri;
        this.inputEvent = inputEvent;
        this.appDestination = uri;
        this.webDestination = uri2;
        this.verifiedDestination = uri3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) obj;
        if (AbstractC3292y.d(this.webSourceParams, webSourceRegistrationRequest.webSourceParams) && AbstractC3292y.d(this.webDestination, webSourceRegistrationRequest.webDestination) && AbstractC3292y.d(this.appDestination, webSourceRegistrationRequest.appDestination) && AbstractC3292y.d(this.topOriginUri, webSourceRegistrationRequest.topOriginUri) && AbstractC3292y.d(this.inputEvent, webSourceRegistrationRequest.inputEvent) && AbstractC3292y.d(this.verifiedDestination, webSourceRegistrationRequest.verifiedDestination)) {
            return true;
        }
        return false;
    }

    public final Uri getAppDestination() {
        return this.appDestination;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    public final Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    public final Uri getWebDestination() {
        return this.webDestination;
    }

    public final List<WebSourceParams> getWebSourceParams() {
        return this.webSourceParams;
    }

    public int hashCode() {
        int hashCode = (this.webSourceParams.hashCode() * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.appDestination;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.webDestination;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.verifiedDestination;
        if (uri3 != null) {
            return (hashCode2 * 31) + uri3.hashCode();
        }
        return hashCode2;
    }

    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.webSourceParams + "], TopOriginUri=" + this.topOriginUri + ", InputEvent=" + this.inputEvent + ", AppDestination=" + this.appDestination + ", WebDestination=" + this.webDestination + ", VerifiedDestination=" + this.verifiedDestination) + " }";
    }

    public /* synthetic */ WebSourceRegistrationRequest(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i8, AbstractC3284p abstractC3284p) {
        this(list, uri, (i8 & 4) != 0 ? null : inputEvent, (i8 & 8) != 0 ? null : uri2, (i8 & 16) != 0 ? null : uri3, (i8 & 32) != 0 ? null : uri4);
    }
}
