package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.j;

/* loaded from: classes3.dex */
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Builder fromAction(String action) {
                AbstractC3292y.i(action, "action");
                if (action.length() > 0) {
                    Builder builder = new Builder(null);
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }

            public final Builder fromMimeType(String mimeType) {
                AbstractC3292y.i(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            public final Builder fromUri(Uri uri) {
                AbstractC3292y.i(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        private Builder() {
        }

        public static final Builder fromAction(String str) {
            return Companion.fromAction(str);
        }

        public static final Builder fromMimeType(String str) {
            return Companion.fromMimeType(str);
        }

        public static final Builder fromUri(Uri uri) {
            return Companion.fromUri(uri);
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        public final Builder setAction(String action) {
            AbstractC3292y.i(action, "action");
            if (action.length() > 0) {
                this.action = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
        }

        public final Builder setMimeType(String mimeType) {
            AbstractC3292y.i(mimeType, "mimeType");
            if (new j("^[-\\w*.]+/[-\\w+*.]+$").e(mimeType)) {
                this.mimeType = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        public final Builder setUri(Uri uri) {
            AbstractC3292y.i(uri, "uri");
            this.uri = uri;
            return this;
        }

        public /* synthetic */ Builder(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    public String getAction() {
        return this.action;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Uri getUri() {
        return this.uri;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        AbstractC3292y.i(intent, "intent");
    }
}
